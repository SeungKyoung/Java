//쓰레드 <- 우선순위(Priority)를 설정 할 수 있다.
//1(최소 , MIN_PRIORITY) ~ 10(최대 , MAX_PRIORITY)까지 설정
//숫자가 높을수록 우선순위가 높다.
//기본값(NORMAL_PRIORITY)은 5로 설정
//getter & setter
public class Ex06_ThreadPriority extends Thread{
	@Override
	public void run() {//<- 쓰레드의 실제 작업공간
		for (int i = 1; i <= 10; i++) {
			System.out.println(getName() + "우선순위: " + 
							  getPriority() + " , : " + i);
		}
	}
	public static void test() {
		
	}
}
