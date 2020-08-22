import java.util.*;

public class Pattern14{
	
	public static void main(String arg[]){
		
		System.out.println("*********************** Pattern14 ****************************");
		
		int rows,columns,num ;
		
		System.out.print("Enter a number : ");
		
		Scanner input = new Scanner(System.in);

		num = input.nextInt();

		for(columns=0;columns<=num;columns++){
			
			for(rows=0;rows<columns;rows++){
				
			    System.out.printf("%c",65+rows);
			}
	            System.out.println();
		} 
	}
}