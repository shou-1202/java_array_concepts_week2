import java.util.Scanner;
class BmiOfPersonUsingMultidimensionalArray{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.println("Enter number of persons: ");
  int numberOfPersons = input.nextInt();
  double [][] weightAndHeightAndBMI = new double[numberOfPersons][3];
  String [] weightStatus = new String[numberOfPersons];
  for(int i=0;i<numberOfPersons;i++){
	  System.out.println("Enter height of "+(i+1)+" person" );
	  weightAndHeightAndBMI[i][0] = input.nextDouble();
  }
  for(int i=0;i<numberOfPersons;i++){
	  System.out.println("Enter weight of "+(i+1)+" person" );
	  weightAndHeightAndBMI[i][1] = input.nextDouble();
	  weightAndHeightAndBMI[i][2] = weightAndHeightAndBMI[i][1]/(weightAndHeightAndBMI[i][0]*weightAndHeightAndBMI[i][0]);
  }
  for(int i = 0;i<numberOfPersons;i++){
	  if(weightAndHeightAndBMI[i][2]<=18.5){
	  if(weightAndHeightAndBMI[i][2]<=18.5){
		  weightStatus[i] = "Underweight";
	  }
	  else if(weightAndHeightAndBMI[i][2]<=24.9){
		  weightStatus[i] = "Normal";
	  }
	  else if(weightAndHeightAndBMI[i][2]<=39.9){
		  weightStatus[i] = "Overweight";
	  }
	  else{
		  weightStatus[i] = "Obese";
	  }
  }
  for(int i =0;i<numberOfPersons;i++){
	  System.out.println("\nBMI and Weight status of "+(i+1)+" person" );
	  System.out.printf("%.2f", weightAndHeightAndBMI[i][2]);
	  System.out.print(" "+weightStatus[i]);
  }
}
}