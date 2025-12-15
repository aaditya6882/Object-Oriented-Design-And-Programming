package Tutorial5;

 class SmartKitchen{
	 Kitchen MyKitchen;
	 SecutritySystem myAlram;
	 public SmartKitchen(){
		 this.myAlram=new SecutritySystem();
		 this.MyKitchen=new Kitchen();
	 }
	 public void eveningRoutine() {
		 System.out.println("Evening Routine");
		 MyKitchen.cookFood();
		 myAlram.activate();
	 }
 }
public class Composition {
public static void main(String[] args) {
	 SmartKitchen smartKitchen=new SmartKitchen();
}
}
