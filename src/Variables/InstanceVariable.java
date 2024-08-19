package Variables;

public class InstanceVariable {
	public int rollNum;
	public String Name;
	public int totalMarks;
	public int number;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariable in = new InstanceVariable();
		in.rollNum = 100891;
		in.Name = "Ritwik";
		in.totalMarks = 480;
		
		System.out.println(in.rollNum);
		System.out.println(in.Name);
		System.out.println(in.totalMarks);
		System.out.println(in.number);
	}

}
