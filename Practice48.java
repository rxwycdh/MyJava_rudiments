import java.io.*;
public class Practice48
{
	public static void main(String[] args) throws IOException
	{
		File mydir = new File("File_class_test");
		File myfile;
		myfile = new File(mydir,"test.txt");
		mydir.mkdir();
		myfile.createNewFile();//报错，因为没有此文件夹
		File rename = new File("test_rename.txt");
		myfile.renameTo(rename)
		myfile.createNewFile();
	}
}
