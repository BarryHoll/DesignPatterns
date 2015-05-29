package com.bchollywood;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		DvdPlayer dvdPlayer = new DvdPlayer();
		
		dvdPlayer.play("DVD", "The Possibilities are Endless");
		dvdPlayer.play("avi", "Ex Machina");
		dvdPlayer.play("wmv", "Her");
		dvdPlayer.play("mp4", "Birdman");
		dvdPlayer.play("rmvb", "Tooken");
	}

}
