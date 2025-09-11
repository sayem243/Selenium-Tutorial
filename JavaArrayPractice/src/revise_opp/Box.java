package revise_opp;

public class Box {
	
	int width=10;
	int length= 15;
	double depthe=0.5;
	
	
	public void setData(int width, int length, int depth) {
		
		this.width=width;
		this.length=length;
		this.depthe=depth;
	}
	
	public void print() {
		System.out.println("Width :"+width +" "+ "Length: "+length+ " Deepth:"+depthe +"Volume:"+Volume());
	}
	
	public double Volume() {
		return width * length * depthe;
	}
	
	public static void main(String[] args) {
		
		
		
	}
}	

