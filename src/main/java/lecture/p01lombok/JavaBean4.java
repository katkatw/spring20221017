package lecture.p01lombok;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public class JavaBean4 { // source의 toString 메소드 // Outline 탭에 안보이고 보이고를 '//' 로 가능
	private String address;
	private int score;
	
	
}
