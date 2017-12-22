package jtrader.tools.turbo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

public class TurboModeTool {
	private static String file = "";

	public static void main(String[] arg) throws Throwable {
		String arg0 = System.getProperty("java.version");
		if (arg0.compareTo("1.7") < 0) {
			System.out.println("Turbo 模式只能用于 jdk1.7或更高版本");
		} else {
			file = "jtrader-turbo-" + arg0 + ".jar";
			System.out.println("JTraderTool Turbo 模式工具");
			Class arg1 = String.class;
			byte[] arg2 = getStringClass(arg1);
			if (arg2 == null) {
				System.out.println("无法加载String类字节码");
			} else {
				saveStringBytes(arg2);
				System.out.println("成功写入String类字节码到 " + file);
				System.out.println("下一次启动时，java命令行增加：-Xbootclasspath/p:" + file);
			}
		}
	}

	private static void saveStringBytes(byte[] arg) throws IOException {
		ClassNode arg0 = new ClassNode();
		ClassReader arg1 = new ClassReader(arg);
		arg1.accept(arg0, 0);
		Iterator arg2 = arg0.fields.iterator();

		while (arg2.hasNext()) {
			FieldNode arg3 = (FieldNode) arg2.next();
			if ("value".equals(arg3.name)) {
				arg3.access = 1;
			}
		}

		boolean arg9 = false;
		List arg10 = arg0.methods;

		for (int arg4 = 0; arg4 < arg10.size(); ++arg4) {
			MethodNode arg5 = (MethodNode) arg10.get(arg4);
			if ("<init>".equals(arg5.name) && "([CZ)V".equals(arg5.desc)) {
				arg5.access = 1;
			}

			if ("toCharArray".equals(arg5.name)) {
				;
			}
		}

		ClassWriter arg11 = new ClassWriter(0);
		arg0.accept(arg11);
		FileOutputStream arg12 = new FileOutputStream(file);
		ZipOutputStream arg6 = new ZipOutputStream(arg12);
		ZipEntry arg7 = new ZipEntry("META-INF/MANIFEST.MF");
		String arg8 = "Manifest-Version: 1.0\n";
		arg6.putNextEntry(arg7);
		arg6.write(arg8.getBytes());
		arg7 = new ZipEntry("java/lang/String.class");
		arg6.putNextEntry(arg7);
		arg6.write(arg11.toByteArray());
		arg6.flush();
		arg6.close();
	}

	private static byte[] getStringClass(Class arg) throws IOException {
		String arg0 = System.getProperty("java.home");
		String arg1 = arg0 + "/lib/rt.jar";
		File arg2 = new File(arg1);
		if (arg2.exists() && arg2.isFile() && arg2.canRead()) {
			ZipFile arg3 = new ZipFile(arg2);
			ZipEntry arg4 = arg3.getEntry("java/lang/String.class");
			InputStream arg5 = arg3.getInputStream(arg4);
			byte[] arg6 = new byte['切'];
			int arg7 = 0;

			int arg10;
			for (boolean arg8 = false; (arg10 = arg5.read(arg6, arg7, arg6.length - arg7)) > 0; arg7 += arg10) {
				;
			}

			arg5.close();
			arg3.close();
			byte[] arg9 = new byte[arg7];
			System.arraycopy(arg6, 0, arg9, 0, arg7);
			return arg9;
		} else {
			return null;
		}
	}
}