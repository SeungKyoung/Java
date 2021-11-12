
public class Ex03Main {
	public static void main(String[] args) {
		//int a = 10; < a라는 변수(숫자형데이터) 10이라는 값을 담고 "초기화"
		//↑ 변수의 사용준비
		int a = 10; 
		//객체의타입(클래스의이름) 객체(변수)의이름 = new 객체의타입(클래스의이름);
		//↑ 클래스(객체)의 사용 준비.
		Ex03 ex = new Ex03();
		System.out.println(ex.data1);//0 int형 초기값 항상 0
		System.out.println(ex.data2);//null String 초기값 항상 0 (Refference Type)
		ex.data1 = 10 ;
		ex.data2 = "data2";
		System.out.println(ex.data1);
		System.out.println(ex.data2);
	}
}
