package List인터페이스계열의클래스예제;

import java.util.Collections;
import java.util.List; //내가 만드는 클래스를 끌어서 쓰겠다.
import java.util.Vector;

public class VecotrClassEx {
	public static void main(String[] args) {
		//고정 배열 객체 형성
		String[] name = {"김진명","최인호","조정래","김홍신","박경리"};
		
		//가변 배열 객체 형성 <E>를  제네릭 기능이라고 한다. =>Element(요소) //가변은 유연배열이다.
		//List<객체타입> 참조변수 = new 생성자가 <객체타입>(매개변수1, 매개변);
		//List<String> list = new Vector<String>(); //기본 사용하는 10개가 공간
		List<String> list = new Vector<String>(4,3); //동일한 것을 주어야겠다. 그것이 제네릴 기능4=공간이 4개,공간이 부족하면 3개를 더 만들어라.
		
		System.out.println("벡터의 용량은 : " + ((Vector<String>) list).capacity());
		//백터의 용량은 : 4
		
	
		//고정 배열의 String 객체들을 Vector 가변배열에 저장하기
		for(int i=0; i<name.length; i++) {
			list.add(name[i]);
		}		
		System.out.println(list);
		//[김진명, 최인호, 조정래, 김홍신, 박경리]
		
		System.out.println("벡터의 용량은 : " + ((Vector<String>) list).capacity()); //게시글에 몇 개 들어갔는지 확인해야한다. 개수의 공간을 알고싶으면 캐퍼시티 메소드를 쓴다.메소드는 어떠한 동작을 시킨 것
		//벡터의 용량은 :7
		System.out.println("벡터에 저장된 요소의 개수는" + list.size()); //객체의 개수 /사이즈는 게시판 개수를 구현할 때 사용한다.
		//벡터에 저장된 요소의 개수는5
		
		//객체 추가
		list.add("박근혜"); //인자 값 한 개는 마지막에 추가//다형성을 구현하기 위한 오버 로딩이라고 한다. 
		System.out.println(list);  //객체와 객체  사이는, 공백으로 구분된다.
		//[김진명, 최인호, 조정래, 김홍신, 박경리, 박근혜]add라는 인자 값을 하나만 주면 맨 뒤에 들어간다. 메소드 오버로딩, 다형성이라고 한다.
		// 추가 시키는 것은 똑같지만 방법론이 다르다.
		
		//가변 배열 중간에  객체 삽입하기
		//김진명과 최인호 사이에 "공지영"을 삽입하고자 한다.
		list.add(1, "공지영");// 인자 값 두 개는 아무곳에 추가
		System.out.println(list); //게시판 등록, 회원 관리등이 있다. 그래서 가변 배열을 사용한다.
		//[김진명, 공지영, 최인호, 조정래, 김홍신, 박경리, 박근혜]
	
		//객체 검색
	    System.out.println(list.get(2)); //최인호 출력 //객체를 검증할 때 겟, 컨텐스
	    
	    boolean contains_result = list.contains("김홍신");//contains 김홍신에 호환되어 있는가
	    System.out.println(contains_result);   //true 출력
	    
	    boolean contains_result2 = list.contains("홍길동");//contains 김홍신에 호환되어 있는가
	    System.out.println(contains_result2);   //false 출력
	    
	    
	    for(String item : list) {  //일반 for문 보다 조금 향상 되었다. 메커니즘 : 초기 값, 조건, 증가 등이 안에 들어가 있다.
	    	System.out.print(item +"\t"); //tap만큼 공간을 늘리는 것이 스케이프 문자
	    	//김진명	공지영	최인호	조정래	김홍신	박경리	박근혜	리스케이프 문자라고 한다.
	    }	
	    
	    	
	    	System.out.println(); //줄 바꿈
	    	
	    	/*객체 수정하기=> 최인호 객체를 이문열 객체로 수정하고 싶다.*/
	    	list.set(2, "이문열");
	    	System.out.println(list);
		//[김진명, 공지영, 이문열, 조정래, 김홍신, 박경리, 박근혜] //객체 수정
	    System.out.println();
		/*객체 삭제하기 => 조정래 객체 삭제하기*/
		
	    list.remove(3);
	    System.out.println(list);
	    //[김진명, 공지영, 이문열, 김홍신, 박경리, 박근혜]
	    
	    System.out.println();
	    /*객체 삭제하기 => 공지영 객체 삭제하기*/
		list.remove(1);
		System.out.println(list);
		
		  System.out.println();
		/* 가변 배열의 객체 정렬하기 => 오름 차순 (Ascending Sort) 약자 : asc*/ // 인자 값 한개 쓰면 오름차순
		System.out.println("[객체 오름차순 정렬하기");
		Collections.sort(list); // 한 줄로 정렬이 되기 때문에 알고리즘 안써도 된다.
		System.out.println(list);
		//[김진명, 김홍신, 박경리, 박근혜, 이문열]
	
		  System.out.println();
			/* 가변 배열의 객체 정렬하기 => 내림 차순 (Dscending Sort) 약자 : desc*/
			System.out.println("[객체 내림차순 정렬하기");
			Collections.sort(list, Collections.reverseOrder()); // 한 줄로 정렬이 되기 때문에 알고리즘 안써도 된다.//리버스 순서를 거꾸로 반대로이다
			System.out.println(list);
			//[이문열, 박근혜, 박경리, 김홍신, 김진명]
			
			System.out.println();
			list.add("김홍신");   //vector 중복 저장가능
			System.out.println(list);
			//[이문열, 박근혜, 박경리, 김홍신, 김진명, 김홍신]
	
	}
	




}






