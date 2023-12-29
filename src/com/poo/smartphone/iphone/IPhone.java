package com.poo.smartphone.iphone;

import com.poo.smartphone.internetBrowser.Browser;
import com.poo.smartphone.internetBrowser.Firefox;
import com.poo.smartphone.internetBrowser.Safari;
import com.poo.smartphone.musicPlayer.IPod;
import com.poo.smartphone.musicPlayer.MidiaPlayer;
import com.poo.smartphone.musicPlayer.VLC;
import com.poo.smartphone.telephoneDevice.CellPhone;
import com.poo.smartphone.telephoneDevice.Dialer;


public class IPhone implements Browser, MidiaPlayer, CellPhone {

    public void pageDisplay() {
    }

    public void addNewTab() {
    }

    public void refreshPage() {
    }

    public void play() {
    }

    public void pause() {
    }

    public void selectMusic() {
    }

    public void call() {
    }

    public void answer() {
    }

    public void startVoiceMail() {
    }



    public static void main(String[] args) {

        Firefox firefox = new Firefox();
        Safari safari = new Safari();
        IPod iPod = new IPod();
        VLC vlc = new VLC();
        Dialer dialer = new Dialer();



        // Testing Methods
        firefox.pageDisplay();
        firefox.addNewTab();
        firefox.refreshPage();

        safari.pageDisplay();
        safari.addNewTab();
        safari.refreshPage();

        iPod.selectMusic();
        iPod.play();
        iPod.pause();

        vlc.selectMusic();
        vlc.play();
        vlc.pause();

        dialer.call();
        dialer.answer();
        dialer.startVoiceMail();
    }
}
