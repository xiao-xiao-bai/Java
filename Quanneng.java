package Conversion;

import java.util.Scanner;

public class Quanneng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner input = new Scanner(System.in);
	     System.out.println("****************<<在线进制转换>>*****************");
         Stack1 s = new Stack1(100);
         while(true)
         {
        	 System.out.println("1,进行计算");
        	 System.out.println("2,退出系统");
        	 System.out.print("请输入你的选择:");
        	 int choices = input.nextInt();
        	 if(choices == 1)
        	 {
        		 System.out.print("请输入要输入数字的进制:");
                 int jin = input.nextInt();
                 
                 System.out.print("请输入数据: ");
            
                 String str = input.next();
                 int result = choice(str,jin);
                 System.out.print("请输入要转为的进制:");
                 int zhuan = input.nextInt();
                 while(result != 0)
                 {
                	int temp = result % zhuan;
                	s.push(temp);
                	result /= zhuan;
                 }
                 System.out.print("结果为: ");
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
        		 System.out.println("退出系统");
        		 System.exit(0);
        	 }
         }
        
	}
    //转换成10进制
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

//栈
class Stack1{
	private int maxsize;
	private int num[];
	private int top = -1;
	public Stack1(int maxsize)
	{
		this.maxsize = maxsize;
		num = new int[maxsize];//为栈申请空间
	}
	//判断栈是否为满
	public boolean isFull()
	{
		return top == maxsize - 1;
	}
	//是否为空
	public boolean isEmpty()
	{
		return top == -1;
	}
	//入栈
	public void push(int temp)
	{
		if(isFull())
		{
			System.out.println("战已满");
			return;
		}
		num[++top] = temp;
	}
	//出栈
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("栈已经为空");
			return -1;
		}
		return num[top --];
	}
	
}