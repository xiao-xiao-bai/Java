package GUI���;
import java.awt.*;
/**
*@author ���� Your-Name��
*@version ����ʱ�䣺
*��˵����
*/
public class Dxnbz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Frame f = new Frame("�����ϱ��в���");
        f.setSize(300,300);
        f.setLocation(200,200);
        f.setVisible(true);
        Button b1 = new Button("��");
        Button b2 = new Button("��");
        Button b3 = new Button("��");
        Button b4 = new Button("��");
        Button b5 = new Button("��");
        f.add(b1,BorderLayout.EAST);
        f.add(b2,BorderLayout.WEST);
        f.add(b3,BorderLayout.SOUTH);
        f.add(b4,BorderLayout.NORTH);
        f.add(b5,BorderLayout.CENTER);

	}

}
