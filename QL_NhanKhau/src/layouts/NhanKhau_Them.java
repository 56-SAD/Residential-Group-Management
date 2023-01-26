package layouts;


import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JSeparator;

import index.InputField;
import index.Label;
import index.Button;
import index.ScrollPane;
import index.Table;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ScrollPaneConstants;

public class NhanKhau_Them extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	NhanKhau_Them_ThongTin panel = new NhanKhau_Them_ThongTin();;
	private Table table;
	JScrollPane scrollPane_1;
	InputField txtSoHoKhau;
	InputField txtQuanHe;

	/**
	 * Create the dialog.
	 */
	public NhanKhau_Them() {
		setTitle("Thêm Nhân Khẩu");
		getContentPane().setLayout(null);
		setBounds(100, 100, 700, 700);
		setLocationRelativeTo(null);
	
	/*
	 * Label
	 * */
		Label lblNewLabel = new Label("Thêm Nhân Khẩu");
		lblNewLabel.setIcon(new ImageIcon("otherResource/NhanKhau16.png"));
		lblNewLabel.setBounds(10, 10, 167, 19);
		getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 40, 664, 7);
		getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Thông tin chung");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 169, 140, 25);
		getContentPane().add(lblNewLabel_1);
		
		
	/*
	 * Table
	 * */
		table = new Table();
		Object[] columns =  {"ID", "Chủ Hộ", "Số Hộ khẩu", "Địa chỉ"};
		table.model.setColumnIdentifiers(columns);
		
		ScrollPane scrollPane = new ScrollPane(table);
		scrollPane.setBounds(10, 107, 664, 51);
		getContentPane().add(scrollPane);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(10, 205, 664, 284);
		getContentPane().add(scrollPane_1);
		
	/*
	 * Field Text
	 * */
		txtSoHoKhau = new InputField("So ho khau sap nhap");
		txtSoHoKhau.setLabel("Số hộ khẩu sáp nhập");
		txtSoHoKhau.setBounds(10, 51, 537, 45);
		getContentPane().add(txtSoHoKhau);
		
		txtQuanHe = new InputField("So ho khau sap nhap");
		txtQuanHe.setLabel("Quan hệ với chủ hộ");
		txtQuanHe.setBounds(10, 508, 470, 45);
		getContentPane().add(txtQuanHe);
		
	/*
	 * Button
	 * */	
		Button btnXcNhn = new Button("Xác nhận");
		btnXcNhn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xacNhan();
			}
		});
		btnXcNhn.setBounds(570, 58, 104, 29);
		getContentPane().add(btnXcNhn);

		Button btnXcNhnThm = new Button("Xác nhận thêm");
		btnXcNhnThm.setBounds(65, 570, 136, 68);
		getContentPane().add(btnXcNhnThm);
		btnXcNhnThm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		Button btnReset = new Button("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnReset.setBounds(281, 570, 136, 68);
		getContentPane().add(btnReset);
		
		Button btnThot = new Button("Thoát");
		btnThot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnThot.setBounds(486, 570, 136, 68);
		getContentPane().add(btnThot);
		
		
	}
	
	public void xacNhan() {

		scrollPane_1.setViewportView(panel);
		
		Object[] row = new Object[4];
		/**/
		row[0] = "1";
		row[1] = "Monkey D. Luffy";
		row[2] = "1";
		row[3] = "Hải tặc mũ rơm";
		table.model.addRow(row);
	}
	
	public void reset() {
		txtQuanHe.setText("");
		txtSoHoKhau.setText("");
		scrollPane_1.setViewportView(null);

		table.model.removeRow(0);
	}
	
}
