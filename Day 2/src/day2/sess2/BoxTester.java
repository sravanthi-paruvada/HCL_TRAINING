package day2.sess2;

class BoxTwoD
{
	private int l;
	private int b;
	public BoxTwoD() {}
	public BoxTwoD(int l,int b) {
		this.l=l;
		this.b=b;
	}
		
		public void print() {
			System.out.println("len "+l+"bre "+b);
		}
}
class BoxThD extends BoxTwoD{
	
		private int h;
		public BoxThD() {}
		public BoxThD(int l,int b,int h) {
			super(l,b);
			this.h=h;
			}
			public void print() {
				super.print();
				System.out.println("hei "+h);
			}
		}
class BoxFD extends BoxThD
{
	private String color;
	public BoxFD() {}
	public BoxFD(int l,int b,int h,String color) {
		super(l,b,h);
		this.color=color;
		}
		public void print() {
			super.print();
			System.out.println("color "+color);
		}
	}
	
	
public class BoxTester {
	public static void main(String args[]) {
		BoxFD boxfd = new BoxFD(12,13,4,"white");
		boxfd.print();
	}

}
