import java.util.Scanner;
public class IT24102791Lab5Q1{
 public static void main (String[]args){
   //Create a Scanner
   Scanner input = new Scanner ( System.in);

   //Declare the variables
   int number1,number2,number3;
   //Prompt the user input first integer
   System.out.print("Enter the first integer:");
   number1= input.nextInt();
   System.out.print("Enter the second integer:");
   number2= input.nextInt();
   System.out.print("Enter the third integer:");
   number3= input.nextInt();
   
   System.out.println("User entered numbers are:"+number1+" "+number2+" "+number3);
   
   //Calculation
   if (number1>number2 && number1>number3)
    {
      System.out.println("The largest number is:"+number1);
    }
   else if ( number2>number1 && number2>number3)
      {
        System.out.println("The largest number is:"+number2);
       }
   else if ( number3>number1 && number3>number2)
      {
       System.out.println("The largest number is:"+number3);
      }
     if(number1<number2 && number1<number3)
      {
        System.out.println("The smallest number is:"+number1);
       }
      else if (number2<number1 && number2<number3)
       {
        System.out.println("The smallest number is:"+number2);
        }
      else if(number3<number1 && number3<number2)

        {
          System.out.println("The smallest number is:"+number3);
        }
  //Close input
   input.close();
 }
}

    