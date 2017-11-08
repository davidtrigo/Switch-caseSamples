package tabla;

import java.util.ArrayList;

public class TimeTable {

	private int loopVal = 0;
	private int endValue = 10;
	private int addition = 0;
	private int timeTable = 0;

	public TimeTable(int timeTable) {
		this.timeTable = timeTable;
	}

	public  void multiplicationTable(){
		
		for (int loopVal=0;loopVal<endValue;loopVal++){
			
			addition=loopVal* timeTable;
			
			System.out.println(timeTable+ " x "+loopVal+" = "+addition);
			
		}
	}
	
	public  String[] multiplicationTableArray(){
		
		  int result;
	      String resultTable[] = new String [10];
		
		  for (int i = 0; i < resultTable.length; i++) {
			  result = i*this.timeTable;
			  resultTable[i] = (timeTable+ " x "+ i +" = "+result);
			
		  }
		  return resultTable;
	  
	} 
	
	public ArrayList<Integer> multiplicationTableArrayList(){
		
		int result;
		ArrayList<Integer> resultTable = new ArrayList<>();
		
		for(int i=0; i<this.endValue+1;i++){
			
			result = i*this.timeTable;
			resultTable.add(result);
		
		}
		
	 return resultTable;
	
	}
	
	
	
	
	 
}
