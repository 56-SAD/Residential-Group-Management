package layouts;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.ScrollPaneConstants;

import index.Button;
import index.InputField;
import index.Label;
import index.ScrollPane;
import index.Table;

public class NhanKhau_ChinhSua extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	NhanKhau_Them_ThongTin panel = new NhanKhau_Them_ThongTin();;
	private Table table;
	JScrollPane scrollPane_1;
	InputField txtID;
	InputField txtQuanHe;
	InputField txtGhiChu;

	/**
	 * Create the dialog.
	 */
	public NhanKhau_ChinhSua() {
		setTitle("Chinh sua Nhân Khẩu");
		getContentPane().setLayout(null);
		setBounds(100, 100, 700, 725);
		setLocationRelativeTo(null);
	
	/*
	 * Label
	 * */
		Label lblNewLabel = new Label("Chinh sua Nhân Khẩu");
		lblNewLabel.setText("Chỉnh sửa Nhân Khẩu");
		lblNewLabel.setIcon(new ImageIcon("otherResource/Edit16.png"));
		lblNewLabel.setBounds(10, 10, 206, 19);
		getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 40, 664, 7);
		getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Thông tin chung");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 163, 140, 25);
		getContentPane().add(lblNewLabel_1);
		
		
	/*
	 * Table
	 * */
		table = new Table();
		Object[] columns =  {"ID", "Chủ Hộ", "Số Hộ khẩu", "Địa chỉ"};
		table.model.setColumnIdentifiers(columns);
		
		ScrollPane scrollPane = new ScrollPane(table);
		scrollPane.setBounds(10, 107, 664, 45);
		getContentPane().add(scrollPane);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(10, 199, 664, 290);
		getContentPane().add(scrollPane_1);
		
	/*
	 * Field Text
	 * */
		txtID = new InputField("So ho khau sap nhap");
		txtID.setLabel("ID Nhan Khau");
		txtID.setBounds(10, 51, 537, 45);
		getContentPane().add(txtID);
		
		txtQuanHe = new InputField("So ho khau sap nhap");
		txtQuanHe.setLabel("Quan hệ với chủ hộ");
		txtQuanHe.setBounds(10, 508, 664, 45);
		getContentPane().add(txtQuanHe);
		
		txtGhiChu = new InputField("So ho khau sap nhap");
		txtGhiChu.setLabel("Ghi chu");
		txtGhiChu.setBounds(10, 565, 664, 45);
		getContentPane().add(txtGhiChu);
		
	/*
	 * Button
	 * */	
		Button btnXcNhn = new Button("Xác nhận");
		btnXcNhn.setText("Nhập");
		btnXcNhn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xacNhan();
			}
		});
		btnXcNhn.setBounds(570, 58, 104, 29);
		getContentPane().add(btnXcNhn);

		Button btnXcNhnChinhSua = new Button("Xác nhận thêm");
		btnXcNhnChinhSua.setText("Xác nhận");
		btnXcNhnChinhSua.setBounds(64, 631, 136, 45);
		getContentPane().add(btnXcNhnChinhSua);
		btnXcNhnChinhSua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		Button btnReset = new Button("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnReset.setBounds(280, 631, 136, 45);
		getContentPane().add(btnReset);
		
		Button btnThot = new Button("Thoát");
		btnThot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnThot.setBounds(485, 631, 136, 45);
		getContentPane().add(btnThot);
		
	}
	
	public void xacNhan() {
		
		Object[] row = new Object[4];
		/**/
		row[0] = "1";
		row[1] = "Monkey D. Luffy";
		row[2] = "1";
		row[3] = "Hải tặc mũ rơm";
		table.model.addRow(row);
		
		NhanKhau_ChinhSua_Panel panel = new NhanKhau_ChinhSua_Panel();
		scrollPane_1.setViewportView(panel);
		
		txtQuanHe.setText("Chu ho");
		txtGhiChu.setText("Khong");
	}
	
	public void reset() {
		txtQuanHe.setText("");
		txtID.setText("");
		scrollPane_1.setViewportView(null);

		table.model.removeRow(0);
	}
}
