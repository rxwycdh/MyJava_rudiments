public class Practice28
{
	public static void main(String[] argv){
		Practice28 t1 = new Practice28();
		Practice28 t3 = t1;
		Example s1 = new Example();
		Practice28 t2 = new Practice28();
		if (t1.equals(t2))
		{
			System.out.println("这两个实例相等");
		}
		else{
			System.out.println("这两个实例不相等");
		}
		if (t1.equals(t3))
		{
			System.out.println("这两个实例相等");
		}
		else{
			System.out.println("这两个实例不相等");
		}
		if (t1.equals(s1))
		{
			System.out.println("这两个实例相等");
		}
		else{
			System.out.println("这两个实例不相等");
		}
		//打印  这两个实例不相等
			//  这两个实例相等
			//  这两个实例不相等
	}
}
class Example
{
	public Example(){
	}
}