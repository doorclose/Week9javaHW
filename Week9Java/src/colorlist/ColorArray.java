package colorlist;

import java.util.ArrayList;

public class ColorArray {

    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>(); //create new ArrayList

        colours.add("white");
        colours.add("Black");
        colours.add("Orange");
        colours.add("Blue");
        colours.add("Pink");
       colours.add("Yellow");

        System.out.println("Collection of colour  ");
        for (String colour : colours);
            System.out.println(colours);
        }
    }
