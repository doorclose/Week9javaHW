package que6to11;

import java.util.HashMap;

//HASMAP object String keys and Integer value.and iterateboth value//
public class Que7 {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();

        people.put("Akash",20);
        people.put("Param",30);
        people.put("Varni",35);
        people.put("Yogini",27);
        people.put("Anshani",45);

        System.out.println(" value from Map");
        for (Integer age : people.values()){
            System.out.println(age);

            }
        }
    }


