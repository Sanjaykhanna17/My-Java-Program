 import java.util.Scanner;

 public class Palindrome{
	 public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Number to Check Palindrome");
		 int number = sc.nextInt();
		 int temp = number;
		 int result = 0;
		 do{
			 int i = temp%10;
			 result = (result*10)+i;
			 temp = temp/10;
		 }while(temp>0);

		 if(number==result)
			 System.out.println(number+" is a Palindrome ");
		 else
			 System.out.println(number+" is not a Palindrome ");
	 }
 }
	
