public class Practice12
{
	private String color;
	private int height;
	private int width;
	/*
	public  Practice12(){
		System.out.println("�����޲ι��췽��");
	}*/
	public  Practice12(String color,int height,int width){
		this.color = color;
		this.height = height;
		this.width = width;
		System.out.println("�����вι��췽��");
	}
	public static void main(String[] argv){
		Practice12 p1 = new Practice12();
	}
}