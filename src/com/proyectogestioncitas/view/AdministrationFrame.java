package com.proyectogestioncitas.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.JSeparator;

public class AdministrationFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField_MPLog;
	private JTextField textField_MPLastLog;
	private JTable medicalTableCRUD;
	private JTextField textField_MCCenterID;
	private JTextField textField_MCLocation;
	private JTextField textField_MCCenterName;
	private JTextField textField_MCPostalCode;
	private JTextField textField_MCPhone;
	private JTable tableCCClient;
	private JTextField textField_CCdni;
	private JTextField textField_CCName;
	private JTable tableCCAAppointment;
	private JTextField textField_CCBirthDate;
	private JTextField textField_CCSurname;
	private JTextField textCCAField_Date;
	private JTextField textCCAField_Hour;
	private JButton btnCCAAddNew;
	private JButton btnCCADelete;
	private JButton btnCCAUpdate;
	private JButton btnCCUpdate;
	private JButton btnCCDelete;
	private JButton btnCCAddNew;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdministrationFrame frame = new AdministrationFrame();
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
	public AdministrationFrame() {
		inicialize();
	}
	
	public void inicialize(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 626, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addComponent(tabbedPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
		);
		
		JPanel MainPanel = new JPanel();
		tabbedPane.addTab("Main panel", null, MainPanel, null);
		
		JLabel lblMPUserInformation = new JLabel("User information");
		
		JLabel lblMPLoguedAs = new JLabel("Logued as:");
		
		JLabel lblMPLastLog = new JLabel("Last log:");
		
		textField_MPLog = new JTextField();
		textField_MPLog.setEditable(false);
		textField_MPLog.setColumns(10);
		
		textField_MPLastLog = new JTextField();
		textField_MPLastLog.setEditable(false);
		textField_MPLastLog.setColumns(10);
		GroupLayout gl_MainPanel = new GroupLayout(MainPanel);
		gl_MainPanel.setHorizontalGroup(
			gl_MainPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_MainPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_MainPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblMPLastLog)
						.addComponent(lblMPLoguedAs)
						.addComponent(lblMPUserInformation))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_MainPanel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textField_MPLastLog)
						.addComponent(textField_MPLog, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
					.addContainerGap(295, Short.MAX_VALUE))
		);
		gl_MainPanel.setVerticalGroup(
			gl_MainPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_MainPanel.createSequentialGroup()
					.addGap(38)
					.addComponent(lblMPUserInformation)
					.addGap(18)
					.addGroup(gl_MainPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMPLoguedAs)
						.addComponent(textField_MPLog, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_MainPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMPLastLog)
						.addComponent(textField_MPLastLog, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(178, Short.MAX_VALUE))
		);
		MainPanel.setLayout(gl_MainPanel);
		
		JPanel ClientConfiguration = new JPanel();
		tabbedPane.addTab("Client configuration", null, ClientConfiguration, null);
		
		tableCCClient = new JTable();
		
		JSeparator separator_1 = new JSeparator();
		
		JLabel lblCCid = new JLabel("ID:");
		
		textField_CCdni = new JTextField();
		textField_CCdni.setEditable(false);
		textField_CCdni.setColumns(10);
		
		JLabel lblCCName = new JLabel("Name:");
		
		textField_CCName = new JTextField();
		textField_CCName.setEditable(false);
		textField_CCName.setColumns(10);
		
		JLabel lblCCBirthdate = new JLabel("Birth date:");
		
		tableCCAAppointment = new JTable();
		
		textField_CCBirthDate = new JTextField();
		textField_CCBirthDate.setEditable(false);
		textField_CCBirthDate.setColumns(10);
		
		JLabel lblCCSurname = new JLabel("Surname:");
		
		textField_CCSurname = new JTextField();
		textField_CCSurname.setEditable(false);
		textField_CCSurname.setColumns(10);
		
		JLabel lblCCADate = new JLabel("Date:");
		
		textCCAField_Date = new JTextField();
		textCCAField_Date.setEditable(false);
		textCCAField_Date.setColumns(10);
		
		JLabel lblCCAHour = new JLabel("Hour:");
		
		textCCAField_Hour = new JTextField();
		textCCAField_Hour.setEditable(false);
		textCCAField_Hour.setColumns(10);
		
		JLabel lblClientInformation = new JLabel("CLIENT INFORMATION");
		
		JLabel lblAppointmentInformation = new JLabel("APPOINTMENT INFORMATION");
		
		btnCCAddNew = new JButton("Add new");
		
		btnCCDelete = new JButton("Delete");
		
		btnCCUpdate = new JButton("Update");
		
		btnCCAUpdate = new JButton("Update");
		
		btnCCADelete = new JButton("Delete");
		
		btnCCAAddNew = new JButton("Add new");
		GroupLayout gl_ClientConfiguration = new GroupLayout(ClientConfiguration);
		gl_ClientConfiguration.setHorizontalGroup(
			gl_ClientConfiguration.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ClientConfiguration.createSequentialGroup()
					.addGroup(gl_ClientConfiguration.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_ClientConfiguration.createSequentialGroup()
							.addComponent(tableCCClient, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tableCCAAppointment, GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
						.addGroup(gl_ClientConfiguration.createSequentialGroup()
							.addGap(22)
							.addGroup(gl_ClientConfiguration.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_ClientConfiguration.createSequentialGroup()
									.addGroup(gl_ClientConfiguration.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_ClientConfiguration.createSequentialGroup()
											.addGroup(gl_ClientConfiguration.createParallelGroup(Alignment.LEADING)
												.addComponent(lblCCSurname)
												.addComponent(lblCCBirthdate))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_ClientConfiguration.createParallelGroup(Alignment.LEADING)
												.addComponent(textField_CCBirthDate, 182, 182, 182)
												.addComponent(textField_CCSurname, 182, 182, 182)))
										.addGroup(gl_ClientConfiguration.createSequentialGroup()
											.addGroup(gl_ClientConfiguration.createParallelGroup(Alignment.LEADING)
												.addComponent(lblCCName)
												.addComponent(lblCCid))
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addGroup(gl_ClientConfiguration.createParallelGroup(Alignment.LEADING, false)
												.addComponent(textField_CCdni)
												.addComponent(textField_CCName, GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))))
									.addGap(51)
									.addGroup(gl_ClientConfiguration.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_ClientConfiguration.createSequentialGroup()
											.addComponent(lblCCAHour)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(textCCAField_Hour, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_ClientConfiguration.createSequentialGroup()
											.addComponent(lblCCADate)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(textCCAField_Date, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE))))
								.addGroup(gl_ClientConfiguration.createSequentialGroup()
									.addComponent(btnCCAddNew)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnCCDelete)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnCCUpdate)
									.addPreferredGap(ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
									.addComponent(btnCCAAddNew)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnCCADelete)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnCCAUpdate)))))
					.addContainerGap())
				.addGroup(gl_ClientConfiguration.createSequentialGroup()
					.addGap(95)
					.addComponent(lblClientInformation)
					.addPreferredGap(ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
					.addComponent(lblAppointmentInformation)
					.addGap(57))
				.addGroup(gl_ClientConfiguration.createSequentialGroup()
					.addContainerGap()
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 599, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_ClientConfiguration.setVerticalGroup(
			gl_ClientConfiguration.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ClientConfiguration.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_ClientConfiguration.createParallelGroup(Alignment.LEADING, false)
						.addComponent(tableCCAAppointment, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(tableCCClient, GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_ClientConfiguration.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblClientInformation)
						.addComponent(lblAppointmentInformation))
					.addGap(18)
					.addGroup(gl_ClientConfiguration.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCCid)
						.addComponent(textField_CCdni, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCCADate)
						.addComponent(textCCAField_Date, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_ClientConfiguration.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCCName)
						.addComponent(textField_CCName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCCAHour)
						.addComponent(textCCAField_Hour, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_ClientConfiguration.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_CCBirthDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCCBirthdate))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_ClientConfiguration.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCCSurname)
						.addComponent(textField_CCSurname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_ClientConfiguration.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCCAddNew)
						.addComponent(btnCCDelete)
						.addComponent(btnCCUpdate)
						.addComponent(btnCCAUpdate)
						.addComponent(btnCCADelete)
						.addComponent(btnCCAAddNew))
					.addContainerGap())
		);
		ClientConfiguration.setLayout(gl_ClientConfiguration);
		
		JPanel MedicalCenterConfig = new JPanel();
		tabbedPane.addTab("Medical center configuration", null, MedicalCenterConfig, null);
		
		medicalTableCRUD = new JTable();
		
		JSeparator separator = new JSeparator();
		
		JLabel lblMCCenterId = new JLabel("Center ID:");
		
		textField_MCCenterID = new JTextField();
		textField_MCCenterID.setEditable(false);
		textField_MCCenterID.setColumns(10);
		
		JLabel lblMCLocate = new JLabel("Location:");
		
		textField_MCLocation = new JTextField();
		textField_MCLocation.setEditable(false);
		textField_MCLocation.setColumns(10);
		
		JLabel lblMCCenterName = new JLabel("Center name:");
		
		textField_MCCenterName = new JTextField();
		textField_MCCenterName.setEditable(false);
		textField_MCCenterName.setColumns(10);
		
		JLabel lblMCPostalCode = new JLabel("Postal code:");
		
		textField_MCPostalCode = new JTextField();
		textField_MCPostalCode.setEditable(false);
		textField_MCPostalCode.setColumns(10);
		
		JLabel lblMCPhoneNumber = new JLabel("Phone number:");
		
		textField_MCPhone = new JTextField();
		textField_MCPhone.setEditable(false);
		textField_MCPhone.setColumns(10);
		
		JButton btnMCAddNew = new JButton("Add new");
		
		JButton btnMCUpdate = new JButton("Update");
		
		JButton btnDelete = new JButton("Delete");
		
		JButton btnMCSave = new JButton("Save");
		btnMCSave.setEnabled(false);
		GroupLayout gl_MedicalCenterConfig = new GroupLayout(MedicalCenterConfig);
		gl_MedicalCenterConfig.setHorizontalGroup(
			gl_MedicalCenterConfig.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_MedicalCenterConfig.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_MedicalCenterConfig.createParallelGroup(Alignment.LEADING)
						.addComponent(separator, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
						.addComponent(medicalTableCRUD, GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
						.addGroup(gl_MedicalCenterConfig.createSequentialGroup()
							.addGroup(gl_MedicalCenterConfig.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_MedicalCenterConfig.createSequentialGroup()
									.addComponent(lblMCPostalCode)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textField_MCPostalCode))
								.addGroup(gl_MedicalCenterConfig.createSequentialGroup()
									.addComponent(lblMCCenterName)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textField_MCCenterName))
								.addGroup(gl_MedicalCenterConfig.createSequentialGroup()
									.addComponent(lblMCLocate)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textField_MCLocation))
								.addGroup(gl_MedicalCenterConfig.createSequentialGroup()
									.addComponent(lblMCCenterId)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textField_MCCenterID, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_MedicalCenterConfig.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnMCAddNew)
								.addComponent(lblMCPhoneNumber))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_MedicalCenterConfig.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_MCPhone, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
								.addGroup(gl_MedicalCenterConfig.createParallelGroup(Alignment.TRAILING)
									.addComponent(btnMCSave)
									.addGroup(gl_MedicalCenterConfig.createSequentialGroup()
										.addComponent(btnDelete)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnMCUpdate))))))
					.addContainerGap())
		);
		gl_MedicalCenterConfig.setVerticalGroup(
			gl_MedicalCenterConfig.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_MedicalCenterConfig.createSequentialGroup()
					.addContainerGap()
					.addComponent(medicalTableCRUD, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_MedicalCenterConfig.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMCCenterId)
						.addComponent(textField_MCCenterID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMCPhoneNumber)
						.addComponent(textField_MCPhone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_MedicalCenterConfig.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_MedicalCenterConfig.createSequentialGroup()
							.addGroup(gl_MedicalCenterConfig.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMCLocate)
								.addComponent(textField_MCLocation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_MedicalCenterConfig.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMCCenterName)
								.addComponent(textField_MCCenterName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18))
						.addGroup(gl_MedicalCenterConfig.createSequentialGroup()
							.addGroup(gl_MedicalCenterConfig.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnMCAddNew)
								.addComponent(btnDelete)
								.addComponent(btnMCUpdate))
							.addGap(37)))
					.addGroup(gl_MedicalCenterConfig.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMCPostalCode)
						.addComponent(textField_MCPostalCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnMCSave)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		MedicalCenterConfig.setLayout(gl_MedicalCenterConfig);
		contentPane.setLayout(gl_contentPane);
	}
}