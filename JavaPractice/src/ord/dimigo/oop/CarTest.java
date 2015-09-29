package ord.dimigo.oop;

public class CarTest {
	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		car1.Company("현대자동차");
		car1.Model("제네시스");
		car1.getColor("검정색");
		car1.getMaxSpeed("225");
		car1.getPrice("50000000");
	}
}
