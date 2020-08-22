import java.util.*;

public class Pattern20{
	
	public static void main(String arg[]){
		
		System.out.println("*********************** Pattern20 ****************************");
		
		int rows,columns,num,abcd = 0 ;
		
		System.out.print("Enter a number : ");
		
		Scanner input = new Scanner(System.in);

		num = input.nextInt();

		for(columns=num;columns>0;columns--){
			
			for(rows=num-abcd;rows>0;rows--){

			    System.out.print(columns);
			}
				abcd++;
	            System.out.println();
		} 
	}
}