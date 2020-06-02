package GUI编程;
import java.awt.*;
/**
*@author 作者 Your-Name：
*@version 创建时间：
*类说明：布局
*/
public class LiuSiBuJu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Frame f = new Frame("这是流式布局");
       f.setSize(300,300);
      // f.setLayout(null);
       f.setLayout(new FlowLayout(FlowLayout.LEFT));
       f.setVisible(true);
       Button b1 = new Button("1");
       Button b2 = new Button("2");
       Button b3 = new Button("3");
       f.add(b1);
       f.add(b2);
       f.add(b3);
       
	}

}
