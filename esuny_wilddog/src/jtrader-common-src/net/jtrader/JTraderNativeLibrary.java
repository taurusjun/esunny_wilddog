package net.jtrader;

import net.common.util.PlatformUtil.Platform;

public class JTraderNativeLibrary {
	private Platform platform;
	private String[] libraries;

	public JTraderNativeLibrary(Platform arg0, String[] arg1) {
		this.platform = arg0;
		this.libraries = arg1;
	}

	public Platform getPlatform() {
		return this.platform;
	}

	public String[] getLibraries() {
		return this.libraries;
	}
}