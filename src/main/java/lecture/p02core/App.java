package lecture.p02core;

public class App { // about spring
	public static void main(String[] args) {
		// 우리가 control
		Servlet1 servlet1 = new Servlet1();
		servlet1.setProductDao(new ProductDao()); // set 필드(의존성-dependency)
		servlet1.doGet();
		
		System.out.println("프로그램 계속 진행...");
		
		// 의존성 dependency는 하나의 객체가 다른 객체 없이 있을 수 없다는 것
		// 우리가 하는게 아닌 spring이 해주는걸 Injection 주입 이라고 함
		// DI (Dependency Injection)
		// Control의 역전이 일어났다. 따라서 Inversion of Control (IOC) 제어역전, 제어반전 이라고 한다
	}
}
