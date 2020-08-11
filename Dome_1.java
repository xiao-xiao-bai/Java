package RiNi;

import java.util.Scanner;

/**
 * 
 * @author СǮǮ
 * @time 
 * @����:����
 */
public class Dome_1 {
	 static int years = -1;
	 static int months = -1;
	 static int days = -1;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("------<<����������ѯ>>----");
		while(true)
		{
			System.out.println();
			System.out.println("-----------------------------------");
			System.out.println("1,��ѯ");
			System.out.println("2,�˳�");
			System.out.print("���������ѡ��:");
			int choice = input.nextInt();
			if(choice == 1)
			{
				scanner();
			       getWeek(getSum());
			       int a = dayWeek(getSum());
			       show(a);
			       
			}
			else
			{
				System.out.println("��ӭ�´�ʹ��");
				System.exit(0);
			}
		}
       
       
       }
	//1,¼��������
    public static void scanner()
    {
    	Scanner input = new Scanner(System.in);
    	System.out.print("���������:");
    	years = input.nextInt();
    	System.out.print("�������·�:");
    	months = input.nextInt();
    	System.out.print("����������:");
    	days = input.nextInt();
    }
    //2,�ж��Ƿ�Ϊ����
    public static boolean isLeap(int year)
    {
    	return year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
    }
	//3,�����1990�����ڵ�������
    public static int getSum()
    {
    	int sum = 0;
    	//���
    	for(int i = 1900;i < years;i ++)
    	{
    		sum += 365;
    		if(isLeap(i))
    		{
    			sum += 1;
    		}
    	}
    	switch(months - 1)
    	{
    	case 11:
    		sum += 30;
    	case 10:
    		sum += 31;
    	case 9:
    		sum += 30;
    	case 8:
    		sum += 31;
    	case 7:
    		sum += 31;
    	case 6:
    		sum += 30;
    	case 5:
    		sum += 31;
    	case 4:
    		sum += 30;
    	case 3:
    		sum += 31;
    	case 2:
    		if(isLeap(years))
    		{
    			sum += 29;
    		}
    		else
    		{
    			sum += 28;
    		}
    	case 1:
    		sum += 31;
    		
    	}
    	//����
    	sum += days;
    	return sum;
    	
    }
	//4,�����ʱ����ܼ�
    public static int getWeek(int sum)
    {
    	int a = 0;
    	a = sum % 7;
    	System.out.print(years + "��" + months + "��" + days + "��");
    	switch(a)
    	{
    	case 0:
    		System.out.println("����");
    		break;
    	case 1:
    		System.out.println("��һ");
    		break;
    	case 2:
    		System.out.println("�ܶ�");
    		break;
    	case 3:
    		System.out.println("����");
    		break;
    	case 4:
    		System.out.println("����");
    		break;
    	case 5:
    		System.out.println("����");
    		break;
    	case 6:
    		System.out.println("����");
    		break;
    	}
    	return a;
    }
    /**
     * 
     * @param sum������
     * @return:����1�����ܼ�
     */
    public static int dayWeek(int sum)
    {
    	sum -= days - 1;//��ȥ���ڣ���ȡ����1�ŵ�1990�������
    	int v = sum % 7;
    	if(v == 0)
    	{
    		return 7;
    	}
    	else
    	{
    		return v;
    	}
  
    	
    }
	//5,��ӡ����:�������ӡ����µ�����������Ҫȷ������1�����ܼ�����ӡ�����ո�,���ܼ��ʹ�ӡ���ٸ��ո�
    public static void show(int a)
    {
    	int day1[] = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};//ƽ��
    	int day2[] = new int[] {31,29,31,30,31,30,31,31,30,31,30,31};//����
    	String weekName[] = new String[] {"��","һ","��","��","��","��","��"};
    	for(int i = 0;i < weekName.length;i ++)
    	{
    		System.out.print(weekName[i] + "\t");
    	}
    	System.out.println();
    	if(isLeap(years))
    	{
    		for(int i = 0;i < a;i ++)
    		{
    			System.out.print("\t");
    		}
    		if(a == 7)
    		{
    			System.out.println();
    		}
    		for(int y = 1;y <= day2[months - 1];y ++)
    		{
    			System.out.print(y);
    			if((y + a) % 7 == 0)
    			{
    				System.out.println();
    			}
    			else
    			{
    				System.out.print("\t");
    			}
    		}
    	}
    	else
    	{
    		for(int i = 0;i < a;i ++)
    		{
    			System.out.print("\t");
    		}
    		if(a == 7)//һ�ж���ӡ����
    		{
    			System.out.println();
    		}
    		for(int y = 1;y <= day1[months - 1];y ++)
    		{
    			System.out.print(y);
    			if((y + a) % 7 == 0)
    			{
    				System.out.println();
    			}
    			else
    			{
    				System.out.print("\t");
    			}
    		}
    	}
    }
}
