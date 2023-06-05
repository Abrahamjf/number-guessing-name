import java.util.Scanner;
import java.util.Random;

public class MyPractice {

    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    Random ran = new Random();
    int randomNumber = ran.nextInt(100) + 1;
    
    
    while(true){
        System.out.println("Enter your guess(1-100): ");
        int playerGuess = scanner.nextInt();
    if(playerGuess == randomNumber){
        System.out.println("You have read my mind!");
        break;
    } else if(playerGuess < randomNumber){
        System.out.println("You have to increase your number");
    } else if(playerGuess > randomNumber){
        System.out.println("You are too High!");
    }

    }
    
    scanner.close();
    
}
}
