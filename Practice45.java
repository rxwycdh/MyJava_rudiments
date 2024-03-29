import java.util.*;
public class Practice45
{
	public static void main(String[] argv){
		HashMap<String,String> t1 = new HashMap<String,String>();
		//t1.add(123);//map不能用add来添加元素，要用put
		t1.put("CN","中国");
		t1.put("US","美国");
		t1.put("JP","日本");
		System.out.println("长度为" + t1.size());
		//用增强型for循环遍历打印map
		for(String temp : t1.keySet()){//keySet()返回键的集合,是Object类型
			String temp_key = (String)temp;
			String temp_value = (String)t1.get(temp_key);
			//用get(key)返回也是Object类型
			System.out.println("key:" + temp_key + "value:" + temp_value);
		}
		if(t1.containsKey("CN")){
			System.out.println("CN包含在t1里");
		}
		if(t1.containsValue("中国")){
			System.out.println("有一个value叫中国");
		}
		t1.remove("JP");
		for(String temp : t1.keySet()){//keySet()返回键的集合,是Object类型
			String temp_key = (String)temp;
			String temp_value = (String)t1.get(temp_key);
			//用get(key)返回也是Object类型
			System.out.println("key:" + temp_key + "value:" + temp_value);
		}
	}
}