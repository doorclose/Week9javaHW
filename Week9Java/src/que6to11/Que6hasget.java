package que6to11;

import java.util.HashSet;

public class Que6hasget {

    public static void main(String[] args) {

        HashSet<Integer> numberSet = new HashSet<>();

        // Store the numbers 4, 7, and 8 in the set
        numberSet.add(4);
        numberSet.add(7);
        numberSet.add(8);
        numberSet.add(11);
        // Show which numbers between 1 and 10 are in the set
        System.out.println("Numbers between 1 and 10 present in the set:");
        for (int i = 1; i <= 10; i++) {
            if (numberSet.contains(i)) {
                System.out.println(i);
            }
        }
    }
}

