package layouts;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JSeparator;

import index.Button;
import index.InputField;
import index.Label;
import index.ScrollPane;
import index.Table;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HoKhau_Them extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	InputField txtCCCD;
	InputField txtSoHoKhau;
	Table table;
	InputField txtDiaChi;
	
	/**
	 * Create the dialog.
	 */
	public HoKhau_Them() {
		setTitle("Thêm Hộ Khẩu");
		getContentPane().setLayout(null);
		setBounds(100, 100, 500, 500);
		setLocationRelativeTo(null);
	
		/*
		 * Labels
		 */
		
			Label lblThemHK = new Label("Thêm Hộ Khẩu");
			lblThemHK.setIcon(new ImageIcon("otherResource/HoKhau16.png"));
			lblThemHK.setBounds(10, 10, 167, 19);
			getContentPane().add(lblThemHK);
			
			JSeparator separator = new JSeparator();
			separator.setBounds(10, 35, 850, 2);
			getContentPane().add(separator);
			JSeparator separator_1 = new JSeparator();
			separator_1.setBounds(10, 356, 850, 2);
			getContentPane().add(separator_1);
			
			JLabel lblThngTinCh = new JLabel("Thông tin chủ hộ");
			lblThngTinCh.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblThngTinCh.setBounds(10, 40, 140, 25);
			getContentPane().add(lblThngTinCh);
			
			JSeparator separator_1_1 = new JSeparator();
			separator_1_1.setBounds(10, 193, 850, 2);
			getContentPane().add(separator_1_1);
			
			JLabel lblThngTinCh_1 = new JLabel("Thông tin Hộ khẩu");
			lblThngTinCh_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblThngTinCh_1.setBounds(10, 206, 140, 25);
			getContentPane().add(lblThngTinCh_1);
			
		/*
		 * Text Field
		 * */
			txtCCCD = new InputField("CCCD/CMND");
			txtCCCD.setBounds(10, 63, 328, 51);
			getContentPane().add(txtCCCD);
			txtCCCD.setColumns(10);
			
			txtSoHoKhau = new InputField("Số Hộ khẩu");
			txtSoHoKhau.setBounds(10, 231, 464, 51);
			getContentPane().add(txtSoHoKhau);
			txtSoHoKhau.setColumns(10);
			
			txtDiaChi = new InputField("Địa chỉ");
			txtDiaChi.setBounds(10, 293, 464, 57);
			getContentPane().add(txtDiaChi);
			txtDiaChi.setColumns(10);
			
		/*
		 * Table
		 * */
			table = new Table();
			Object[] columns =  {"ID", "Họ tên", "Số Hộ khẩu", "Ghi chu"};
			table.model.setColumnIdentifiers(columns);
				
			ScrollPane scrollPane = new ScrollPane(table);
			scrollPane.setBounds(10, 125, 464, 57);
			getContentPane().add(scrollPane);
			
		/*
		 ** Buttons
		 */
			Button btnXcNhn = new Button("Xác nhận");
			btnXcNhn.setBounds(31, 369, 118, 68);
			getContentPane().add(btnXcNhn);
			btnXcNhn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					xacNhan();
				}
			});
			
			Button btnReset = new Button("Reset");
			btnReset.setBounds(179, 369, 118, 68);
			getContentPane().add(btnReset);
			btnReset.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					reset();
				}
			});
			
			Button btnThoat = new Button("Thoát");
			btnThoat.setBounds(332, 369, 118, 68);
			getContentPane().add(btnThoat);
			btnThoat.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			
			Button btnXcNhn_1 = new Button("Xác nhận");
			btnXcNhn_1.setBounds(370, 78, 104, 29);
			getContentPane().add(btnXcNhn_1);
			btnXcNhn_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					xacNhan_1();
				}
			});
	}
	
	/*
	 * Events
	 * */
	public void xacNhan() {
		
	}
	
	public void reset() {
		txtCCCD.setText("");
		txtDiaChi.setText("");
		txtSoHoKhau.setText("");
		if(table.getRowCount() > 0) {
			table.model.removeRow(0);
		}
	}
	
	public void xacNhan_1() {
		Object[] row = new Object[9];
		/**/
		row[0] = "1";
		row[1] = "Monkey D. Luffy";
		row[2] = "3";
		row[3] = "Khong";
		if(table.model.getRowCount() == 0) {
			table.model.addRow(row);
		}
		else {
			table.model.removeRow(0);
			table.model.addRow(row);
		}
	}
}
