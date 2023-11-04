package com.Mithin.TRASH.DSA_ASSIGNMENT_2;

public class Main {
    public static void main(String[] args) {
        DeQueueCustom queue = new DeQueueCustom(5);

//        queue.delete_From_theFrontEnd();
        queue.Insert_from_theRearEnd(1);
        queue.Insert_from_theRearEnd(2);
        queue.Insert_from_theRearEnd(3);
        queue.Insert_from_theRearEnd(4);
        queue.Insert_from_theRearEnd(5);

        queue.display();
    }
}
