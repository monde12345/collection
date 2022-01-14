package Set�������̽��迭��Ŭ��������;

//Member�� �ڽ� Ŭ������ extends   �θ�Ŭ����
public class Member extends Object{
	//��� ����(=�ν��Ͻ� ���� )
	public String name;   //�̸�
	public int age;   //����
	public String juminNum; //�ֹι�ȣ
	
	//������         ����, �ֹι�ȣ, �̸� ���� �Ű���������Ѵ�. (parameter) Ŭ���� ��� ���� �̸��� �Ű� ���� �̸��� �Ȱ���.
	public Member(String name, int age, String juminNum) {
		this.name = name;
		this.age = age;
		this.juminNum = juminNum;
		//this�� ���� ���� �Ÿ� �Ű� ���� �Ѱ� ���� ������, �����ڸ� ���ؼ� �ʱ�ȭ�� ��Ų ��		
	}
	//�θ� Ŭ������ �޼ҵ带 �������� �������̵� ��Ű�� ��� => ���� "e"�� �Է��ϰ� Ctrl +Spacebar ���ÿ� ������ �޼ҵ尡 ���. ���� Ŭ���Ѵ�.
	@Override //������̼�(@)    �ڽ� ���� �ƴ϶� �θ���̴�. / �������̵�� ��Ӱ����� �� �̴�.
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


