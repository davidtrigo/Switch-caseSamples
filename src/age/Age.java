package age;

public class Age {

		private int age;

		public Age(int age) {
			this.age = age;
		}

		public String checkAge(){
			
			String message;

			switch (age) {
				case 0: case 1: case 2:case 3: case 4: case 5: case 6:case 7:  case 8: case 9: case 10:
					message= age+ " is between 0 and 10";
					break;
				case 11: case 12: case 13: case 14: case 15: case 16:case 17: case 18: case 19: case 20:
					message = age+ " is between 11 and 20";
						break;	
				case 21: case 22: case 23: case 24: case 25: case 26:case 27: case 28: case 29: case 30:
					message = age+ " is between 21 and 30";
						break;
				default:
					message = "You're are over 30";
					break;
			}
			return message;

		} 	
}
