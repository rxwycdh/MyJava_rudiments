import java.util.*;
//������toArrayתΪ���飬����ӡ
public class Practice44
{
	public static void main(String[] args) 
	{
		HashSet<String> t1 = new HashSet<String>();
		t1.add("one");
		t1.add("two");
		//t1.add("one");///set��������ͬ��key
		t1.add("three");
		Iterator<String> t1_iterator = t1.iterator();
		//�ȱ�����ӡ
		for(String temp : t1){
			System.out.println(temp);
		}



		Object[] t1_object_array = t1.toArray();
		//��ֵ��Object�����ࣩ����ֵ������String[]���Զ�����ת��������
		//t1_object_array��Ϊ����String��ʵ����Ҳ��Objectʵ��
		System.out.println((t1_object_array[1] instanceof String)?true:false);
		//String �� Object������



		String[] t1_string_array = new String[t1_object_array.length];
		for(int i =0;i <  t1_object_array.length;i++){
			if(t1_object_array[i] instanceof String){
				t1_string_array[i] = (String) t1_object_array[i];
				//����instanceof���ٽ���ǿ������ת��
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
		//��ԭ������t1��Ԫ�ط���str1��,ע��str1Ҫ��t1�������������ͬ
		//�����ﶼ��String��
		System.out.println("-----------");
		for(String temp : str1){
			System.out.println(temp);
		}
	}
}