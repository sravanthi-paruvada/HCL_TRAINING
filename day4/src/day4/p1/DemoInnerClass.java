package day4.p1;

class outer{
	private int i=99;
	class inner{
		private int i=88;
		public void doInner() {
			System.out.println("do inner of inner class"+outer.this.i+":"+this.i);
		}
	}
	
	public void doouter() {
		inner inn=this.new inner();
		inn.doInner();
	}
}
public class DemoInnerClass {
	public static void main(String []args) {
		outer.inner  test=new outer().new inner();
		test.doInner();
	}

}
