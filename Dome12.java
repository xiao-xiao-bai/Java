
import java.awt.*;
import java.awt.event.*;
/**
*@author ���� Your-Name��
*@version ����ʱ�䣺
*��˵������������˰������
*/
public class Dome12 implements YangLao,BaoXian{
	static double a,b,c;
	//������
    public double getYl(double g)
    {
    	return (g * 0.05);
    }
    //����
    public double getBx(double g)
    {
    	return (g * 0.1);
    }
	public static void main(String[] args) {
		
		Dome12 d = new Dome12();
		Frame f = new Frame();
		Font f1 = new Font("����",Font.BOLD,20);
		Font f2 = new Font("����",Font.BOLD,14);
		f.setBounds(200,200,400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setBackground(Color.GREEN);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent w)
			{
				System.exit(0);
			}
		});
		Label l1 = new Label("��������˰������");
		l1.setBounds(110,30,170,40);
		l1.setFont(f1);
		f.add(l1);
		Label l2 = new Label("������˰ǰ����:");
		l2.setBounds(20,80,110,30);
		l2.setFont(f2);
		f.add(l2);
		TextField t1 = new TextField();
		t1.setBounds(140,80,100,30);
		t1.setFont(f2);
		f.add(t1);
		Label l3 = new Label("������:");
		l3.setBounds(30,190,50,30);
		l3.setFont(f2);
		f.add(l3);
		TextField t2 = new TextField(50);
		t2.setBounds(80,190,100,30);
		t2.setFont(f2);
		f.add(t2);
		Label l4 = new Label("����:");
		l4.setBounds(30,230,40,30);
		l4.setFont(f2);
		f.add(l4);
		TextField t3 = new TextField(50);
		t3.setBounds(80,230,100,30);
		t3.setFont(f2);
		f.add(t3);
		Label l5 = new Label("˰����:");
		l5.setFont(f2);
		l5.setBounds(30,280,70,30);
		f.add(l5);
		TextField t4 = new TextField(50);
		t4.setBounds(110,280,100,30);
		t4.setFont(f2);
		f.add(t4);
		Button b1 = new Button("��ѯ");
		b1.setBounds(130,140,100,40);
		b1.setFont(f2);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent c)
			{
				a = Double.parseDouble(t1.getText());
				if(a > 5000)
				{
					t2.setText("" + (d.getYl(a)) + "Ԫ");
					t3.setText("" + (d.getBx(a)) + "Ԫ");
					t4.setText("" + (a - d.getYl(a) - d.getBx(a)) + "Ԫ");
				}
				else
				{
					t2.setText("" + 0 + "Ԫ");
					t3.setText("" + 0 + "Ԫ");
					t4.setText("" + a + "Ԫ");
				}
			}
		});
		f.add(b1);
		Label l6 = new Label("ע��:ֻ�г���5000Ԫ�Ĳ���˰��������:0.5%,����:1%");
		l6.setBackground(Color.white);
		l6.setForeground(Color.red);
		l6.setBounds(15,320,370,30);
		l6.setFont(f2);
		f.add(l6);
		

	}

}
