package com.traincompanion;

public class TrainRoute {
	
	
	private Compartment head;
    private Compartment current;
	
	
	/// insert at end 
	public void addCompartmentAtEnd(String name) {
		Compartment newComp = new Compartment(name);
		
		if(head == null) {
			head  = current = newComp;
		}
		
		Compartment temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		
		temp.next = newComp;
		newComp.prev = temp;
			
		
	}
	
	// Remove compartment (using loop)
    public void removeCompartment(String name) {
        Compartment temp = head;

        while (temp != null) {
            if (temp.name.equals(name)) {

                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                } else {
                    head = temp.next;
                }

                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                }

                if (current == temp) {
                    current = head;
                }
                return;
            }
            temp = temp.next;
        }
    }
    
 // Move forward
    public void moveNext() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    // Move backward
    public void movePrevious() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }
	

    // Display adjacent compartments
    public void showAdjacent() {
        System.out.println("Previous: " +
                (current.prev != null ? current.prev.name : "None"));
        System.out.println("Current : " + current.name);
        System.out.println("Next     : " +
                (current.next != null ? current.next.name : "None"));
    }
}
