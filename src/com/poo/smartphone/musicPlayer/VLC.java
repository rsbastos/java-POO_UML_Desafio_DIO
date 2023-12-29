package com.poo.smartphone.musicPlayer;

public class VLC implements MidiaPlayer {

    // implements methods from Interface
    public void play() {
        System.out.println("Playing a music on VLC Player");
    }

    public void pause() {
        System.out.println("Pausing a music on VLC Player");
    }

    public void selectMusic() {
        System.out.println(("Selecting a music from VLC Library"));
    }
}
