package com.browserbuddy;
import java.util.Stack;

class TabManager {
    private TabHistory activeTab = new TabHistory();
    private Stack<TabHistory> closedTabs = new Stack<>();

    public TabHistory getActiveTab() {
        return activeTab;
    }

    public void closeTab() {
        closedTabs.push(activeTab);
        activeTab = new TabHistory();
    }

    public void restoreTab() {
        if (!closedTabs.isEmpty()) {
            activeTab = closedTabs.pop();
        }
    }
}
