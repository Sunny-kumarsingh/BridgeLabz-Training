package com.ambulanceroute;
class AmbulanceRoute {

    private HospitalUnit head;
    private HospitalUnit tail;

    // Add unit to circular list
    public void addUnit(String name, boolean available) {
        HospitalUnit unit = new HospitalUnit(name, available);

        if (head == null) {
            head = tail = unit;
            tail.next = head;
        } else {
            tail.next = unit;
            tail = unit;
            tail.next = head;
        }
    }

    // Find nearest available unit
    public HospitalUnit findAvailableUnit() {
        if (head == null) return null;

        HospitalUnit temp = head;
        do {
            if (temp.available) {
                return temp;
            }
            temp = temp.next;
        } while (temp != head);

        return null;
    }

    // Remove unit under maintenance
    public void removeUnit(String name) {
        if (head == null) return;

        HospitalUnit curr = head;
        HospitalUnit prev = tail;

        do {
            if (curr.name.equals(name)) {
                if (curr == head) {
                    head = head.next;
                    tail.next = head;
                } else if (curr == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = curr.next;
                }
                break;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }
}
