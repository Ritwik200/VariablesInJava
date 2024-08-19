package Variables;

public class LocalVariable {

	public void calculate() {
		int height = 0;
		height = height + 170;
		System.out.println("height is: "+ height + " cm");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		LocalVariable a =new LocalVariable();
		a.calculate();
	}

}
