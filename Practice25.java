public class Practice25
{
	public static void main(String[] args) 
	{
		final Student s1 = new Student(1800502108,181);
		Student s2 = new Student(1900500000,193);
		//s1 = s2;//�ᱨ������Ϊs1����final���Σ���������ָ���ܸı�
		s1.Class_id = 1000;//��Ȼָ���ܸı䣬��������ֵ���Ըı�
		System.out.println(s1.Class_id);//��ӡ1000
	}
}
class Student
{
	final int STU_ID = 0000;
	int Class_id;
	public Student(int stu_id,int class_id){
		this.Class_id = class_id;
	}
}