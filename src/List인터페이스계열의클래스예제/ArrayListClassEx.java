package List�������̽��迭��Ŭ��������;

import java.util.ArrayList;
import java.util.List;
//import java.lang.Integer; //�����Ϸ� �������� �� �ڵ����� import ��Ų��. 
public class ArrayListClassEx {

	public static void main(String[] args) {
		//���� �迭 ��ü ���� <E>��  ���׸� ����̶�� �Ѵ�. =>Element(���)
		//List<String> list = new Vector<String>();
		
		List<Integer> list = new ArrayList<Integer>(); //�⺻ 10���� ������ Ȯ����!!
		//�����Ϸ��� �ڵ������� ����Ʈ ��
		//��ü �߰�
		//list.add(new Integer(90));
		list.add(90);//JDK 1.5�������� ���� => �ڵ� �ڽ�(boxing) //������ ��üȭ �� ��
		list.add(85);
		list.add(100);
		list.add(70);
		list.add(95);
		System.out.println(list);
		//[90, 85, 100, 70, 95]//������ �ƴϴ�.
		
		System.out.println();
		list.add(80);
		System.out.println(list);
		//[90, 85, 100, 70, 95, 80]
	
		list.add(1, 60);
		System.out.println(list);
	
		list.set(3, 65);
		System.out.println(list);
		//[90, 60, 85, 65, 70, 95, 80] //���Ϳ� �Ȱ���
		
	
	}
	
	

}
