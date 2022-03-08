class ParamConstExample{
	int id;
	String name;
	
	ParamConstExample(int pid,String pname){
		id = pid;
		name = pname;
	}
	void display() {
		System.out.println("Name = "+name+" Id = "+id);
	}
}
public class ParametarizedConstEx {

	public static void main(String[] args) {
		ParamConstExample p = new ParamConstExample(101,"Preyas");
		p.display();

	}

}
