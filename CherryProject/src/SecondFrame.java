import java.awt.Container;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;

public class SecondFrame extends JFrame{
	private JButton preButton;
	private JButton nextButton;
	private JTextArea textArea;
	private ButtonGroup buttonGroup;
	private JRadioButton aButton;
	private JRadioButton bButton;
	private JRadioButton cButton;
	private JRadioButton dButton;
	SecondFrame() {
		super();
		Container container = getContentPane();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,800);
		//初始化
		textArea = new JTextArea("题目");
		preButton = new JButton("上一题");
		nextButton = new JButton("下一题");
		buttonGroup = new ButtonGroup();
		aButton = new JRadioButton("A");
		bButton = new JRadioButton("B");
		cButton = new JRadioButton("C");
		dButton = new JRadioButton("D");
		
		Box vBox1 = Box.createVerticalBox();
		Box hBox1 = Box.createHorizontalBox();
		Box hBox2 = Box.createHorizontalBox();
		
		//将单选按钮加入按钮组。
		buttonGroup.add(aButton);
		buttonGroup.add(bButton);
		buttonGroup.add(cButton);
		buttonGroup.add(dButton);
		
		//将选项ABCD加入第一个水平盒子中
		hBox1.add(aButton);
		hBox1.add(bButton);
		hBox1.add(cButton);
		hBox1.add(dButton);
		//将上一题，下一题放入第二个水品盒子中
		hBox2.add(preButton);
		hBox2.add(nextButton);
		
		vBox1.add(textArea);
		vBox1.add(hBox1);
		vBox1.add(hBox2);
		container.add(vBox1);
	}
}
