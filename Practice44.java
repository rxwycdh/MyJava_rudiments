import java.util.*;
//集合用toArray转为数组，并打印
public class Practice44
{
	public static void main(String[] args) 
	{
		HashSet<String> t1 = new HashSet<String>();
		t1.add("one");
		t1.add("two");
		//t1.add("one");///set不能有相同的key
		t1.add("three");
		Iterator<String> t1_iterator = t1.iterator();
		//先遍历打印
		for(String temp : t1){
			System.out.println(temp);
		}



		Object[] t1_object_array = t1.toArray();
		//左值是Object（父类），右值是子类String[]，自动类型转换，所以
		//t1_object_array变为即是String类实例，也是Object实例
		System.out.println((t1_object_array[1] instanceof String)?true:false);
		//String 是 Object的子类



		String[] t1_string_array = new String[t1_object_array.length];
		for(int i =0;i <  t1_object_array.length;i++){
			if(t1_object_array[i] instanceof String){
				t1_string_array[i] = (String) t1_object_array[i];
				//先用instanceof，再进行强制类型转换
				System.out.println(t1_string_array[i]);
			}
			else{
				
			}
		}


		ArrayList<Object> t2 = new ArrayList<Object>();
		t2.add(123);
		t2.add("one");
		t2.add(new Double("3456"));
		for(Object temp : t2){
			System.out.println(temp);
		}

		System.out.println("----------");
		String[] str1 = new String[t1_object_array.length];
		t1.toArray(str1);
		//将原来集合t1的元素放入str1中,注意str1要和t1所储存的类型相同
		//（这里都是String）
		System.out.println("-----------");
		for(String temp : str1){
			System.out.println(temp);
		}
	}
}
