import java.util.Random;
import java.util.Scanner;
public class Exercise2_20 {
    public static void main(String[] args) {
        System.out.println("Welcome to Rock,Paper and Scissors");
        System.out.println("Enter 1 for Rock");
        System.out.println("Enter 2 for Paper");
        System.out.println("Enter 3 for Scissors");
        int botPoints=0;
        int playerPoints=0;
        int rounds=0;
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        while (rounds<5){
            System.out.print("Your Turn :");
            int playerTurn= sc.nextInt();

            int botTurn=random.nextInt(1,4);
            System.out.println("Bot turn :"+botTurn);

            if (playerTurn>3){
                System.out.println("Invalid Input");
                break;
            }
            else if (playerTurn==1 && botTurn==1) {
                botPoints+=0;
                playerPoints+=0;
            }
            else if (playerTurn==1 && botTurn==2) {
                botPoints+=1;
            }
            else if (playerTurn==1 && botTurn==3) {
                playerPoints+=1;
            }

            else if (playerTurn==2 && botTurn==1) {
                playerPoints+=1;
            }
            else if (playerTurn==2 && botTurn==2) {
                playerPoints+=0;
                botPoints+=0;
            }
            else if (playerTurn==2 && botTurn==3) {
                botPoints+=1;
            }

            else if (playerTurn==3 && botTurn==1) {
                botPoints+=1;
            }
            else if (playerTurn==3 && botTurn==2) {
                playerPoints+=1;
            }
            else if (playerTurn==3 && botTurn==3) {
                botPoints+=0;
            }

            rounds++;
        }
        System.out.println("Your points :"+playerPoints);
        System.out.println("Bot points :"+botPoints);
        if (botPoints>playerPoints){
            System.out.println("Bot wins");
        }
        else {
            System.out.println("You win");
        }
    }
}
