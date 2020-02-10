import java.util.*;
import java.io.*;

public class Taskperf6 {
    public static void main(String[] args) throws Exception {
    	
    Scanner sc = new Scanner(System.in);
 	System.out.println("Type '1' for register and type '2' for Login");
 	int choose = sc.nextInt();
 	
 	
 	if(choose == 1){
 		
 		System.out.println("Creating account... Please input username and password");
 		System.out.print("Username: ");
 		String username = sc.next();
 		System.out.print("Password: ");
 		String password = sc.next();
 		
 		String Credentials = username + " " + password; 
	 	
 		String filename = "Register.txt";
 		File input = new File(filename);
 		input.createNewFile();
 		FileWriter write = new FileWriter(filename);
 		write.write(Credentials);
		write.flush();
		
		System.out.println(" ");
		System.out.println("Account created successfuly");
 		}
 		
 	else if(choose == 2){
 		System.out.println("Logging in... Please type Username name and Password");
 		System.out.print("Username: ");
 		String user = sc.next();
 		System.out.print("Password: ");
 		String pass = sc.next();
 		
 		String filename = "Register.txt";
 		RandomAccessFile file = new RandomAccessFile(filename, "r");
		String input = file.readLine();
		String[] cred = input.split(" ");
		
		String Coruser = cred[0];
		String Corpass = cred[1];
	
	    if(user.equals(Coruser) && pass.equals(Corpass)){
	    	System.out.print("Login succesful, Congrats :)");
	    	}else{
	    		System.out.print("Wrong username or password, please try again");
	    		}
    	
    } else{
    	System.out.println("Error Please try again and enter a valid number");
    	}
}
}
