package net.common.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import net.common.util.BufferUtil;
import net.common.util.PlatformUtil.Platform;

public class PlatformUtil {
	public static void checkPlatform(String arg, String arg0) {
		Platform arg1 = getPlatform();
		if (!arg0.equalsIgnoreCase(arg1.name())) {
			throw new RuntimeException(arg + " can\'t run on platform: " + arg1 + ", expects " + arg0);
		}
	}

	public static String checkPlatform(String arg, String[] arg0) {
		Platform arg1 = getPlatform();

		for (int arg2 = 0; arg2 < arg0.length; ++arg2) {
			if (arg0[arg2].equalsIgnoreCase(arg1.name())) {
				return arg1.name();
			}
		}

		throw new RuntimeException(arg + " can\'t run on platform: " + arg1 + ", supported " + Arrays.asList(arg0));
	}

	public static Platform getPlatform() {
		if (isWindows()) {
			if (is32bit()) {
				return Platform.win32_x86;
			}

			if (is64bit()) {
				return Platform.win32_x64;
			}
		} else if (isLinux()) {
			if (is32bit()) {
				return Platform.linux_x86;
			}

			if (is64bit()) {
				return Platform.linux_x64;
			}
		}

		String arg = System.getProperty("os.name");
		String arg0 = System.getProperty("os.arch");
		throw new RuntimeException("Unknown platform: " + arg + " " + arg0);
	}

	public static boolean isWindows() {
		String arg = System.getProperty("os.name");
		return arg.toLowerCase().indexOf("windows") >= 0;
	}

	public static boolean isLinux() {
		String arg = System.getProperty("os.name");
		return arg.toLowerCase().indexOf("linux") >= 0;
	}

	public static boolean is32bit() {
		String arg = System.getProperty("os.arch").trim();
		return "x86".equalsIgnoreCase(arg) || "i386".equalsIgnoreCase(arg);
	}

	public static boolean is64bit() {
		String arg = System.getProperty("os.arch").trim();
		return "amd64".equalsIgnoreCase(arg);
	}

	public static URL getLibraryResourceURL(Class arg, String arg0, String arg1) {
		ClassLoader arg2 = arg.getClassLoader();
		String arg3 = arg0 + "/" + arg1;
		URL arg4 = arg2.getResource(arg3);
		if (arg4 == null) {
			arg4 = arg2.getResource("/" + arg3);
		}

		arg3 = arg0 + "/" + arg1 + ".dll";
		if (arg4 == null) {
			arg4 = arg2.getResource(arg3);
		}

		if (arg4 == null) {
			arg4 = arg2.getResource("/" + arg3);
		}

		arg3 = arg0 + "/lib" + arg1 + ".so";
		if (arg4 == null) {
			arg4 = arg2.getResource(arg3);
		}

		if (arg4 == null) {
			arg4 = arg2.getResource("/" + arg3);
		}

		arg3 = arg0 + "/" + arg1 + ".so";
		if (arg4 == null) {
			arg4 = arg2.getResource(arg3);
		}

		if (arg4 == null) {
			arg4 = arg2.getResource("/" + arg3);
		}

		return arg4;
	}

	public static String getcwd() {
		return BufferUtil.c2str(_getcwd());
	}

	public static void chdir(String arg) {
		_chdir(BufferUtil.str2c(arg));
	}

	private static native byte[] _getcwd();

	private static native void _chdir(byte[] arg);

	static {
		if (isLinux()) {
			Platform arg = getPlatform();
			String arg0 = System.getProperty("user.home");
			File arg1 = new File(arg0, ".jtrader/sharedLibrary/common/" + arg.name() + "/" + "20171205");
			arg1.mkdirs();
			URL arg2 = getLibraryResourceURL(PlatformUtil.class, "resources/common/" + arg.name() + "/" + "20171205",
					"platform_util");
			if (arg2 == null) {
				throw new RuntimeException("No shared library found for common on this platform: " + getPlatform());
			}

			try {
				File arg3 = new File(arg1, (new File(arg2.getFile())).getName());
				if (!arg3.exists() || arg3.length() == 0L) {
					InputStream arg4 = arg2.openStream();
					FileOutputStream arg5 = new FileOutputStream(arg3);
					byte[] arg7 = new byte[4096];

					int arg6;
					while ((arg6 = arg4.read(arg7)) != -1) {
						arg5.write(arg7, 0, arg6);
					}

					arg4.close();
					arg5.close();
					arg3.setExecutable(true, false);
					arg3.setReadable(true, false);
				}

				System.load(arg3.getAbsolutePath());
			} catch (Exception arg8) {
				throw new RuntimeException("Extract and load shared library for common on platform " + arg.name()
						+ " failed: " + arg8.getMessage(), arg8);
			}
		}

	}
}