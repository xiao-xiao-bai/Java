

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
		int sl;//数量
		int num;
		int pass1 = 1234;
		int pass2;
		a = (int)(Math.random() * 10);
		b = (int)(Math.random() * 10);
		System.out.println("《《《口算系统》》》");
		System.out.println("请输入密码:");
		pass2 = input.nextInt();
		if(pass1 == pass2)
		{
			System.out.println("恭喜你登陆成功");
		
		while(true)
		{
		System.out.println("1,加法");
		System.out.println("2,减法");
		System.out.println("3,乘法");
		System.out.println("4,除法");
		System.out.println("5,退出系统");
		System.out.print("请输入你的选择");
		choice = input.nextInt();
		switch(choice)
		{
		case 1:
			num = 0;
			i = 1;
			System.out.print("请输入做题数量:");
			sl = input.nextInt();
			System.out.println("你需要完成" + sl + "道加法题");
			while(i <= sl)
			{
				
				a = (int)(Math.random() * 10);
				b = (int)(Math.random() * 10);
				System.out.println(a + " + " + b + " = ");
				System.out.print("请输入答案:");
				dan = input.nextInt();
				if(dan == (a + b))
				{
					System.out.println("********************");
					System.out.println("恭喜你回答正确");
					System.out.println("********************");
					num ++;
				}
				else
				{
					System.out.println("********************");
					System.out.println("很遗憾，回答错误");
					System.out.println("********************");
					System.out.println("正确结果:" + a + " + " + b + " = " + (a + b));
					System.out.println("********************");
				}
				
				i ++;
				
			}
			System.out.println("共做了" + sl + "道题");
			System.out.println("答对" + num + "道题答错" + (sl - num) + "道题");
			break;
		case 2:
			num = 0;
			i = 1;
			System.out.print("请输入做题数量:");
			sl = input.nextInt();
			System.out.println("你需要完成" + sl + "道法题");
			while(i <= sl)
			{
				//System.out.println("你需要完成3道减法题");
				a = (int)(Math.random() * 10);
				b = (int)(Math.random() * 10);
				
				if(a > b)
				{
					System.out.println(a + " - " + b + " = ");
					System.out.print("请输入答案:");
					dan = input.nextInt();
				if(dan == (a - b) )
				{
					System.out.println("********************");
					System.out.println("恭喜你回答正确");
					System.out.println("********************");
					num ++;
					
				}
				else
				{
					System.out.println("********************");
					System.out.println("很遗憾，回答错误");
					System.out.println("********************");
					System.out.println("正确结果:" + a + " - " + b + " = " + (a - b));
					System.out.println("********************");
				}
				
				i ++;
			}
				
			}
			System.out.println("共做了" + sl + "道题");
			System.out.println("答对" + num + "道题答错" + (sl - num) + "道题");
			break;
		case 3:
			i = 1;
			num = 0;
			System.out.print("请输入做题数量:");
			sl = input.nextInt();
			System.out.println("你需要完成" + sl + "道乘法题");
			while(i <= sl)
			{
				//System.out.println("你需要完成3道乘法题");
				a = (int)(Math.random() * 10);
				b = (int)(Math.random() * 10);
				System.out.println(a + " * " + b + " = ");
				System.out.print("请输入答案:");
				dan = input.nextInt();
				if(dan == (a * b))
				{
					System.out.println("********************");
					System.out.println("恭喜你回答正确");
					System.out.println("********************");
					num ++;
				}
				else
				{
					System.out.println("********************");
					System.out.println("很遗憾，回答错误");
					System.out.println("********************");
					System.out.println("正确结果:" + a + " * " + b + " = " + (a * b));
					System.out.println("********************");
				}
				i ++;
			}
			System.out.println("共做了" + sl + "道题");
			System.out.println("答对" + num + "道题答错" + (sl - num) + "道题");
			break;
		case 4:
			i = 1;
			num = 0;
			System.out.print("请输入做题数量:");
			sl = input.nextInt();
			System.out.println("你需要完成" + sl + "道除法题");
			while(i <= sl)
			{
				//System.out.println("你需要完成3道除法法题");
				a = (int)(Math.random() * 10);
				b = (int)(Math.random() * 10);
				
				if(b != 0 && a > b)
				{
					System.out.println(a + " / " + b + " = ");
					System.out.print("请输入答案:");
					dan = input.nextInt();
				if(dan == (a / b))
				{
					System.out.println("********************");
					System.out.println("恭喜你回答正确");
					System.out.println("********************");
					num ++;
				}
				else
				{
					System.out.println("********************");
					System.out.println("很遗憾，回答错误");
					System.out.println("********************");
					System.out.println("正确结果:" + a + " / " + b + " = " + (a / b));
					System.out.println("********************");
				}
				
				i ++;
				}
				
			}
			System.out.println("共做了" + sl + "道题");
			System.out.println("答对" + num + "道题答错" + (sl - num) + "道题");
			break;
		case 5:
			System.out.println("欢迎下次使用");
			System.exit(0);
		default:
			System.out.println("格式输入错误");
				
		
		}
		

	}
  }
		else
		{
			System.out.println("密码错误");
		}
	}
}
