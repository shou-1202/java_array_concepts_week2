import java.util.Scanner;
class MarksPercentageAndGradeUsingArray{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.println("Enter number of students: ");
  int numberOfStudents = input.nextInt();
  double [] physics = new double[numberOfStudents];
  double [] chemistry = new double[numberOfStudents];
  double [] maths = new double[numberOfStudents];
  double [] percentage = new double[numberOfStudents];
  for(int i=0;i<numberOfStudents;i++){
	  System.out.println("Enter marks in Physics of "+(i+1)+" student" );
	  physics[i] = input.nextDouble();
	  System.out.println("Enter marks in Chemistry of "+(i+1)+" student" );
	  chemistry[i] = input.nextDouble();
	  System.out.println("Enter marks in Maths of "+(i+1)+" student" );
	  maths[i] = input.nextDouble();
	  percentage[i] = (physics[i]+chemistry[i]+maths[i])/3;
  }
  String [] grade = new String[numberOfStudents];
  for(int i = 0;i<numberOfStudents;i++){
	  if(percentage[i]>=80){
	    grade[i] = "A";
	  }
	  else if(percentage[i]>=70){
		grade[i] = "B";
	  }
	  else if(percentage[i]>=60){
		grade[i] = "C";
	  }
	  else if(percentage[i]>=50){
		grade[i] = "D";
	  }
	  else if(percentage[i]>=40){
		grade[i] = "E";
	  }
      else{
        grade[i] = "R";		
	  }		
  }
  for(int i =0;i<numberOfStudents;i++){
	  System.out.println("\nDetails of "+(i+1)+" Student: " );
	  System.out.print("Marks in Physics: "+physics[i]+"\nMarks in Chemistry: "+chemistry[i]+"\nMarks in Maths: "+maths[i]+"\nPercentage: "+percentage[i]);
	  System.out.println("\nGrade: "+grade[i]);
  }
}
}