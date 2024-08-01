package ex01;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
//  자바 방식		
//	SpringTest test = new SpringTest();
//		test.hello();

	GenericXmlApplicationContext ctx =
					new GenericXmlApplicationContext("application-context.xml");
	
	SpringTest test = ctx.getBean(SpringTest.class); /*SpringTest 타입의 객체를 꺼냄*/
	test.hello();
	
	SpringTest test2 = ctx.getBean(SpringTest.class); /*SpringTest 타입의 객체를 꺼냄*/
	
	System.out.println(test==test2); // 싱글톤일 때는 true로 나오며 프로토타입일 때는 false라고 나옴
	
	
	}	

}
