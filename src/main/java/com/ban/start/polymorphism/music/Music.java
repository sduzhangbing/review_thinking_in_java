package com.ban.start.polymorphism.music;

/**
 * Created by banzhang on 16-11-26.
 */
public class Music {
    public static void tune(Instrument instrument){
        instrument.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind wind = new Wind();
        tune(wind);
    }
}
