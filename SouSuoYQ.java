
import java.util.Scanner;

/**
*@author ���� Your-Name����Ǯ
*@version ����ʱ�䣺2020/3/25
*��˵�����ַ����ȽϺ���������
*/
public class SouSuoYQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int choice;//ѡ��
		float money = 0;//��Ǯ��
		float n;//����
		String name = "��С��";
		String pass = "wxc1314520";
		String name1;
		String pass1;
        Scanner input = new Scanner(System.in);
        String num1[];
        num1 = new String[]{"ԭ�ӵ�","���˻�","����ĸ��","����","ǹ֧"};
        String num;
        System.out.println("**************************");
        System.out.println("**<<<<<<<����ϵͳ>>>>>>>**");
        System.out.println("**************************");
        System.out.println("������ʾ:��ϵͳ��˽��ϵͳ");
        System.out.print("�������û���:");
        name1 = input.next();
        System.out.print("��������Կ:");
        pass1 = input.next();
        if(name1.equals(name) && pass1.equals(pass))
        {
        	System.out.println("���Ѿ�����");
        	  while(true)
              {
              
        	
        	System.out.println("**************************");
            System.out.println("**<<<<<<<�����̳�>>>>>>>**");
            System.out.println("**************************");
        	System.out.println("1,��������");
        	System.out.println("2,�˳�ϵͳ");
        	System.out.print("���������ѡ��:");
        	choice = input.nextInt();
        	if(choice == 1)
        	{
        
      
        	 
        System.out.print("����������Ҫ������:");
        num = input.next();
        for(i = 0;i < num1.length;i ++)
        {
        	if(num.equals(num1[i]))
        	{
        		switch(num)
        		{
        		   
        		case "ԭ�ӵ�":
        			n = 0;
        			System.out.println("1,Ʒ�����ƣ�ԭ�ӵ�" + "\t" + "23����Ԫ");
        			System.out.print("����������:");
        			n = input.nextInt();
        			money += n * 23;
        			break;
        		case "���˻�":
        			n = 0;
        			System.out.println("1,�ն�ī˹900" + "\t" + "1����Ԫ");
        			System.out.println("2,RQ-4ȫ��ӥ" + "\t" + "1.9����Ԫ");
        			System.out.print("���������ѡ��:");
                	choice = input.nextInt();
                	if(choice == 1)
                	{
                		System.out.print("����������:");
            			n = input.nextFloat();
            			money += n * 1;
                	}
                	else
                	{
                		System.out.print("����������:");
            			n = input.nextFloat();
            			money += (float)(n * 1.9);
                	}
        			break;
        		case "����ĸ��":
        			n = 0;
        			System.out.println("1,���غź�ĸ" + "\t" + "34����Ԫ");
        			System.out.println("2,�����ȼ���ĸ" + "\t" + "20����Ԫ");
        			System.out.print("���������ѡ��:");
                	choice = input.nextInt();
                	if(choice == 1)
                	{
                		System.out.print("����������:");
            			n = input.nextFloat();
            			money += n * 34;
                	}
                	else
                	{
                		System.out.print("����������:");
            			n = input.nextFloat();
            			money += (float)(n * 20);
                	}
        			break;
        		case "����":
        			System.out.println("1,�����II��" + "\t" + "0.1����Ԫ");
        			System.out.println("2,����" + "\t" + "0.11����Ԫ");
        			System.out.print("���������ѡ��:");
                	choice = input.nextInt();
                	if(choice == 1)
                	{
                		System.out.print("����������:");
            			n = input.nextFloat();
            			money += (float)(n * 0.1);
                	}
                	else
                	{
                		System.out.print("����������:");
            			n = input.nextFloat();
            			money += (float)(n * 0.11);
                	}
        			break;
        		case "ǹ֧":
        			n = 0;
        			System.out.println("��1ǧ��Ϊ�����Ļ�����λ");
        			System.out.println("1,˹����SSg69" + "\t" + "һǧ�� ��2��Ԫ");
        			System.out.println("2,������M82" + "\t" + "һǧ�� �� 1.5��Ԫ");
        			System.out.print("���������ѡ��:");
                	choice = input.nextInt();
                	if(choice == 1)
                	{
                		System.out.print("����������:");
            			n = input.nextFloat();
            			money += n * 2;
                	}
                	else
                	{
                		System.out.print("����������:");
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
        	System.out.println("���鵱�£���Դ���㣬��ʱ�޻�");
        	
        }
        
       
        }
         else
            {
        	 System.out.println("�ܻ���:" + money + "����Ԫ");
    	      money = 0;
             	System.out.println("��ӭ�´�ʹ��");
             	break;
            }
	}
        
       
        }
	}

}
