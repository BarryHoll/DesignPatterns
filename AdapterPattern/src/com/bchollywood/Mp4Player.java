package com.bchollywood;

public class Mp4Player implements MovieFileFormatPlayer {

	@Override
	public void playAvi(String fileName) {
		// Do nothing
	}

	@Override
	public void playWmv(String fileName) {
		// Do nothing
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Title: " + fileName + ".");
	}

}
