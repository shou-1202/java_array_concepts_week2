import java.util.Scanner;
class BmiOfPerson{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.println("Enter number of persons: ");
  int numberOfPersons = input.nextInt();
  double [] weight = new double[numberOfPersons];
  double [] height = new double[numberOfPersons];
  double [] BMI = new double[numberOfPersons];
  String [] weightStatus = new String[numberOfPersons];
  for(int i=0;i<numberOfPersons;i++){
	  System.out.println("Enter height of "+(i+1)+" person" );
	  height[i] = input.nextDouble();
  }
  for(int i=0;i<numberOfPersons;i++){
	  System.out.println("Enter weight of "+(i+1)+" person" );
	  weight[i] = input.nextDouble();
	  BMI[i] = weight[i]/(height[i]*height[i]);
  }
  for(int i = 0;i<numberOfPersons;i++){
	  if(BMI[i]<=18.5){
		  weightStatus[i] = "Underweight";
	  }
	  else if(BMI[i]<=24.9){
		  weightStatus[i] = "Normal";
	  }
	  else if(BMI[i]<=39.9){
		  weightStatus[i] = "Overweight";
	  }
	  else{
		  weightStatus[i] = "Obese";
	  }
  }
  for(int i =0;i<numberOfPersons;i++){
	  System.out.println("\nBMI and Weight status of "+(i+1)+" person" );
	  System.out.printf("%.2f", BMI[i]);
	  System.out.print(" "+weightStatus[i]);
  }
}
}