
package dat5.q3;

import java.util.Scanner;

public class AutomaticResourceManager {
	public static void main(String []args) {
		//ARM will close resource 
		try(Scanner scan=new Scanner(System.in)){
			System.out.println("Enter name");
			String name=scan.nextLine();
			System.out.println(name);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	 
	//Scanner scann=null;
	/*	try {
			scann =new Scanner(System.in);
		}
				finally {
					if(scann!=null)
						scann.close();
				}
			}
*/
	}


