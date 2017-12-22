package net.common.util;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import net.common.util.BufferUtil;
import net.common.util.StringCoder.1;
import net.common.util.StringCoder.CoderContext;

abstract class StringCoder {
	static final StringCoder INSTANCE = createStringCoder();
	protected Charset charset;
	protected ThreadLocal<CoderContext> localCoderContext = new 1(this);

	StringCoder(Charset arg0) {
		this.charset = arg0;
	}

	public String bytes2str(byte[] arg0, int arg1, int arg2) {
		if (arg0.length > arg1 && arg0[arg1] != 0) {
			CoderContext arg3 = (CoderContext) this.localCoderContext.get();
			CharBuffer arg4 = arg3.ensureCharBuffer(arg2);
			int arg5 = arg2;

			for (int arg6 = 0; arg6 < arg2; ++arg6) {
				if (arg0[arg1 + arg6] == 0) {
					arg5 = arg6;
					break;
				}
			}

			if (arg5 == 0) {
				return null;
			} else {
				ByteBuffer arg8 = ByteBuffer.wrap(arg0);
				arg8.position(arg1).limit(arg1 + arg5);
				arg3.decoder.decode(arg8, arg4, true);
				return new String(arg4.array(), 0, arg4.position());
			}
		} else {
			return "";
		}
	}

	public String buffer2ascii(ByteBuffer arg0, int arg1, int arg2) {
		CoderContext arg3 = (CoderContext) this.localCoderContext.get();
		char[] arg4 = arg3.ensureChars(arg2);
		int arg5 = 0;

		for (int arg6 = 0; arg6 < arg2; ++arg6) {
			char arg7 = (char) arg0.get(arg1 + arg6);
			if (arg7 == 0) {
				arg5 = arg6;
				break;
			}

			arg4[arg6] = arg7;
		}

		return arg5 == 0 ? "" : new String(arg4, 0, arg5);
	}

	public String buffer2str(ByteBuffer arg0, int arg1, int arg2) {
		CoderContext arg3 = (CoderContext) this.localCoderContext.get();
		arg0.position(arg1);
		CharBuffer arg4 = arg3.ensureCharBuffer(arg2);
		arg3.decoder.decode(arg0, arg4, true);
		return (new String(arg4.array(), 0, arg4.limit())).trim();
	}

	public abstract boolean isFast();

	public abstract String bytes2ascii(byte[] arg0, int arg1, int arg2);

	public abstract void str2bytes(String arg0, ByteBuffer arg1, int arg2, int arg3);

	public abstract void ascii2bytes(String arg0, ByteBuffer arg1, int arg2, int arg3);

	private static StringCoder createStringCoder() {
		Charset arg = BufferUtil.bufferCharset;

		try {
			char[] arg0 = new char[]{'a'};
			new String(arg0, true);
			return new StringCoder.FastStringCoder(arg);
		} catch (Throwable arg1) {
			return new StringCoder.StandardStringCoder(arg);
		}
	}

	static class FastStringCoder extends StringCoder {
		FastStringCoder(Charset arg0) {
			super(arg0);
		}

		public boolean isFast() {
			return true;
		}

		public String bytes2ascii(byte[] arg0, int arg1, int arg2) {
			if (arg0.length > arg1 && arg0[arg1] != 0) {
				int arg3 = arg2;

				for (int arg4 = 0; arg4 < arg2; ++arg4) {
					if (arg0[arg1 + arg4] == 0) {
						arg3 = arg4;
						break;
					}
				}

				char[] arg6 = new char[arg3];

				for (int arg5 = 0; arg5 < arg3; ++arg5) {
					arg6[arg5] = (char) (arg0[arg1 + arg5] & 255);
				}

				return new String(arg6, true);
			} else {
				return "";
			}
		}

		public void str2bytes(String arg0, ByteBuffer arg1, int arg2, int arg3) {
			if (arg0 != null) {
				CharsetEncoder arg4 = ((CoderContext) this.localCoderContext.get()).encoder;
				arg1.clear().position(arg2);
				CoderResult arg5 = arg4.encode(CharBuffer.wrap(arg0.value), arg1, true);
				if (arg5.isOverflow()) {
					byte[] arg6 = arg0.getBytes(this.charset);
					int arg7 = arg6.length;
					if (arg6.length > arg3) {
						arg7 = arg3;
					}

					arg1.position(arg2);
					arg1.put(arg6, 0, arg7);
				}

			}
		}

		public void ascii2bytes(String arg0, ByteBuffer arg1, int arg2, int arg3) {
			if (arg0 != null) {
				char[] arg4 = arg0.value;
				int arg5 = Math.min(arg4.length, arg3);
				byte[] arg6 = new byte[arg5];

				for (int arg7 = 0; arg7 < arg5; ++arg7) {
					arg6[arg7] = (byte) arg4[arg7];
				}

				arg1.position(arg2);
				arg1.put(arg6, 0, arg5);
			}
		}
	}

	static class StandardStringCoder extends StringCoder {
		StandardStringCoder(Charset arg0) {
			super(arg0);
		}

		public boolean isFast() {
			return false;
		}

		public String bytes2ascii(byte[] arg0, int arg1, int arg2) {
			if (arg0.length > arg1 && arg0[arg1] != 0) {
				int arg3 = arg2;
				CoderContext arg4 = (CoderContext) this.localCoderContext.get();
				char[] arg5 = arg4.ensureChars(arg2);

				for (int arg6 = 0; arg6 < arg2; ++arg6) {
					if (arg0[arg1 + arg6] == 0) {
						arg3 = arg6;
						break;
					}

					arg5[arg6] = (char) (arg0[arg1 + arg6] & 255);
				}

				return new String(arg5, 0, arg3);
			} else {
				return "";
			}
		}

		public void str2bytes(String arg0, ByteBuffer arg1, int arg2, int arg3) {
			if (arg0 != null) {
				CharsetEncoder arg4 = ((CoderContext) this.localCoderContext.get()).encoder;
				arg1.clear().position(arg2);
				CoderResult arg5 = arg4.encode(CharBuffer.wrap(arg0.toCharArray()), arg1, true);
				if (arg5.isOverflow()) {
					byte[] arg6 = arg0.getBytes(this.charset);
					int arg7 = arg6.length;
					if (arg6.length > arg3) {
						arg7 = arg3;
					}

					arg1.position(arg2);
					arg1.put(arg6, 0, arg7);
				}

			}
		}

		public void ascii2bytes(String arg0, ByteBuffer arg1, int arg2, int arg3) {
			if (arg0 != null) {
				char[] arg4 = arg0.toCharArray();
				int arg5 = Math.min(arg4.length, arg3);
				byte[] arg6 = new byte[arg5];

				for (int arg7 = 0; arg7 < arg5; ++arg7) {
					arg6[arg7] = (byte) arg4[arg7];
				}

				arg1.position(arg2);
				arg1.put(arg6, 0, arg5);
			}
		}
	}
}