// In this interface i will have option and greetings for user when they enters into atm
import java.util.*;
class AtmMachine{
    float balance;
    public float checkBalance()
    {
    return balance;
    }
    public int withDraw(int withDrawlamount){
        if(withDrawlamount<=balance)
        {
            balance -=withDrawlamount;
        }
        else return -1;
        return 0;

    }
    public int deposit(int depositAmount){
        balance += depositAmount;
        return 0;
    }
}
public class Atm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pinNumber = 7772;
        AtmMachine obj = new AtmMachine();
        obj.balance = 20000;
        obj.checkBalance();
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
                    System.out.print("Your current Balance is: $");
                   System.out.println(obj.checkBalance());
                    break;
                }
                case 2:{
                    System.out.print("Enter the amount to withdraw: ");
                    int withdrawnAmount = sc.nextInt();
                   int sm =  obj.withDraw(withdrawnAmount);
                   if(sm==-1)
                   {
                       System.out.println("Transaction cancled!");
                   }
                   else System.out.println("Collect your Cash!");
                    break;
                }
                case 3:{
                    System.out.print("Enter the amount you want to deposit: ");
                    int depositAmount = sc.nextInt();
                    int check = obj.deposit(depositAmount);
                            if(check==0)
                            {
                                System.out.println("Your amount deposited successfully and current amount is: $" + obj.checkBalance());
                            }
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
