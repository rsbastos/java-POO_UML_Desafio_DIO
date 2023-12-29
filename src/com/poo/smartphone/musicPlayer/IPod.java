package com.poo.smartphone.musicPlayer;

public class IPod implements MidiaPlayer {

    // implements methods from Interface
    public void play() {
        System.out.println("Playing a music on IPod Player");
    }

    public void pause() {
        System.out.println("Pausing a music on IPod Player");
    }

    public void selectMusic() {
        System.out.println(("Selecting a music from IPod Player"));
    }
}
