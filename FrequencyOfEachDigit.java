import java.util.Scanner;
class FrequencyOfEachDigit{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.println("Enter a number: ");
  long number = input.nextLong();
  long num1 = number;
  int count = 0;
  while(num1>0){
	  num1 = num1/10;
	  count++;
  }
  int index= 0;
  long [] digits = new long[count];
  while(number>0){
	  long num2 = number%10;
	  number = number/10;
	  digits[index] = num2;
	  index++;
  }
  int [] frequency = new int[10];
  for(int i =0;i<10;i++){
	  frequency[i] = 0;
  }
  for(int i = 0;i<count;i++){
	  if(digits[i]==0){
	    frequency[0] += 1;
	  }
	  else if(digits[i]==1){
		frequency[1] += 1;
	  }
	  else if(digits[i]==2){
		frequency[2] += 1;
	  }
	  else if(digits[i]==3){
		frequency[3] += 1;
	  }
	  else if(digits[i]==4){
		frequency[4] += 1;
	  }
      else if(digits[i]==5){
        frequency[5] += 1;	
	  }	
      else if(digits[i]==6){
        frequency[6] += 1;
	  }
      else if(digits[i]==7){
        frequency[7] += 1;
	  }
      else if(digits[i]==8){
        frequency[8] += 1;
	  }
      else{
        frequency[9] += 1;
	  }		  
  }
  for(int i =0;i<10;i++){
	  System.out.println("\nFrequency "+(i)+" digit: "+ frequency[i] );
  }
}
}