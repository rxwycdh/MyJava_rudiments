class Student
{
	public static int stu_class;
	public static void static_methods(){
		Student s1 = new Student();
		s1.getClass_non_static();
		//�ھ�̬�����з��ʷǾ�̬���ʱ��봴��ͨ����������������
		//ֱ����getClass_non_static()�ᱨ��
		getClass_static();
		//����̬��������ֱ�ӷ���ͬΪ��̬�ķ���

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
		System.out.println("���н���");
	}
}