public class  Practice6
{
	int a = 999;
	static void count(){
		System.out.println('s');
	} 
	public static void main(String[] args) 
	{
		Practice6[] instance  = new Practice6[10];
		instance[0] = new Practice6();
		System.out.println(instance[0].a);//��ӡ999
		System.out.println(instance[0]);//Practice6@1db9742��ջ�е�ַ��
		System.out.println(instance[1]);
		//��ӡnull�����������͵ĳ�ʼ��ΪĬ��ֵnull
		System.out.println(instance.length);
		System.out.println(instance.length);
	}
}