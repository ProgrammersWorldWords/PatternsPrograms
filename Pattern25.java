import java.util.*;

public class Pattern25{
	
	public static void main(String arg[]){
		
		System.out.println("*********************** Pattern25 ****************************");
		
		int rows,columns,num,abcd ;
		
		System.out.print("Enter a number : ");
		
		Scanner input = new Scanner(System.in);

		num = input.nextInt();

		for(columns=0;columns<=num;columns++){
			

			for(rows=num-columns;rows>0;rows--){

			    System.out.print(" ");
			   
			}
	                
			for(rows=0;rows<=columns;rows++){

			    System.out.print(columns);
			   
			}
	            System.out.println();
		} 
	}
}