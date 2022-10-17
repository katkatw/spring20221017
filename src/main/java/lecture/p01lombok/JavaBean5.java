package lecture.p01lombok;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data // 아래 네개의 어노테이션을 한번에 적용함
// @ToString
// @EqualsAndHashCode
// @Getter
// @Setter
// @RequiredArgsConstructor
public class JavaBean5 { // final 필드가 없어서 파라미터 없는 생성자
	private String name;
	private int age;
}
