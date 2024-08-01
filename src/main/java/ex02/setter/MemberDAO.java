package ex02.setter;

public class MemberDAO {

	private MyDataSource myDataSource;
	
	// setter 주입
	public void setMyDataSource(MyDataSource myDataSource) {
		this.myDataSource = myDataSource;
	}
	
	// getter 주입
	public MyDataSource getMyDataSource() {
		return myDataSource;
	}
}
