import java.util.Enumeration;
import java.util.Properties;

public class PropertiesClassEx {

	public static void main(String[] args) {
		//객체 생성
		Properties prop = new Properties();
		
		//prop가 가리키는 객체에 key, value 값 넣기
		prop.setProperty("name","홍길동");
		prop.setProperty("email","hong77@naver.com"); //순서가 중요하지 않고 키와 값은 한 쌍으로 되어 있는 것이 중요하다.
		prop.setProperty("HP","010-2315-1234" );
	
		//System.out.println(prop);
		//{email=hong77@naver.com, name=홍길동, HP=010-2315-1234}
	
		//가져오기
		Enumeration enu = prop.propertyNames(); //Enumeration(열거형) : 저장한 순서로 가져온다 또한 이름 부터 가지고 온다.
		
		while(enu.hasMoreElements()) {
			String ele = (String)enu.nextElement();
			System.out.println(ele + ":" + prop.getProperty(ele)); //키의 대한 값을 가져오는 것은 get이다. set은 설정하는 것이다.
		
		
		}
	
	
	
	
	}

}
