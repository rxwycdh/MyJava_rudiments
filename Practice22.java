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
			System.out.println("c1是Parent的一个实例");
		}
		if (!(p1 instanceof Child))
		{
			System.out.println("p1不是Child的一个实例");
		}
		//c1 = (Child) p1;//没有进行向上映射，强制转换会报错
		p1 = c1;//进行强制类型转换前需要向上映射
		if(p1 instanceof Child){
			System.out.println("经过向上映射后，p1是Child的一个实例");
		}
		c1 = (Child) p1;

	}
}