package inheritencePractice;



class A {
	int a;
	void display(){
		System.out.println("Display"+a);
	}
}


class B extends A {
	int c;
	void show(){
		System.out.println("show the value"+c);
	}
}




class InheritenceType {
	

	public static void main(String[] args) {
		
		B obj = new B();
		obj.a=10;
		obj.display();
		obj.c=1111;
		obj.show();
		
	}
}
