package tabla;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
	
		
		try {
			Scanner userInput = new Scanner(System.in);	
			
			System.out.println("Which table do you want?");
			int timetable = userInput.nextInt();
			
			TimeTable  myTimeTable = new TimeTable(timetable); 
		
			if (timetable<=10) {
				
				int cont=0;
				for (int  value : myTimeTable.multiplicationTableArrayList()) {
					
					System.out.println(timetable+" x "+cont+" = "+value);
					cont++;	
				}  

			}else {
					throw new Exception("Number is too big");
			}
			
			
			
	 
			
		} catch (Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
		
		
		
	 
		
		
	/*	for (String x:myTimeTable.multiplicationTableArray()){
			
			System.out.println(x);
			
			
		}*/
		
	
	}

}
