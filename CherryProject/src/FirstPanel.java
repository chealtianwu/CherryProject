import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class J_ActionListener03 implements ActionListener{
	public void actionPerformed(ActionEvent arg0) {
		System.exit(0);//�˳�����
	}
}
class J_ActionListener04 implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null,"��½�ɹ�");
		//Menu2 m=new Menu2();
		//m.setVisible(true);  //�����Ծ����
		
  }
}
class FirstPanel extends JFrame{
	JLabel b;
	JTextField t;
	JButton d;
	String s[]={"ģ��ϵͳ��½","׼��֤�ţ�","����������","���֤�ţ�","��½","�˳�"};
	public Menu1(){
		super("ģ��ϵͳ��½����");
		Container c=getContentPane();
		GridBagLayout gr=new GridBagLayout();
		c.setLayout(gr);
		int []gx={0,0,1,0,1,0,1,0,1};
		int []gy={0,1,1,2,2,3,3,4,4};
		int []gw={5,1,1,1,1,1,1,1,1};
		int []gh={1,1,1,1,1,1,1,1,1};
		GridBagConstraints gc=new GridBagConstraints();
		//ImageIcon a=new ImageIcon("img1.gif");
		
		for(int i=0;i<gx.length;i++){
			if(gx[i]==0&&gy[i]==0){
				b=new JLabel(s[0]);gc.gridx=gx[i];gc.gridy=gy[i];
				gc.gridwidth=gw[i];gc.gridheight=gh[i];gc.fill=GridBagConstraints.CENTER;
				gr.setConstraints(b, gc);c.add(b);}
			if(gx[i]==0&&gy[i]==1){
				b=new JLabel(s[1]);gc.gridx=gx[i];gc.gridy=gy[i];
				gc.gridwidth=gw[i];gc.gridheight=gh[i];gc.fill=GridBagConstraints.CENTER;
				gr.setConstraints(b, gc);c.add(b);}
			if(gx[i]==0&&gy[i]==2){
				b=new JLabel(s[2]);gc.gridx=gx[i];gc.gridy=gy[i];
				gc.gridwidth=gw[i];gc.gridheight=gh[i];gc.fill=GridBagConstraints.CENTER;
				gr.setConstraints(b, gc);c.add(b);}
			if(gx[i]==0&&gy[i]==3){
				b=new JLabel(s[3]);gc.gridx=gx[i];gc.gridy=gy[i];
				gc.gridwidth=gw[i];gc.gridheight=gh[i];gc.fill=GridBagConstraints.CENTER;
				gr.setConstraints(b, gc);c.add(b);}
			if(gx[i]==1&&gy[i]==1){
				t=new JTextField();gc.gridx=gx[i];gc.gridy=gy[i];
				gc.gridwidth=gw[i];gc.gridheight=gh[i];gc.fill=GridBagConstraints.BOTH;
				gr.setConstraints(t, gc);c.add(t);}
			if(gx[i]==1&&gy[i]==2){
				t=new JTextField("");gc.gridx=gx[i];gc.gridy=gy[i];
				gc.gridwidth=gw[i];gc.gridheight=gh[i];gc.fill=GridBagConstraints.BOTH;
				gr.setConstraints(t, gc);c.add(t);}
			if(gx[i]==1&&gy[i]==3){
				t=new JTextField(220);gc.gridx=gx[i];gc.gridy=gy[i];
				gc.gridwidth=gw[i];gc.gridheight=gh[i];gc.fill=GridBagConstraints.BOTH;
				gr.setConstraints(t, gc);c.add(t);}
			if(gx[i]==0&&gy[i]==4){
				d=new JButton(s[4]);gc.gridx=gx[i];gc.gridy=gy[i];
				gc.gridwidth=gw[i];gc.gridheight=gh[i];gc.fill=GridBagConstraints.CENTER;
				gr.setConstraints(d, gc);c.add(d);J_ActionListener03 l1=new J_ActionListener03();d.addActionListener(l1);}
			if(gx[i]==1&&gy[i]==4){
				d=new JButton(s[5]);gc.gridx=gx[i];gc.gridy=gy[i];
				gc.gridwidth=gw[i];gc.gridheight=gh[i];gc.fill=GridBagConstraints.CENTER;
				gr.setConstraints(d, gc);c.add(d);J_ActionListener04 l2=new J_ActionListener04();d.addActionListener(l2);}

		}
		setSize(600,600);
	}
}