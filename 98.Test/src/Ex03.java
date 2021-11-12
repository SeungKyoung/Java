
public class Ex03 {
	//어떤 상태정보 
	//또는 어떤 기능들을 정의해놓고 다른곳에서 사용할수있게하는 클래스(객체)
	//어떤 상태정보 == FIELD , 클래스 블럭 안에 있는 변수 , 멤버
	//어떤 기능들 == 메소드 
	//public static void main(String[] arg) { }
	//자바에서는 프로그램 시작 지점이 어딘지 인식을 못한다.
	int data1; //상태정보 숫자형
	String data2;//상태정보 문자형
	
	//생성자 메소드 규칙
	//현재 클래스의 이름을 똑같이 써준다.() { }
	//파라메터가 없는 형태의 생성자 메소드
	public Ex03() {
		
	}
	//변수를 선언 <- 파라메터 추가
	//int data = 10;
	public Ex03(int data) {
		System.out.println(data);
	}
	public Ex03(String data) {
		System.out.println(data);
	}
	public Ex03(int data1 , String data2) {
		//this <- 지금 여기에 있는.
		this.data1 = data1;//메소드 호출시 보내준 값이 data1에담기고
						   //지금 여기에있는(this)변수에 그값을 담는다.
		this.data2 = data2;
	}
	
	//생성자 메소드 오버로딩
	//메소드를 같은이름으로 사용하는데
	//파라메터(인자)를 갯수를 달리하거나
	//파라메터(인자)의 타입을 달리하면
	//컴퓨터가 어떤 메소드를 부르는지 
	//인식하기때문에 같은이름으로 여러개
	//사용하게 만들어놓고 선택해서 사용하는것
	
	
}
