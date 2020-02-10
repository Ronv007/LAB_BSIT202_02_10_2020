	class favesong{
		 static String song = "Make you mine";
		}
		
public class LAB1 extends favesong{
	
	public static String quote = "I'll leave tomorrow's problems to tomorrow's me.";
	
    public static void main(String[] args){
		LAB1 song = new LAB1();	
		System.out.println("My fave song is: " + LAB1.song +" and my fave quote is: " + LAB1.quote);	
    }
}