package presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JTextArea;
import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.text.DefaultCaret;
import javax.swing.BoxLayout;
import business.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;
import javax.swing.ScrollPaneConstants;

public class TRKGUI {

	private JFrame frmResourceSchedulingApp;
	private final ButtonGroup options_buttonGroup = new ButtonGroup();
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_id;
	private JTextField textField_id_2;
	private JTextField textField_id_3;
	private TrkAPP app;
	private JTable table;
	private JTable viewscheduletable;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TRKGUI window = new TRKGUI(new TrkAPP());
					window.frmResourceSchedulingApp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TRKGUI(TrkAPP app) {
		this.app=app;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmResourceSchedulingApp = new JFrame();
		frmResourceSchedulingApp.setTitle("Resource Scheduling App");
		frmResourceSchedulingApp.setBounds(100, 100, 710, 491);
		frmResourceSchedulingApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmResourceSchedulingApp.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new CardLayout(0, 0));
		
		/**
		 * The contents of the login card/page
		 */
		JPanel login_panel = new JPanel();
		panel.add(login_panel, "login");
		login_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel l1 = new JPanel();
		l1.setToolTipText("");
		FlowLayout fl_l1 = (FlowLayout) l1.getLayout();
		fl_l1.setVgap(70);
		login_panel.add(l1, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("TRK APP LOGIN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		l1.add(lblNewLabel);
		
		JPanel l2 = new JPanel();
		FlowLayout fl_l2 = (FlowLayout) l2.getLayout();
		fl_l2.setHgap(100);
		login_panel.add(l2, BorderLayout.WEST);
		
		JPanel l3 = new JPanel();
		FlowLayout fl_l3 = (FlowLayout) l3.getLayout();
		fl_l3.setHgap(100);
		login_panel.add(l3, BorderLayout.EAST);
		
		JPanel l4 = new JPanel();
		login_panel.add(l4, BorderLayout.CENTER);
		
		JLabel Username_Label = new JLabel("Username:");
		l4.add(Username_Label);
		Username_Label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JTextField Username_Field = new JTextField();
		l4.add(Username_Field);
		Username_Field.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Username_Field.setColumns(15);
		
		
		JLabel Password_Label = new JLabel("Password:");
		l4.add(Password_Label);
		Password_Label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JPasswordField password_Field = new JPasswordField();
		l4.add(password_Field);
		password_Field.setFont(new Font("Tahoma", Font.PLAIN, 14));
		password_Field.setColumns(15);
		
		JButton login_button = new JButton("Login");
		l4.add(login_button);
		login_button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JPanel options_panel2 = new JPanel();
		panel.add(options_panel2, "name_255827648248700");
		options_panel2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_1.getLayout();
		flowLayout_2.setHgap(100);
		flowLayout_2.setVgap(100);
		options_panel2.add(panel_1, BorderLayout.WEST);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panel_2.getLayout();
		flowLayout_3.setHgap(100);
		options_panel2.add(panel_2, BorderLayout.EAST);
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_3.getLayout();
		flowLayout.setVgap(50);
		flowLayout.setHgap(50);
		options_panel2.add(panel_3, BorderLayout.NORTH);
		
		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_4.getLayout();
		flowLayout_1.setVgap(50);
		options_panel2.add(panel_4, BorderLayout.SOUTH);
		
		JPanel panel_5 = new JPanel();
		options_panel2.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.Y_AXIS));
		
		JPanel options_1 = new JPanel();
		panel_5.add(options_1);
		options_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton schedule_button_1 = new JButton("Schedule Equipment");
		schedule_button_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		options_1.add(schedule_button_1);
		
		JButton search_button_1 = new JButton("Search");
		search_button_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		options_1.add(search_button_1);
		
		JButton viewSch_button_1 = new JButton("View Schedule");
		viewSch_button_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		options_1.add(viewSch_button_1);
		
		JPanel options_panel1 = new JPanel();
		panel.add(options_panel1, "options");
		options_panel1.setLayout(new BorderLayout(0, 0));
		
		JPanel options = new JPanel();
		options.setLayout(new GridLayout(0, 1, 0, 0));
		
		/**
		 * Buttons for the options panel
		 * Allows the user to select an option
		 */
		JButton addEqu_button = new JButton("Add Equipment");		
		addEqu_button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		options.add(addEqu_button);
		options_buttonGroup.add(addEqu_button);
		
		JButton modEqu_button = new JButton("Modify Equippment");
		modEqu_button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		options.add(modEqu_button);
		options_buttonGroup.add(modEqu_button);
		
		JButton delEqu_button = new JButton("Delete Equipment");
		delEqu_button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		options.add(delEqu_button);
		options_buttonGroup.add(delEqu_button);
		
		JButton viewEqu_button = new JButton("Check Inventory");
		viewEqu_button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		options.add(viewEqu_button);
		options_buttonGroup.add(viewEqu_button);
		
		JButton schedule_button = new JButton("Schedule Equipment");
		schedule_button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		options.add(schedule_button);
		options_buttonGroup.add(schedule_button);
		
		JButton modSch_button = new JButton("Modify Schedule");
		modSch_button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		options.add(modSch_button);
		options_buttonGroup.add(modSch_button);
		
		JButton search_button = new JButton("Search");		
		search_button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		options.add(search_button);
		options_buttonGroup.add(search_button);
		
		JButton viewSch_button = new JButton("View Schedule");
		viewSch_button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		options_buttonGroup.add(viewSch_button);
		options.add(viewSch_button);
		options_1.add(viewSch_button_1);
		
		JButton genrep = new JButton("Generate Report");
		genrep.setFont(new Font("Tahoma", Font.PLAIN, 14));
		options.add(genrep);
		
		options_panel1.add(options, BorderLayout.CENTER);
		
		
		
		/**
		 * Options Panel
		 */
		JPanel o1 = new JPanel();
		FlowLayout fl_o1 = (FlowLayout) o1.getLayout();
		fl_o1.setHgap(100);
		fl_o1.setVgap(100);
		options_panel1.add(o1, BorderLayout.WEST);
		
		JPanel o2 = new JPanel();
		FlowLayout fl_o2 = (FlowLayout) o2.getLayout();
		fl_o2.setVgap(50);
		fl_o2.setHgap(50);
		options_panel1.add(o2, BorderLayout.NORTH);
		
		JPanel o3 = new JPanel();
		FlowLayout fl_o3 = (FlowLayout) o3.getLayout();
		fl_o3.setVgap(50);
		fl_o3.setHgap(50);
		options_panel1.add(o3, BorderLayout.SOUTH);
		
		JPanel o4 = new JPanel();
		FlowLayout fl_o4 = (FlowLayout) o4.getLayout();
		fl_o4.setVgap(100);
		fl_o4.setHgap(100);
		options_panel1.add(o4, BorderLayout.EAST);
		
		/**
		 * Add Equipment Panel
		 */
		
		JPanel addEqu_panel = new JPanel();
		panel.add(addEqu_panel);
		addEqu_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel a1 = new JPanel();
		FlowLayout fl_a1 = (FlowLayout) a1.getLayout();
		fl_a1.setHgap(20);
		fl_a1.setVgap(20);
		addEqu_panel.add(a1, BorderLayout.NORTH);
		
		JLabel a_Label = new JLabel("Add Equipment");
		a_Label.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		a1.add(a_Label);
		
		JPanel a2 = new JPanel();
		FlowLayout fl_a2 = (FlowLayout) a2.getLayout();
		fl_a2.setHgap(50);
		addEqu_panel.add(a2, BorderLayout.EAST);
		
		JPanel a3 = new JPanel();
		FlowLayout fl_a3 = (FlowLayout) a3.getLayout();
		fl_a3.setHgap(50);
		addEqu_panel.add(a3, BorderLayout.WEST);
		
		JPanel a4 = new JPanel();
		addEqu_panel.add(a4, BorderLayout.CENTER);
		
		JPanel a4_1 = new JPanel();
		
		JLabel aLabel_1 = new JLabel("Name:");
		aLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JTextField atextField_1 = new JTextField();
		atextField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		atextField_1.setColumns(15);
		
		JLabel aLabel_2 = new JLabel("Quantity:");
		aLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JTextField atextField_2 = new JTextField();
		atextField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		atextField_2.setColumns(5);
		
		JLabel aLabel_3 = new JLabel("ID:");
		aLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JTextField atextArea = new JTextField();
		atextArea.setEditable(false);
		atextArea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		atextArea.setColumns(10);
		
		JButton aSave = new JButton("Save");
		aSave.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JButton aBack = new JButton("Back");
		aBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		a4_1.setLayout(new BoxLayout(a4_1, BoxLayout.Y_AXIS));
		a4_1.add(aLabel_1);
		a4_1.add(atextField_1);
		a4_1.add(aLabel_2);
		a4_1.add(atextField_2);
		a4_1.add(aLabel_3);
		a4_1.add(atextArea);
		
		JLabel confirm1 = new JLabel("");
		confirm1.setFont(new Font("Tahoma", Font.ITALIC, 14));
		confirm1.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_a4 = new GroupLayout(a4);
		gl_a4.setHorizontalGroup(
			gl_a4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_a4.createSequentialGroup()
					.addGap(173)
					.addGroup(gl_a4.createParallelGroup(Alignment.LEADING)
						.addComponent(a4_1, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_a4.createSequentialGroup()
							.addComponent(aSave)
							.addGap(33)
							.addComponent(aBack)))
					.addContainerGap(162, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_a4.createSequentialGroup()
					.addContainerGap(166, Short.MAX_VALUE)
					.addComponent(confirm1, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
					.addGap(142))
		);
		gl_a4.setVerticalGroup(
			gl_a4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_a4.createSequentialGroup()
					.addGap(18)
					.addComponent(a4_1, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_a4.createParallelGroup(Alignment.BASELINE)
						.addComponent(aBack)
						.addComponent(aSave))
					.addGap(34)
					.addComponent(confirm1)
					.addGap(115))
		);
		a4.setLayout(gl_a4);
		
		/**
		 * Modify Equipment Panel
		 */
		JPanel modEqu_panel = new JPanel();
		panel.add(modEqu_panel);
		modEqu_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel mE1 = new JPanel();
		FlowLayout fl_mE1 = (FlowLayout) mE1.getLayout();
		fl_mE1.setVgap(15);
		modEqu_panel.add(mE1, BorderLayout.NORTH);
		
		JLabel mE_Label_1 = new JLabel("Modify Equipment Information");
		mE_Label_1.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		mE1.add(mE_Label_1);
		
		JPanel mE2 = new JPanel();
		FlowLayout fl_mE2 = (FlowLayout) mE2.getLayout();
		fl_mE2.setHgap(50);
		modEqu_panel.add(mE2, BorderLayout.WEST);
		
		JPanel mE3 = new JPanel();
		FlowLayout fl_mE3 = (FlowLayout) mE3.getLayout();
		fl_mE3.setHgap(50);
		modEqu_panel.add(mE3, BorderLayout.EAST);
		
		JPanel mE4 = new JPanel();
		modEqu_panel.add(mE4, BorderLayout.CENTER);
		
		JPanel mE4_1 = new JPanel();
		
		JButton mESave = new JButton("Save");
		mESave.setFont(new Font("Tahoma", Font.PLAIN, 14));
				
		JButton mEBack = new JButton("Back");
		mEBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel confirm2 = new JLabel("");
		confirm2.setFont(new Font("Tahoma", Font.ITALIC, 14));
		
		GroupLayout gl_mE4 = new GroupLayout(mE4);
		gl_mE4.setHorizontalGroup(
			gl_mE4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mE4.createSequentialGroup()
					.addContainerGap(178, Short.MAX_VALUE)
					.addComponent(mESave)
					.addGap(10)
					.addComponent(mEBack)
					.addGap(180))
				.addGroup(gl_mE4.createSequentialGroup()
					.addGap(133)
					.addComponent(mE4_1, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(159, Short.MAX_VALUE))
				.addGroup(gl_mE4.createSequentialGroup()
					.addGap(147)
					.addComponent(confirm2, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(150, Short.MAX_VALUE))
		);
		gl_mE4.setVerticalGroup(
			gl_mE4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mE4.createSequentialGroup()
					.addContainerGap()
					.addComponent(mE4_1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addGroup(gl_mE4.createParallelGroup(Alignment.LEADING)
						.addComponent(mESave)
						.addComponent(mEBack))
					.addGap(48)
					.addComponent(confirm2)
					.addContainerGap(144, Short.MAX_VALUE))
		);
		
		JTextField mEtextField_1 = new JTextField();
		mEtextField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mEtextField_1.setColumns(10);
		
		JTextField mEtextField_2 = new JTextField();
		mEtextField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mEtextField_2.setColumns(10);
		mE4_1.setLayout(new BoxLayout(mE4_1, BoxLayout.Y_AXIS));
		
		JLabel mE_Label_2 = new JLabel("Equipment ID:");
		mE_Label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mE4_1.add(mE_Label_2);
		mE4_1.add(mEtextField_1);
		
		JLabel mE_Label_3 = new JLabel("Quantity:");
		mE_Label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mE4_1.add(mE_Label_3);
		mE4_1.add(mEtextField_2);
		mE4.setLayout(gl_mE4);
		
		/**
		 * Delete Equipment Panel
		 */
		JPanel delEqu_panel = new JPanel();
		panel.add(delEqu_panel);
		delEqu_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel d1 = new JPanel();
		delEqu_panel.add(d1, BorderLayout.NORTH);
		
		JLabel d_Label_1 = new JLabel("Delete Equipment Information");
		d_Label_1.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		d1.add(d_Label_1);
		
		JPanel d2 = new JPanel();
		delEqu_panel.add(d2, BorderLayout.WEST);
		d2.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 5));
		
		JPanel d3 = new JPanel();
		FlowLayout fl_d3 = (FlowLayout) d3.getLayout();
		fl_d3.setHgap(50);
		delEqu_panel.add(d3, BorderLayout.EAST);
		
		JPanel d4 = new JPanel();
		delEqu_panel.add(d4, BorderLayout.CENTER);
		
		JPanel d4_1 = new JPanel();
		d4_1.setLayout(new MigLayout("", "[grow]", "[][grow]"));
		
		JButton dDelete = new JButton("Delete");
		dDelete.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton dBack = new JButton("Back");
		dBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		GroupLayout gl_d4 = new GroupLayout(d4);
		gl_d4.setHorizontalGroup(
			gl_d4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_d4.createSequentialGroup()
					.addGroup(gl_d4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_d4.createSequentialGroup()
							.addGap(72)
							.addComponent(d4_1, GroupLayout.PREFERRED_SIZE, 353, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_d4.createSequentialGroup()
							.addGap(158)
							.addComponent(dDelete)
							.addGap(48)
							.addComponent(dBack)))
					.addContainerGap(67, Short.MAX_VALUE))
		);
		gl_d4.setVerticalGroup(
			gl_d4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_d4.createSequentialGroup()
					.addGap(18)
					.addComponent(d4_1, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_d4.createParallelGroup(Alignment.BASELINE)
						.addComponent(dBack)
						.addComponent(dDelete))
					.addContainerGap(108, Short.MAX_VALUE))
		);
		
		JLabel d_Label_2 = new JLabel("Equipment ID:");
		d_Label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		d4_1.add(d_Label_2, "flowx,cell 0 0");
		
		JTextField dtextField = new JTextField();
		dtextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		d4_1.add(dtextField, "cell 0 0");
		dtextField.setColumns(10);
		
		JScrollPane dscrollPane = new JScrollPane();
		d4_1.add(dscrollPane, "cell 0 1,grow");
		
		JTextArea dtextArea = new JTextArea();
		dtextArea.setEditable(false);
		dscrollPane.setViewportView(dtextArea);
		d4.setLayout(gl_d4);
		
		/**
		 * Schedule Equipment Panel
		 */
		JPanel schedule_panel = new JPanel();
		panel.add(schedule_panel);
		schedule_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel s1 = new JPanel();
		schedule_panel.add(s1, BorderLayout.NORTH);
		
		JLabel s_Label_1 = new JLabel("Schedule Equipment ");
		s_Label_1.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		s1.add(s_Label_1);
		
		JPanel s2 = new JPanel();
		FlowLayout fl_s2 = (FlowLayout) s2.getLayout();
		fl_s2.setHgap(50);
		schedule_panel.add(s2, BorderLayout.WEST);
		
		JPanel s3 = new JPanel();
		FlowLayout fl_s3 = (FlowLayout) s3.getLayout();
		fl_s3.setHgap(50);
		schedule_panel.add(s3, BorderLayout.EAST);
		
		JPanel s4 = new JPanel();
		schedule_panel.add(s4, BorderLayout.CENTER);
		
		JPanel s4_1 = new JPanel();
		
		JButton sSchedule = new JButton("Schedule");
		sSchedule.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		
		JButton sBack = new JButton("Back");
		sBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel confirm3 = new JLabel("");
		confirm3.setFont(new Font("Tahoma", Font.ITALIC, 14));
		
		GroupLayout gl_s4 = new GroupLayout(s4);
		gl_s4.setHorizontalGroup(
			gl_s4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_s4.createSequentialGroup()
					.addGap(159)
					.addComponent(sSchedule)
					.addGap(18)
					.addComponent(sBack)
					.addContainerGap(167, Short.MAX_VALUE))
				.addGroup(gl_s4.createSequentialGroup()
					.addGap(141)
					.addGroup(gl_s4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_s4.createSequentialGroup()
							.addComponent(confirm3, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_s4.createSequentialGroup()
							.addComponent(s4_1, GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
							.addGap(140))))
		);
		gl_s4.setVerticalGroup(
			gl_s4.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_s4.createSequentialGroup()
					.addContainerGap()
					.addComponent(s4_1, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
					.addGroup(gl_s4.createParallelGroup(Alignment.LEADING)
						.addComponent(sBack)
						.addComponent(sSchedule))
					.addGap(23)
					.addComponent(confirm3)
					.addContainerGap())
		);
		
		JLabel s_Label_2 = new JLabel("EventID: ");
		s_Label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		s_Label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JTextField stextField_1 = new JTextField();
		stextField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		stextField_1.setColumns(10);
		
		JLabel s_Label_3 = new JLabel("Location:");
		s_Label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		s_Label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JTextField stextField_2 = new JTextField();
		stextField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		stextField_2.setColumns(10);
		
		JLabel s_Label_4 = new JLabel("Date [yyyy-mm-dd]: ");
		s_Label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		s_Label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel s_Label_5 = new JLabel("Start Time [24 hr] [hh:mm]:");
		s_Label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		s_Label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel s_Label_6 = new JLabel("End Time [24 hr] [hh:mm]:");
		s_Label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		s_Label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		s4_1.setLayout(new BoxLayout(s4_1, BoxLayout.Y_AXIS));
		
		JLabel s_Label_id = new JLabel("Equipment ID: ");
		s_Label_id.setHorizontalAlignment(SwingConstants.RIGHT);
		s_Label_id.setFont(new Font("Tahoma", Font.PLAIN, 14));
		s4_1.add(s_Label_id);
		
		textField_id = new JTextField();
		textField_id.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_id.setColumns(10);
		s4_1.add(textField_id);
		s4_1.add(s_Label_2);
		s4_1.add(stextField_1);
		s4_1.add(s_Label_3);
		s4_1.add(stextField_2);
		s4_1.add(s_Label_4);
		
		JTextField stextField_4_1 = new JTextField();
		stextField_4_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		stextField_4_1.setColumns(10);
		s4_1.add(stextField_4_1);
		s4_1.add(s_Label_5);
		
		JTextField stextField_5_1 = new JTextField();
		stextField_5_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		stextField_5_1.setColumns(10);
		s4_1.add(stextField_5_1);
		s4_1.add(s_Label_6);
		
		JTextField stextField_6_1 = new JTextField();
		stextField_6_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		stextField_6_1.setColumns(10);
		s4_1.add(stextField_6_1);
		
		JLabel s_Label_7 = new JLabel("Quantity:");
		s_Label_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		s_Label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		s4_1.add(s_Label_7);
		
		JTextField stextField_7_1 = new JTextField();
		stextField_7_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		stextField_7_1.setColumns(10);
		s4_1.add(stextField_7_1);
		s4.setLayout(gl_s4);
		
		/**
		 * Modify Schedule Panel -
		 */
		JPanel modify_schedule_panel = new JPanel();
		panel.add(modify_schedule_panel, "name_178420640145900");
		modify_schedule_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel mS1 = new JPanel();
		modify_schedule_panel.add(mS1, BorderLayout.NORTH);
		
		JLabel mS_Label_1 = new JLabel("Modify Equipment Schedule ");
		mS_Label_1.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		mS1.add(mS_Label_1);
		
		JPanel mS2 = new JPanel();
		FlowLayout fl_mS2 = (FlowLayout) mS2.getLayout();
		fl_mS2.setHgap(50);
		modify_schedule_panel.add(mS2, BorderLayout.WEST);
		
		JPanel mS3 = new JPanel();
		FlowLayout fl_mS3 = (FlowLayout) mS3.getLayout();
		fl_mS3.setHgap(50);
		modify_schedule_panel.add(mS3, BorderLayout.EAST);
		
		JPanel mS4 = new JPanel();
		modify_schedule_panel.add(mS4, BorderLayout.CENTER);
		
		JPanel mS4_1 = new JPanel();
		
		JButton mSsave = new JButton("Save");
		mSsave.setFont(new Font("Tahoma", Font.PLAIN, 14));
				
		JButton mSback = new JButton("Back");
		mSback.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel confirm4 = new JLabel("");
		confirm4.setFont(new Font("Tahoma", Font.ITALIC, 14));
		
		GroupLayout gl_mS4 = new GroupLayout(mS4);
		gl_mS4.setHorizontalGroup(
			gl_mS4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mS4.createSequentialGroup()
					.addContainerGap(129, Short.MAX_VALUE)
					.addGroup(gl_mS4.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_mS4.createSequentialGroup()
							.addComponent(mS4_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(126))
						.addGroup(gl_mS4.createSequentialGroup()
							.addGroup(gl_mS4.createParallelGroup(Alignment.LEADING)
								.addComponent(confirm4, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_mS4.createSequentialGroup()
									.addComponent(mSsave)
									.addGap(57)
									.addComponent(mSback)))
							.addGap(152))))
		);
		gl_mS4.setVerticalGroup(
			gl_mS4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mS4.createSequentialGroup()
					.addContainerGap()
					.addComponent(mS4_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(23)
					.addGroup(gl_mS4.createParallelGroup(Alignment.BASELINE)
						.addComponent(mSsave)
						.addComponent(mSback))
					.addPreferredGap(ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
					.addComponent(confirm4)
					.addContainerGap())
		);
		mS4_1.setLayout(new BoxLayout(mS4_1, BoxLayout.Y_AXIS));
		
		JLabel s_Label_id_1 = new JLabel("Equipment ID: ");
		s_Label_id_1.setHorizontalAlignment(SwingConstants.RIGHT);
		s_Label_id_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mS4_1.add(s_Label_id_1);
		
		textField_id_2 = new JTextField();
		textField_id_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_id_2.setColumns(10);
		mS4_1.add(textField_id_2);
		
		JLabel ms_Label_1 = new JLabel("EventID: ");
		ms_Label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ms_Label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		mS4_1.add(ms_Label_1);
		
		JTextField textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setColumns(10);
		mS4_1.add(textField);
		
		JLabel ms_Label_2 = new JLabel("Location:");
		ms_Label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ms_Label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		mS4_1.add(ms_Label_2);
		
		JTextField textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setColumns(10);
		mS4_1.add(textField_1);
		
		JLabel ms_Label_3 = new JLabel("Date [yyyy-mm-dd]: ");
		ms_Label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ms_Label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		mS4_1.add(ms_Label_3);
		
		JTextField textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_2.setColumns(10);
		mS4_1.add(textField_2);
		
		JLabel ms_Label_4 = new JLabel("Start Time [24 hr] [hh:mm]:");
		ms_Label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ms_Label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		mS4_1.add(ms_Label_4);
		
		JTextField textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_3.setColumns(10);
		mS4_1.add(textField_3);
		
		JLabel ms_Label_5 = new JLabel("End Time [24 hr] [hh:mm]:");
		ms_Label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ms_Label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		mS4_1.add(ms_Label_5);
		
		JTextField textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_4.setColumns(10);
		mS4_1.add(textField_4);
		
		JLabel ms_Label_6 = new JLabel("Quantity:");
		ms_Label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ms_Label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		mS4_1.add(ms_Label_6);
		
		JTextField textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_5.setColumns(10);
		mS4_1.add(textField_5);
				
		mS4.setLayout(gl_mS4);
		
		JPanel search_panel = new JPanel();
		panel.add(search_panel, "name_178648497614900");
		search_panel.setLayout(new BorderLayout(0, 0));
		
		/**
		 * Search Panel
		 */
		JPanel sr1 = new JPanel();
		search_panel.add(sr1, BorderLayout.NORTH);
		
		JLabel lblNewLabel_15 = new JLabel("View Equipment");
		lblNewLabel_15.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		sr1.add(lblNewLabel_15);
		
		JPanel sr2 = new JPanel();
		search_panel.add(sr2, BorderLayout.WEST);
		GroupLayout gl_sr2 = new GroupLayout(sr2);
		gl_sr2.setHorizontalGroup(
			gl_sr2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 58, Short.MAX_VALUE)
		);
		gl_sr2.setVerticalGroup(
			gl_sr2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 312, Short.MAX_VALUE)
		);
		sr2.setLayout(gl_sr2);
		
		JPanel sr3 = new JPanel();
		search_panel.add(sr3, BorderLayout.EAST);
		GroupLayout gl_sr3 = new GroupLayout(sr3);
		gl_sr3.setHorizontalGroup(
			gl_sr3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 161, Short.MAX_VALUE)
		);
		gl_sr3.setVerticalGroup(
			gl_sr3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 312, Short.MAX_VALUE)
		);
		sr3.setLayout(gl_sr3);
		
		JPanel sr4 = new JPanel();
		search_panel.add(sr4, BorderLayout.CENTER);
		
		JPanel v4_1 = new JPanel();
		
		JButton srSearch = new JButton("Search");
		srSearch.setFont(new Font("Tahoma", Font.PLAIN, 14));
				
		JButton srBack = new JButton("Back");
		srBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel confirm5 = new JLabel("");
		confirm5.setHorizontalAlignment(SwingConstants.CENTER);
		confirm5.setFont(new Font("Tahoma", Font.ITALIC, 14));
		
		GroupLayout gl_v4 = new GroupLayout(sr4);
		gl_v4.setHorizontalGroup(
			gl_v4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_v4.createSequentialGroup()
					.addGroup(gl_v4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_v4.createSequentialGroup()
							.addGap(40)
							.addComponent(v4_1, GroupLayout.PREFERRED_SIZE, 397, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_v4.createSequentialGroup()
							.addGap(159)
							.addComponent(srSearch)
							.addGap(64)
							.addComponent(srBack)))
					.addContainerGap(36, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_v4.createSequentialGroup()
					.addContainerGap(133, Short.MAX_VALUE)
					.addComponent(confirm5, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
					.addGap(94))
		);
		gl_v4.setVerticalGroup(
			gl_v4.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_v4.createSequentialGroup()
					.addContainerGap()
					.addComponent(v4_1, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
					.addGroup(gl_v4.createParallelGroup(Alignment.BASELINE)
						.addComponent(srSearch)
						.addComponent(srBack))
					.addGap(28)
					.addComponent(confirm5)
					.addGap(32))
		);
		
		JLabel lblNewLabel_16 = new JLabel("Equipment ID:");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JTextField textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_8.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setEditable(false);
		scrollPane.setViewportView(textArea_2);
		textArea_2.setColumns(50);
		textArea_2.setRows(10);
		GroupLayout gl_v4_1 = new GroupLayout(v4_1);
		gl_v4_1.setHorizontalGroup(
			gl_v4_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_v4_1.createSequentialGroup()
					.addGap(116)
					.addComponent(lblNewLabel_16)
					.addGap(4)
					.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_v4_1.createSequentialGroup()
					.addGap(7)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 383, GroupLayout.PREFERRED_SIZE))
		);
		gl_v4_1.setVerticalGroup(
			gl_v4_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_v4_1.createSequentialGroup()
					.addGap(7)
					.addGroup(gl_v4_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_v4_1.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_16))
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
		);
		v4_1.setLayout(gl_v4_1);
		sr4.setLayout(gl_v4);
		
		/**Generate Report*/
		
		JPanel gen_report_panel = new JPanel();
		panel.add(gen_report_panel, "name_178648497614910");
		gen_report_panel.setLayout(new BorderLayout(0, 0));
		JPanel gen1 = new JPanel();
		gen_report_panel.add(gen1, BorderLayout.NORTH);
		
		JLabel genrepl = new JLabel("Generate Report");
		genrepl.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		gen1.add(genrepl);
		
		JPanel gen2 = new JPanel();
		gen_report_panel.add(gen2, BorderLayout.WEST);
		GroupLayout gl_gen2 = new GroupLayout(gen2);
		gl_gen2.setHorizontalGroup(
			gl_gen2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 58, Short.MAX_VALUE)
		);
		gl_gen2.setVerticalGroup(
			gl_gen2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 312, Short.MAX_VALUE)
		);
		gen2.setLayout(gl_gen2);
		
		JPanel gen3 = new JPanel();
		gen_report_panel.add(gen3, BorderLayout.EAST);
		GroupLayout gl_gen3 = new GroupLayout(gen3);
		gl_gen3.setHorizontalGroup(
			gl_gen3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 161, Short.MAX_VALUE)
		);
		gl_gen3.setVerticalGroup(
			gl_gen3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 312, Short.MAX_VALUE)
		);
		gen3.setLayout(gl_gen3);
		
		JPanel gen4 = new JPanel();
		gen_report_panel.add(gen4, BorderLayout.CENTER);
		
		JPanel vgen4 = new JPanel();
		
		JButton grSearch = new JButton("Search");
		srSearch.setFont(new Font("Tahoma", Font.PLAIN, 14));
				
		JButton grBack = new JButton("Back");
		srBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel confirm = new JLabel("");
		confirm.setHorizontalAlignment(SwingConstants.CENTER);
		confirm.setFont(new Font("Tahoma", Font.ITALIC, 14));
		
		GroupLayout gl_gen4 = new GroupLayout(gen4);
		gl_gen4.setHorizontalGroup(
			gl_gen4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_gen4.createSequentialGroup()
					.addGroup(gl_gen4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_gen4.createSequentialGroup()
							.addGap(159)
							.addComponent(grSearch)
							.addGap(64)
							.addComponent(grBack))
						.addGroup(gl_gen4.createSequentialGroup()
							.addGap(40)
							.addComponent(vgen4, GroupLayout.PREFERRED_SIZE, 397, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(36, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_gen4.createSequentialGroup()
					.addContainerGap(221, Short.MAX_VALUE)
					.addComponent(confirm)
					.addGap(196))
		);
		gl_gen4.setVerticalGroup(
			gl_gen4.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_gen4.createSequentialGroup()
					.addContainerGap()
					.addComponent(vgen4, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
					.addComponent(confirm)
					.addGap(18)
					.addGroup(gl_gen4.createParallelGroup(Alignment.BASELINE)
						.addComponent(grSearch)
						.addComponent(grBack))
					.addGap(76))
		);
		
		JLabel gendate = new JLabel("Date:");
		gendate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JTextField textField_gn = new JTextField();
		textField_gn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_gn.setColumns(10);
		
		JScrollPane scrollPanegn = new JScrollPane();
		JTextArea textArea_gn = new JTextArea();
		DefaultCaret caret2 = (DefaultCaret)textArea_gn.getCaret();
		caret2.setUpdatePolicy(DefaultCaret.NEVER_UPDATE);
		textArea_gn.setEditable(false);
		scrollPanegn.setViewportView(textArea_gn);
		textArea_gn.setColumns(50);
		textArea_gn.setRows(10);
		GroupLayout gl_gen41 = new GroupLayout(vgen4);
		gl_gen41.setHorizontalGroup(
				gl_gen41.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_gen41.createSequentialGroup()
					.addGap(116)
					.addComponent(gendate)
					.addGap(4)
					.addComponent(textField_gn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_gen41.createSequentialGroup()
					.addGap(7)
					.addComponent(scrollPanegn, GroupLayout.PREFERRED_SIZE, 383, GroupLayout.PREFERRED_SIZE))
		);
		gl_gen41.setVerticalGroup(
				gl_gen41.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_gen41.createSequentialGroup()
					.addGap(7)
					.addGroup(gl_gen41.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_gen41.createSequentialGroup()
							.addGap(3)
							.addComponent(gendate))
						.addComponent(textField_gn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addComponent(scrollPanegn, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
		);
		vgen4.setLayout(gl_gen41);
		gen4.setLayout(gl_gen4);
		
		/**View Equipment*/
		
		JPanel viewEqu_panel = new JPanel();
		panel.add(viewEqu_panel);
		viewEqu_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel v1 = new JPanel();
		viewEqu_panel.add(v1, BorderLayout.NORTH);
		
		JLabel v_Label_1 = new JLabel("Check Inventory");
		v_Label_1.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		v1.add(v_Label_1);
		
		JPanel v2 = new JPanel();
		viewEqu_panel.add(v2, BorderLayout.WEST);
		v2.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 5));
		
		JPanel v3 = new JPanel();
		FlowLayout fl_v3 = (FlowLayout) v3.getLayout();
		fl_v3.setHgap(50);
		viewEqu_panel.add(v3, BorderLayout.EAST);
		
		JPanel v4 = new JPanel();
		viewEqu_panel.add(v4, BorderLayout.CENTER);
		
		JPanel v4_11 = new JPanel();
		v4_11.setLayout(new MigLayout("", "[grow]", "[][grow]"));
		
		JButton vBack = new JButton("Back");
		vBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		GroupLayout gl_v41 = new GroupLayout(v4);
		gl_v41.setHorizontalGroup(
				gl_v41.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_v41.createSequentialGroup()
					.addGroup(gl_v41.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_v41.createSequentialGroup()
							.addGap(158)
							.addGap(48)
							.addComponent(vBack))
						.addGroup(gl_v41.createSequentialGroup()
							.addGap(72)
							.addComponent(v4_11, GroupLayout.PREFERRED_SIZE, 353, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(71, Short.MAX_VALUE))
		);
		gl_v41.setVerticalGroup(
				gl_v41.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_v41.createSequentialGroup()
					.addGap(18)
					.addComponent(v4_11, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_v41.createParallelGroup(Alignment.BASELINE)
						.addComponent(vBack))
					.addContainerGap(38, Short.MAX_VALUE))
		);
		
		/**JLabel v_Label_2 = new JLabel("Equipment ID:");
		v_Label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		v4_11.add(v_Label_2, "flowx,cell 0 0");
		
		JTextField vtextField = new JTextField();
		vtextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		v4_11.add(vtextField, "cell 0 0");
		vtextField.setColumns(10);*/
		
		JScrollPane vscrollPane = new JScrollPane();
		v4_11.add(vscrollPane, "cell 0 1,grow");
		
		JTextArea vtextArea = new JTextArea();
		DefaultCaret caret = (DefaultCaret)vtextArea.getCaret();
		caret.setUpdatePolicy(DefaultCaret.NEVER_UPDATE);
		vtextArea.setEditable(false);
		vscrollPane.setViewportView(vtextArea);
		v4.setLayout(gl_v41);
		
		/**
		 * View Schedule Panel
		 */
		JPanel view_schedule_panel = new JPanel();
		panel.add(view_schedule_panel, "name_191323147392800");
		view_schedule_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel vs1 = new JPanel();
		view_schedule_panel.add(vs1, BorderLayout.NORTH);
		
		JLabel lblNewLabel_17 = new JLabel("View Equipment Schedule");
		lblNewLabel_17.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		vs1.add(lblNewLabel_17);
		
		JPanel vs2 = new JPanel();
		FlowLayout fl_vs2 = (FlowLayout) vs2.getLayout();
		fl_vs2.setHgap(50);
		view_schedule_panel.add(vs2, BorderLayout.WEST);
		
		JPanel vs3 = new JPanel();
		FlowLayout fl_vs3 = (FlowLayout) vs3.getLayout();
		fl_vs3.setHgap(50);
		view_schedule_panel.add(vs3, BorderLayout.EAST);
		
		JPanel vs4 = new JPanel();
		view_schedule_panel.add(vs4, BorderLayout.CENTER);
		
		JPanel vs4_1 = new JPanel();
		vs4_1.setBounds(131, 10, 233, 36);
		vs4_1.setLayout(new MigLayout("", "[grow]", "[][]"));
		
		JLabel vs_Label_2 = new JLabel("Equipment ID:");
		vs_Label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		vs4_1.add(vs_Label_2, "flowx,cell 0 0,alignx center");
		
		JTextField vstextField = new JTextField();
		vstextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		vs4_1.add(vstextField, "cell 0 0");
		vstextField.setColumns(10);
		
		
		JButton vsView = new JButton("View");
		vsView.setBounds(78, 284, 68, 25);
		vsView.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		
		JButton vsBack = new JButton("Back");
		vsBack.setBounds(333, 284, 68, 25);
		vsBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JPanel view_schedule_panel_1 = new JPanel();
		panel.add(view_schedule_panel_1, "name_263145308522499");
		view_schedule_panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		view_schedule_panel_1.add(panel_6, BorderLayout.NORTH);
		
		JLabel lblNewLabel_17_1 = new JLabel("View Equipment Schedule");
		lblNewLabel_17_1.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		panel_6.add(lblNewLabel_17_1);
		
		JPanel panel_7 = new JPanel();
		FlowLayout flowLayout_6 = (FlowLayout) panel_7.getLayout();
		flowLayout_6.setHgap(50);
		view_schedule_panel_1.add(panel_7, BorderLayout.WEST);
		
		JPanel panel_8 = new JPanel();
		FlowLayout flowLayout_7 = (FlowLayout) panel_8.getLayout();
		flowLayout_7.setHgap(50);
		view_schedule_panel_1.add(panel_8, BorderLayout.EAST);
		
		JPanel panel_9 = new JPanel();
		view_schedule_panel_1.add(panel_9, BorderLayout.CENTER);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		vs4_1.add(scrollPane_1, "cell 0 1,grow");
		
		JButton vsView_1 = new JButton("View");
		vsView_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton vsBack_1 = new JButton("Back");
		vsBack_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JPanel panel_19 = new JPanel();
		GroupLayout gl_panel_9 = new GroupLayout(panel_9);
		vs4.setLayout(null);
		gl_panel_9.setHorizontalGroup(
			gl_panel_9.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_9.createSequentialGroup()
							.addGap(23)
							.addComponent(panel_19, GroupLayout.PREFERRED_SIZE, 449, GroupLayout.PREFERRED_SIZE)
							.addGap(140)
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_9.createSequentialGroup()
							.addGap(127)
							.addComponent(vsView_1)
							.addGap(94)
							.addComponent(vsBack_1)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_9.setVerticalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_9.createSequentialGroup()
							.addGap(23)
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_9.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_19, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE)))
					.addGap(30)
					.addGroup(gl_panel_9.createParallelGroup(Alignment.BASELINE)
						.addComponent(vsView_1)
						.addComponent(vsBack_1))
					.addContainerGap(105, Short.MAX_VALUE))
		);
		vs4.add(vs4_1);
		vs4.add(vsView);
		vs4.add(vsBack);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 53, 492, 203);
		vs4.add(scrollPane_2);
		viewscheduletable = new JTable();
		scrollPane_2.setViewportView(viewscheduletable);
		viewscheduletable.setFont(new Font("Tahoma", Font.PLAIN, 14));
		viewscheduletable.getTableHeader();
		
		viewscheduletable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"EventId", "Location", "Date", "Start Time", "End Time", "Quantity"
			}
		));
		
		JLabel confirm6 = new JLabel("");
		confirm6.setFont(new Font("Tahoma", Font.ITALIC, 14));
		confirm6.setBounds(144, 333, 253, 16);
		vs4.add(confirm6);
		
		JLabel vs_Label_2_1 = new JLabel("Equipment ID:");
		vs_Label_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_13.setColumns(10);
		
		table = new JTable();
		GroupLayout gl_panel_19 = new GroupLayout(panel_19);
		gl_panel_19.setHorizontalGroup(
			gl_panel_19.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_19.createSequentialGroup()
					.addGroup(gl_panel_19.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_19.createSequentialGroup()
							.addGap(127)
							.addComponent(vs_Label_2_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_19.createSequentialGroup()
							.addGap(202)
							.addComponent(table, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(102, Short.MAX_VALUE))
		);
		gl_panel_19.setVerticalGroup(
			gl_panel_19.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_19.createSequentialGroup()
					.addGroup(gl_panel_19.createParallelGroup(Alignment.BASELINE)
						.addComponent(vs_Label_2_1)
						.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(94)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(108, Short.MAX_VALUE))
		);
		panel_19.setLayout(gl_panel_19);
		panel_9.setLayout(gl_panel_9);
		
		JPanel schedule_panel_1 = new JPanel();
		panel.add(schedule_panel_1, "name_263458545026600");
		schedule_panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_10 = new JPanel();
		schedule_panel_1.add(panel_10, BorderLayout.NORTH);
		
		JLabel s_Label_1_1 = new JLabel("Schedule Equipment ");
		s_Label_1_1.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		panel_10.add(s_Label_1_1);
		
		JPanel panel_11 = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) panel_11.getLayout();
		flowLayout_4.setHgap(50);
		schedule_panel_1.add(panel_11, BorderLayout.WEST);
		
		JPanel panel_12 = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) panel_12.getLayout();
		flowLayout_5.setHgap(50);
		schedule_panel_1.add(panel_12, BorderLayout.EAST);
		
		JPanel panel_13 = new JPanel();
		schedule_panel_1.add(panel_13, BorderLayout.CENTER);
		
		JPanel panel_18 = new JPanel();
		panel_18.setLayout(new BoxLayout(panel_18, BoxLayout.Y_AXIS));
		
		JLabel s_Label_id_2 = new JLabel("Equipment ID: ");
		s_Label_id_2.setHorizontalAlignment(SwingConstants.RIGHT);
		s_Label_id_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_18.add(s_Label_id_2);
		
		textField_id_3 = new JTextField();
		textField_id_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_id_3.setColumns(10);
		panel_18.add(textField_id_3);
		
		JLabel s_Label_2_1 = new JLabel("EventID: ");
		s_Label_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		s_Label_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_18.add(s_Label_2_1);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_6.setColumns(10);
		panel_18.add(textField_6);
		
		JLabel s_Label_3_1 = new JLabel("Location:");
		s_Label_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		s_Label_3_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_18.add(s_Label_3_1);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_7.setColumns(10);
		panel_18.add(textField_7);
		
		JLabel s_Label_4_1 = new JLabel("Date [yyyy-mm-dd]: ");
		s_Label_4_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		s_Label_4_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_18.add(s_Label_4_1);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_9.setColumns(10);
		panel_18.add(textField_9);
		
		JLabel s_Label_5_1 = new JLabel("Start Time [24 hr] [hh:mm]:");
		s_Label_5_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		s_Label_5_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_18.add(s_Label_5_1);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_10.setColumns(10);
		panel_18.add(textField_10);
		
		JLabel s_Label_6_1 = new JLabel("End Time [24 hr] [hh:mm]:");
		s_Label_6_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		s_Label_6_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_18.add(s_Label_6_1);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_11.setColumns(10);
		panel_18.add(textField_11);
		
		JLabel s_Label_7_1 = new JLabel("Quantity:");
		s_Label_7_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		s_Label_7_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_18.add(s_Label_7_1);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_12.setColumns(10);
		panel_18.add(textField_12);
		
		JButton sSchedule_1 = new JButton("Schedule");
		sSchedule_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton sBack_1 = new JButton("Back");
		sBack_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		sBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GroupLayout gl_panel_13 = new GroupLayout(panel_13);
		gl_panel_13.setHorizontalGroup(
			gl_panel_13.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_13.createSequentialGroup()
					.addGap(126)
					.addGroup(gl_panel_13.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_13.createSequentialGroup()
							.addComponent(sSchedule_1)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(sBack_1))
						.addComponent(panel_18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(126, Short.MAX_VALUE))
		);
		gl_panel_13.setVerticalGroup(
			gl_panel_13.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_13.createSequentialGroup()
					.addGap(5)
					.addComponent(panel_18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(41)
					.addGroup(gl_panel_13.createParallelGroup(Alignment.BASELINE)
						.addComponent(sSchedule_1)
						.addComponent(sBack_1))
					.addContainerGap(137, Short.MAX_VALUE))
		);
		panel_13.setLayout(gl_panel_13);
		
		JPanel search_panel_1 = new JPanel();
		panel.add(search_panel_1, "name_263510153674900");
		search_panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_14 = new JPanel();
		search_panel_1.add(panel_14, BorderLayout.NORTH);
		
		JLabel lblNewLabel_15_1 = new JLabel("View Equipment");
		lblNewLabel_15_1.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		panel_14.add(lblNewLabel_15_1);
		
		JPanel panel_15 = new JPanel();
		FlowLayout flowLayout_8 = (FlowLayout) panel_15.getLayout();
		flowLayout_8.setHgap(50);
		search_panel_1.add(panel_15, BorderLayout.WEST);
		
		JPanel panel_16 = new JPanel();
		FlowLayout flowLayout_9 = (FlowLayout) panel_16.getLayout();
		flowLayout_9.setHgap(50);
		search_panel_1.add(panel_16, BorderLayout.EAST);
		
		JPanel panel_17 = new JPanel();
		search_panel_1.add(panel_17, BorderLayout.CENTER);
		
		JPanel panel_19_1 = new JPanel();
		
		JLabel vs_Label_2_1_1 = new JLabel("Equipment ID:");
		vs_Label_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_14.setColumns(10);
		
		JTextArea srtextArea_1 = new JTextArea();
		srtextArea_1.setRows(10);
		srtextArea_1.setEditable(false);
		srtextArea_1.setColumns(50);
		GroupLayout gl_panel_19_1 = new GroupLayout(panel_19_1);
		gl_panel_19_1.setHorizontalGroup(
			gl_panel_19_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 449, Short.MAX_VALUE)
				.addGroup(gl_panel_19_1.createSequentialGroup()
					.addGroup(gl_panel_19_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_19_1.createSequentialGroup()
							.addGap(127)
							.addComponent(vs_Label_2_1_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_19_1.createSequentialGroup()
							.addGap(26)
							.addComponent(srtextArea_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		gl_panel_19_1.setVerticalGroup(
			gl_panel_19_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 226, Short.MAX_VALUE)
				.addGroup(gl_panel_19_1.createSequentialGroup()
					.addGroup(gl_panel_19_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(vs_Label_2_1_1)
						.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(srtextArea_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(13, Short.MAX_VALUE))
		);
		panel_19_1.setLayout(gl_panel_19_1);
		
		JButton srSearch_1 = new JButton("Search");
		srSearch_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton srBack_1 = new JButton("Back");
		srBack_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		srBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GroupLayout gl_panel_17 = new GroupLayout(panel_17);
		gl_panel_17.setHorizontalGroup(
			gl_panel_17.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_17.createSequentialGroup()
					.addGroup(gl_panel_17.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_17.createSequentialGroup()
							.addGap(23)
							.addComponent(panel_19_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_17.createSequentialGroup()
							.addGap(156)
							.addComponent(srSearch_1)
							.addGap(69)
							.addComponent(srBack_1)))
					.addContainerGap(24, Short.MAX_VALUE))
		);
		gl_panel_17.setVerticalGroup(
			gl_panel_17.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_17.createSequentialGroup()
					.addGap(5)
					.addComponent(panel_19_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addGroup(gl_panel_17.createParallelGroup(Alignment.BASELINE)
						.addComponent(srBack_1)
						.addComponent(srSearch_1))
					.addGap(110))
		);
		panel_17.setLayout(gl_panel_17);
		
		/**
		 * Action listener to allow user authentication for login
		 */
		
		login_button.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				/**
				 * test for password: 12345    and user name: user
				 */

				String p ="";

				for (int i = 0; i < password_Field.getPassword().length; i++) {
					p += password_Field.getPassword()[i];
				}
				
				if (Username_Field.getText().compareTo("user") == 0) {
					if (p.compareTo("12345")==0) {
						options_panel1.show();
						login_panel.hide();	
					}
				}
				else if (Username_Field.getText().compareTo("emp") == 0) {
					if (p.compareTo("0000")==0) {
						options_panel2.show();
						login_panel.hide();	
					}
				}
			}
			
			
		});
					
		/**
		 * Action listener for the owner view
		 */
		addEqu_button.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.hide();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.show();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				schedule_panel_1.hide();
			}
		});
		
		modEqu_button.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.hide();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.show();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				schedule_panel_1.hide();
			}
		});
		
		delEqu_button.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.hide();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.show();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				schedule_panel_1.hide();
			}
		});
		
		viewEqu_button.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.hide();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				viewEqu_panel.show();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				schedule_panel_1.hide();
			}
		});
		
		schedule_button.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.hide();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.show();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				schedule_panel_1.hide();
			}
		});
		
		modSch_button.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.hide();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.show();
				search_panel.hide();
				view_schedule_panel.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				schedule_panel_1.hide();
			}
		});
		
		search_button.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.hide();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.show();
				view_schedule_panel.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				schedule_panel_1.hide();
			}
		});
		
		viewSch_button.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.hide();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.show();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				schedule_panel_1.hide();
			}
		});
		
		schedule_button_1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.hide();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				search_panel.hide();
				view_schedule_panel.show();
				view_schedule_panel_1.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
			}
		});
		
		search_button_1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.hide();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				schedule_panel_1.hide();
				view_schedule_panel_1.hide();
				search_panel_1.show();
			}
		});
		
		viewSch_button_1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.hide();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.show();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				schedule_panel_1.hide();
			}
		});		
		genrep.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.hide();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				schedule_panel_1.hide();
				gen_report_panel.show();
				
			}
		});
		
		/**
		 * Action listeners for the back buttons on each option panel
		 */		
		aBack.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.show();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				schedule_panel_1.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				atextField_1.setText("");
				atextField_2.setText("");
				atextArea.setText("");
				confirm1.setText("");
			}
		});
		
		mEBack.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.show();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				schedule_panel_1.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				mEtextField_1.setText("");
				mEtextField_2.setText("");
				confirm2.setText("");
			}
		});
		
		dBack.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.show();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				schedule_panel_1.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				dtextField.setText("");
				dtextArea.setText("");
		
			}
		});
		
		vBack.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.show();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				viewEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				schedule_panel_1.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				vtextArea.setText("");
			}
		});
		
		sBack.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.show();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				schedule_panel_1.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				textField_id.setText("");
				stextField_1.setText("");
				stextField_2.setText("");
				stextField_4_1.setText("");
				stextField_5_1.setText("");
				stextField_6_1.setText("");
				stextField_7_1.setText("");
				confirm3.setText("");
			}
		});
		
		mSback.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.show();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				schedule_panel_1.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				textField_id_2.setText("");
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				confirm4.setText("");
			}
		});
		
		srBack.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.show();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				schedule_panel_1.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				textField_8.setText("");
				textArea_2.setText("");
				confirm5.setText("");
			}
		});
		
		vsBack.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel scheduletablemodel =(DefaultTableModel)viewscheduletable.getModel();
				scheduletablemodel.setRowCount(0);
					options_panel1.show();
					options_panel2.hide();
					login_panel.hide();	
					addEqu_panel.hide();
					modEqu_panel.hide();
					delEqu_panel.hide();
					schedule_panel.hide();
					modify_schedule_panel.hide();
					search_panel.hide();
					view_schedule_panel.hide();
					schedule_panel_1.hide();
					view_schedule_panel_1.hide();
					search_panel_1.hide();
					vstextField.setText("");
					confirm6.setText("");
				
			}
		});
				
		vsBack_1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.hide();
				options_panel2.show();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				schedule_panel_1.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				textField_13.setText("");
			}
		});
		
		srBack_1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.hide();
				options_panel2.show();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				schedule_panel_1.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				textField_14.setText("");
				srtextArea_1.setText("");
			}
		});
		
		sBack_1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.hide();
				options_panel2.show();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				schedule_panel_1.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				textField_id_3.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
			}
		});
		
		grBack.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.show();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();;
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				schedule_panel_1.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				gen_report_panel.hide();
				gendate.setText("");
				textField_gn.setText("");
				confirm.setText("");

			}
		});
		
	
		
		/**
		 * Action listeners for the save/schedule buttons on each option panel
		 */	
		//add equipment 
		aSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nme = atextField_1.getText();
				int quantity =  Integer.parseInt(atextField_2.getText());
				String genericid= nme.substring(0,3)+"#"+app.genStr();
				atextArea.setText(genericid);
				/**app.delay();*/
				if (app.addNewEquipment(genericid, nme, quantity) == "yes"){
					confirm1.setText("Resource sucessfully added.");
				}
				else {
					confirm1.setText("Resource not added.");
				}
				
			}
		});
		
		//modify equipment quantity
		mESave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = mEtextField_1.getText();
				int new_quantity = Integer.parseInt(mEtextField_2.getText());
				if (app.equipmentModifier(id, new_quantity, new_quantity) == "yes"){
					confirm2.setText("Resource sucessfully modified.");
				}
				else {
					confirm2.setText("Resource not modified.");
				}
			}
		});
		
		//delete equipment
		dDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = dtextField.getText();
				if (app.equipmentRemover(id) == "yes"){
					dtextArea.setText("Resource sucessfully deleted.");
				}
				else {
					dtextArea.setText("Resource not deleted.");
				}
			}
		});
		
		//schedule equipment
		sSchedule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = textField_id.getText();
				String eventid = stextField_1.getText();
				String location = stextField_2.getText();
				String date = stextField_4_1.getText();
				String s_time = stextField_5_1.getText();
				String e_time = stextField_6_1.getText();
				int quantity = Integer.parseInt(stextField_7_1.getText());
				if (app.equipmentScheduler(eventid, location, date, s_time, e_time, id, quantity) == "yes"){
					confirm3.setText("Resource sucessfully scheduled.");
				}
				else {
					confirm3.setText("Resource not scheduled.");
				}
			}
		});
		
		//modify schedule
		mSsave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = textField_id_2.getText();
				String eventid = textField.getText();
				String location = textField_1.getText();
				String date = textField_2.getText();
				String s_time = textField_3.getText();
				String e_time = textField_4.getText();
				int quantity = Integer.parseInt(textField_5.getText());
				if (app.scheduleModifier(eventid, location, date, s_time, e_time, id, quantity) == "yes"){
					confirm4.setText("Schedule sucessfully modified.");
				}
				else {
					confirm4.setText("Schedule not modified.");
				}
			}
		});
		
		//search
		srSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = textField_8.getText();
				if (app.equipmentInfoViewer(id) != ""){
					confirm.setText("Information sucessfully retrieved.");
					confirm5.setText("Information sucessfully retrieved.");
				}
				else {
					confirm.setText("Information not found.");
					confirm5.setText("Information not found.");
				}
				textArea_2.setText(app.equipmentInfoViewer(id));
			}
		});
		
		grSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String date = textField_gn.getText();
				if (app.reportGenerator(date) != ""){
					confirm.setText("Information sucessfully retrieved.");
				}
				else {
					confirm.setText("Information not found.");
				}
				textArea_gn.setText("DATE: "+date+"\n\n");
				textArea_gn.append(app.reportGenerator(date));
			}
		});
		
		viewEqu_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vtextArea.setText(app.viewEquipment());
			}
		});
		
		//view schedule
		vsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = vstextField.getText();
				ArrayList<String[]> lis=app.schedule_Viewer(id);
				if (lis != null) {
					DefaultTableModel scheduletablemodel =(DefaultTableModel)viewscheduletable.getModel();
					scheduletablemodel.setRowCount(0);
					for(String[]schedule:lis){
						scheduletablemodel.addRow(new Object[]{schedule[0],schedule[1],
								schedule[2],schedule[3],schedule[4],schedule[5]});
					}
					confirm6.setText("Information sucessfully retrieved.");
					
				} else {
					confirm6.setText("Information not found.");
				}
				
				
			}
		});	
		
		//schedule equipment - employee view
		sSchedule_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = textField_id_3.getText();
				String eventid = textField_6.getText();
				String location = textField_7.getText();
				String date = textField_9.getText();
				String s_time = textField_10.getText();
				String e_time = textField_11.getText();
				int quantity = Integer.parseInt(textField_12.getText());
				app.equipmentScheduler(eventid, location, date, s_time, e_time, id, quantity);
			}
		});
		
		//view schedule - employee view
		vsView_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String id = textField_13.getText();
				//vstextArea_1.setText(app.schedule_Viewer(id));
			}
		});		
		
		//search - employee view
		srSearch_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = textField_14.getText();
				srtextArea_1.setText(app.equipmentInfoViewer(id));
			}
		});
		
		
	}
}
	
