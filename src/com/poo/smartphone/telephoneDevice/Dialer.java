package com.poo.smartphone.telephoneDevice;

public class Dialer implements CellPhone {

    // implements methods from Interface
    public void call() {
        System.out.println("Making a call...");
    }

    public void answer() {
        System.out.println("Aswering a call...");
    }

    public void startVoiceMail() {
        System.out.println("Opening the Voice Mail Box...");
    }
}
