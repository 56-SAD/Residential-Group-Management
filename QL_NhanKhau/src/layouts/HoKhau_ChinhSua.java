package layouts;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JSeparator;

import index.Button;
import index.InputField;
import index.Label;
import index.ScrollPane;
import index.Table;

public class HoKhau_ChinhSua extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Table table;
	Table table1;
	InputField txtSoHoKhau;
	InputField txtChuHo;
	InputField txtDiaChi;
	/**
	 * Create the dialog.
	 */
	public HoKhau_ChinhSua() {
		setTitle("Chỉnh sửa Hộ Khẩu");
		getContentPane().setLayout(null);
		setBounds(100, 100, 500, 500);
		setLocationRelativeTo(null);
	
		/*
		 * Label
		 */
		
			Label lblNewLabel = new Label("Chỉnh Sửa Hộ Khẩu");
			lblNewLabel.setIcon(new ImageIcon("otherResource/Edit16.png"));
			lblNewLabel.setBounds(10, 10, 220, 19);
			getContentPane().add(lblNewLabel);
			
			JSeparator separator = new JSeparator();
			separator.setBounds(10, 35, 850, 2);
			getContentPane().add(separator);
			
			JLabel lblThngTinThay = new JLabel("Thông tin thay đổi");
			lblThngTinThay.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblThngTinThay.setBounds(10, 185, 167, 19);
			getContentPane().add(lblThngTinThay);
			
			JSeparator separator_1 = new JSeparator();
			separator_1.setBounds(10, 172, 464, 2);
			getContentPane().add(separator_1);
			
		/*
		 * Table
		 * */
			table = new Table();
			Object[] columns =  {"ID", "Chủ Hộ", "Số Hộ khẩu", "Địa chỉ"};
			table.model.setColumnIdentifiers(columns);
				
			ScrollPane scrollPane = new ScrollPane(table);
			scrollPane.setBounds(10, 101, 464, 60);
			getContentPane().add(scrollPane);
			
			table1 = new Table();
			Object[] columns1 =  {"ID", "Ho ten", "So ho khau", "Ghi chu"};
			table1.model.setColumnIdentifiers(columns1);
			
			ScrollPane scrollPane_1 = new ScrollPane(table1);
			scrollPane_1.setBounds(10, 266, 464, 60);
			getContentPane().add(scrollPane_1);
			
		/*
		 * Text Field
		 */
			txtSoHoKhau = new InputField("Số Hộ khẩu cần chỉnh sửa");
			txtSoHoKhau.setBounds(10, 50, 333, 45);
			getContentPane().add(txtSoHoKhau);
			txtSoHoKhau.setColumns(10);
			
			txtChuHo = new InputField("Chủ Hộ");
			txtChuHo.setLabel("CCCD Chủ hộ");
			txtChuHo.setColumns(10);
			txtChuHo.setBounds(10, 210, 333, 45);
			getContentPane().add(txtChuHo);
			
			txtDiaChi = new InputField("Địa chỉ");
			txtDiaChi.setColumns(10);
			txtDiaChi.setBounds(10, 337, 464, 51);
			getContentPane().add(txtDiaChi);
			
		/*
		 * Buttons
		 * */	
			Button btnXcNhn = new Button("Xác nhận");
			btnXcNhn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					xacNhan();
				}
			});
			btnXcNhn.setBounds(353, 62, 104, 29);
			getContentPane().add(btnXcNhn);
			
			Button btnXcNhn_1 = new Button("Xác nhận");
			btnXcNhn_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					xacNhan1();
				}
			});
			btnXcNhn_1.setBounds(353, 222, 104, 29);
			getContentPane().add(btnXcNhn_1);
			
			Button btnXcNhn_2 = new Button("Xác nhận");
			btnXcNhn_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					xacNhan2();
				}
			});
			btnXcNhn_2.setBounds(38, 399, 118, 51);
			getContentPane().add(btnXcNhn_2);
			
			Button btnReset = new Button("Reset");
			btnReset.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					reset();
				}
			});
			btnReset.setBounds(186, 399, 118, 51);
			getContentPane().add(btnReset);
			
			Button btnThoat = new Button("Thoát");
			btnThoat.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnThoat.setBounds(339, 399, 118, 51);
			getContentPane().add(btnThoat);
			
			
	}
	/*
	 * Events
	 * */
	public void xacNhan() {
		Object[] row = new Object[4];
		/**/
		row[0] = "1";
		row[1] = "Monkey D. Luffy";
		row[2] = "1";
		row[3] = "Hải tặc mũ rơm";
		if(table.model.getRowCount() > 0) {
			table.model.removeRow(0);
		}
		table.model.addRow(row);
		txtChuHo.setText("1");
		txtDiaChi.setText("Hải tặc mũ rơm");
	}
	
	public void xacNhan1() {
		Object[] row = new Object[4];
		/**/
		row[0] = "1";
		row[1] = "Monkey D. Luffy";
		row[2] = "3";
		row[3] = "Khong";
		if(table1.model.getRowCount() > 0) {
			table1.model.removeRow(0);
		}
		table1.model.addRow(row);
	}
	
	public void xacNhan2() {
		
	}
	
	public void reset() {
		txtChuHo.setText("");
		txtDiaChi.setText("");
		txtSoHoKhau.setText("");
		if(table.model.getRowCount() > 0) {
			table.model.removeRow(0);
		}
		if(table1.model.getRowCount() > 0) {
			table1.model.removeRow(0);
		}
	}
}
