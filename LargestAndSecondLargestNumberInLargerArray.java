import java.util.Scanner;
class LargestAndSecondLargestNumberInLargerArray{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.println("Enter a number: ");
  long number = input.nextLong();
  int maxDigits = 10;
  long [] digits = new long[maxDigits];
  int index = 0;
  int number2 = 0;
  while(number>0){
	  long number1 = number%10;
	  digits[index] = number1;
	  index++;
	  number = number/10;
	  if(index==maxDigits){
		  maxDigits += 10;
		  long [] temp = new long[maxDigits];
		  for(int i = 0;i<10;i++){
			  temp[i] = digits[i];
		  }
		  digits = temp;
	  }
  }
  long largestNumber = -1, secondLargestNumber = -1;    
  for(int i = 0;i<index;i++){
	  if(digits[i]>largestNumber){
		  largestNumber = digits[i];
		  number2 = i;
	  }
  }
  for(int j=0;j<index;j++){
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