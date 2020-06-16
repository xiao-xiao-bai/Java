package RILICX;
import java.awt.*;
import java.awt.event.*;
/**
*@author ���� Your-Name��
*@version ����ʱ�䣺�������ڷ������ڼ�
*��˵����������ѯ
*/
public class Dome1 {
    static int years,month,day;
	public static void main(String[] args) {
		Weekend w = new Weekend();
		Frame f = new Frame();
		f.setBounds(200,200,400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent w)
			{
				System.exit(0);
			}
		});
		Label l1 = new Label("���ڲ�ѯ");
		Font f1 = new Font("����",Font.BOLD,20);
		Font f2 = new Font("����",Font.BOLD,14);
		l1.setBounds(150,30,100,40);
		l1.setFont(f1);
		f.add(l1);
		Label l2 = new Label("���:");
		l2.setBounds(30,80, 50,30);
		l2.setFont(f2);
		f.add(l2);
		TextField t1 = new TextField(50);
		t1.setBounds(80,80, 100,30);
		t1.setFont(f2);
		f.add(t1);
		Label l3 = new Label("�·�:");
		l3.setBounds(30,120, 50,30);
		l3.setFont(f2);
		f.add(l3);
		TextField t2 = new TextField(50);
		t2.setBounds(80,120, 100,30);
		t2.setFont(f2);
		f.add(t2);
		Label l4 = new Label("����:");
		l4.setBounds(30,160, 50,30);
		l4.setFont(f2);
		f.add(l4);
		TextField t3 = new TextField(50);
		t3.setBounds(80,160, 100,30);
		t3.setFont(f2);
		f.add(t3);
		TextField t4 = new TextField(50);
		t4.setBounds(40,250,180,50);
		t4.setFont(f2);
		f.add(t4);
		Button b1 = new Button("��ѯ");
		b1.setBounds(50,200,40,30);
		b1.setFont(f2);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a)
			{
				years = Integer.parseInt(t1.getText());
				month = Integer.parseInt(t2.getText());
				day = Integer.parseInt(t3.getText());
				t4.setText( w.getWeekend(years, month, day));
			}
		});
		f.add(b1);
		
		Button b2 = new Button("���");
		b2.setBounds(120,200,40,30);
		b2.setFont(f2);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a)
			{
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			}
		});
		
		Label l5 = new Label("��ע�⣬��ʼ�������2000��");
		l5.setBounds(80,300, 200,30);
		l5.setFont(f2);
		l5.setBackground(Color.red);
		f.add(l5);

	}

}

class Weekend{
	public String getWeekend(int years,int month,int day)
	{
		String a = null;
		int sum = 0;
		for(int i = 2000;i <= years;i ++)
		{
			if(i == years)
			{
				switch(month - 1)
				{
			     	case 11:
			     		sum += 30;
			     	case 10:
			     		sum += 31;
			     	case 9:
			     		sum += 30;
			     	case 8:
			     		sum += 31;
			     	case 7:
			     		sum += 31;
			     	case 6:
			     		sum += 30;
			     	case 5:
			     		sum += 31;
			     	case 4:
			     		sum += 30;
			     	case 3:
			     		sum += 31;
			     	case 2:
			     		if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
			     		{
			     			sum += 29;
			     		}
			     		else
			     		{
			     			sum += 28;
			     		}
			     	case 1:
			     		sum += 31;
			    }
				sum += day;
				
			}
			else
			{
				if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
				{
					sum += 366;
				}
				else
				{
					sum += 365;
				}
			}
			
		}
		
		int week = sum % 7;
		
		switch(week)
		{
		case 0:
			a = "����";
			break;
		case 1:
			a = "����";
			break;
		case 2:
			a = "����";
			break;
		case 3:
			a = "��һ";
			break;
		case 4:
			a = "�ܶ�";
			break;
		case 5:
			a = "����";
			break;
		case 6:
			a = "����";
			break;
			
		
		}
		
		return a;
	}
	
}