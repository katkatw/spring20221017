package lecture.p01lombok;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor // final 필드 초기화하는 생성자 생성
@AllArgsConstructor
//@NoArgsConstructor
public class JavaBean7 {
	
	private final String name;
	private final int age;
	private String address;
	
	
	
//	JavaBean7(String name, int age, String address) {
//		this.name = name;
//		this.age = age; // final 필드를 안쓰면 오류
//		this.address = address; // final이 아니면 없어도 됨
//	}
}
