package Conversion;

import java.util.Scanner;

public class Quanneng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner input = new Scanner(System.in);
	     System.out.println("****************<<���߽���ת��>>*****************");
         Stack1 s = new Stack1(100);
         while(true)
         {
        	 System.out.println("1,���м���");
        	 System.out.println("2,�˳�ϵͳ");
        	 System.out.print("���������ѡ��:");
        	 int choices = input.nextInt();
        	 if(choices == 1)
        	 {
        		 System.out.print("������Ҫ�������ֵĽ���:");
                 int jin = input.nextInt();
                 
                 System.out.print("����������: ");
            
                 String str = input.next();
                 int result = choice(str,jin);
                 System.out.print("������ҪתΪ�Ľ���:");
                 int zhuan = input.nextInt();
                 while(result != 0)
                 {
                	int temp = result % zhuan;
                	s.push(temp);
                	result /= zhuan;
                 }
                 System.out.print("���Ϊ: ");
                 while(!s.isEmpty())
                 {
                	 int temp = s.pop();
         			if(temp >= 0 && temp <= 9)
         			{
         				System.out.print(" " + (char)(temp + '0'));
         			}
         			else
         			{
         				System.out.print(" " + (char)(temp - 10 + 'A'));
         			}
                 }
                 System.out.println();
                
        	 }
        	 else
        	 {
        		 System.out.println("�˳�ϵͳ");
        		 System.exit(0);
        	 }
         }
        
	}
    //ת����10����
	public static int choice(String temp,int jin)
	{
		int sum = 0;
		int top = 0;
		for(int i = temp.length() - 1;i >= 0;i --)
		{
			
			char ch = temp.charAt(i);
			
			if(ch >= '0' && ch <= '9')
			{
				sum += Math.pow(jin,top) * (ch - '0');
				top ++;
			}
			else
			{
				sum += Math.pow(jin,top) * (ch - '7');
				top ++;
			}
		}
		return sum;
	}
		
   
}

//ջ
class Stack1{
	private int maxsize;
	private int num[];
	private int top = -1;
	public Stack1(int maxsize)
	{
		this.maxsize = maxsize;
		num = new int[maxsize];//Ϊջ����ռ�
	}
	//�ж�ջ�Ƿ�Ϊ��
	public boolean isFull()
	{
		return top == maxsize - 1;
	}
	//�Ƿ�Ϊ��
	public boolean isEmpty()
	{
		return top == -1;
	}
	//��ջ
	public void push(int temp)
	{
		if(isFull())
		{
			System.out.println("ս����");
			return;
		}
		num[++top] = temp;
	}
	//��ջ
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("ջ�Ѿ�Ϊ��");
			return -1;
		}
		return num[top --];
	}
	
}