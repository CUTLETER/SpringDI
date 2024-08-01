package ex03.autowired;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("autowired-context.xml");
		
		Printer pt = ctx.getBean("printer", Printer.class);
		System.out.println(pt.getDocument().data);
	}

}
