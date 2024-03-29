//父类与子类的自动类型转换和强制类型转换
class Parent
{
	String s = "父类s";
	public void test(){
		System.out.println("执行了test()");
	}
}
class Child extends Parent
{
	String s = "子类s";//参数隐藏
}
public class Practice21_book
{
	public static void main(String[] args) 
	{
		Child c1,c3;
		Parent p1,p2,p3;
		Child c2 = new Child();
		p1 = c2;//自动类型转换,p1变为既是Parent实例也是Child实例了
		//所以后面p1才可以强制类型转换
		p2 = c2;//自动类型转换
		System.out.println(p1.s);//父类s
		System.out.println(p2.s);//父类s
		p1.test();
		if(p1 instanceof Child){
			System.out.println("p1是Child的实例");//打印
		}
		if(p1 instanceof Parent){
			System.out.println("p1是Parent的实例");//打印
		}
		c1 = (Child) p1;//强制类型转换
		System.out.println(c1.s);//子类s
		p3 = new Parent();
		if(p3 instanceof Child){
			c3 = (Child) p3;
		}
		else{
			System.out.println("无法转换");
		}
	}
}
