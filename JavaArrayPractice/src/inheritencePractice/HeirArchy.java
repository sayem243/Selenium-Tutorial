package inheritencePractice;


class Parent{
	void ParentClassDisplay(int a) {
		System.out.println("Here is the valu: "+ a);
	}
	
}


class child1 extends Parent {
	 
	void child1classDisplay(int b) {
		System.out.println("Here is the valu of b: "+ b);
	}
	
}

class child2 extends Parent {
	
	void child1classDisplay(int c) {
		System.out.println("Here is the value of c: "+ c);
	}
	
	
}



public class HeirArchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		child2 obj = new child2();
		obj.child1classDisplay(12);
		obj.ParentClassDisplay(1);

	}

}
