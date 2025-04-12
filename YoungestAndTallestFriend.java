import java.util.Scanner;
class YoungestAndTallestFriend{
public static void main(String[] args){
  double [] height = new double[3];//declaring an array
  int [] age = new int[3];
  Scanner input = new Scanner(System.in);
  for(int i=0;i<3;i++){
	  System.out.println("Enter age and height of "+(i+1)+" friend");
	  age[i] = input.nextInt();
	  height[i] = input.nextDouble();
  }
  int youngest = age[0];
  double tallest = height[0];
  for(int i = 1;i<3;i++){
	  if(age[i]<youngest){
		  youngest = age[i];
	  }
	  if(height[i]>tallest){
		  tallest = height[i];
	  }
  }
  if(youngest==age[0]){
	  System.out.println("Amar is youngest");
  }
  else if(youngest==age[1]){
	  System.out.println("Akbar is youngest");
  }
  else{
	  System.out.println("Anthony is youngest");
  }
  if(tallest==height[0]){
	  System.out.println("Amar is tallest");
  }
  else if(tallest==height[1]){
	  System.out.println("Akbar is tallest");
  }
  else{
	  System.out.println("Anthony is tallest");
  }
}
}