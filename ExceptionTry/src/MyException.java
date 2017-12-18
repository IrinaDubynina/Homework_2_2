
public class MyException extends NumberFormatException{
	public MyException() {
		super();
	}
	public String getMessage(){
		String s = "I need INTEGER NUMBER! Not real! Not String!";
		return s;
		
	}
}
