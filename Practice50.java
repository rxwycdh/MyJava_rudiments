//��FileInputStream�ͼӻ����BufferedInputStream����ȡ�ļ�
import java.io.*;
import java.util.*;
public class Practice50
{
	public static void main(String[] args) 
	{
		
		InputStream f;
		int ch;
		long i=0;
		System.out.println("Start");
		Date start = new Date();
		/*
		try{
			f = new FileInputStream("io_example/test.txt");
			while((ch=f.read()) != -1){
				i++;
			}
			f.close();
		}
		catch (IOException e){
			e.printStackTrace();
		}*/
		try{
			f = new BufferedInputStream(new FileInputStream("io_example/test.txt"));
			while((ch = f.read()) != -1){
				i++;
			}
			f.close();
		}
		catch(IOException e){
			e.printStackTrace();
		} 

		Date end = new Date();
		long elapsedTime = end.getTime() - start.getTime();
		System.out.println("end");
		System.out.println("read" + i + "bytes");
		System.out.println("use" + elapsedTime);
		//FileInputStream��ȡ�ٶȣ�use2
		//BufferedInputStream��ȡ�ٶȣ�use0������̫����8
	}
}