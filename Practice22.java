class Parent
{
	int id = 10;
}
class Child extends Parent
{
	int id = 20;
}
public class Practice22
{
	public static void main(String[] argv){
		Parent p1 = new Parent();
		Child c1 = new Child();
		if(c1 instanceof Parent){
			System.out.println("c1��Parent��һ��ʵ��");
		}
		if (!(p1 instanceof Child))
		{
			System.out.println("p1����Child��һ��ʵ��");
		}
		//c1 = (Child) p1;//û�н�������ӳ�䣬ǿ��ת���ᱨ��
		p1 = c1;//����ǿ������ת��ǰ��Ҫ����ӳ��
		if(p1 instanceof Child){
			System.out.println("��������ӳ���p1��Child��һ��ʵ��");
		}
		c1 = (Child) p1;

	}
}