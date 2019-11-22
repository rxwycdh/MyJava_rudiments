import java.io.FileInputStream;
import java.io.IOException;
public class Practice36
{
	public static void main(String[] argv){
		/*用try catch 方法捕获异常*/
		
		FileInputStream t1 = null;
		try{
			t1 = new FileInputStream("test.txt");
			int b;
			b = t1.read();
			while(b != -1){
				System.out.print((char)b);
				b = t1.read();
			}
			t1.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			if(t1 != null){
				t1  = null;//二次检查t1是否已经释放资源
			}
			System.out.println("资源已经释放");
		}
	}
}
}