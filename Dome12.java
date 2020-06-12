
import java.awt.*;
import java.awt.event.*;
/**
*@author 作者 Your-Name：
*@version 创建时间：
*类说明：个人所得税计算器
*/
public class Dome12 implements YangLao,BaoXian{
	static double a,b,c;
	//公积金
    public double getYl(double g)
    {
    	return (g * 0.05);
    }
    //保险
    public double getBx(double g)
    {
    	return (g * 0.1);
    }
	public static void main(String[] args) {
		
		Dome12 d = new Dome12();
		Frame f = new Frame();
		Font f1 = new Font("楷体",Font.BOLD,20);
		Font f2 = new Font("宋体",Font.BOLD,14);
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
		Label l1 = new Label("个人所得税计算器");
		l1.setBounds(110,30,170,40);
		l1.setFont(f1);
		f.add(l1);
		Label l2 = new Label("请输入税前工资:");
		l2.setBounds(20,80,110,30);
		l2.setFont(f2);
		f.add(l2);
		TextField t1 = new TextField();
		t1.setBounds(140,80,100,30);
		t1.setFont(f2);
		f.add(t1);
		Label l3 = new Label("公积金:");
		l3.setBounds(30,190,50,30);
		l3.setFont(f2);
		f.add(l3);
		TextField t2 = new TextField(50);
		t2.setBounds(80,190,100,30);
		t2.setFont(f2);
		f.add(t2);
		Label l4 = new Label("保险:");
		l4.setBounds(30,230,40,30);
		l4.setFont(f2);
		f.add(l4);
		TextField t3 = new TextField(50);
		t3.setBounds(80,230,100,30);
		t3.setFont(f2);
		f.add(t3);
		Label l5 = new Label("税后工资:");
		l5.setFont(f2);
		l5.setBounds(30,280,70,30);
		f.add(l5);
		TextField t4 = new TextField(50);
		t4.setBounds(110,280,100,30);
		t4.setFont(f2);
		f.add(t4);
		Button b1 = new Button("查询");
		b1.setBounds(130,140,100,40);
		b1.setFont(f2);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent c)
			{
				a = Double.parseDouble(t1.getText());
				if(a > 5000)
				{
					t2.setText("" + (d.getYl(a)) + "元");
					t3.setText("" + (d.getBx(a)) + "元");
					t4.setText("" + (a - d.getYl(a) - d.getBx(a)) + "元");
				}
				else
				{
					t2.setText("" + 0 + "元");
					t3.setText("" + 0 + "元");
					t4.setText("" + a + "元");
				}
			}
		});
		f.add(b1);
		Label l6 = new Label("注意:只有超过5000元的才收税，公积金:0.5%,保险:1%");
		l6.setBackground(Color.white);
		l6.setForeground(Color.red);
		l6.setBounds(15,320,370,30);
		l6.setFont(f2);
		f.add(l6);
		

	}

}
