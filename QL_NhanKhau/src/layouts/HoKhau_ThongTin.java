package layouts;

import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JDialog;

import index.Label;
import index.ScrollPane;
import index.Table;

import javax.swing.JSeparator;

import index.Button;
import index.InputField;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HoKhau_ThongTin extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the dialog.
	 */
	public HoKhau_ThongTin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("otherResource/HoKhau16.png"));
		setTitle("Thông Tin Hộ Khẩu");
		getContentPane().setLayout(null);
		setBounds(100, 100, 600, 700);
		setLocationRelativeTo(null);
		
		/*
		 * Table
		 * */
			Table table = new Table();
			Object[] columns =  {"ID", "Ho ten", "Ngay sinh", "Gioi tinh", "CCCD/CMND", "Quan he chu ho"};
			table.model.setColumnIdentifiers(columns);
			
			ScrollPane scrollPane = new ScrollPane(table);
			scrollPane.setBounds(10, 234, 564, 371);
			getContentPane().add(scrollPane);
			
			Object[] row = new Object[9];
			/**/
			row[0] = "1";
			row[1] = "Monkey D. Luffy";
			row[2] = "05/05/2001";
			row[3] = "Nam";
			row[4] = "1";
			row[5] = "Chu ho";
			table.model.addRow(row);
			Object[] row1 = new Object[9];
			/**/
			row1[0] = "2";
			row1[1] = "Roronoa Zoro";
			row1[2] = "10/05/2001";
			row1[3] = "Nam";
			row1[4] = "2";
			row1[5] = "Thanh vien";
			table.model.addRow(row1);
		
	/*
	 * Label
	 * */
		Label lblThemHK = new Label("Thông tin Hộ Khẩu");
		lblThemHK.setIcon(new ImageIcon("otherResource/HoKhau16.png"));
		lblThemHK.setBounds(10, 10, 258, 19);
		getContentPane().add(lblThemHK);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 40, 850, 2);
		getContentPane().add(separator);
		
		JLabel lblThongTinThanh = new JLabel("Thong tin thanh vien");
		lblThongTinThanh.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblThongTinThanh.setBounds(10, 204, 197, 19);
		getContentPane().add(lblThongTinThanh);
	
	/*
	 * Information
	 * */
		InputField txtDiaChi = new InputField("Địa chỉ");
		txtDiaChi.setEditable(false);
		txtDiaChi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtDiaChi.setText("Hai tac mu rom");
		txtDiaChi.setColumns(10);
		txtDiaChi.setBounds(10, 131, 564, 57);
		getContentPane().add(txtDiaChi);
		
		InputField txtSoHoKhau = new InputField("Số Hộ khẩu");
		txtSoHoKhau.setEditable(false);
		txtSoHoKhau.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtSoHoKhau.setText("3");
		txtSoHoKhau.setColumns(10);
		txtSoHoKhau.setBounds(10, 69, 564, 51);
		getContentPane().add(txtSoHoKhau);
		
	/*
	 * Button
	 * */

		Button btnNewButton = new Button("Close");
		btnNewButton.setBounds(383, 616, 89, 23);
		getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		Button txtChiTiet = new Button("Close");
		txtChiTiet.setText("Chi tiet");
		txtChiTiet.setBounds(141, 616, 89, 23);
		getContentPane().add(txtChiTiet);
		txtChiTiet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xemThongTin();
			}
		});
		
		
	}
	
	public void xemThongTin() {
		NhanKhau_ThongTin thongTin = new NhanKhau_ThongTin();
		thongTin.setVisible(true);
	}
}
