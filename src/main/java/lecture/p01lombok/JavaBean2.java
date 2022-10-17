package lecture.p01lombok;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JavaBean2 {
	private String company;
	private int score;
	private String location; 
	
	// source에서 getter setter 메소드도 가능하고
	// 위에서 annotation으로 @Getter @Setter 사용도 됨
}
