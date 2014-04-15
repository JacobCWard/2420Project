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

public class bstFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField txtYear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bstFrame frame = new bstFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public bstFrame() {
		setResizable(false);
		setTitle("Account Information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Social Security Number");
		lblNewLabel.setBounds(35, 14, 113, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(158, 11, 127, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(10, 48, 62, 14);
		contentPane.add(lblFirstName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(77, 45, 106, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(193, 48, 62, 14);
		contentPane.add(lblLastName);
		
		textField_2 = new JTextField();
		textField_2.setBounds(265, 45, 113, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Phone");
		lblNewLabel_1.setBounds(10, 73, 62, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(77, 70, 106, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(193, 73, 46, 14);
		contentPane.add(lblEmail);
		
		textField_4 = new JTextField();
		textField_4.setBounds(227, 70, 151, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(10, 98, 46, 14);
		contentPane.add(lblAddress);
		
		textField_5 = new JTextField();
		textField_5.setBounds(77, 95, 151, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblZip = new JLabel("Zip");
		lblZip.setBounds(237, 98, 46, 14);
		contentPane.add(lblZip);
		
		textField_6 = new JTextField();
		textField_6.setBounds(265, 95, 113, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(10, 123, 46, 14);
		contentPane.add(lblCity);
		
		textField_7 = new JTextField();
		textField_7.setBounds(77, 120, 151, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblState = new JLabel("State");
		lblState.setBounds(237, 123, 46, 14);
		contentPane.add(lblState);
		
		textField_8 = new JTextField();
		textField_8.setBounds(265, 120, 113, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 204, 46, 14);
		contentPane.add(lblPassword);
		
		textField_9 = new JTextField();
		textField_9.setBounds(77, 201, 151, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblBirthday = new JLabel("Birthday");
		lblBirthday.setBounds(10, 148, 46, 14);
		contentPane.add(lblBirthday);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Month...", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		comboBox.setBounds(77, 145, 101, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Day...", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_1.setBounds(193, 145, 62, 20);
		contentPane.add(comboBox_1);
		
		txtYear = new JTextField();
		txtYear.setText("Year...");
		txtYear.setBounds(265, 145, 86, 20);
		contentPane.add(txtYear);
		txtYear.setColumns(10);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setBounds(10, 173, 62, 14);
		contentPane.add(lblDepartment);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Sales and Marketing", "Quality Assurance", "Payroll", "Customer Service", "Media Relations", "Customer Relations", "Advertising", "Finances", "Human Resources", "Accounting", "Research and Development", "Tech Support", "Legal Department", "Public Relations", "Asset Management"}));
		comboBox_2.setBounds(77, 170, 178, 20);
		contentPane.add(comboBox_2);
		
		JCheckBox chckbxActive = new JCheckBox("Active");
		chckbxActive.setBounds(265, 169, 97, 23);
		contentPane.add(chckbxActive);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(298, 10, 80, 23);
		contentPane.add(btnNewButton);
	}
}
