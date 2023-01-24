import java.util.InputMismatchException;
import java.util.Scanner;

public class calcCode {
    public static void main(String[] args) {
        System.out.println("Welcome to cal app");
        System.out.println("==================");

        //Var's
        Scanner inputVar = new Scanner(System.in);
        Double firstNum = 0.0, secondNum = 0.0;
        char oper = 0;

        calcCode obj1 = new calcCode();


        //INPUT FIRST NUMBER
        System.out.println("Enter your first number");
        // A use case scenerio during input if the user is low on IQ: and decides to input anything other than numbers
        try {
            firstNum = inputVar.nextDouble();
            } catch (InputMismatchException ex) {
            System.out.println("Were you dropped on head!!! \nthis calculator only processes numbers");
            System.exit(1); //Personal preference to end this program if user provides incorrect input! :::Alternative a while loop with max-count flag to try again::

        }

        //INPUT SECOND NUMBER
        System.out.println("Enter your second number");
        // similar as previous
        try {
            secondNum = inputVar.nextDouble();
            } catch (InputMismatchException ex1) {
            System.out.println("Were you dropped on head!!! \nthis calculator only processes numbers");
            System.exit(1); //Personal preference to end this program if user provides incorrect input! :::Alternative a while loop with max-count flag to try again::
        }

        //SELECT AN OPERATOR
        System.out.println("Select an operator\n+\n-\n*\n/");

        //No type cast need as i forced it to use a char
        oper = inputVar.next().charAt(0);

        switch (oper){

            case '+': obj1.add(firstNum,secondNum);

                break;
            case '-': obj1.sub(firstNum,secondNum);

                break;
            case '*': obj1.mul(firstNum,secondNum);

                break;
            case '/': obj1.div(firstNum,secondNum);

                break;


            default:
                //throw new IllegalStateException("Unexpected value: " + oper);
                System.out.println("Some rules should not be broken\nNext time make a better decision");
        }


    }

    public void add(double num1, double num2){
        System.out.println(num1+" + "+num2+" =====> "+(num1+num2));

    }
    public void sub(double num1, double num2){
        System.out.println(num1+" - "+num2+" =====> "+(num1-num2));
    }
    public void mul(double num1, double num2){
        System.out.println(num1+" * "+num2+" =====> "+(num1*num2));
    }
    public void div(double num1, double num2){

        // Modern day java smart enough to handle this on its own by showing (infinity or NaN) but still implemented it.
        if(num2==0){
            System.out.println("Hmm! that's all u got.\nI recommend you to study basic mathematics a bit\nthen you are welcomed to give this another try");
        }else{
        System.out.println(num1+" / "+num2+" =====> "+(num1/num2));
        }
    }

}
