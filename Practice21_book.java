//������������Զ�����ת����ǿ������ת��
class Parent
{
	String s = "����s";
	public void test(){
		System.out.println("ִ����test()");
	}
}
class Child extends Parent
{
	String s = "����s";//��������
}
public class Practice21_book
{
	public static void main(String[] args) 
	{
		Child c1,c3;
		Parent p1,p2,p3;
		Child c2 = new Child();
		p1 = c2;//�Զ�����ת��,p1��Ϊ����Parentʵ��Ҳ��Childʵ����
		//���Ժ���p1�ſ���ǿ������ת��
		p2 = c2;//�Զ�����ת��
		System.out.println(p1.s);//����s
		System.out.println(p2.s);//����s
		p1.test();
		if(p1 instanceof Child){
			System.out.println("p1��Child��ʵ��");//��ӡ
		}
		if(p1 instanceof Parent){
			System.out.println("p1��Parent��ʵ��");//��ӡ
		}
		c1 = (Child) p1;//ǿ������ת��
		System.out.println(c1.s);//����s
		p3 = new Parent();
		if(p3 instanceof Child){
			c3 = (Child) p3;
		}
		else{
			System.out.println("�޷�ת��");
		}
	}
}