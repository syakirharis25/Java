package day1.examples;

public class ExampleAndOr {

	public static void main(String[] args) {
		int x, y;
		x = -10;
		y = 10;
	
		// && and
		if(x > 0 && y > 0){
			System.out.println(" Both nums are +ve");
		}else if(x > 0 || y > 0){
			System.out.println(" At least one num is +ve");
		}else{
			System.out.println(" Both nums are -ve");
		}
	}
}
