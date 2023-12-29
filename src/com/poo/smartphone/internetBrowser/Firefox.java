package com.poo.smartphone.internetBrowser;

public class Firefox implements Browser {

    // implements methods from Interface
    public void pageDisplay() {
        System.out.println("Displaying Firefox Page");
    }

    public void addNewTab() {
        System.out.println("Opening New Firefox Tab");
    }

    public void refreshPage() {
        System.out.println("Refreshing Firefox Page");
    }
}
