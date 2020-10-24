package dat5.q3;

class Door implements AutoCloseable{

	@Override
	public void close() throws Exception {
		
		System.out.println("Close for door is called");		
	}
	public void doDoorLogic(){
		System.out.println("Door logic");		
		if(1==1)
			throw new NullPointerException();
		
	}
	
}

class Window implements AutoCloseable{

	@Override
	public void close() throws Exception {
	System.out.println("Close for window is called");	
		
	}
	public void doWindowLogic(){
		
		System.out.println("window logic");	
	}
	
}
public class HowArmWorks {
	public static void main(String []args) {
	try(Door door=new Door(); Window win=new Window())
		{
		
		door.doDoorLogic();
		win.doWindowLogic();
	}catch(Exception e)
		{
		System.out.println(e);
		}
		
	}
}
