public class Practice31
{
	public static void main(String[] args) 
	{
		Integer in1 = new Integer("2345");
		double in1_dou = in1.doubleValue();
		//�½��������Ͷ������xxxValueת��Ϊdouble����
		String in1_str = in1.toString();
		//toString()ת��Ϊ�ַ���
		System.out.println(in1_dou);
		System.out.println(in1_str);
		String st1 = new String("4567");
		Integer st1_int = Integer.valueOf("4567");
		//��st1����һ��Integerʵ��
		double st1_int_dou = st1_int.doubleValue();
		System.out.println(st1_int_dou);
		String st3  = new String("999");
		double st3_dou = Double.parseDouble("999");
		System.out.println(st3_dou);
		Integer in11 = Integer.parseInt("09999");
		System.out.println(in11.doubleValue());
		}
}