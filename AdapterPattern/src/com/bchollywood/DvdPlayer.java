package com.bchollywood;

public class DvdPlayer implements MovieDiscPlayer {
	
	MovieAdapter movieAdapter;

	@Override
	public void play(String movieType, String fileName) {

		if (movieType.equalsIgnoreCase("DVD")) {					// The DVD Player, out of the box,
			System.out.println("Playing DVD. Title: " + fileName  + ".");  //   can play DVDs.
		} else if (movieType.equalsIgnoreCase("avi") 
				|| movieType.equalsIgnoreCase("wmv") 				// To play movie file formats,
				|| movieType.equalsIgnoreCase("mp4")) {     		//   movieAdapter is used.
			movieAdapter = new MovieAdapter(movieType);
			movieAdapter.play(movieType, fileName);
		} else {
			System.out.println("Error! Movie format " + movieType   // And if it's not on the list
					+ " can not be played.");						// it can't come in.
		}

	}
}
