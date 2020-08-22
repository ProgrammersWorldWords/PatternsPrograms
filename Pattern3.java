import java.util.*;

public class Pattern3{
	
	public static void main(String arg[]){
		
		System.out.println("*********************** Pattern1 ****************************");
		
		int rows,columns,num ;
		
		System.out.print("Enter a number : ");
		
		Scanner input = new Scanner(System.in);

		num = input.nextInt();

		for(columns=0;columns<=num;columns++){
			
			for(rows=0;rows<=num;rows++){
				
			    System.out.print(rows);
			}
	            System.out.println();
		}
	}
}