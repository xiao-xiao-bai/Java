

import java.util.Scanner;

public class ChenQian39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int i;
		int num;//存款
		int sum;//取款
		int pass = 12345,passwork;//密码
		int balan = 1000;//初始化的余额
		int choice;//用户的选择
		String usear;//账户
		int get;//缴纳金额
		while(true)
		{
			//System.out.println("<<<中国建设银行自动取款机欢迎你>>>");
			for(i = 1;i <= 3;i ++)
			{
				System.out.println("<<<中国建设银行自动取款机欢迎你>>>");
				System.out.print("请输入密码:");
				passwork = input.nextInt();
				if(passwork == pass)
				{
					while(true)
					{
					System.out.println("菜单:");
					System.out.println("1,查询");
					System.out.println("2,取款");
					System.out.println("3,转账");
					System.out.println("4,生活缴费");
					System.out.println("5,存款");
					System.out.println("6,退出");
					System.out.print("请输入你的选择:");
					choice = input.nextInt();
					if(choice == 6)
					{
						System.out.println("本次系统退出，欢迎下次使用");
						break;
					}
					switch(choice)
					{
					case 1:
						System.out.println("<<<<查询>>>>");
						System.out.println("余额:" + balan + "元");
						break;
					case 2:
						System.out.println("<<<取款>>>");
						System.out.print("请输入取款金额:");
						num = input.nextInt();
						if(num > balan)
						{
							System.out.println("对不起，你的账户余额不足");
						}
						else
						{
							balan = balan - num;
							System.out.println("取款成功");
						}
						break;
					case 3:
						System.out.println("<<<转账>>>");
						System.out.print("请输入转账的账号:");
						usear = input.next();
						System.out.print("请输入转账金额:");
						num = input.nextInt();
						
						if(num > balan)
						{
							System.out.println("对不起，你的账户余额不足");
						}
						else
						{
							balan = balan - num;
							System.out.println("转账成功");
						}
						break;
					case 4:
						while(true)
						{
						System.out.println("<<<生活缴费>>>");
						System.out.println("功能:");
						System.out.println("1,水费");
						System.out.println("2,电费");
						System.out.println("3,天然气");
						System.out.println("4,返回上一层");
						System.out.print("请输入你的选择:");
						choice = input.nextInt();
						if(choice == 4)
						{
							break;
						}
						switch(choice)
						{
						case 1:
							System.out.println("<<<水费>>>");
							System.out.println("请输入要缴纳金额:");
							get = input.nextInt();
							if(get > balan)
							{
								System.out.print("对不起，你的余额不足");
							}
							else
							{
								balan = balan - get;
								System.out.println("缴费成功");
							}
							break;
						case 2:
							System.out.println("<<<电费>>>");
							System.out.print("请输入要缴纳金额:");
							get = input.nextInt();
							if(get > balan)
							{
								System.out.println("对不起，你的余额不足");
							}
							else
							{
								balan = balan - get;
								System.out.println("缴费成功");
							}
							break;
						case 3:
							System.out.println("<<<天然气费>>>");
							System.out.print("请输入要缴纳金额:");
							get = input.nextInt();
							if(get > balan)
							{
								System.out.println("对不起，你的余额不足");
							}
							else
							{
								balan = balan - get;
								System.out.println("缴费成功");
							}
							break;
						default:
							System.out.println("输入格式错误");
						}
						}
						break;
					case 5:
						System.out.println("<<<存款>>>");
						System.out.print("请输入存款金额:");
						sum = input.nextInt();
						balan = balan + sum;
						System.out.println("存款成功");
						break;
					//case 6:
						
						//System.exit(0);
						//break;
					default:
						System.out.println("输入格式错误");
							
					
					}
				}
				}
				else
				{
					System.out.println("还有" + (3 - i) + "次机会");
				}
				
			}
			if(i > 3)
			{
				System.out.println("密码错误三次，请带上你的有效证件前往开卡银行解封");
			}
			
			
			
		}
		

	}

}
