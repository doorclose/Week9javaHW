package calculate;

public class Calculator {
    public void addition(int a, int b) {

        System.out.println("Add number:-->"  +(a+b));
    }
    public void subtraction(int a,int b){

        System.out.println("Subtract number :==>  "  +(a-b));
    }
    public void multiplication(int a, int b){
        System.out.println("Multiply numbers => " +(a*b));

    }
    public void division(int a, int b) {
        System.out.println("Divide number :=> " +(a/b));
    }
    public void calculateResult (int a, int b, char symbol){

        switch (symbol) {
            case '+':
                addition(a, b);
                break;
            case '-':
                subtraction(a, b);
                break;
            case '*':
                multiplication(a, b);
                break;
            case '/':
                division(a, b);
                break;
            default:
                System.out.println("Invalid symbol.");
        }

    }

}

