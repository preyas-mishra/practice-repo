
class ThisExample{
	int id;
	String name;
	ThisExample(int id,String name){
		this.id = id;
		this.name = name;
	}
	void display() {
		System.out.println(name+" "+id);
	}
}
public class ThisKeywordExample {

	public static void main(String[] args) {
		ThisExample thisexample = new ThisExample(101,"Preyas");
		thisexample.display();
	}

}
