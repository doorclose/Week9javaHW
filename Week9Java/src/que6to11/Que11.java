package que6to11;
//Declare global variables of your name, Add all your group names in list,
// using  for each loop iterate and print ONLY your name.
public class Que11 {

    static String yourName = "Kinjal";
        public static void main(String[] args) {

            String[] groupMembers = {"Astha", "Bina", "Eva", "Dharti", "Nima", "Kinjal"};
            for (String member : groupMembers) {
                if (member.equals(yourName)) {
                    System.out.println("My name is " + yourName);
                }
            }

        }
    }


