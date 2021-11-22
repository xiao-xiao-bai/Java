public class exercit{
	public static void main(String[] args){
		System.out.println("JAVA的数据类型");
		System.out.println("数值型");
		System.out.println("名称\t字节数\t比特位");
		System.out.println("byte\t1个字节\t1*8个比特");
		System.out.println("short\t2个字节\t2*8个比特");
		System.out.println("int\t4个字节\t4*8个比特");
		System.out.println("long\t8个字节\t8*8个比特");
		System.out.println("浮点类型");
		System.out.println("注意:浮点数=符号位+指数位+尾数位");
		System.out.println("float\t4个字节\t4*8个比特个");
		float num = 1.1f;//如果不带f，那编译器就默认1.1为double类型，那double类型不能赋给float,因为float装不下
		System.out.println("");

	}
}