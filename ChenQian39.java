//package ����������;

import java.util.Scanner;

/**
*@author ���� Your-Name��
*@version ����ʱ�䣺
*��˵����������ݣ��·ݣ�������ܼ�
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
		System.out.println("****<<<<2020�����ڲ�ѯ>>>>");
		while(true)
		{
			System.out.println("1,��ʼ��ѯ");
			System.out.println("2,�˳�ϵͳ");
			System.out.print("���������ѡ��:");
			choice = input.nextInt();
			if(choice == 1)
			{
				    num = 0;
				   System.out.print("���������:");
			       year = input.nextInt();
			       System.out.print("�������·�:");
			       month = input.nextInt();
			       System.out.print("����������:");
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
						       System.out.print("������:");
						       switch(weekend)
						       {
						       case 0:
						    	   System.out.println("�ܶ�");
						    	   break;
						       case 6:
						    	   System.out.println("��һ");
						    	   break;
						       case 5:
						    	   System.out.println("����");
						    	   break;
						       case 4:
						    	   System.out.println("����");
						    	   break;
						       case 3:
						    	   System.out.println("����");
						    	   break;
						       case 2:
						    	   System.out.println("����");
						    	   break;
						       case 1:
						    	   System.out.println("����");
						    	   break;
						    	   
						       }
			 System.out.println("*********************************");
			 }
			else
			{
				System.out.println("��ӭ�´�ʹ��");
				System.exit(0);
			}
			      
			       
			       
			}
			
		}

	}


