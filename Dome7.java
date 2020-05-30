
import java.awt.*;
import java.awt.event.*;
/**
*@author 作者 Your-Name：
*@version 创建时间：
*类说明：
*/
public class Dome7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("窗口");
		Label la1 = new Label("密 码: ");
		TextField t1 = new TextField(50);
		Font f1 = new Font("楷体",Font.BOLD,20);
		Font f2 = new Font("楷体",Font.BOLD,18);
		la1.setFont(f1);
		f.add(la1);
		f.add(t1);//进入容器
		t1.setEchoChar('*');//特殊字符代替
		t1.setFont(f2);//字体
		t1.setBounds(120,60,150,30);
		la1.setAlignment(Label.CENTER);
		la1.setForeground(Color.black);//前景色
		la1.setBackground(Color.white);
		f.setLayout(null);//清除默认窗口布局
		la1.setBounds(20,60,100,30);
		f.setSize(400,400);
		f.setLocation(200,200);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});

	}

}
