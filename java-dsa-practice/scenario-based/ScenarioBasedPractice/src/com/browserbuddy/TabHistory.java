package com.browserbuddy;
class TabHistory {
    private HistoryNode current;

    public void visitPage(String url) {
        HistoryNode node = new HistoryNode(url);
        if (current != null) {
            current.next = node;
            node.prev = current;
        }
        current = node;
    }

    public void goBack() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    public void goForward() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    public String getCurrentPage() {
        return current != null ? current.url : null;
    }
}
