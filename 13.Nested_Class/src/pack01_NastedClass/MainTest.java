package pack01_NastedClass;


public class MainTest {
	public static void main(String[] args) {
		A a = new A();
		//B b = new B(); <- B의 현 위치 
		A.B b = a.new B();//이미 인스턴스화 시킨 A라는 객체가 있어야함.
						  //a라는 객체를 통해서 B라는 클래스의 생성자 메소드를 호출
		b.bMethod();
		System.out.println(b.field1);
		
		A.C c = new A.C();
		System.out.println(c.feild1);
		//System.out.println(c.field2);
		//field2 , method2 (static 멤버) 인스턴스화 과정없이 사용해보기
		//A의 멤버 C의 멤버
		c.method1();
		//c.method2();
		A.C.method2();
		
		a.aMethod();
		
		
		
		
	}
}
