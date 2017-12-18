import java.util.Scanner;


public class ExceptionTry {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("I need integer number");
		
		String s;
		while (in.hasNext()){
			s = in.next();
			
			try {
				check(s);
			} catch (MyException e) {
				System.out.println(e.getMessage());
				System.out.println("Try again later! Bye!");
				System.exit(0);
			} 
			System.out.println("Well done!");
		}
		
	}
	
	public static void check(String s) throws MyException {
		try {
			Integer.parseInt(s);
		} catch (Exception e) {
			throw new MyException();
		}
	}

}
