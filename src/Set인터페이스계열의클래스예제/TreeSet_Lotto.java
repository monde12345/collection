package Set�������̽��迭��Ŭ��������;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet; // Ʈ������ ������ �ʿ���� �ڵ������� ������ ����

/*
 * TreeSet���� ��ü�� ���� �� �����ϸ鼭 �ڵ� ���� ��Ų��.
 */
public class TreeSet_Lotto {

	public static void main(String[] args) {
		Set set = new TreeSet();
		
		for(int i=0; set.size() < 6; i++) {
			Random rnd = new Random(); //���� �߻��ϴ� Ŭ����
			int number = rnd.nextInt(45)+1;  //1 ~ 45������ ���� �߻� //"0"���� �����ϱ� ������
			set.add(new Integer(number)); 
			
			System.out.println("<<�ζǹ�ȣ �����ֱ�>>");
			System.out.println(set);
}
	}
	}


