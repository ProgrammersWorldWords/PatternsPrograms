import java.util.*;

public class Pattern21{
	
	public static void main(String arg[]){
		
		System.out.println("*********************** Pattern21 ****************************");
		
		int rows,columns,num,abcd ;
		
		System.out.print("Enter a number : ");
		
		Scanner input = new Scanner(System.in);

		num = input.nextInt();

		for(columns=0;columns<num;columns++){
			
			for(rows=num;rows>columns;rows--){

			    System.out.print(rows);
			   
			}
	            System.out.println();
		} 
	}
}