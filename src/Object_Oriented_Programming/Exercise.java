package Object_Oriented_Programming;
//This is code of Game Guess the number;
import java.util.Random;
import java.util.Scanner;
class Game{
    int number;
    private int InputNumber;
    int noOfGuess=0;
    public void SetnoOfGuess(int noOfGuess){
        this.noOfGuess=noOfGuess;
    }
    public int GetNoOfGuess(){
        return noOfGuess;
    }
    Game() {
       Random random = new Random();
       this.number= random.nextInt(100);
    }
         void TakeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
          InputNumber = sc.nextInt();
        }
        boolean IsCorrectNumber(){
        noOfGuess++;
        if( InputNumber == number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuess);
            return true;
        }
        else if( InputNumber < number){
            System.out.println("Too low....");
        }
        else if ( InputNumber > number){
            System.out.println("Too high....");
        }
        return false;
        }
}
public class Exercise {
    public static void main(String[] args) {
    Game g = new Game();
    boolean b = false;
    while(!b){
   g.TakeUserInput();
   b=g.IsCorrectNumber();
    }
    }
}
