

import java.util.Scanner;

public class ChenQian39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int i;
		int num;//���
		int sum;//ȡ��
		int pass = 12345,passwork;//����
		int balan = 1000;//��ʼ�������
		int choice;//�û���ѡ��
		String usear;//�˻�
		int get;//���ɽ��
		while(true)
		{
			//System.out.println("<<<�й����������Զ�ȡ�����ӭ��>>>");
			for(i = 1;i <= 3;i ++)
			{
				System.out.println("<<<�й����������Զ�ȡ�����ӭ��>>>");
				System.out.print("����������:");
				passwork = input.nextInt();
				if(passwork == pass)
				{
					while(true)
					{
					System.out.println("�˵�:");
					System.out.println("1,��ѯ");
					System.out.println("2,ȡ��");
					System.out.println("3,ת��");
					System.out.println("4,����ɷ�");
					System.out.println("5,���");
					System.out.println("6,�˳�");
					System.out.print("���������ѡ��:");
					choice = input.nextInt();
					if(choice == 6)
					{
						System.out.println("����ϵͳ�˳�����ӭ�´�ʹ��");
						break;
					}
					switch(choice)
					{
					case 1:
						System.out.println("<<<<��ѯ>>>>");
						System.out.println("���:" + balan + "Ԫ");
						break;
					case 2:
						System.out.println("<<<ȡ��>>>");
						System.out.print("������ȡ����:");
						num = input.nextInt();
						if(num > balan)
						{
							System.out.println("�Բ�������˻�����");
						}
						else
						{
							balan = balan - num;
							System.out.println("ȡ��ɹ�");
						}
						break;
					case 3:
						System.out.println("<<<ת��>>>");
						System.out.print("������ת�˵��˺�:");
						usear = input.next();
						System.out.print("������ת�˽��:");
						num = input.nextInt();
						
						if(num > balan)
						{
							System.out.println("�Բ�������˻�����");
						}
						else
						{
							balan = balan - num;
							System.out.println("ת�˳ɹ�");
						}
						break;
					case 4:
						while(true)
						{
						System.out.println("<<<����ɷ�>>>");
						System.out.println("����:");
						System.out.println("1,ˮ��");
						System.out.println("2,���");
						System.out.println("3,��Ȼ��");
						System.out.println("4,������һ��");
						System.out.print("���������ѡ��:");
						choice = input.nextInt();
						if(choice == 4)
						{
							break;
						}
						switch(choice)
						{
						case 1:
							System.out.println("<<<ˮ��>>>");
							System.out.println("������Ҫ���ɽ��:");
							get = input.nextInt();
							if(get > balan)
							{
								System.out.print("�Բ����������");
							}
							else
							{
								balan = balan - get;
								System.out.println("�ɷѳɹ�");
							}
							break;
						case 2:
							System.out.println("<<<���>>>");
							System.out.print("������Ҫ���ɽ��:");
							get = input.nextInt();
							if(get > balan)
							{
								System.out.println("�Բ����������");
							}
							else
							{
								balan = balan - get;
								System.out.println("�ɷѳɹ�");
							}
							break;
						case 3:
							System.out.println("<<<��Ȼ����>>>");
							System.out.print("������Ҫ���ɽ��:");
							get = input.nextInt();
							if(get > balan)
							{
								System.out.println("�Բ����������");
							}
							else
							{
								balan = balan - get;
								System.out.println("�ɷѳɹ�");
							}
							break;
						default:
							System.out.println("�����ʽ����");
						}
						}
						break;
					case 5:
						System.out.println("<<<���>>>");
						System.out.print("����������:");
						sum = input.nextInt();
						balan = balan + sum;
						System.out.println("���ɹ�");
						break;
					//case 6:
						
						//System.exit(0);
						//break;
					default:
						System.out.println("�����ʽ����");
							
					
					}
				}
				}
				else
				{
					System.out.println("����" + (3 - i) + "�λ���");
				}
				
			}
			if(i > 3)
			{
				System.out.println("����������Σ�����������Ч֤��ǰ���������н��");
			}
			
			
			
		}
		

	}

}
