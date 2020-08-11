package RiNi;

import java.util.Scanner;

/**
 * 
 * @author 小钱钱
 * @time 
 * @作用:日历
 */
public class Dome_1 {
	 static int years = -1;
	 static int months = -1;
	 static int days = -1;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("------<<在线日历查询>>----");
		while(true)
		{
			System.out.println();
			System.out.println("-----------------------------------");
			System.out.println("1,查询");
			System.out.println("2,退出");
			System.out.print("请输入你的选择:");
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
				System.out.println("欢迎下次使用");
				System.exit(0);
			}
		}
       
       
       }
	//1,录入年月日
    public static void scanner()
    {
    	Scanner input = new Scanner(System.in);
    	System.out.print("请输入年份:");
    	years = input.nextInt();
    	System.out.print("请输入月份:");
    	months = input.nextInt();
    	System.out.print("请输入日期:");
    	days = input.nextInt();
    }
    //2,判断是否为闰年
    public static boolean isLeap(int year)
    {
    	return year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
    }
	//3,计算从1990到现在的总天数
    public static int getSum()
    {
    	int sum = 0;
    	//年份
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
    	//天数
    	sum += days;
    	return sum;
    	
    }
	//4,计算该时间的周几
    public static int getWeek(int sum)
    {
    	int a = 0;
    	a = sum % 7;
    	System.out.print(years + "年" + months + "月" + days + "是");
    	switch(a)
    	{
    	case 0:
    		System.out.println("周日");
    		break;
    	case 1:
    		System.out.println("周一");
    		break;
    	case 2:
    		System.out.println("周二");
    		break;
    	case 3:
    		System.out.println("周三");
    		break;
    	case 4:
    		System.out.println("周四");
    		break;
    	case 5:
    		System.out.println("周五");
    		break;
    	case 6:
    		System.out.println("周六");
    		break;
    	}
    	return a;
    }
    /**
     * 
     * @param sum总天数
     * @return:该月1号是周几
     */
    public static int dayWeek(int sum)
    {
    	sum -= days - 1;//减去日期，获取改月1号到1990年的天数
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
	//5,打印日历:我们想打印这个月的天数首先需要确定改月1号是周几，打印几个空格,是周几就打印多少个空格
    public static void show(int a)
    {
    	int day1[] = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};//平年
    	int day2[] = new int[] {31,29,31,30,31,30,31,31,30,31,30,31};//闰年
    	String weekName[] = new String[] {"日","一","二","三","四","五","六"};
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
    		if(a == 7)//一行都打印完了
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
