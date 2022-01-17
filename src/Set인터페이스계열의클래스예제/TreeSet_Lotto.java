package Set인터페이스계열의클래스예제;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet; // 트리셋은 정렬이 필요없다 자동적으로 정렬을 해줌

/*
 * TreeSet으로 객체를 생성 후 저장하면서 자동 정렬 시킨다.
 */
public class TreeSet_Lotto {

	public static void main(String[] args) {
		Set set = new TreeSet();
		
		for(int i=0; set.size() < 6; i++) {
			Random rnd = new Random(); //난수 발생하는 클래스
			int number = rnd.nextInt(45)+1;  //1 ~ 45까지의 난수 발생 //"0"으로 시작하기 때문에
			set.add(new Integer(number)); 
			
			System.out.println("<<로또번호 보여주기>>");
			System.out.println(set);
}
	}
	}


