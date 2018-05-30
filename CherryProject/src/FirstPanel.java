import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class FirstPanel extends JPanel{
	private JButton queDing;
	FirstPanel(SecondPanel secondPanel) {
		queDing = new JButton("È·¶¨");
		queDing.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				secondPanel.setVisible(true);
				setVisible(false);
			}
		});
		add(queDing);
		setVisible(true);
	}
}
