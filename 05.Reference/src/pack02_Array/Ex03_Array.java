package pack02_Array;

public class Ex03_Array {
	public static void main(String[] args) {
		//배열은 for문 또는 while을 (반복문)을 통해서 사용을하면
		//더욱 편리하다.
		int[] array = new int[3];
//		array[0] = 1;
//		array[1] = 2;
//		array[2] = 3;  != 사용하기가 불편하다. 값을 하나씩 할당하는것은
		//변수의 사용과 비슷함.//i<=2 == i<3
		for(int i = 0 ; i<3; i++) {//0 // 1
			array[i] = (i+1)*10;//
			//System.out.println(i + "번 index:" + array[i]);
		}
		// 반복문을 통해서 array[i] <- 0번 index부터 2번 index까지
		//전부 접근을해서 값을 할당하고있다(2)
		//for문의 값할당부분을 수정하여
		//0번 index : 10 , 1번 index : 20 , 2번 index : 30
		
		//배열의 크기를 얻어오는 함수 . 
		System.out.println(array.length);
		int[] array2 = new int[10];
		for (int i = 0; i < array2.length; i++) {
			array2[i] = i+1;
			System.out.println(array2[i]);
		}
		
		
		
	}
}
