package GUI���;
import java.awt.*;
/**
*@author ���� Your-Name��
*@version ����ʱ�䣺
*��˵����
*/
public class TableBuJu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Frame f = new Frame("��񲼾�");
     Button b1 = new Button("��");
     Button b2 = new Button("��");
     Button b3 = new Button("��");
     Button b4 = new Button("��");
     Button b5 = new Button("��");
     Button b6 = new Button("��");
     f.setLayout(new GridLayout(3,2));//�����������
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
