package Map�������̽��迭��Ŭ��������;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/*
 *  �α��� ����ó�� => ID�� Password ��ġ ���� �Ǵ��ϴ� ���α׷�
 */
public class HashtableClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String[] userID = {"Lee", "Kim","Jang","Wang","Ha"};   // ���̵� Ű
			String[] passWord = {"L123","K456","J234","W879","H23"}; // ��
			
			//Hashtable ��ü ����
			Map<String, String> ht = new Hashtable<String, String>(userID.length);
			
			//Hashtable�� ��ü ����
			for(int i=0; i<userID.length; i++) {
				ht.put(userID[i], passWord[i]);
		
			}
			System.out.println(ht);
			//{Ha=H23, jang=J234, Lee=L123, Wang=W879, Kim=K456} // [�߿�] Ű�� ���� �ѽ����� ����

		//�α��� ����ó��
			boolean FLAG = true;
			
			while(FLAG) {    //���� Loop
				System.out.print("���� ID��? ");
				Scanner scan = new Scanner(System.in);
				String user_key = scan.nextLine();  //Lee��� �����սô�.
				String pw_value = ht.get(user_key);	//L123��� ����
				
				if(pw_value != null) {
					System.out.print("���� Password��? ");
					String passWordInput = scan.nextLine();
					
					if(pw_value.equals(passWordInput)) {
						System.out.println("����ó�� ����, ��ȣ�� ��ġ�մϴ�.");
					}else {
					}	System.out.println("����ó�� ����, ��ȣ�� ��ġ���� �ʽ��ϴ�.");	
					}else {
						System.out.println("�Է��� ���� ID�� ��ϵǾ� ���� �ʽ��ϴ�.");	
					}
				

	}
	  }
	
}






