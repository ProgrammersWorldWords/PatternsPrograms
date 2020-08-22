import java.util.*;

public class Pattern9{
	
	public static void main(String arg[]){
		
		System.out.println("*********************** Pattern9 ****************************");
		
		int rows,columns,num ;
		
		System.out.print("Enter a number : ");
		
		Scanner input = new Scanner(System.in);

		num = input.nextInt();

		for(columns=num;columns>=0;columns--){
			
			for(rows=num;rows>=0;rows--){
				
			    System.out.printf("%c",65+rows);
			}
	            System.out.println();
		} 
	}
}