public class Practice9
{
	private String name;
	private String sex;
	private int age;
	public Practice9(){
		super();
		System.out.println("���๹�췽��");
	}
	public Practice9(String n,String s,int a){
		name = n;
		sex = s;
		age = a;
	}
	public void display(){
		System.out.println("����Ϊ:"+name+"�Ա�Ϊ��"+sex+"����Ϊ��"+age);
	}
	public static void main(String[] argv){
		Practice9 p1 = new Practice9();
		p1.display();
		Practice9 p2 = new Practice9("����","��",18);
		p2.display();
		p1.display();
	}
}