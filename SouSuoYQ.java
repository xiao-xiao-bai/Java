
import java.util.Scanner;

/**
*@author 作者 Your-Name：陈钱
*@version 创建时间：2020/3/25
*类说明：字符串比较和搜索引擎
*/
public class SouSuoYQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int choice;//选择
		float money = 0;//总钱数
		float n;//个数
		String name = "王小川";
		String pass = "wxc1314520";
		String name1;
		String pass1;
        Scanner input = new Scanner(System.in);
        String num1[];
        num1 = new String[]{"原子弹","无人机","航空母舰","导弹","枪支"};
        String num;
        System.out.println("**************************");
        System.out.println("**<<<<<<<暗网系统>>>>>>>**");
        System.out.println("**************************");
        System.out.println("友情提示:该系统是私人系统");
        System.out.print("请输入用户名:");
        name1 = input.next();
        System.out.print("请输入秘钥:");
        pass1 = input.next();
        if(name1.equals(name) && pass1.equals(pass))
        {
        	System.out.println("你已经进入");
        	  while(true)
              {
              
        	
        	System.out.println("**************************");
            System.out.println("**<<<<<<<军火商场>>>>>>>**");
            System.out.println("**************************");
        	System.out.println("1,继续操作");
        	System.out.println("2,退出系统");
        	System.out.print("请输入你的选择:");
        	choice = input.nextInt();
        	if(choice == 1)
        	{
        
      
        	 
        System.out.print("请输入你需要的武器:");
        num = input.next();
        for(i = 0;i < num1.length;i ++)
        {
        	if(num.equals(num1[i]))
        	{
        		switch(num)
        		{
        		   
        		case "原子弹":
        			n = 0;
        			System.out.println("1,品牌名称：原子弹" + "\t" + "23亿美元");
        			System.out.print("请输入数量:");
        			n = input.nextInt();
        			money += n * 23;
        			break;
        		case "无人机":
        			n = 0;
        			System.out.println("1,赫尔墨斯900" + "\t" + "1亿美元");
        			System.out.println("2,RQ-4全球鹰" + "\t" + "1.9亿美元");
        			System.out.print("请输入你的选择:");
                	choice = input.nextInt();
                	if(choice == 1)
                	{
                		System.out.print("请输入数量:");
            			n = input.nextFloat();
            			money += n * 1;
                	}
                	else
                	{
                		System.out.print("请输入数量:");
            			n = input.nextFloat();
            			money += (float)(n * 1.9);
                	}
        			break;
        		case "航空母舰":
        			n = 0;
        			System.out.println("1,福特号航母" + "\t" + "34亿美元");
        			System.out.println("2,尼米兹级航母" + "\t" + "20亿美元");
        			System.out.print("请输入你的选择:");
                	choice = input.nextInt();
                	if(choice == 1)
                	{
                		System.out.print("请输入数量:");
            			n = input.nextFloat();
            			money += n * 34;
                	}
                	else
                	{
                		System.out.print("请输入数量:");
            			n = input.nextFloat();
            			money += (float)(n * 20);
                	}
        			break;
        		case "导弹":
        			System.out.println("1,三叉戟II型" + "\t" + "0.1亿美元");
        			System.out.println("2,撒旦" + "\t" + "0.11亿美元");
        			System.out.print("请输入你的选择:");
                	choice = input.nextInt();
                	if(choice == 1)
                	{
                		System.out.print("请输入数量:");
            			n = input.nextFloat();
            			money += (float)(n * 0.1);
                	}
                	else
                	{
                		System.out.print("请输入数量:");
            			n = input.nextFloat();
            			money += (float)(n * 0.11);
                	}
        			break;
        		case "枪支":
        			n = 0;
        			System.out.println("以1千作为数量的基本单位");
        			System.out.println("1,斯塔尔SSg69" + "\t" + "一千个 ：2亿元");
        			System.out.println("2,巴雷特M82" + "\t" + "一千个 ： 1.5亿元");
        			System.out.print("请输入你的选择:");
                	choice = input.nextInt();
                	if(choice == 1)
                	{
                		System.out.print("请输入数量:");
            			n = input.nextFloat();
            			money += n * 2;
                	}
                	else
                	{
                		System.out.print("请输入数量:");
            			n = input.nextFloat();
            			money += (float)(n * 1.5);
                	}
        			break;
        		}
        		
        		break;
        	}
        	
        }
        if(i == num1.length)
        {
        	System.out.println("疫情当下，货源不足，暂时无货");
        	
        }
        
       
        }
         else
            {
        	 System.out.println("总花费:" + money + "亿美元");
    	      money = 0;
             	System.out.println("欢迎下次使用");
             	break;
            }
	}
        
       
        }
	}

}
