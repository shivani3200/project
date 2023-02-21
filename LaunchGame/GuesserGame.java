package LaunchGame;

import javax.lang.model.util.*;
 import java.util.*;

class Guesser{
    int guessNum;
    int guessingNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser! kindly guess the number ");
        guessNum = sc.nextInt();
        return guessNum;
    }
}
class Player{
    int guessNum;
    int guessingNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Player! kindly guess the number");
        guessNum = sc.nextInt();
        return guessNum;
    }
}
class Umpire{
    int numberFromGuesser;
    int numberFromPlayer1;
    int numberFromPlayer2;
    int numberFromPlayer3;

    void collectNumFromGuesser(){
        Guesser g = new Guesser();
        numberFromGuesser = g.guessingNum();

    }
    void collectNumFromPlayers(){
       Player p1 = new Player();
       Player p2 = new Player();
       Player p3 = new Player(); 

        numberFromPlayer1 = p1.guessingNum();
        numberFromPlayer2 = p2.guessingNum();
        numberFromPlayer3 = p3.guessingNum();

    }
    void compare(){
        if(numberFromGuesser == numberFromPlayer1){
            if(numberFromGuesser==numberFromPlayer2 && numberFromGuesser== numberFromPlayer3){
                System.out.println("all are winner");
            }else if(numberFromGuesser==numberFromPlayer2){
                System.out.println( "player1 and player2 won the match");
            }else if(numberFromGuesser== numberFromPlayer3){
                System.out.println("player1 and player3 won the game");
            }
            else{
            System.out.println("Player1 won the game!");
        }
    }

        else if(numberFromGuesser == numberFromPlayer2){
            if(numberFromGuesser==numberFromPlayer3){
                System.out.println("player2 and player3 won the game");
            }
            else
            System.out.println("Player2 won the game!");

        }

        else if(numberFromGuesser == numberFromPlayer3){
            System.out.println("Player3 won the game!");
        }
        else{
             System.out.println("Game lost!");
        }
    }
}

class GuesserGame{
    public static void main(String[] args) {
        System.out.println("Game started !");
        Umpire u =new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();

        
    }
}