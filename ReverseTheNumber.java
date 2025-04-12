import java.util.Scanner;
class ReverseTheNumber{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.println("Enter a number: ");
  int number = input.nextInt();
  int maxDigits = 10;
  int [] originalNumber = new int[maxDigits];
  int indexoforiginalNumber = 0;
  while(number>0){
	  int number1 = number%10;
	  originalNumber[indexoforiginalNumber] = number1;
	  indexoforiginalNumber++;
	  number = number/10;
  }
  int indexofreverseNumber = 0;
  int [] reverseNumber = new int[maxDigits];
  for(int i=indexoforiginalNumber;i>=0;i--){
	  reverseNumber[indexofreverseNumber] = originalNumber[i];
	  indexofreverseNumber++;
  }
  System.out.println("Reverse number: ");
  for(int i=0;i<indexofreverseNumber;i++){
	  System.out.print(reverseNumber[i]);
  }
}
}