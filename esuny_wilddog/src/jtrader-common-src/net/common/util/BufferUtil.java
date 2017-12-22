package net.common.util;

import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;
import net.common.util.StringCoder;
import sun.misc.Cleaner;

public class BufferUtil {
	public static final Charset bufferCharset;
	private static final Field cleanerField;
	private static final byte[] NULL_INTARRAY_BYTES;

	public static byte[] intArray2bytes(int[] arg) {
		if (arg != null && arg.length != 0) {
			ByteBuffer arg0 = ByteBuffer.allocate(arg.length * 4).order(ByteOrder.nativeOrder());

			for (int arg1 = 0; arg1 < arg.length; ++arg1) {
				arg0.putInt(arg[arg1]);
			}

			return arg0.array();
		} else {
			return null;
		}
	}

	public static byte[] ints2c(int[] arg) {
		if (arg != null && arg.length != 0) {
			ByteBuffer arg0 = ByteBuffer.allocate((arg.length + 1) * 4).order(ByteOrder.nativeOrder());
			arg0.putInt(arg.length);

			for (int arg1 = 0; arg1 < arg.length; ++arg1) {
				arg0.putInt(arg[arg1]);
			}

			return arg0.array();
		} else {
			return NULL_INTARRAY_BYTES;
		}
	}

	public static byte[] str2c(String arg) {
		if (arg == null) {
			return null;
		} else {
			byte[] arg0 = arg.getBytes(bufferCharset);
			byte[] arg1 = new byte[arg0.length + 1];
			System.arraycopy(arg0, 0, arg1, 0, arg0.length);
			return arg1;
		}
	}

	public static byte[] strs2c(String[] arg) {
		if (arg != null && arg.length != 0) {
			byte[][] arg0 = new byte[arg.length][];

			int arg1;
			for (arg1 = 0; arg1 < arg.length; ++arg1) {
				arg0[arg1] = arg[arg1].getBytes(bufferCharset);
			}

			arg1 = 0;

			for (int arg2 = 0; arg2 < arg.length; ++arg2) {
				arg1 += arg0[arg2].length + 1;
			}

			byte[] arg5 = new byte[arg1 + 2];
			int arg3 = 0;

			for (int arg4 = 0; arg4 < arg0.length; ++arg4) {
				System.arraycopy(arg0[arg4], 0, arg5, arg3, arg0[arg4].length);
				arg3 += arg0[arg4].length + 1;
			}

			return arg5;
		} else {
			return null;
		}
	}

	public static List<String> c2strs(byte[] arg) {
		if (arg != null && arg.length != 0) {
			LinkedList arg0 = new LinkedList();
			int arg1 = 0;

			while (arg1 < arg.length) {
				int arg2;
				for (arg2 = arg1; arg[arg1] != 0 && arg1 < arg.length; ++arg1) {
					;
				}

				int arg3 = arg1++;
				String arg4 = bytes2str(arg, arg2, arg3 - arg2);
				arg0.add(arg4);
			}

			return arg0;
		} else {
			return null;
		}
	}

	public static String c2str(byte[] arg) {
		return arg != null && arg.length != 0 ? c2str(arg, 0, arg.length) : null;
	}

	public static String c2str(byte[] arg, int arg0, int arg1) {
		if (arg == null) {
			return null;
		} else if (arg[arg0] == 0) {
			return "";
		} else {
			int arg2 = arg1;

			for (int arg3 = 0; arg3 < arg1; ++arg3) {
				if (arg[arg3 + arg0] == 0) {
					arg2 = arg3;
					break;
				}
			}

			return (new String(arg, arg0, arg2, bufferCharset)).trim();
		}
	}

	public static String buffer2ascii(ByteBuffer arg, int arg0, int arg1) {
		return StringCoder.INSTANCE.buffer2ascii(arg, arg0, arg1);
	}

	public static String bytes2ascii(byte[] arg, int arg0, int arg1) {
		return StringCoder.INSTANCE.bytes2ascii(arg, arg0, arg1);
	}

	public static String buffer2str(ByteBuffer arg, int arg0, int arg1) {
		return StringCoder.INSTANCE.buffer2str(arg, arg0, arg1);
	}

	public static String bytes2str(byte[] arg, int arg0, int arg1) {
		return StringCoder.INSTANCE.bytes2str(arg, arg0, arg1);
	}

	public static void ascii2bytes(ByteBuffer arg, String arg0, int arg1, int arg2) {
		StringCoder.INSTANCE.ascii2bytes(arg0, arg, arg1, arg2);
	}

	public static void str2bytes(ByteBuffer arg, String arg0, int arg1, int arg2) {
		StringCoder.INSTANCE.str2bytes(arg0, arg, arg1, arg2);
	}

	public static int[] buffer2ints(ByteBuffer arg, int arg0, int arg1) {
		int arg2 = arg1 / 4;
		int[] arg3 = new int[arg2];

		for (int arg4 = 0; arg4 < arg2; ++arg4) {
			arg3[arg4] = arg.getInt(arg0 + arg4 * 4);
		}

		return arg3;
	}

	public static double[] buffer2doubles(ByteBuffer arg, int arg0, int arg1) {
		int arg2 = arg1 / 8;
		double[] arg3 = new double[arg2];

		for (int arg4 = 0; arg4 < arg2; ++arg4) {
			arg3[arg4] = arg.getDouble(arg0 + arg4 * 8);
		}

		return arg3;
	}

	public static float[] buffer2floats(ByteBuffer arg, int arg0, int arg1) {
		int arg2 = arg1 / 8;
		float[] arg3 = new float[arg2];

		for (int arg4 = 0; arg4 < arg2; ++arg4) {
			arg3[arg4] = arg.getFloat(arg0 + arg4 * 4);
		}

		return arg3;
	}

	public static int bytes2int(byte[] arg, int arg0) {
		ByteBuffer arg1 = ByteBuffer.wrap(arg).order(ByteOrder.nativeOrder());
		return arg1.getInt(arg0);
	}

	public static boolean isTurboModeEnabled() {
		return StringCoder.INSTANCE.isFast();
	}

	public static String getStringFromByteArrays(byte[][] arg, int arg0, int arg1) {
		ByteArrayOutputStream arg2 = new ByteArrayOutputStream();
		byte[][] arg3 = arg;
		int arg4 = arg.length;

		for (int arg5 = 0; arg5 < arg4; ++arg5) {
			byte[] arg6 = arg3[arg5];
			arg2.write(arg6, arg0, arg1);
		}

		byte[] arg7 = arg2.toByteArray();
		return c2str(arg7, 0, arg7.length);
	}

	public static void releaseDirectBuffer(ByteBuffer arg) {
		try {
			Cleaner arg0 = (Cleaner) cleanerField.get(arg);
			arg0.clean();
		} catch (Exception arg1) {
			throw new RuntimeException(arg1);
		}
	}

	static {
		String arg = System.getProperty("jctp.encoding", (String) null);
		if (arg == null) {
			arg = System.getProperty("jtrader.encoding", "GBK");
		}

		bufferCharset = Charset.forName(arg);

		try {
			cleanerField = Class.forName("java.nio.DirectByteBuffer").getDeclaredField("cleaner");
			cleanerField.setAccessible(true);
		} catch (Throwable arg1) {
			throw new RuntimeException(arg1);
		}

		NULL_INTARRAY_BYTES = new byte[]{0, 0, 0, 0};
	}
}