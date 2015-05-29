package com.bchollywood;

public class AviPlayer implements MovieFileFormatPlayer {

	@Override
	public void playAvi(String fileName) {
		System.out.println("Playing avi file. Title: " + fileName);
	}

	@Override
	public void playWmv(String fileName) {
		// Do nothing
	}

	@Override
	public void playMp4(String fileName) {
		// Do nothing
	}

}
