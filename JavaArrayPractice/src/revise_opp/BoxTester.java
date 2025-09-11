package revise_opp;

public class BoxTester {
	
	public static void main(String[] args)  {
		
		Box box= new Box();
		int a=box.length;
		box.setData(2, 1, 2);
		
		Box box2= new Box();
		box2.setData(10, 6, 9);
		box2.print();
		box2.Volume();
		
		
		//System.out.println(a);
		
		Box[] box_obj= new Box[3];
		box_obj[0]=box;
		box_obj[1]=box2;
		
		
	}
	
}
