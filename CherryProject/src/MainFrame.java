import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class J_ActionListener01 implements ActionListener{
	public void actionPerformed(ActionEvent arg0) {
		System.exit(0);//退出程序
	}
}
class J_ActionListener02 implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		FirstPanel m=new FirstPanel();
		m.setVisible(true);  //创建新的窗体，以达到切换窗体的效果，进入登陆页面
		
  }
}
public class MainFrame extends JFrame{
	ImageIcon a=new ImageIcon("img1.gif");
	JLabel b;
	JButton d;
	String s[]={"无纸化试卷阅卷模拟系统","没头脑小组","退出系统","开始登陆"};
    public MainFrame(){
		super("无纸化试卷阅卷模拟系统");
		Container c=getContentPane();
		GridBagLayout gr=new GridBagLayout();
		c.setLayout(gr);
		int []gx={1,1,1,1,3};
		int []gy={0,2,3,4,4};
		int []gw={3,3,3,1,1};
		int []gh={2,1,1,1,1};
		GridBagConstraints gc=new GridBagConstraints();
		for(int i=0;i<gx.length;i++){
			if(gx[i]==1&&gy[i]==0){
					b=new JLabel(a);gc.gridx=gx[i];gc.gridy=gy[i];
					gc.gridwidth=gw[i];gc.gridheight=gh[i];gc.fill=GridBagConstraints.CENTER;
					gr.setConstraints(b, gc);c.add(b);}
			if(gx[i]==1&&gy[i]==2){
				b=new JLabel(s[0]);gc.gridx=gx[i];gc.gridy=gy[i];
				gc.gridwidth=gw[i];gc.gridheight=gh[i];gc.fill=GridBagConstraints.CENTER;
				gr.setConstraints(b, gc);c.add(b);}
			if(gx[i]==1&&gy[i]==3){
				b=new JLabel(s[1]);gc.gridx=gx[i];gc.gridy=gy[i];
				gc.gridwidth=gw[i];gc.gridheight=gh[i];gc.fill=GridBagConstraints.CENTER;
				gr.setConstraints(b, gc);c.add(b);}
			if(gx[i]==1&&gy[i]==4){
				d=new JButton(s[2]);gc.gridx=gx[i];gc.gridy=gy[i];
				gc.gridwidth=gw[i];gc.gridheight=gh[i];gc.fill=GridBagConstraints.CENTER;
				gr.setConstraints(d, gc);c.add(d);J_ActionListener01 l1=new J_ActionListener01();d.addActionListener(l1);}
			if(gx[i]==3&&gy[i]==4){
				d=new JButton(s[3]);gc.gridx=gx[i];gc.gridy=gy[i];
				gc.gridwidth=gw[i];gc.gridheight=gh[i];gc.fill=GridBagConstraints.CENTER;
				gr.setConstraints(d, gc);c.add(d);J_ActionListener02 l2=new J_ActionListener02();d.addActionListener(l2);}
		}
}
	public static void main (String args[]){
        MainFrame app=new MainFrame();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(260,150);
		app.setVisible(true);
}
}