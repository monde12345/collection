package List�������̽��迭��Ŭ��������;

import java.util.Collections;
import java.util.List; //���� ����� Ŭ������ ��� ���ڴ�.
import java.util.Vector;

public class VecotrClassEx {
	public static void main(String[] args) {
		//���� �迭 ��ü ����
		String[] name = {"������","����ȣ","������","��ȫ��","�ڰ渮"};
		
		//���� �迭 ��ü ���� <E>��  ���׸� ����̶�� �Ѵ�. =>Element(���) //������ �����迭�̴�.
		//List<��üŸ��> �������� = new �����ڰ� <��üŸ��>(�Ű�����1, �Ű���);
		//List<String> list = new Vector<String>(); //�⺻ ����ϴ� 10���� ����
		List<String> list = new Vector<String>(4,3); //������ ���� �־�߰ڴ�. �װ��� ���׸� ���4=������ 4��,������ �����ϸ� 3���� �� ������.
		
		System.out.println("������ �뷮�� : " + ((Vector<String>) list).capacity());
		//������ �뷮�� : 4
		
	
		//���� �迭�� String ��ü���� Vector �����迭�� �����ϱ�
		for(int i=0; i<name.length; i++) {
			list.add(name[i]);
		}		
		System.out.println(list);
		//[������, ����ȣ, ������, ��ȫ��, �ڰ渮]
		
		System.out.println("������ �뷮�� : " + ((Vector<String>) list).capacity()); //�Խñۿ� �� �� ������ Ȯ���ؾ��Ѵ�. ������ ������ �˰������ ĳ�۽�Ƽ �޼ҵ带 ����.�޼ҵ�� ��� ������ ��Ų ��
		//������ �뷮�� :7
		System.out.println("���Ϳ� ����� ����� ������" + list.size()); //��ü�� ���� /������� �Խ��� ������ ������ �� ����Ѵ�.
		//���Ϳ� ����� ����� ������5
		
		//��ü �߰�
		list.add("�ڱ���"); //���� �� �� ���� �������� �߰�//�������� �����ϱ� ���� ���� �ε��̶�� �Ѵ�. 
		System.out.println(list);  //��ü�� ��ü  ���̴�, �������� ���еȴ�.
		//[������, ����ȣ, ������, ��ȫ��, �ڰ渮, �ڱ���]add��� ���� ���� �ϳ��� �ָ� �� �ڿ� ����. �޼ҵ� �����ε�, �������̶�� �Ѵ�.
		// �߰� ��Ű�� ���� �Ȱ����� ������� �ٸ���.
		
		//���� �迭 �߰���  ��ü �����ϱ�
		//������� ����ȣ ���̿� "������"�� �����ϰ��� �Ѵ�.
		list.add(1, "������");// ���� �� �� ���� �ƹ����� �߰�
		System.out.println(list); //�Խ��� ���, ȸ�� �������� �ִ�. �׷��� ���� �迭�� ����Ѵ�.
		//[������, ������, ����ȣ, ������, ��ȫ��, �ڰ渮, �ڱ���]
	
		//��ü �˻�
	    System.out.println(list.get(2)); //����ȣ ��� //��ü�� ������ �� ��, ���ٽ�
	    
	    boolean contains_result = list.contains("��ȫ��");//contains ��ȫ�ſ� ȣȯ�Ǿ� �ִ°�
	    System.out.println(contains_result);   //true ���
	    
	    boolean contains_result2 = list.contains("ȫ�浿");//contains ��ȫ�ſ� ȣȯ�Ǿ� �ִ°�
	    System.out.println(contains_result2);   //false ���
	    
	    
	    for(String item : list) {  //�Ϲ� for�� ���� ���� ��� �Ǿ���. ��Ŀ���� : �ʱ� ��, ����, ���� ���� �ȿ� �� �ִ�.
	    	System.out.print(item +"\t"); //tap��ŭ ������ �ø��� ���� �������� ����
	    	//������	������	����ȣ	������	��ȫ��	�ڰ渮	�ڱ���	���������� ���ڶ�� �Ѵ�.
	    }	
	    
	    	
	    	System.out.println(); //�� �ٲ�
	    	
	    	/*��ü �����ϱ�=> ����ȣ ��ü�� �̹��� ��ü�� �����ϰ� �ʹ�.*/
	    	list.set(2, "�̹���");
	    	System.out.println(list);
		//[������, ������, �̹���, ������, ��ȫ��, �ڰ渮, �ڱ���] //��ü ����
	    System.out.println();
		/*��ü �����ϱ� => ������ ��ü �����ϱ�*/
		
	    list.remove(3);
	    System.out.println(list);
	    //[������, ������, �̹���, ��ȫ��, �ڰ渮, �ڱ���]
	    
	    System.out.println();
	    /*��ü �����ϱ� => ������ ��ü �����ϱ�*/
		list.remove(1);
		System.out.println(list);
		
		  System.out.println();
		/* ���� �迭�� ��ü �����ϱ� => ���� ���� (Ascending Sort) ���� : asc*/ // ���� �� �Ѱ� ���� ��������
		System.out.println("[��ü �������� �����ϱ�");
		Collections.sort(list); // �� �ٷ� ������ �Ǳ� ������ �˰��� �Ƚᵵ �ȴ�.
		System.out.println(list);
		//[������, ��ȫ��, �ڰ渮, �ڱ���, �̹���]
	
		  System.out.println();
			/* ���� �迭�� ��ü �����ϱ� => ���� ���� (Dscending Sort) ���� : desc*/
			System.out.println("[��ü �������� �����ϱ�");
			Collections.sort(list, Collections.reverseOrder()); // �� �ٷ� ������ �Ǳ� ������ �˰��� �Ƚᵵ �ȴ�.//������ ������ �Ųٷ� �ݴ���̴�
			System.out.println(list);
			//[�̹���, �ڱ���, �ڰ渮, ��ȫ��, ������]
			
			System.out.println();
			list.add("��ȫ��");   //vector �ߺ� ���尡��
			System.out.println(list);
			//[�̹���, �ڱ���, �ڰ渮, ��ȫ��, ������, ��ȫ��]
	
	}
	




}






