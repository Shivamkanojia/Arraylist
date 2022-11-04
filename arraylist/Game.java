import java.util.Scanner;


public class Game {
    public static void main(String[] args) {
        int ComptNum=(int )(Math.random()*10+1);
       int Usernum;
       //chances
       int k=3;

       do{
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Guessing Game"+"\n"+
       "Guess number between 1 to 10" );
        Usernum = sc.nextInt();
        if(Usernum==ComptNum && k==1)
        {
          System.out.println("Congratulations Your Guess is correct "+"\n"+
          "you won 100$");
        }
        else if(Usernum >ComptNum && k==2)
        {
            System.out.println("your guess is higher ");
        }
        else{
            System.out.println("your guess is lower");
        }
     }while(k==3);
     {
      System.out.println("You Lose"+
      "\n"+"you have exhausted your chances");
     }


       
    }
}
