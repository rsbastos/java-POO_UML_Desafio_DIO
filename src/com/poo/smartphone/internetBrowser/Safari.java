package com.poo.smartphone.internetBrowser;

public class Safari implements Browser {

    // implements methods from Interface
    public void pageDisplay() {
        System.out.println("Displaying Safari Page");
    }

    public void addNewTab() {
        System.out.println("Opening New Safari Tab");
    }

    public void refreshPage() {
        System.out.println("Refreshing Safari Page");
    }
}
