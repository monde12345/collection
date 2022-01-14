package List인터페이스계열의클래스예제;

import java.util.ArrayList;
import java.util.List;
//import java.lang.Integer; //컴파일러 컴파일할 때 자동으로 import 시킨다. 
public class ArrayListClassEx {

	public static void main(String[] args) {
		//가변 배열 객체 형성 <E>를  제네릭 기능이라고 한다. =>Element(요소)
		//List<String> list = new Vector<String>();
		
		List<Integer> list = new ArrayList<Integer>(); //기본 10개의 공간을 확보함!!
		//컴파일러가 자동적으로 임포트 함
		//객체 추가
		//list.add(new Integer(90));
		list.add(90);//JDK 1.5버전부터 가능 => 자동 박싱(boxing) //정수를 객체화 한 것
		list.add(85);
		list.add(100);
		list.add(70);
		list.add(95);
		System.out.println(list);
		//[90, 85, 100, 70, 95]//정수가 아니다.
		
		System.out.println();
		list.add(80);
		System.out.println(list);
		//[90, 85, 100, 70, 95, 80]
	
		list.add(1, 60);
		System.out.println(list);
	
		list.set(3, 65);
		System.out.println(list);
		//[90, 60, 85, 65, 70, 95, 80] //벡터와 똑같다
		
	
	}
	
	

}
