public class Practice19
{
	protected int stu_id;
	public void test(){
		this.stu_id = 10010; 
		System.out.println(this.stu_id);
		//this(11111);//错误: 对this的调用必须是构造器中的第一个语句
	}
	public Practice19(int id){
		this.stu_id = id;
		System.out.println(this.stu_id);
	}
	public Practice19(){
		//this(11111);//引用自身实例的构造方法
		this.test();//引用自身实例（t1）的成员方法
		
	}
	public static void main(String[] argv){
		Practice19 t1 = new Practice19();
	}
}