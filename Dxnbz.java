package GUI编程;
import java.awt.*;
/**
*@author 作者 Your-Name：
*@version 创建时间：
*类说明：
*/
public class Dxnbz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Frame f = new Frame("东西南北中布局");
        f.setSize(300,300);
        f.setLocation(200,200);
        f.setVisible(true);
        Button b1 = new Button("东");
        Button b2 = new Button("西");
        Button b3 = new Button("南");
        Button b4 = new Button("北");
        Button b5 = new Button("中");
        f.add(b1,BorderLayout.EAST);
        f.add(b2,BorderLayout.WEST);
        f.add(b3,BorderLayout.SOUTH);
        f.add(b4,BorderLayout.NORTH);
        f.add(b5,BorderLayout.CENTER);

	}

}
