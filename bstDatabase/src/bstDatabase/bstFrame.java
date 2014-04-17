package bstDatabase;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import javax.swing.JCheckBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "serial", "unused", "rawtypes" })
public class bstFrame extends JFrame {

	private JPanel contentPane;
	private JTextField ssnField;
	private JTextField fNameField;
	private JTextField lNameField;
	private JTextField phoneField;
	private JTextField emailField;
	private JTextField addressField;
	private JTextField zipField;
	private JTextField cityField;
	private JTextField stateField;
	private JTextField passwordField;
	private JTextField yearField;
	private JCheckBox chckbxActive;
	private JComboBox departmentComboBox;
	private JComboBox dayComboBox;
	private JComboBox monthComboBox;
	private static PopulateTreeNodes main;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws Exception {
		main = new PopulateTreeNodes();
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); // Change
																				// for
																				// WindowsLookAndFeel

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				bstFrame frame = new bstFrame();
				frame.setVisible(true);
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * 
	 */
	@SuppressWarnings({ "unchecked" })
	public bstFrame() {
		setResizable(false);
		setTitle("Account Information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 392, 261);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Social Security Number");
		lblNewLabel.setBounds(35, 14, 113, 14);
		contentPane.add(lblNewLabel);

		ssnField = new JTextField();
		ssnField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setFields(Integer.parseInt(ssnField.getText()));	//Populating fields from pressing Enter in ssnField
			}
		});
		ssnField.setBounds(158, 11, 127, 20);
		contentPane.add(ssnField);
		ssnField.setColumns(10);

		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(10, 48, 62, 14);
		contentPane.add(lblFirstName);

		fNameField = new JTextField();
		fNameField.setBounds(77, 45, 106, 20);
		contentPane.add(fNameField);
		fNameField.setColumns(10);

		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(193, 48, 62, 14);
		contentPane.add(lblLastName);

		lNameField = new JTextField();
		lNameField.setBounds(265, 45, 113, 20);
		contentPane.add(lNameField);
		lNameField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Phone");
		lblNewLabel_1.setBounds(10, 73, 62, 14);
		contentPane.add(lblNewLabel_1);

		phoneField = new JTextField();
		phoneField.setBounds(77, 70, 106, 20);
		contentPane.add(phoneField);
		phoneField.setColumns(10);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(193, 73, 46, 14);
		contentPane.add(lblEmail);

		emailField = new JTextField();
		emailField.setBounds(227, 70, 151, 20);
		contentPane.add(emailField);
		emailField.setColumns(10);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(10, 98, 46, 14);
		contentPane.add(lblAddress);

		addressField = new JTextField();
		addressField.setBounds(77, 95, 151, 20);
		contentPane.add(addressField);
		addressField.setColumns(10);

		JLabel lblZip = new JLabel("Zip");
		lblZip.setBounds(237, 98, 46, 14);
		contentPane.add(lblZip);

		zipField = new JTextField();
		zipField.setBounds(265, 95, 113, 20);
		contentPane.add(zipField);
		zipField.setColumns(10);

		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(10, 123, 46, 14);
		contentPane.add(lblCity);

		cityField = new JTextField();
		cityField.setEditable(false);
		cityField.setBounds(77, 120, 151, 20);
		contentPane.add(cityField);
		cityField.setColumns(10);

		JLabel lblState = new JLabel("State");
		lblState.setBounds(237, 123, 46, 14);
		contentPane.add(lblState);

		stateField = new JTextField();
		stateField.setEditable(false);
		stateField.setBounds(265, 120, 113, 20);
		contentPane.add(stateField);
		stateField.setColumns(10);

		JLabel lblBirthday = new JLabel("Birthday");
		lblBirthday.setBounds(10, 148, 46, 14);
		contentPane.add(lblBirthday);

		monthComboBox = new JComboBox();
		monthComboBox.setModel(new DefaultComboBoxModel(new String[] {
				"Month...", "January", "February", "March", "April", "May",
				"June", "July", "August", "September", "October", "November",
				"December" }));
		monthComboBox.setBounds(77, 145, 101, 20);
		contentPane.add(monthComboBox);

		dayComboBox = new JComboBox();
		dayComboBox.setModel(new DefaultComboBoxModel(new String[] { "Day...",
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",
				"13", "14", "15", "16", "17", "18", "19", "20", "21", "22",
				"23", "24", "25", "26", "27", "28", "29", "30", "31" }));
		dayComboBox.setBounds(193, 145, 62, 20);
		contentPane.add(dayComboBox);

		yearField = new JTextField();
		yearField.setText("Year...");
		yearField.setBounds(265, 145, 86, 20);
		contentPane.add(yearField);
		yearField.setColumns(10);

		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setBounds(10, 173, 62, 14);
		contentPane.add(lblDepartment);

		departmentComboBox = new JComboBox();
		departmentComboBox.setModel(new DefaultComboBoxModel(new String[] {
				"Sales and Marketing", "Quality Assurance", "Payroll",
				"Customer Service", "Media Relations", "Customer Relations",
				"Advertising", "Finances", "Human Resources", "Accounting",
				"Research and Development", "Tech Support", "Legal Department",
				"Public Relations", "Asset Management" }));
		departmentComboBox.setBounds(77, 170, 178, 20);
		contentPane.add(departmentComboBox);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 204, 46, 14);
		contentPane.add(lblPassword);

		passwordField = new JTextField();
		passwordField.setBounds(77, 201, 151, 20);
		contentPane.add(passwordField);
		passwordField.setColumns(10);

		chckbxActive = new JCheckBox("Active");
		chckbxActive.setBounds(265, 169, 97, 23);
		contentPane.add(chckbxActive);

		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setFields(Integer.parseInt(ssnField.getText()));			//Calling setFields to populate all of the JTextFields
			}
		});
		btnNewButton.setBounds(298, 10, 80, 23);
		contentPane.add(btnNewButton);
	}

	public void setFields(int ssn) {
		Account account = main.getAccount(ssn);
		fNameField.setText(account.getFname());
		lNameField.setText(account.getLname());
		phoneField.setText(account.getPhone() + "");
		emailField.setText(account.getEmail());
		addressField.setText(account.getAddress());
		zipField.setText(account.getZip() + "");
		cityField.setText(account.getCity());
		stateField.setText(account.getState());
		passwordField.setText(account.getPassword());
		monthComboBox.setSelectedIndex(account.getBmonth());
		dayComboBox.setSelectedIndex(account.getBday());
		yearField.setText(account.getByear() + "");
		departmentComboBox.setSelectedItem(account.getDepartment());
		chckbxActive.setSelected(account.isActive());
	}
}
