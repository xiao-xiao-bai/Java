
import java.util.Random;
import java.util.Arrays;;
/**
*@author 作者 Your-Name：
*@version 创建时间：
*类说明：随机产生一注双色球
*/
public class ChenQian39 {
  public static int isIn(int x[],int s)
  {
	  int i;
	  for(i = 0;i < x.length;i ++)
	  {
		  if(s == x[i])
		  {
			  return 0;
		  }
	  }
	  return 1;
  }
	public static void main(String[] args) {
		Random rd = new Random();
		int a[] = new int[6];
		int n,i = 0,j,k;
		int num;
		n = rd.nextInt(16) + 1;
		//方法二创建方法
		while(i < a.length)
		{
			num = rd.nextInt(33) + 1;
			j = isIn(a,num);
			if(j == 1)
			{
				a[i]  =num;
				i ++;
			}
		}
		//方法一
		/*for(i = 0;i < a.length;)
		{
			num = rd.nextInt(33) + 1;
			k = i;
			for(j = 0;j < i;j ++)
			{
				if(num == a[j])
				{
					k = j;
					break;
				}
			}
			if(k == i)
			{
				a[i]  =num;
				i ++;
			}
		}*/
		
		//排序
		Arrays.sort(a);
		for(i = 0;i < a.length;i ++)
		{
			System.out.printf("%02d\t",a[i]);
		}
		System.out.printf("%02d\t",n);
			
		
		
		
	}
}
