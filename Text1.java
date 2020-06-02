package GUI编程;
import java.awt.*;
/**
*@author 作者 Your-Name：
*@version 创建时间：
*类说明：
*/
public class Text1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("布局");
		f.setLocation(100,100);
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(new GridLayout(2,1));
//		  f.add(b1,BorderLayout.EAST);
//	        f.add(b2,BorderLayout.WEST);
//	        f.add(b3,BorderLayout.SOUTH);
//	        f.add(b4,BorderLayout.NORTH);
//	        f.add(b5,BorderLayout.CENTER);
		// f.setLayout(new GridLayout(3,2));//三行两列填充
		// f.setLayout(new FlowLayout(FlowLayout.LEFT));
		//面板
		Panel p1 = new Panel(new BorderLayout());
		Panel p2 = new Panel(new GridLayout(2,1));
		Panel p3 = new Panel(new BorderLayout());
		Panel p4 = new Panel(new GridLayout(1,2));
		
		Button b1 = new Button("1");
		Button b2 = new Button("1");
		p1.add(b1,BorderLayout.WEST);
		p1.add(b2,BorderLayout.EAST);
		f.add(p1);
		Button b3 = new Button("1");
		Button b4 = new Button("1");
		p2.add(b3);
		p2.add(b4);
		p1.add(p2);
		Button b5 = new Button("1");
		Button b6 = new Button("1");
		p3.add(b5,BorderLayout.WEST);
		p3.add(b6,BorderLayout.EAST);
		Button b7 = new Button("1");
		Button b8 = new Button("1");
		p4.add(b7);
		p4.add(b8);
		p3.add(p4);
		f.add(p3);
		

	}

}
