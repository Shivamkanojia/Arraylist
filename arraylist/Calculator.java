import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int option;
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("choose any one option");
        System.out.println("choose 1 for addition");
        System.out.println("choose 2 for subtract");
        System.out.println("choose 3 for multiple");
        System.out.println("choose 4 for division");
        option =sc.nextInt();
        System.out.println("enter value of and b ");
        a=sc.nextInt();
        b=sc.nextInt();
        if(option ==1)
        {
            System.out.println(a+b);
        }else if(option==2)
        {
            System.out.println(a-b);
        }else if(option ==3)
        {
            System.out.println(a*b);
        }
        else if(option ==4)
        {
          System.out.println(a/b);
        }
       else{
        System.out.println("invalid option");
       }
        
    }
}
