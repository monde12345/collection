package Set인터페이스계열의클래스예제;

//Member가 자식 클래스고 extends   부모클래스
public class Member extends Object{
	//멤버 변수(=인스턴스 변수 )
	public String name;   //이름
	public int age;   //나이
	public String juminNum; //주민번호
	
	//생성자         나이, 주민번호, 이름 등을 매개변수라고한다. (parameter) 클래스 멤버 변수 이름과 매개 변수 이름이 똑같다.
	public Member(String name, int age, String juminNum) {
		this.name = name;
		this.age = age;
		this.juminNum = juminNum;
		//this가 붙지 않은 거면 매개 변수 넘겨 받은 변수임, 생성자를 통해서 초기화를 시킨 것		
	}
	//부모 클래스의 메소드를 수동으로 오버라이드 시키는 방법 => 먼저 "e"를 입력하고 Ctrl +Spacebar 동시에 누르면 메소드가 뜬다. 더블 클릭한다.
	@Override //어노테이션(@)    자식 것이 아니라 부모것이다. / 오버라이드는 상속관계일 때 이다.
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member =(Member) obj;
			return member.name.equals(name) && (member.age == age)
					&& member.juminNum.equals(juminNum);
		}else {
			return false;
		}	
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age + juminNum.hashCode();
	}
	
	
	
	
	
	


}


