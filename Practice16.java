class Student
{
	public static int stu_class;
	public static void static_methods(){
		Student s1 = new Student();
		s1.getClass_non_static();
		//在静态方法中访问非静态访问必须创建通过对象名字来调用
		//直接用getClass_non_static()会报错
		getClass_static();
		//而静态方法可以直接访问同为静态的方法

	}
	public int getClass_non_static(){
		return stu_class;
	}
	public static int getClass_static(){
		return stu_class;
	}

}

public class Practice16
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.static_methods();
		System.out.println("运行结束");
	}
}
