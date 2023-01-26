package layouts;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import index.Button;
import index.ScrollPane;
import index.Table;

public class NhanKhau_Panel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Table table;

	/**
	 * Create the panel.
	 */
	public NhanKhau_Panel() {
		setLayout(null);
		setBounds(100, 100, 700, 500);
		
	/*
	 * Label
	 * */
		JSeparator separator = new JSeparator();
		separator.setBounds(150, 45, 400, 10);
		add(separator);
		
		JLabel lblNewLabel = new JLabel("Qu\u1EA3n L\u00FD Nh\u00E2n Kh\u1EA9u");
		lblNewLabel.setForeground(Color.magenta);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 10, 700, 35);
		add(lblNewLabel);
		
	/*
	 * TABLE
	 */
		table = new Table();
		Object[] columns =  {"ID", "Ho ten", "So ho khau", "Ghi chu"};
		table.model.setColumnIdentifiers(columns);
		
		ScrollPane scrollPane = new ScrollPane(table);
		scrollPane.setBounds(150, 66, 518, 406);
		add(scrollPane);
		
		Object[] row = new Object[4];
		/**/
		row[0] = "1";
		row[1] = "Monkey D. Luffy";
		row[2] = "3";
		row[3] = "Khong";
		table.model.addRow(row);
		
		Object[] row1 = new Object[4];
		/**/
		row1[0] = "2";
		row1[1] = "Portgas D. Ace";
		row1[2] = "2";
		row1[3] = "Da qua doi";
		table.model.addRow(row1);
	/*
	 * BUTTON
	 * */
		
		Button btnUpdate = new Button("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update();
			}
		});
		btnUpdate.setBounds(0, 74, 140, 35);
		add(btnUpdate);
		
		Button btnThemNK = new Button("Th\\u00EAm h\\u1ED9 kh\\u1EA9u");
		btnThemNK.setText("Th\u00EAm Nh\u00E2n Kh\u1EA9u");
		btnThemNK.setBounds(0, 120, 140, 35);
		add(btnThemNK);
		btnThemNK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				themNhanKhau();
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
		
		Button btnXoaNK = new Button("Xo\u00E1 h\u1ED9 kh\u1EA9u");
		btnXoaNK.setText("Xo\u00E1 Nh\u00E2n Kh\u1EA9u");
		btnXoaNK.setBounds(0, 214, 140, 35);
		add(btnXoaNK);
		btnXoaNK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xoaNhanKhau();
			}
		});
		
		Button btnChiTiet = new Button("Th\u00F4ng tin chi ti\u1EBFt");
		btnChiTiet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chiTiet();
			}
		});
		btnChiTiet.setBounds(0, 259, 140, 35);
		add(btnChiTiet);
	}
	
	/*
	 * Event
	 * */
	
	public void update() {
		
	}
	
	public void themNhanKhau() {
		NhanKhau_Them themNhanKhauDialog = new NhanKhau_Them();
		themNhanKhauDialog.setVisible(true);
	}
	
	public void chinhSua() {
		NhanKhau_ChinhSua nhanKhau_ChinhSua = new NhanKhau_ChinhSua();
		nhanKhau_ChinhSua.setVisible(true);
	}
	
	public void xoaNhanKhau() {
		int i = table.getSelectedRow();
		if(i>=0) {
			int input = JOptionPane.showConfirmDialog(table, "Bạn có chắc muốn xoá Nhân khẩu đã chọn?");
			if(input == 0) {
				table.model.removeRow(i);
			}
		}
		else {
			JOptionPane.showMessageDialog(table, "Chọn Nhân khẩu muốn xoá!");
		}
	}
	
	public void chiTiet() {
		NhanKhau_ThongTin thongTin = new NhanKhau_ThongTin();
		thongTin.setVisible(true);
	}
}
