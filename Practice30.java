public class Practice30
{
	public static void main(String[] argv){
	Practice30 t1 = new Practice30();
	System.out.println(t1.getClass());
	//��ӡclass Practice30
	Class p1 = t1.getClass();
	System.out.println(p1.toString());//��ӡclass Practice30
	System.out.println(t1.toString());//��ӡPractice30@1db9742
	System.out.println(t1.hashCode());
	}
}