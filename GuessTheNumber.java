import java.util.Scanner;
import java.util.Random;

class Game{
    int botGuess;
    int userGuess;
    int noOfGuesses=0;
    public void displayNoOfGuesses(){
        System.out.println("Number of guesses are : "+noOfGuesses);
    }
    public void setBotGuess(){
        Random random=new Random();
        int randomNum=random.nextInt(0,101);
        botGuess=randomNum;
    }
    public void takeUserInput(){
        while (botGuess!=userGuess){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter your guess :");
            userGuess=sc.nextInt();
            noOfGuesses+=1;

            if(botGuess==userGuess){
                System.out.println("Congrats ! your guess is right");
                displayNoOfGuesses();
            }
            else if (userGuess>botGuess) {
                System.out.println("Your guess is greater");
            }
            else {
                System.out.println("Your guess is lesser");
            }
        }

    }
    public void welcome(){
        System.out.println("Welcome to guess the number");
        System.out.println("guess any number between 0 to 100");
    }
}

public class Exercise3_43 {
    public static void main(String[] args) {
        Game guessTheNumber=new Game();
        guessTheNumber.welcome();
        guessTheNumber.setBotGuess();
        guessTheNumber.takeUserInput();


    }
}
