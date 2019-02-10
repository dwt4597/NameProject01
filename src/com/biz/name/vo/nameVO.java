package com.biz.name.vo;

public class nameVO {
	private String name;
	private String sung;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSung() {
		return sung;
	}
	public void setSung(String sung) {
		this.sung = sung;
	}
	@Override
	public String toString() {
		return "nameVO [name=" + name + ", sung=" + sung + "]";
	}
}
