package ex02.constructor;

public class Hotel {

	private Chef chef;
	
	// 호텔은 생성될 때 chef 객체를 받는다 (hotel은 chef 객체에 의존적이다)
	public Hotel(Chef chef) {
		this.chef = chef;
	}
	
	public Chef getChef() {
		return chef;
	}
}
