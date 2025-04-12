import java.util.Scanner;
class LargestAndSecondLargestNumber{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.println("Enter a number: ");
  int number = input.nextInt();
  int maxDigits = 10;
  int [] digits = new int[maxDigits];
  int index = 0;
  int number2 = 0;
  while(number>0){
	  int number1 = number%10;
	  digits[index] = number1;
	  index++;
	  number = number/10;
	  if(index==10){
		  break;
	  }
  }
  int largestNumber = digits[0], secondLargestNumber = digits[0];    
  for(int i = 0;i<10;i++){
	  if(digits[i]>largestNumber){
		  largestNumber = digits[i];
		  number2 = i;
	  }
  }
  for(int j=0;j<10;j++){
		  if(j==number2){
		    continue;
		  }
		  else{
		    if(digits[j]>secondLargestNumber&&digits[j]!=largestNumber){
			  secondLargestNumber = digits[j];
		    }
		  }
	  }		  
  System.out.println("Largest number is "+largestNumber);
  System.out.println("Second Largest number is "+secondLargestNumber);
}
}