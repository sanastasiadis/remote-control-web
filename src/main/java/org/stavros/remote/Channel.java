package org.stavros.remote;

public class Channel {
	
	public Channel(String name, String url) {
		this.name = name;
		this.url = url;
	}
	
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	private String url;
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl() {
		return this.url;
	}

}
