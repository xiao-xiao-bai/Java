package game;

import java.util.Scanner;
import java.lang.Math;

public class KouSuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a,b;
		int i = 1;
		int dan;
		int choice;
		int sl;//����
		int num;
		int pass1 = 1234;
		int pass2;
		a = (int)(Math.random() * 10);
		b = (int)(Math.random() * 10);
		System.out.println("����������ϵͳ������");
		System.out.println("����������:");
		pass2 = input.nextInt();
		if(pass1 == pass2)
		{
			System.out.println("��ϲ���½�ɹ�");
		
		while(true)
		{
		System.out.println("1,�ӷ�");
		System.out.println("2,����");
		System.out.println("3,�˷�");
		System.out.println("4,����");
		System.out.println("5,�˳�ϵͳ");
		System.out.print("���������ѡ��");
		choice = input.nextInt();
		switch(choice)
		{
		case 1:
			num = 0;
			i = 1;
			System.out.print("��������������:");
			sl = input.nextInt();
			System.out.println("����Ҫ���" + sl + "���ӷ���");
			while(i <= sl)
			{
				
				a = (int)(Math.random() * 10);
				b = (int)(Math.random() * 10);
				System.out.println(a + " + " + b + " = ");
				System.out.print("�������:");
				dan = input.nextInt();
				if(dan == (a + b))
				{
					System.out.println("********************");
					System.out.println("��ϲ��ش���ȷ");
					System.out.println("********************");
					num ++;
				}
				else
				{
					System.out.println("********************");
					System.out.println("���ź����ش����");
					System.out.println("********************");
					System.out.println("��ȷ���:" + a + " + " + b + " = " + (a + b));
					System.out.println("********************");
				}
				
				i ++;
				
			}
			System.out.println("������" + sl + "����");
			System.out.println("���" + num + "������" + (sl - num) + "����");
			break;
		case 2:
			num = 0;
			i = 1;
			System.out.print("��������������:");
			sl = input.nextInt();
			System.out.println("����Ҫ���" + sl + "������");
			while(i <= sl)
			{
				//System.out.println("����Ҫ���3��������");
				a = (int)(Math.random() * 10);
				b = (int)(Math.random() * 10);
				
				if(a > b)
				{
					System.out.println(a + " - " + b + " = ");
					System.out.print("�������:");
					dan = input.nextInt();
				if(dan == (a - b) )
				{
					System.out.println("********************");
					System.out.println("��ϲ��ش���ȷ");
					System.out.println("********************");
					num ++;
					
				}
				else
				{
					System.out.println("********************");
					System.out.println("���ź����ش����");
					System.out.println("********************");
					System.out.println("��ȷ���:" + a + " - " + b + " = " + (a - b));
					System.out.println("********************");
				}
				
				i ++;
			}
				
			}
			System.out.println("������" + sl + "����");
			System.out.println("���" + num + "������" + (sl - num) + "����");
			break;
		case 3:
			i = 1;
			num = 0;
			System.out.print("��������������:");
			sl = input.nextInt();
			System.out.println("����Ҫ���" + sl + "���˷���");
			while(i <= sl)
			{
				//System.out.println("����Ҫ���3���˷���");
				a = (int)(Math.random() * 10);
				b = (int)(Math.random() * 10);
				System.out.println(a + " * " + b + " = ");
				System.out.print("�������:");
				dan = input.nextInt();
				if(dan == (a * b))
				{
					System.out.println("********************");
					System.out.println("��ϲ��ش���ȷ");
					System.out.println("********************");
					num ++;
				}
				else
				{
					System.out.println("********************");
					System.out.println("���ź����ش����");
					System.out.println("********************");
					System.out.println("��ȷ���:" + a + " * " + b + " = " + (a * b));
					System.out.println("********************");
				}
				i ++;
			}
			System.out.println("������" + sl + "����");
			System.out.println("���" + num + "������" + (sl - num) + "����");
			break;
		case 4:
			i = 1;
			num = 0;
			System.out.print("��������������:");
			sl = input.nextInt();
			System.out.println("����Ҫ���" + sl + "��������");
			while(i <= sl)
			{
				//System.out.println("����Ҫ���3����������");
				a = (int)(Math.random() * 10);
				b = (int)(Math.random() * 10);
				
				if(b != 0 && a > b)
				{
					System.out.println(a + " / " + b + " = ");
					System.out.print("�������:");
					dan = input.nextInt();
				if(dan == (a / b))
				{
					System.out.println("********************");
					System.out.println("��ϲ��ش���ȷ");
					System.out.println("********************");
					num ++;
				}
				else
				{
					System.out.println("********************");
					System.out.println("���ź����ش����");
					System.out.println("********************");
					System.out.println("��ȷ���:" + a + " / " + b + " = " + (a / b));
					System.out.println("********************");
				}
				
				i ++;
				}
				
			}
			System.out.println("������" + sl + "����");
			System.out.println("���" + num + "������" + (sl - num) + "����");
			break;
		case 5:
			System.out.println("��ӭ�´�ʹ��");
			System.exit(0);
		default:
			System.out.println("��ʽ�������");
				
		
		}
		

	}
  }
		else
		{
			System.out.println("�������");
		}
	}
}
