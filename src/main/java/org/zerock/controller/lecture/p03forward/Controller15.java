package org.zerock.controller.lecture.p03forward;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex15")
public class Controller15 {
	
	// ex15/sub01
	@RequestMapping("sub01") // 자동 jsp로 포워드
	public void method1() {
		System.out.println("메소드1번 일함");
	}
	
	// sub02 요청
	// WEB-INF/views/ex15/sub02.jsp 로 포워드
	@RequestMapping("sub02")
	public void method2() {
		System.out.println("메소드2번 일함");
	}

	@RequestMapping("sub03")
	public String method3() {
		
		// void처럼 default view name을 사용해서 view로 포워드
		return null;
	}
	
	// sub04 요청
	// WEB-INF/views/ex15/sub04.jsp 로 포워드
	@RequestMapping("sub04")									// 요청경로명
	public String method4() { 
		return null;	// return null은 요청경로가 곧 view의 이름이 되게 한다.
	}
	
	
	
	// sub05 요청
	// name request param이 있으면
	// WEB-INF/views/ex15/sub051.jsp 로 포워드
	// 없으면
	// WEB-INF/views/ex15/sub05.jsp 로 포워드
	@RequestMapping("sub05")
	public String method5(String name) {
		if (name == null) {
			return null;
		}
		
		return "ex15/sub051";
	}
	

	// sub06 요청
	// address request param이 있으면
	// WEB-INF/views/ex15/sub061.jsp 로 포워드
	// 없으면
	// WEB-INF/views/ex15/sub06.jsp 로 포워드
	
	@RequestMapping(path = "sub06", params = "address")
	public String method6() {
		return "ex15/sub061";
	}
	
	@RequestMapping("sub06") 
	public void method7() {
		
	}
	
	
//	@RequestMapping("sub06")
//	public String method6(String address) {
//		if (address == null) {
//			return null;
//		}
//		
//		return "ex15/sub061";
//	}

}
