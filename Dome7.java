
import java.awt.*;
import java.awt.event.*;
/**
*@author ���� Your-Name��
*@version ����ʱ�䣺
*��˵����
*/
public class Dome7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("����");
		Label la1 = new Label("�� ��: ");
		TextField t1 = new TextField(50);
		Font f1 = new Font("����",Font.BOLD,20);
		Font f2 = new Font("����",Font.BOLD,18);
		la1.setFont(f1);
		f.add(la1);
		f.add(t1);//��������
		t1.setEchoChar('*');//�����ַ�����
		t1.setFont(f2);//����
		t1.setBounds(120,60,150,30);
		la1.setAlignment(Label.CENTER);
		la1.setForeground(Color.black);//ǰ��ɫ
		la1.setBackground(Color.white);
		f.setLayout(null);//���Ĭ�ϴ��ڲ���
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
