package com.bchollywood;

public class MovieAdapter implements MovieDiscPlayer {
	
	MovieFileFormatPlayer movieFileFormatPlayer;
	
	public MovieAdapter(String movieType) {
		if(movieType.equalsIgnoreCase("avi")){
			movieFileFormatPlayer = new AviPlayer();
		} else if (movieType.equalsIgnoreCase("wmv")) {
			movieFileFormatPlayer = new WmvPlayer();
		} else if (movieType.equalsIgnoreCase("mp4")) {
			movieFileFormatPlayer = new Mp4Player();
		}
	}

	@Override
	public void play(String movieType, String fileName) {
		if(movieType.equalsIgnoreCase("avi")){
			movieFileFormatPlayer.playAvi(fileName);
		} else if (movieType.equalsIgnoreCase("wmv")) {
			movieFileFormatPlayer.playWmv(fileName);
		} else if (movieType.equalsIgnoreCase("mp4")) {
			movieFileFormatPlayer.playMp4(fileName);
		}
	}

}
