
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
/**
*@author 作者 Your-Name：
*@version 创建时间：
*类说明：
*/
public class Dome9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int a1,a2;
		a1 = r.nextInt(100);
		a2 = r.nextInt(100);
		int c = a1 + a2;
		String b1 = Integer.toString(a1);
		String b2 = Integer.toString(a2);
		String b3 = Integer.toString(c);
         Frame f = new Frame("窗口");
         TextField t1 = new TextField(10);
         t1.setBounds(50,100,50,50);
         t1.setText(b1);
         f.add(t1);
         Label l1 = new Label("+");
         l1.setBounds(110,100,30,50);
         l1.setAlignment(Label.CENTER);
         f.add(l1);
         TextField t2 = new TextField(10);
         t2.setBounds(150,100,50,50);
         t2.setText(b2);
         f.add(t2);
         Label l2 = new Label("=");
         l2.setBounds(210,100,30,50);
         l2.setAlignment(Label.CENTER);
         f.add(l2);
         TextField t3 = new TextField(10);
         t3.setBounds(250,100,50,50);
         t3.setText(b3);
         f.add(t3);
         f.setSize(400,400);
         f.setLocation(200,200);
         f.setLayout(null);
         f.setVisible(true);
         f.addWindowListener(new WindowAdapter() {
 			public void windowClosing(WindowEvent e)
 			{
 				System.exit(0);
 			}
 		});
        
         
	}

}
