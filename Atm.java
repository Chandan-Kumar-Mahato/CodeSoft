// In this interface i will have option and greetings for user when they enters into atm
import java.util.*;
public class Atm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pinNumber = 7772;
        System.out.print("Enter the pin Number: ");
        int pinInput = sc.nextInt();
        if(pinInput==pinNumber)
        {
            System.out.println("Welcome to Atm Machine! ");
            while(true)
            {
            System.out.println("1.Check your Account Balance\n2.Click me for Withdrawl\n3.Click me for deposit\n4.Exit here");
            int input = sc.nextInt();
            switch(input){
                case 1:{
                    System.out.println("Check bank balance");
                    break;
                }
                case 2:{
                    System.out.println("Click me for withdrawl");
                    break;
                }
                case 3:{
                    System.out.println("click me for deposit");
                    break;
                }
                case 4:{
                    System.out.println("Exit");
                    System.exit(0);
                }
                default :{
                    System.out.println("Enter the valid operation here");
                }
            }
            }
        }
        else
        {
            System.out.println("Incorrect validation! Try valid pin Number");
        }
    }

}
