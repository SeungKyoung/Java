package pack01_TryCatch;

public class Ex03_TryCatchFinally {
	public static void main(String[] args) {
		//try { 오류가 날수도있는 코드를 넣고 실행을한다. }
		//catch{ 오류가 실제 발생했을때의 실행코드를 넣는다.}
		//finally{오류가 나던 안나던 '무조건' 실행 되어야하는 코드를 넣는다}
		//1.가스불을 킨다 -> 2.요리시작 -> 3.요리 끝 -> 4.가스불을 끈다 5.요리종료
	
		try {
			
			System.out.println("가스불을 킨다.");
			System.out.println("요리를 시작합니다.");
			
			System.out.println("요리 끝!");
			//System.out.println("가스불을 끈다.");
			//System.out.println("요리를 종료합니다.");
		}catch (Exception e) {
			System.out.println("예외가 발생함(가스불,여러이유)");
			//System.out.println("가스불을 끈다.");
			//System.out.println("요리를 종료.");
		}finally {
			System.out.println("가스불을 끈다.");
			System.out.println("요리를 종료.");
		}
	}
}
