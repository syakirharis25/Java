package day1.excercises;

public class ExcerciseA {

	public static void main(String[] args) {
		
		double salary = 20000;
		double tax = 0.0;
		
		if(salary <= 15000){
			tax = salary * .10;
		}else if(salary <= 40000){
			tax = salary * .20;
		}else{
			tax = salary * .30;
		}
		System.out.println("Tax = " + tax);

	}

}
