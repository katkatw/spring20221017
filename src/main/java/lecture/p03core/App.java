package lecture.p03core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) { // Interface라 바로 객체를 만들 수 없는 AC. 따라서 Xml 들어간 클래스를 쓰면 된다.
		// application context가 필요한 객체bean을 만들고 의존성을 만들어주는 메소드
		String configLocation = "/lecture/p03core/context.xml";
		
		ApplicationContext context;
		context = new ClassPathXmlApplicationContext(configLocation); // 다형성 때문에 가능함
		
		Servlet s = context.getBean(Servlet.class);
		Dao d = context.getBean(Dao.class);
		
		System.out.println(s); // null 이 아니면 객체가 있다
		System.out.println(d);
		
		System.out.println("프로그램 계속 실행"); // 객체를 만들고 주입까지 한 상태
		
	}
}
