public class Practice19
{
	protected int stu_id;
	public void test(){
		this.stu_id = 10010; 
		System.out.println(this.stu_id);
		//this(11111);//����: ��this�ĵ��ñ����ǹ������еĵ�һ�����
	}
	public Practice19(int id){
		this.stu_id = id;
		System.out.println(this.stu_id);
	}
	public Practice19(){
		//this(11111);//��������ʵ���Ĺ��췽��
		this.test();//��������ʵ����t1���ĳ�Ա����
		
	}
	public static void main(String[] argv){
		Practice19 t1 = new Practice19();
	}
}