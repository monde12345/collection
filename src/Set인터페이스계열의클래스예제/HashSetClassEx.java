package Set�������̽��迭��Ŭ��������;

import java.util.HashSet;
import java.util.Set;

public class HashSetClassEx {

	public static void main(String[] args) {
		//HashSet ��ü ����
		Set<Member> member_set = new HashSet<Member>();
		
		//[���] ������ => �� ���� ��ü�� �� ���̸� �� �ȴ�. ���� �ϳ��� ��ü�� �����Ǿ�� �Ѵ�.
		Member member1 = new Member("�����", 31, "111111-1111111");
		Member member2 = new Member("�����", 31, "111111-1111111");
		
		member_set.add(member1);
		member_set.add(member2);
		
		System.out.println("��ü�� �� ������? " + member_set.size());
		
		System.out.println(member1.hashCode()); //-1166721462
		System.out.println(member2.hashCode());	//-1166721462
		
		System.out.println(member1.equals(member2));
		

	}

}
 	