import java.util.Scanner;

public class Ex06_ThreadPriorityMain {
	public static void main(String[] args) {

		Ex06_ThreadPriority priority1 = new Ex06_ThreadPriority();
		Ex06_ThreadPriority priority2 = new Ex06_ThreadPriority();
		Ex06_ThreadPriority priority3 = new Ex06_ThreadPriority();
		priority1.setPriority(Thread.MIN_PRIORITY);//<- 상수로 바꿔보기.(final 변수로 바꾸기)
		priority1.setPriority(Thread.NORM_PRIORITY);
		priority1.setPriority(Thread.MAX_PRIORITY);
		priority1.start();
		priority2.start();
		priority3.start();
	}
}
