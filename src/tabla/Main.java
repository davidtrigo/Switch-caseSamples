package tabla;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner userInput = new Scanner(System.in);	
		
		System.out.println("Which table do you want?");
		int timetable = userInput.nextInt();

	 
		TimeTable  myTimeTable = new TimeTable(timetable); 
		
	/*	for (String x:myTimeTable.multiplicationTableArray()){
			
			System.out.println(x);
			
			
		}*/
		
		int cont=0;
		for (int  value : myTimeTable.multiplicationTableArrayList()) {
			
			System.out.println(timetable+" x "+cont+" = "+value);
			cont++;
		}
	}

}
