import java.util.Scanner;

public class Excercise1 {
    public static void main(String[] args) {
        Scanner enter = new Scanner (System.in);

        float monthly = 1000; 
        float commission ;
        boolean close = false;
        
        do{
        System.out.print("how many cars have you sold?: ");
        commission = enter.nextFloat();

        if (commission == 0) {
         System.out.print("you have not sold any car good luck next time:D");
            close = true;
           // break;
       } else {

        float total = commission * 150;

        double valor = total * 0.05;

        double resultado = monthly + valor;

        System.out.println("-----------------------");

        System.out.print("your monthly salary is: " + resultado + "\n\n");

       }
       

        }while(commission != 0);

    }
}