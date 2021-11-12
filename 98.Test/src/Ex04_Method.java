
public class Ex04_Method {
	//기능 , 함수 , function 
	//미리 기능을 정의해놓고 불러서 사용,
	//반복되는 코드를 줄이고.
	//여러가지 편리한 기능들을 정의해서 여러사람이 같이 사용할수있도록 해놓은것.
	//생성자 메소드 <= 클래스 이름과 똑같은 형태의 이름
	//예)public Ex04_Method() {   } <=생성자 메소드
	
	//일반 메소드 (void는 return타입이 없는 , void가 아닌 타입은 return 타입이 있는)
	//public void 메소드이름() {  } <=일반 메소드
	public void method1() {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
	}//파라메터가 없고 , 리턴타잆도 없는 형태의 메소드
	//     void   ,  ( ) <-비어있는 상태
	
	public void method1(int a) {
		System.out.println(a);
	}//파라메터가 있고 , 리턴타입이 없는 형태의 메소드
	
	public String method2() {
		//String rtnData = "kkk";
		//return rtnData;
		return "kkk";
	}//파라메터가 없고 , 리턴타입이 있는 메소드 ,== return이라는 키워드가 반드시 있어야함.
	//리턴타입==String , 반드시 return String을 해줘야한다.
	
	
	
	
}
