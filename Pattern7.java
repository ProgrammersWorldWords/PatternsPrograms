import java.util.*;

public class Pattern7{
	
	public static void main(String arg[]){
		
		System.out.println("*********************** Pattern7 ****************************");
		
		int rows,columns,num ;
		
		System.out.print("Enter a number : ");
		
		Scanner input = new Scanner(System.in);

		num = input.nextInt();

		for(columns=num;columns>0;columns--){
			
			for(rows=num;rows>0;rows--){
				
			    System.out.print(rows);
			}
	            System.out.println();
		}
	}
}