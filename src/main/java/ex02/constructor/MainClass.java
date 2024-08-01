package ex02.constructor;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// 자바 문법
//		Hotel hotel = new Hotel(new Chef());
//		hotel.getChef().cooking();
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("application-context.xml");
	
		Hotel hotel = ctx.getBean("hotel", Hotel.class); // hotel 이름의 Hotel 클래스 찾아달라는 의미
		hotel.getChef().cooking();
	}

}
