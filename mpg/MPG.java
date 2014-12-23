import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.Double;

public class MPG {
	public static void main(String [] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Set up outer Panel to hold miles and gallons
		JPanel mpgForm = new JPanel();
		mpgForm.setLayout(new BoxLayout(mpgForm, BoxLayout.Y_AXIS));

		//starts the miles Panel
		JPanel miles = new JPanel();
		miles.setLayout(new BoxLayout(miles, BoxLayout.X_AXIS));

		JLabel milesLabel = new JLabel("Miles driven: ");
		//has to be final because it is used in inner class
		final JTextField milesInput = new JTextField(10);
		miles.add(milesLabel);
		miles.add(milesInput);

		//starts the gallons Panel
		JPanel gallons = new JPanel();
		gallons.setLayout(new BoxLayout(gallons, BoxLayout.X_AXIS));

		JLabel gallonsLabel = new JLabel("Gallons used: ");
		final JTextField gallonsInput = new JTextField(10);
		gallons.add(gallonsLabel);
		gallons.add(gallonsInput);

		//adds the two panels to the outer container panel
		mpgForm.add(miles);
		mpgForm.add(gallons);

		//panel for buttons in case more buttons are to be added
		JPanel buttons = new JPanel();
		buttons.setLayout(new BoxLayout(buttons, BoxLayout.X_AXIS));

		JButton submit = new JButton("Submit");
		buttons.add(submit);

		//calculates the miles per gallon when submit is pressed and also does some form validation
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if(!milesInput.getText().matches("-?\\d+(\\.\\d+)?") || !gallonsInput.getText().matches("-?\\d+(\\.\\d+)?"))
					JOptionPane.showMessageDialog(null, "Please insert a number!", "MPG", JOptionPane.PLAIN_MESSAGE);
				else {
					double milesNum = Double.parseDouble(milesInput.getText());
					double gallonsNum = Double.parseDouble(gallonsInput.getText());
					if(gallonsNum != 0) {
						double mpg = milesNum / gallonsNum;
						if(milesNum < 0)
							JOptionPane.showMessageDialog(null, "You can't drive a negative amount of miles!", "MPG", JOptionPane.PLAIN_MESSAGE);
						else if(gallonsNum < 0)
							JOptionPane.showMessageDialog(null, "You can't use a negative amount of gas!", "MPG", JOptionPane.PLAIN_MESSAGE);
						else
							JOptionPane.showMessageDialog(null, "Miles per Gallon: " + String.format("%.2f", mpg), "MPG", JOptionPane.PLAIN_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, "You can't drive somewhere without using gas!", "MPG", JOptionPane.PLAIN_MESSAGE);
					}
				}
			}
		});

		frame.getContentPane().add(mpgForm, BorderLayout.PAGE_START);
		frame.getContentPane().add(buttons, BorderLayout.PAGE_END);

		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
	}
}
