import java.util.*;
public class Practice45
{
	public static void main(String[] argv){
		HashMap<String,String> t1 = new HashMap<String,String>();
		//t1.add(123);//map������add������Ԫ�أ�Ҫ��put
		t1.put("CN","�й�");
		t1.put("US","����");
		t1.put("JP","�ձ�");
		System.out.println("����Ϊ" + t1.size());
		//����ǿ��forѭ��������ӡmap
		for(String temp : t1.keySet()){//keySet()���ؼ��ļ���,��Object����
			String temp_key = (String)temp;
			String temp_value = (String)t1.get(temp_key);
			//��get(key)����Ҳ��Object����
			System.out.println("key:" + temp_key + "value:" + temp_value);
		}
		if(t1.containsKey("CN")){
			System.out.println("CN������t1��");
		}
		if(t1.containsValue("�й�")){
			System.out.println("��һ��value���й�");
		}
		t1.remove("JP");
		for(String temp : t1.keySet()){//keySet()���ؼ��ļ���,��Object����
			String temp_key = (String)temp;
			String temp_value = (String)t1.get(temp_key);
			//��get(key)����Ҳ��Object����
			System.out.println("key:" + temp_key + "value:" + temp_value);
		}
	}
}