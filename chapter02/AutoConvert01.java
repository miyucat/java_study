public class AutoConvert01
{
	//编写一个main方法
	public static void main(String[] args)
	{
	int n1 = 10;//ok
	//float = n1 + 1.1;//多类型运算时先自动转换成容量大的数据类型，再计算
	double d2= n1 +1.1;//ok
	float d1 = n1 + 1.1F;//ok

	//
	//int n2 = 1.1;//err double 不能给int  精度高的给精度低的

	byte b1 = 10;
	//char c1 = b1;//err 不能从byte 转成char  

	byte b2 = 1;
	short s1 = 1;
	//short s2 = b2 + s1;//err  b2 + s1 => int
	int n3 = b2 + s1;//true


	
	}

}