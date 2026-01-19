package com.fitnesstracker;
class FitnessSorter {

    public static void bubbleSort(User[] users) {

        int n = users.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {

                // Higher steps = better rank
                if (users[j].steps < users[j + 1].steps) {

                    User temp = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = temp;

                    swapped = true;
                }
            }

            // already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
