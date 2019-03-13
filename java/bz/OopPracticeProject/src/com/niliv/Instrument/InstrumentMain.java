package com.niliv.Instrument;

public class InstrumentMain {
	public static void main(String[] args) {
		Musician musician = new Musician();
		musician.play(new Erhu());
		musician.play(new Piano());
		musician.play(new Violin());
	}
}
