package sujet;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class RegistrationView extends JFrame implements ActionListener {
	private JTextArea messageArea;
	private Form form;
	private SaveToCSV save;
	protected ResourceBundle dico;

	public RegistrationView(String title, ResourceBundle dico) throws HeadlessException {
		super(title);

		this.setSize(500, 500);

		JLabel titleL = new JLabel(title);
		Font arialF = new Font("arial", Font.PLAIN, 18);
		titleL.setFont(arialF);
		titleL.setHorizontalAlignment(titleL.CENTER);

		add(titleL, BorderLayout.NORTH);

		form = new Form(this, dico);

		JPanel messagePanel = new JPanel();

		messagePanel.setLayout(new BorderLayout());
		messageArea = new JTextArea(5, 40);
		messageArea.setEditable(false);
		messagePanel.add(messageArea);

		this.getContentPane().add(form);
		this.getContentPane().add(messagePanel, BorderLayout.EAST);

		this.pack();

		Insets insets = getInsets();
		int margin = 10;
		form.setBorder(new EmptyBorder(insets.top + margin, insets.left + margin, insets.bottom + margin, margin));
		messagePanel
				.setBorder(new EmptyBorder(insets.top + margin, margin, insets.bottom + margin, insets.right + margin));

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		String componentName = "";
		if (e.getSource() instanceof JButton) {
			componentName = ((JButton) e.getSource()).getText();
		} else if (e.getSource() instanceof JTextField) {
			componentName = ((JTextField) e.getSource()).getName();
		}

		messageArea.setText("Vous avez cliqué sur le champ de texte " + componentName + "\n");

		if (e.getActionCommand() == "add") {
			String name = form.getNameTF().getText();
			String mobile = form.getMobileTF().getText();
			String gender = form.getGenderBG().getSelection().getActionCommand();
			// String date = dateComboBox.getSelectedItem().toString();
			String date = form.getBirthdateTF().getText();
			String address = form.getAdresseTF().getText();

			save = new SaveToCSV(name, mobile, gender, date, address);

			// pour reset fonctionne
		} else if (e.getActionCommand() == "reset") {
			form.getNameTF().setText("");
			form.getMobileTF().setText("");
			form.getBirthdateTF().setText("");
			form.getAdresseTF().setText("");

		}
	}

}
