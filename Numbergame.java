import java.util.*;
public class Numbergame{
    public static int generateRandom(int max , int min)
    {
        int random =(int) (Math.random()*(max-min)+min);
        return random;
    }
    public static void welcomePlayer(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Welcome to your Game , Enter 1 to know the rules of this game else 0 to continue :");
        int n = inp.nextInt();
        if(n==1) {
            System.out.println("The Random number is in the range of 0 to 100");
            System.out.println("The limit of this game is 5 chances");
            System.out.println("You can play this game in multiple rounds");
            System.out.println("Enjoy the game, ThankYou");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       // lets get the random number
       int rand = generateRandom(1,100);

       // lets check how good is user to guess this number
        welcomePlayer();
       System.out.println("Enter your Guess to check you are right or wrong: ");
       int score = 1,round = 1;
       int limit = 5;
       do{
            int guess = sc.nextInt();
            if(guess==rand)
            {
                System.out.println("Hurray you have guess it, in: " + round + "with score : " + score);
                break;
            }
            else if(guess>rand)
            {
                System.out.println("Your Guess is higher please choose smaller value !");
            }
            else{
                System.out.println("Your Guess is lower please choose bigger value !");
            }
            score++;
            limit--;
            if(limit==0)
            {
                System.out.println("You reached your limit , Sorry");
                System.out.println("Enter Y or y to play nextRound else n or N to exit :");
                String ch = sc.next();
                if(ch.equals("y") || ch.equals("Y"))
                {
                    limit = 5;
                    rand = generateRandom(1, 100);
                    round++;
                    System.out.println("Enter your Guess to check you are right or wrong: ");
                }
            }
       }while(limit>0);
       sc.close();
    }

}