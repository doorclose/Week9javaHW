package tubename;

import java.util.ArrayList;

//5. Write a Java program to test an array list is empty or not. Define array list with underground tube names //
public class UndergroundTube {

    public static void main(String[] args) {
        ArrayList<String> tubename = new ArrayList<>();
       tubename.add("Piccadilly");
        tubename.add("Elizabeth");
        tubename.add("Metropoliton");
        tubename.add("Central Line");

        if (tubename.isEmpty()) {
            System.out.println("The tubename list is empty");
        } else {
            System.out.println("The tunename list is not empty");
        }
    }

}
