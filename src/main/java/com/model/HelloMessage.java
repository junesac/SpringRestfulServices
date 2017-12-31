package com.model;

public class HelloMessage {

	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "HelloMessage [text=" + text + "]";
	}

}
