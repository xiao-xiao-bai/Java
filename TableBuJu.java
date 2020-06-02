package GUI编程;
import java.awt.*;
/**
*@author 作者 Your-Name：
*@version 创建时间：
*类说明：
*/
public class TableBuJu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Frame f = new Frame("表格布局");
     Button b1 = new Button("红");
     Button b2 = new Button("黄");
     Button b3 = new Button("蓝");
     Button b4 = new Button("绿");
     Button b5 = new Button("青");
     Button b6 = new Button("靛");
     f.setLayout(new GridLayout(3,2));//三行两列填充
     f.add(b1);
     f.add(b2);
     f.add(b3);
     f.add(b4);
     f.add(b5);
     f.add(b6);
     f.setSize(400,400);
     f.setLocation(100,100);
     f.setVisible(true);
     
     
     
     
	}

}
