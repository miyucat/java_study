public class AutoConvert01
{
	//��дһ��main����
	public static void main(String[] args)
	{
	int n1 = 10;//ok
	//float = n1 + 1.1;//����������ʱ���Զ�ת������������������ͣ��ټ���
	double d2= n1 +1.1;//ok
	float d1 = n1 + 1.1F;//ok

	//
	//int n2 = 1.1;//err double ���ܸ�int  ���ȸߵĸ����ȵ͵�

	byte b1 = 10;
	//char c1 = b1;//err ���ܴ�byte ת��char  

	byte b2 = 1;
	short s1 = 1;
	//short s2 = b2 + s1;//err  b2 + s1 => int
	int n3 = b2 + s1;//true


	
	}

}