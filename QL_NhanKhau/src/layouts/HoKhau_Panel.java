package layouts;

import javax.swing.JPanel;
import javax.swing.JOptionPane;

import index.Button;
import index.Label;
import index.ScrollPane;
import index.Table;

import javax.swing.JSeparator;
import qL_NhanKhau.HoKhauManagement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HoKhau_Panel extends JPanel {
	HoKhauManagement hoKhauManagement = new HoKhauManagement();
	Table table;
	
	private static final long serialVersionUID = 2645128917383602723L;

	/**
	 * Create the panel.
	 */
	public HoKhau_Panel() {
		setLayout(null);
		setBounds(100, 100, 700, 500);
	
	/*
	 * TABLE
	 * */
		table = new Table();
		Object[] columns = {"ID","Chu ho","So ho khau","Dia chi"};
		table.model.setColumnIdentifiers(columns);
		
		ScrollPane scrollPane = new ScrollPane(table);
		scrollPane.setBounds(150, 66, 518, 406);
		add(scrollPane);
		
		Object[] row = new Object[4];
		/**/
		row[0] = "1";
		row[1] = "Monkey D. Luffy";
		row[2] = "1";
		row[3] = "Hai tac mu rom";
		table.model.addRow(row);
		Object[] row1 = new Object[4];
		row1[0] = "2";
		row1[1] = "Monkey D. Dragon";
		row1[2] = "2";
		row1[3] = "Quan Cach mang";
		table.model.addRow(row1);
		/**/
		
		/*
		 * BUTTON
		 * */
			Label lblNewLabel = new Label("Quản Lý Hộ Khẩu");
			lblNewLabel.setBounds(0, 10, 700, 35);
			add(lblNewLabel);
			
			JSeparator separator = new JSeparator();
			separator.setBounds(150, 45, 400, 10);
			add(separator);
			
			Button btnUpdate = new Button("Update");
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					update();
				}
			});
			btnUpdate.setBounds(0, 74, 140, 35);
			add(btnUpdate);
			
			Button btnThemHK = new Button("Th\u00EAm H\u1ED9 kh\u1EA9u");
			btnThemHK.setBounds(0, 120, 140, 35);
			add(btnThemHK);
			btnThemHK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					themHoKhau();
				}
			});
			
			Button btnChinhSua = new Button("Ch\u1EC9nh s\u1EEDa");
			btnChinhSua.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					chinhSua();
				}
			});
			btnChinhSua.setBounds(0, 166, 140, 35);
			add(btnChinhSua);
			
			Button btnXoaHK = new Button("Xo\u00E1 h\u1ED9 kh\u1EA9u");
			btnXoaHK.setBounds(0, 214, 140, 35);
			add(btnXoaHK);
			btnXoaHK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					XoaHK();
				}
			});
			
			Button btnXemThanhVien = new Button("Xem th\u00E0nh vi\u00EAn");
			btnXemThanhVien.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					xemThanhVien();
				}
			});
			btnXemThanhVien.setBounds(0, 259, 140, 35);
			add(btnXemThanhVien);
	}
	
	/*
	 * Events
	 * */
	public void update() {
		
	}
	public void themHoKhau() {
		HoKhau_Them themHoKhauDialog = new HoKhau_Them();
		themHoKhauDialog.setVisible(true);
	}
	public void chinhSua() {
		HoKhau_ChinhSua chinhSuaHoKhauDialog = new HoKhau_ChinhSua();
		chinhSuaHoKhauDialog.setVisible(true);
	}
	public void XoaHK() {
		int i = table.getSelectedRow();
		if(i>=0) {
			int input = JOptionPane.showConfirmDialog(table, "Bạn có chắc muốn xoá Hộ khẩu đã chọn?");
			if(input == 0) {
				table.model.removeRow(i);
			}
		}
		else {
			JOptionPane.showMessageDialog(table, "Chọn Hộ khẩu muốn xoá!");
		}
	}
	public void xemThanhVien() {
		HoKhau_ThongTin thongTinHoKhau = new HoKhau_ThongTin();
		thongTinHoKhau.setVisible(true);
	}
}
