import java.util.Scanner;

public class calculator{
    public static void main(String[] args)
    {
        char operator;
        double num1,num2,result=0;

        Scanner sc = new Scanner(System.in);
       System.out.println("enter a opreator(+,-,*,/)");
       operator=sc.next().charAt(0);

       System.out.println("enter first number you want:");
       num1=sc.nextDouble();


       System.out.println("enter a second number ypu want:");
       num2=sc.nextDouble();

       switch(operator){
        case '+':
        result=num1+num2;
        System.out.println(num1+ "+" +num2+"="+result);
        break;

        case'-':
        result=num1-num2;
        System.out.println(num1+ "-" +num2+"="+result);
        break;

        case'*':
        result=num1*num2;
         System.out.println(num1+ "*" +num2+"="+result);
         break;

        case '/':
        result=num1/num2;
         System.out.println(num1+ "/" +num2+"="+result);
         break;

         default:
         System.out.println("invalid operator");
         break;

       }
        

    }
}