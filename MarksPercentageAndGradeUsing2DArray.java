import java.util.Scanner;
class MarksPercentageAndGradeUsing2DArray{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.println("Enter number of students: ");
  int numberOfStudents = input.nextInt();
  double [][] studentData = new double[numberOfStudents][4];
  for(int i=0;i<numberOfStudents;i++){
	  System.out.println("Enter marks in 3 subjects of "+(i+1)+" student" );
	  studentData[i][0] = input.nextDouble();
	  studentData[i][1] = input.nextDouble();
	  studentData[i][2] = input.nextDouble();
	  studentData[i][3] = (studentData[i][0]+studentData[i][1]+studentData[i][2])/3;
  }
  String [] grade = new String[numberOfStudents];
  for(int i = 0;i<numberOfStudents;i++){
	  if(studentData[i][3]>=80){
	    grade[i] = "A";
	  }
	  else if(studentData[i][3]>=70){
		grade[i] = "B";
	  }
	  else if(studentData[i][3]>=60){
		grade[i] = "C";
	  }
	  else if(studentData[i][3]>=50){
		grade[i] = "D";
	  }
	  else if(studentData[i][3]>=40){
		grade[i] = "E";
	  }
      else{
        grade[i] = "R";		
	  }		
  }
  for(int i =0;i<numberOfStudents;i++){
	  System.out.println("\nDetails of "+(i+1)+" Student: " );
	  System.out.print("Marks in Physics: "+studentData[i][0]+"\nMarks in Chemistry: "+studentData[i][1]+"\nMarks in Maths: "+studentData[i][2]+"\nPercentage: "+studentData[i][3]);
	  System.out.println("\nGrade: "+grade[i]);
  }
}
}