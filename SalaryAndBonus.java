import java.util.Scanner;
class SalaryAndBonus{
public static void main(String[] args){
  double [][] salaryAndServiceYears = new double[2][10];//declaring an array
  Scanner input = new Scanner(System.in);
  for(int i=0;i<2;i++){
	  for(int j = 0;j<10;j++){
		  if(i==0){
		  System.out.println("Enter your salary: ");
		  salaryAndServiceYears[i][j] = input.nextDouble();
		  if(salaryAndServiceYears[i][j]<=0){
			  System.out.println("Wrong Salary! Please enter again");
			  j--;
			  continue;
		  }
		  }
		  if(i==1){
		  System.out.println("Enter your years of service: ");
		  salaryAndServiceYears[i][j] = input.nextDouble();
		  if(salaryAndServiceYears[i][j]<0){
			  System.out.println("Wrong Years of service! Please enter again");
			  j--;
			  continue;
		  }
		  }
	  }
  }
  double [] newSalary = new double[10];
  double [] bonus = new double[10];
  double totalBonus= 0, totalNewSalary = 0, totalOldSalary = 0;
  for(int i = 0;i<10;i++){
	  if(salaryAndServiceYears[1][i]>5){
		  bonus[i] = (salaryAndServiceYears[0][i]*5)/100;
		  newSalary[i] = salaryAndServiceYears[0][i]+bonus[i];
		  totalBonus += bonus[i];
		  totalNewSalary += newSalary[i];
	  }
	  else{
		  bonus[i] = (salaryAndServiceYears[0][i]*2)/100;
		  newSalary[i] = salaryAndServiceYears[0][i]+bonus[i];
		  totalBonus += bonus[i];
		  totalNewSalary += newSalary[i];
	  }
  }
  for(int i = 0;i<10;i++){
	  totalOldSalary += salaryAndServiceYears[0][i];
  }
  System.out.println("Total Bonus is "+totalBonus+"\nTotal new salary is "+totalNewSalary+"\nTotal old salary is "+totalOldSalary);
}
}