package lecture.p01lombok;

import lombok.Getter;
import lombok.Setter;

	public class JavaBean3 { // 특정 필드에만 쓰고 싶을때 { } 안에 넣어서 쓸 수 있다.
	@Getter
	@Setter
	private String name;
	
	@Getter
	@Setter
	private int age;
	
}
