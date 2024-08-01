package ex03.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Printer {
	
	@Autowired //(required = false)
	@Qualifier("doc1")
	private Document document;
	
	// Autowired = 의존 객체 자동 주입 태그
	// Autowired는 생성자, 멤버 변수, setter 메소드 에게 쓸 수 있음
	// bean 객체를 자동으로 주입시키며, 먼저 해당 타입을 찾아서 주입시킴
	// 해당 타입으로 찾을 수 없다면(동일한 타입이 중복으로 있을 때도 포함) 그 다음엔 name으로 찾아서 주입시킴
	// 멤버 변수에 autowired 사용할 때는 기본 생성자가 반드시 필요함
	// (required = false) 주입할 bean이 없으면 스프링이 에러를 발생시키는데 이거를 무시하고 지나가게끔 만드는 속성
	
	// Qualifier - bean 강제 연결
	// 컨테이너에 동일 객체가 여러 개 있을 때는 이름으로 강제 주입을 넣어주는 어노테이션
	
	
	public Printer() { // 그래서 만든 기본 생성자
		// TODO Auto-generated constructor stub
	}
	
	
	// 생성자 주입
	public Printer(Document document) {
		this.document = document;
	}

	public Document getDocument() {
		return document;
	}

	// 세터 주입
	public void setDocument(Document document) {
		this.document = document;
	}
	
	

}
