package org.zerock.controller.lecture.p03forward;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex14")
public class Controller14 {
	// 1. 요청받고
	// 2. request parameter 수집 
	// 2. request parameter 가공
	// 4. business logic
	// 5. add attribute
	// 6. forward / redirect
	
	@RequestMapping("sub01")
	public void method1(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("메소드 1번 일함!!!");
		String path = "/WEB-INF/views/ex14/sub01.jsp";
		req.getRequestDispatcher(path).forward(req, res);
	}
	
	@RequestMapping("sub02")
	public String method2() {
		System.out.println("메소드 2번 일함!!!");

		return "abc"; // /WEB-INF/views/abc.jsp 를 찾으려 한다 // 없음 // 스트링만 리턴하면 뷰 이름으로 간주된다!
	}	
	
	// sub03 경로
	// /WEB-INF/views/xyz.jsp 로 포워드하는 메소드 작성
	@RequestMapping("sub03")
	public String method3() {
		System.out.println("메소드 3번 일함!!!");
		
		return "xyz";
	}
	
	@RequestMapping("sub04")
	public String method4() { // WEB-INF폴더의 것들은 웹에서 접근할 수 없지만 이렇게 하면 볼 수 있다.
		
		// /WEB-INF/views/ex14/sub04.jsp
		return "ex14/sub04";
	}
	
	// sub05 요청
	// /WEB-INF/views/ex14/sub05.jsp forword
	@RequestMapping("sub05")
	public String method5() {
		
		return "ex14/sub05";
	}
}