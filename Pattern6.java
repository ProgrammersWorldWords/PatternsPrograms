import java.util.*;

public class Pattern6{
	
	public static void main(String arg[]){
		
		System.out.println("*********************** Pattern6 ****************************");
		
		int rows,columns,num ;
		
		System.out.print("Enter a number : ");
		
		Scanner input = new Scanner(System.in);

		num = input.nextInt();

		for(columns=num;columns>0;columns--){
			
			for(rows=0;rows<num;rows++){
				
			    System.out.print(columns);
			}
	            System.out.println();
		}
	}
}