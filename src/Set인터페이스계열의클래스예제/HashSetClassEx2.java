package Set�������̽��迭��Ŭ��������;

import java.util.HashSet;
import java.util.Set;

/*
 * Set �̶�� �������̽��� �������� Ŭ�������(HashSet, TreeSet)��
 * ù° : ������ �������� �ʰ� ����Ǹ�
 * ��° : �ߺ� ���� ��� ����!!
 */


public class HashSetClassEx2 {

	public static void main(String[] args) {
		Set<String> hashSet =new HashSet<String>();
		
		hashSet.add(new String("����ȣ")); //�ε��� ������ ����.!!
		hashSet.add(new String("������"));
		hashSet.add(new String("����ö"));
		hashSet.add(new String("������"));
		hashSet.add(new String("ȫ����"));
		hashSet.add(new String("����ö"));
		System.out.println(hashSet);
		//[������, ȫ����, ������, ����ö, ����ȣ]

	
	}
	
	
	
	
	
	
	

}
