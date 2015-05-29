package com.bchollywood;

public class WmvPlayer implements MovieFileFormatPlayer {

	@Override
	public void playAvi(String fileName) {
		// Do nothing
	}

	@Override
	public void playWmv(String fileName) {
		System.out.println("Playing wmv file. Title: " + fileName + ".");
	}

	@Override
	public void playMp4(String fileName) {
		// Do nothing
	}

}
