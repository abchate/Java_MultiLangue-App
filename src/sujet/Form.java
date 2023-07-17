package sujet;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class Form extends JPanel implements ActionListener {

	private JTextField nameTF;
	private JTextField mobileTF;
	private JRadioButton maleRB;
	private JTextField birthdateTF;
	private JTextArea adresseTF;
	private JRadioButton femaleRB;
	private JButton submitB;
	private JButton resetB;
	private ButtonGroup genderBG;
	private RegistrationView r;
	protected ResourceBundle dico;

	public Form(RegistrationView rg, ResourceBundle dico) {
		this.r = rg;

		setLayout(new BorderLayout());

		SpringLayout layout = new SpringLayout();
		this.setLayout(layout);
		this.setSize(100, 50);

		JLabel nameL = new JLabel(dico.getString("form.name"));
		nameTF = new JTextField(20);
		this.add(nameL);
		layout.putConstraint(SpringLayout.WEST, nameL, 10, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, nameL, 0, SpringLayout.NORTH, this); // hauteur
		this.add(nameTF);
		nameTF.addActionListener(this.r);

		// ligne 2
		JLabel mobileL = new JLabel(dico.getString("form.mobile"));
		this.add(mobileL);
		layout.putConstraint(SpringLayout.WEST, mobileL, 10, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.NORTH, mobileL, 3, SpringLayout.HORIZONTAL_CENTER, nameL);
		mobileTF = new JTextField(20);

		this.add(mobileTF);
		mobileTF.addActionListener(this.r);
		layout.putConstraint(SpringLayout.WEST, mobileTF, 10, SpringLayout.EAST, mobileL);
		layout.putConstraint(SpringLayout.NORTH, mobileTF, 10, SpringLayout.SOUTH, nameTF);
		layout.putConstraint(SpringLayout.WEST, nameTF, 0, SpringLayout.WEST, mobileTF); // pour aligner

		// ligne 3
		JLabel genderL = new JLabel(dico.getString("form.gender"));
		femaleRB = new JRadioButton(dico.getString("form.female"), true);
		maleRB = new JRadioButton(dico.getString("form.male"), false);
		genderBG = new ButtonGroup();
		genderBG.add(femaleRB);
		genderBG.add(maleRB);
		this.add(genderL);
		layout.putConstraint(SpringLayout.WEST, genderL, 10, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.NORTH, genderL, 12, SpringLayout.SOUTH, mobileL);
		this.add(femaleRB);
		layout.putConstraint(SpringLayout.WEST, femaleRB, 10, SpringLayout.EAST, genderL);
		layout.putConstraint(SpringLayout.NORTH, femaleRB, 5, SpringLayout.SOUTH, mobileTF);
		layout.putConstraint(SpringLayout.WEST, mobileTF, 0, SpringLayout.WEST, femaleRB);
		this.add(maleRB);
		layout.putConstraint(SpringLayout.WEST, maleRB, 5, SpringLayout.EAST, femaleRB);
		layout.putConstraint(SpringLayout.NORTH, maleRB, 0, SpringLayout.NORTH, femaleRB);

		JLabel birthdateL = new JLabel(dico.getString("form.DOB"));
		this.add(birthdateL);
		layout.putConstraint(SpringLayout.WEST, birthdateL, 10, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, birthdateL, 10, SpringLayout.SOUTH, genderL);
		birthdateTF = new JTextField(20);
		this.add(birthdateTF);
		layout.putConstraint(SpringLayout.WEST, birthdateTF, 20, SpringLayout.EAST, birthdateL);
		layout.putConstraint(SpringLayout.NORTH, birthdateTF, 0, SpringLayout.SOUTH, femaleRB);
		// layout.putConstraint(SpringLayout.WEST, mobileTF, 10, SpringLayout.WEST,
		// birthdateTF);

		JLabel adresseL = new JLabel(dico.getString("form.adresse"));
		this.add(adresseL);
		layout.putConstraint(SpringLayout.WEST, adresseL, 10, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, adresseL, 10, SpringLayout.SOUTH, birthdateL);
		adresseTF = new JTextArea(3, 20);
		this.add(adresseTF);
		// adresseTF.addActionListener(this.r);
		layout.putConstraint(SpringLayout.WEST, adresseTF, 10, SpringLayout.EAST, adresseL);
		layout.putConstraint(SpringLayout.NORTH, adresseTF, 10, SpringLayout.SOUTH, birthdateTF);
		// layout.putConstraint(SpringLayout.WEST, birthdateTF, 10, SpringLayout.WEST,
		// adresseTF);

		JCheckBox checkBox = new JCheckBox(dico.getString("form.check"));
		this.add(checkBox);
		layout.putConstraint(SpringLayout.WEST, checkBox, 70, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, checkBox, 70, SpringLayout.NORTH, adresseTF);

		submitB = new JButton(dico.getString("button.add"));
		submitB.setActionCommand("add");
		submitB.addActionListener(this.r);
		this.add(submitB);
		layout.putConstraint(SpringLayout.WEST, submitB, 100, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, submitB, 40, SpringLayout.NORTH, checkBox);
		resetB = new JButton(dico.getString("button.reset"));
		resetB.setActionCommand("reset");
		resetB.addActionListener(this.r);
		this.add(resetB);
		layout.putConstraint(SpringLayout.WEST, resetB, 10, SpringLayout.EAST, submitB);
		layout.putConstraint(SpringLayout.NORTH, resetB, 0, SpringLayout.NORTH, submitB);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public JTextField getNameTF() {
		return nameTF;
	}

	public void setNameTF(JTextField nameTF) {
		this.nameTF = nameTF;
	}

	public JTextField getMobileTF() {
		return mobileTF;
	}

	public void setMobileTF(JTextField mobileTF) {
		this.mobileTF = mobileTF;
	}

	public JRadioButton getMaleRB() {
		return maleRB;
	}

	public void setMaleRB(JRadioButton maleRB) {
		this.maleRB = maleRB;
	}

	public JTextField getBirthdateTF() {
		return birthdateTF;
	}

	public void setBirthdateTF(JTextField birthdateTF) {
		this.birthdateTF = birthdateTF;
	}

	public JTextArea getAdresseTF() {
		return adresseTF;
	}

	public void setAdresseTF(JTextArea adresseTF) {
		this.adresseTF = adresseTF;
	}

	public JRadioButton getFemaleRB() {
		return femaleRB;
	}

	public void setFemaleRB(JRadioButton femaleRB) {
		this.femaleRB = femaleRB;
	}

	public JButton getSubmitB() {
		return submitB;
	}

	public void setSubmitB(JButton submitB) {
		this.submitB = submitB;
	}

	public JButton getResetB() {
		return resetB;
	}

	public void setResetB(JButton resetB) {
		this.resetB = resetB;
	}

	public RegistrationView getR() {
		return r;
	}

	public void setR(RegistrationView r) {
		this.r = r;
	}

	public ButtonGroup getGenderBG() {
		return genderBG;
	}

	public void setGenderBG(ButtonGroup genderBG) {
		this.genderBG = genderBG;
	}

}
