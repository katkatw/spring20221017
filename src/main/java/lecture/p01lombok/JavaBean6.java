package lecture.p01lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter 
@AllArgsConstructor // 모든 필드를 argument로 받는 생성자 생성 // 어노테이션 아닐 시 source 탭에서 Constructor using Fields
@NoArgsConstructor // 아규먼트 없는 생성자 추가*
public class JavaBean6 { // 생성자를 안만들면 argument 없는 기본 생성자 생성되는데 Outline에는 안나옴 // 생성자를 만들면 기본생성자가 삽입이 안됨*
	private String name;
	private int age;
	
}
