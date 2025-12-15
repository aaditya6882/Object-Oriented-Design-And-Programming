package Tutorial5;
interface Workable{
	void work();
}
interface Eatable{
	void eat();
}
class Employee implements Workable,Eatable{
	@Override
	public void work(){
		System.out.println("Employee is Work");
	}
	@Override
	public void eat() {
		System.out.println("Employee is Eating");
	}
}
class Robot implements Workable{
	@Override
	public void work(){
		System.out.println(" Robot is Work");
	}
}
public class ISPSolution {
public static void main(String[] args) {
	Workable workable=new Employee();
	Workable robotWorkable=new Robot();
	workable.work();
	robotWorkable.work();
	if (workable instanceof Eatable) {
		((Eatable) workable).eat();
	}
}
}
