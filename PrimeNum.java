import java.util.Scanner;
public class PrimeNum{
	public static void main(String [] args){
		// get how many prime numbers you want
		System.out.print("Enter how many prime numbers you want :- ");
		Scanner input=new Scanner(System.in);
		int numofprime=input.nextInt();
		int number=2;
		int count=0;
		while(count<numofprime){
			boolean isP = true;
			for(int div=2;div<=number/2;div++){
				if(number%div==0){
					isP=false;
					break;
				}
			}
			if(isP){
				count++;
				System.out.println(number);
			}
			number++;
		}
	}
}