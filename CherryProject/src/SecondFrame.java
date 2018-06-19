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
		//��ʼ��
		textArea = new JTextArea("��Ŀ");
		preButton = new JButton("��һ��");
		nextButton = new JButton("��һ��");
		buttonGroup = new ButtonGroup();
		aButton = new JRadioButton("A");
		bButton = new JRadioButton("B");
		cButton = new JRadioButton("C");
		dButton = new JRadioButton("D");
		
		Box vBox1 = Box.createVerticalBox();
		Box hBox1 = Box.createHorizontalBox();
		Box hBox2 = Box.createHorizontalBox();
		
		//����ѡ��ť���밴ť�顣
		buttonGroup.add(aButton);
		buttonGroup.add(bButton);
		buttonGroup.add(cButton);
		buttonGroup.add(dButton);
		
		//��ѡ��ABCD�����һ��ˮƽ������
		hBox1.add(aButton);
		hBox1.add(bButton);
		hBox1.add(cButton);
		hBox1.add(dButton);
		//����һ�⣬��һ�����ڶ���ˮƷ������
		hBox2.add(preButton);
		hBox2.add(nextButton);
		
		vBox1.add(textArea);
		vBox1.add(hBox1);
		vBox1.add(hBox2);
		container.add(vBox1);
	}
}
