//ArrayList遍历，创建复习
import java.util.*;//记得要引入！！！
public class Practice42
{
	public static void main(String[] argv){
		ArrayList<Student> t1 = new ArrayList<Student>();
		t1.add(new Student("小明",1800502108));
		t1.add(new Student("小红",1800502109));
		ListIterator<Student> t1_iterator = t1.listIterator();
		while(t1_iterator.hasNext()){
			System.out.println(t1_iterator.next().name);
		}
		System.out.println("ArrayList长度为" + t1.size());
		for(Student item:t1){
			System.out.print(item.name + " " + item.stu_id);
		}
		System.out.println(" ");
		for(int i = 0;i < t1.size();i++){
			Student temp_stu = (Student)t1.get(i);
			System.out.print(temp_stu.name + " " + temp_stu.stu_id);
		}
	}
}
class Student
{
	String name;
	int stu_id;
	public Student(String name,int stu_id ){
		this.name = name;
		this.stu_id = stu_id;
	}
}
