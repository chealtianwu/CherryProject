import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



public class SecondPanel extends JFrame{
	private JTextField tmtext;
	private JTextField context;
	private ButtonGroup buttonGroup;
	private JRadioButton []r={new JRadioButton("A"),new JRadioButton("B"),new JRadioButton("C"),new JRadioButton("D")};
	private JButton preButton;
	private JButton nextButton;

	public SecondPanel(){
		super("操作界面");
		Container c=getContentPane();
		GridBagLayout gr=new GridBagLayout();
		c.setLayout(gr);
		int []gx={0,1,0,1,4,5,0,1,4,5,0,5};
		int []gy={0,0,2,2,2,2,4,4,4,4,6,6};
		int []gw={1,8,1,3,1,3,1,3,1,3,2,2};
		int []gh={2,2,2,2,2,2,2,2,2,2,1,1};
		GridBagConstraints gc=new GridBagConstraints();
		//ImageIcon a=new ImageIcon("img1.gif");
		
		for(int i=0;i<gx.length;i++){
			if(gx[i]==0&&gy[i]==0){
				tmtext=new JTextField("题目：",5);tmtext.setEditable(false);gc.gridx=gx[i];gc.gridy=gy[i];
				gc.gridwidth=gw[i];gc.gridheight=gh[i];gc.fill=GridBagConstraints.BOTH;
				gr.setConstraints(tmtext, gc);c.add(tmtext);}
			if(gx[i]==1&&gy[i]==0){
				context=new JTextField(null,40);gc.gridx=gx[i];gc.gridy=gy[i];
				gc.gridwidth=gw[i];gc.gridheight=gh[i];gc.fill=GridBagConstraints.BOTH;
				gr.setConstraints(context, gc);c.add(context);}
			if(gx[i]==0&&gy[i]==2){
				gc.gridx=gx[i];gc.gridy=gy[i];
				gc.gridwidth=gw[i];gc.gridheight=gh[i];gc.fill=GridBagConstraints.CENTER;
				gr.setConstraints(r[0], gc);c.add(r[0]);}
			if(gx[i]==1&&gy[i]==2){
				context=new JTextField(null,20);gc.gridx=gx[i];gc.gridy=gy[i];
				gc.gridwidth=gw[i];gc.gridheight=gh[i];gc.fill=GridBagConstraints.BOTH;
				gr.setConstraints(context, gc);c.add(context);}
			if(gx[i]==4&&gy[i]==2){
				gc.gridx=gx[i];gc.gridy=gy[i];
				gc.gridwidth=gw[i];gc.gridheight=gh[i];gc.fill=GridBagConstraints.CENTER;
				gr.setConstraints(r[1], gc);c.add(r[1]);}
			if(gx[i]==5&&gy[i]==2){
				context=new JTextField(null,20);gc.gridx=gx[i];gc.gridy=gy[i];
				gc.gridwidth=gw[i];gc.gridheight=gh[i];gc.fill=GridBagConstraints.BOTH;
				gr.setConstraints(context, gc);c.add(context);}
			if(gx[i]==0&&gy[i]==4){
				gc.gridx=gx[i];gc.gridy=gy[i];
				gc.gridwidth=gw[i];gc.gridheight=gh[i];gc.fill=GridBagConstraints.CENTER;
				gr.setConstraints(r[2], gc);c.add(r[2]);}
			if(gx[i]==1&&gy[i]==4){
				context=new JTextField(null,20);gc.gridx=gx[i];gc.gridy=gy[i];
				gc.gridwidth=gw[i];gc.gridheight=gh[i];gc.fill=GridBagConstraints.BOTH;
				gr.setConstraints(context, gc);c.add(context);}
			if(gx[i]==4&&gy[i]==4){
				gc.gridx=gx[i];gc.gridy=gy[i];
				gc.gridwidth=gw[i];gc.gridheight=gh[i];gc.fill=GridBagConstraints.CENTER;
				gr.setConstraints(r[3], gc);c.add(r[3]);}
			if(gx[i]==5&&gy[i]==4){
				context=new JTextField(null,20);gc.gridx=gx[i];gc.gridy=gy[i];
				gc.gridwidth=gw[i];gc.gridheight=gh[i];gc.fill=GridBagConstraints.BOTH;
				gr.setConstraints(context, gc);c.add(context);}
			if(gx[i]==0&&gy[i]==6){
				preButton=new JButton("上一题");gc.gridx=gx[i];gc.gridy=gy[i];
				gc.gridwidth=gw[i];gc.gridheight=gh[i];gc.fill=GridBagConstraints.CENTER;
				gr.setConstraints(preButton, gc);c.add(preButton);}
			if(gx[i]==5&&gy[i]==6){
				nextButton=new JButton("下一题");gc.gridx=gx[i];gc.gridy=gy[i];
				gc.gridwidth=gw[i];gc.gridheight=gh[i];gc.fill=GridBagConstraints.CENTER;
				gr.setConstraints(nextButton, gc);c.add(nextButton);}
		}/*
		for(int i=0;i<r.length;i++){
			buttonGroup.add(r[i]);
			r[i].setSelected(false);
		}*/
		setSize(1024,1024);
	}
}
