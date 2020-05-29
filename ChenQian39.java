//package 升级版期中;

import java.util.Scanner;

/**
*@author 作者 Your-Name：
*@version 创建时间：
*类说明：输入年份，月份，日输出周几
*/
public class ChenQian39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		int month;
		int day;
		int i;
		int num = 0;
		int choice;
		int weekend;
		Scanner input = new Scanner(System.in);
		System.out.println("****<<<<2020的日期查询>>>>");
		while(true)
		{
			System.out.println("1,开始查询");
			System.out.println("2,退出系统");
			System.out.print("请输入你的选择:");
			choice = input.nextInt();
			if(choice == 1)
			{
				    num = 0;
				   System.out.print("请输入年份:");
			       year = input.nextInt();
			       System.out.print("请输入月份:");
			       month = input.nextInt();
			       System.out.print("请输入日期:");
			       day = input.nextInt();
			     
			    		   switch(month - 1)
				           {
				           case 11:
				        	   num += 30;
				           case 10:
				        	   num += 31;
				           case 9:
				        	   num += 30;
				           case 8:
				        	   num += 31;
				           case 7:
				        	   num += 31;
				           case 6:
				        	   num += 30;
				           case 5:
				        	   num += 31;
				           case 4:
				        	   num += 30;
				           case 3:
				        	   num += 31;
				           case 2:
				        	   if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
				        	   {
				        		   num += 29;
				        	   }
				        	   else
				        	   {
				        		   num += 28;
				        	   }
				           case 1:
				        	   num += 31;
				           }
				    	   
				    		   num += day;
				    		   //ystem.out.println(num);
						       weekend = num % 7;
						      // System.out.println(weekend);
//						       System.out.println(num);
//						       System.out.println(weekend);
						       System.out.print("今天是:");
						       switch(weekend)
						       {
						       case 0:
						    	   System.out.println("周二");
						    	   break;
						       case 6:
						    	   System.out.println("周一");
						    	   break;
						       case 5:
						    	   System.out.println("周日");
						    	   break;
						       case 4:
						    	   System.out.println("周六");
						    	   break;
						       case 3:
						    	   System.out.println("周五");
						    	   break;
						       case 2:
						    	   System.out.println("周四");
						    	   break;
						       case 1:
						    	   System.out.println("周三");
						    	   break;
						    	   
						       }
			 System.out.println("*********************************");
			 }
			else
			{
				System.out.println("欢迎下次使用");
				System.exit(0);
			}
			      
			       
			       
			}
			
		}

	}


