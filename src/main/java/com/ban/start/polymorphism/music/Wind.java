package com.ban.start.polymorphism.music;

/**
 * Created by banzhang on 16-11-26.
 */
public class Wind extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println("Wind.play()"+note);
    }
}
