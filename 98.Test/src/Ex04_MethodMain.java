
public class Ex04_MethodMain {
	public static void main(String[] args) {
		//Ex04_Method를 인스턴스화 시키고  method1호출하기.
		//메소드 , 변수 , 클래스 기타 등등 
		//↑ Ex04_Method 의 멤버 ( Ex04_Method { <- 어떤것(멤버) -> } )
		//멤버의 접근은 인스턴스화 시킨 객체에 쩜.을 찍으면 접근이 가능하다.
		//변수 , 메소드 , 클래스 기타등등(멤버)
		Ex04_Method em = new Ex04_Method();
		em.method1();
		em.method1(10);
		System.out.println(em.method2());
	}
}
