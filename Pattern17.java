import java.util.*;

public class Pattern17{
	
	public static void main(String arg[]){
		
		System.out.println("*********************** Pattern17 ****************************");
		
		int rows,columns,num,abcd ;
		
		System.out.print("Enter a number : ");
		
		Scanner input = new Scanner(System.in);

		num = input.nextInt();

		for(columns=0;columns<num;columns++){
				abcd = 0 ;
			
			for(rows=num-columns;rows>0;rows--){

			    System.out.print(abcd);
			    abcd++;
			}
	            System.out.println();
		} 
	}
}