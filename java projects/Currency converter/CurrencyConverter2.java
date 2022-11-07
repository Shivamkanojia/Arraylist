import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConverter2{
public static void main(String[] args) {
    double amount;
    double rupee,dollar,pound,euro;
    int choice;
    DecimalFormat f=new DecimalFormat();
    Scanner sc =new Scanner(System.in);

    System.out.println("Follwing are the choices ");
    System.out.println("enter 1: Rupee");
    System.out.println("enter 2: Dollar");
    System.out.println("enter 3: pound");
    System.out.println("enter 4: euro");
    System.out.println("Choose among the choices");
    choice=sc.nextInt();

    System.out.println("Enter amount u want to convert");
    amount=sc.nextDouble();

    switch (choice)
    {
        case 1://rupee conversion
       dollar=amount/70;
       System.out.println(amount +"Rupee"+f.format(dollar)+"Dollar");
       pound=amount/88;
       System.out.println(amount +"Rupee"+f.format(pound)+"pound");
       euro=amount/80;
       System.out.println(amount+"rupee"+f.format(euro)+"euro");
       break;

       case 2://dollar conversion
       rupee=amount*70;
       System.out.println();



    }
}

}
