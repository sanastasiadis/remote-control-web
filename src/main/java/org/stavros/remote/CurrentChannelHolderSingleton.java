package org.stavros.remote;

import java.util.HashMap;
import java.util.Map;

public class CurrentChannelHolderSingleton {
	
	private CurrentChannelHolderSingleton() {
		buffer = new HashMap<>();
	}
	
	private final static CurrentChannelHolderSingleton INSTANCE = new CurrentChannelHolderSingleton();
	public final static CurrentChannelHolderSingleton getInstance() {
		return INSTANCE;
	}
	
	private Map<String,Channel> buffer;
	public void setBuffer(Map<String,Channel> buffer) {
		this.buffer = buffer;
	}
	public Map<String,Channel> getBuffer() {
		return this.buffer;
	}

}
