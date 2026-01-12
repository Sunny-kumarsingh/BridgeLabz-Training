package com.browserbuddy;
public class BrowserBuddyMain {
    public static void main(String[] args) {

        TabManager manager = new TabManager();
        TabHistory tab = manager.getActiveTab();

        tab.visitPage("google.com");
        tab.visitPage("github.com");
        tab.goBack();
        tab.goForward();

        manager.closeTab();
        manager.restoreTab();
    }
}
