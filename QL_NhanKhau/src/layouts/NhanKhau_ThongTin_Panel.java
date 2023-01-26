package layouts;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSeparator;
import index.InputField;
import index.ComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;

public class NhanKhau_ThongTin_Panel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public NhanKhau_ThongTin_Panel() {
		setAutoscrolls(true);
		
		/*
		 * Label
		 * */
		JSeparator separator = new JSeparator();
		JSeparator separator_1 = new JSeparator();
		
		JLabel ThuongTru = new JLabel("Thuong tru");
		ThuongTru.setFont(new Font("Tahoma", Font.BOLD, 14));
		JLabel CCCD = new JLabel("Căn cước công dân");
		CCCD.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		/*
		 * Input Field
		 * */
		InputField txtNoiCap = new InputField("Noi cap");
		txtNoiCap.setEditable(false);
		txtNoiCap.setText("Vuong quoc Goa");
		
		InputField txtCCCD = new InputField("CCCD/CMND");
		txtCCCD.setEditable(false);
		txtCCCD.setText("1");
		
		InputField txtNamCap = new InputField("Nam cap");
		txtNamCap.setEditable(false);
		txtNamCap.setText("2021");
		
		InputField txtNamDK = new InputField("Nam dang ky");
		txtNamDK.setEditable(false);
		txtNamDK.setText("2021");
		
		InputField txtThuongTru = new InputField("Dia chi thuong tru hien nay");
		txtThuongTru.setEditable(false);
		txtThuongTru.setText("EggHead");
		
		InputField txtThuongTru_Truoc = new InputField("Dia chi thuong tru truoc");
		txtThuongTru_Truoc.setEditable(false);
		txtThuongTru_Truoc.setText("Wano Quoc");
		
		InputField txtNoiLamViec = new InputField("Noi lam viec");
		txtNoiLamViec.setEditable(false);
		txtNoiLamViec.setText("Hai tac mu rom");
		
		InputField txtDanToc = new InputField("Dan toc");
		txtDanToc.setEditable(false);
		txtDanToc.setText("D.");
		
		InputField txtNgheNghiep = new InputField("Nghe nghiep");
		txtNgheNghiep.setEditable(false);
		txtNgheNghiep.setText("Hai tac");
		
		InputField txtQueQuan = new InputField("Que quan");
		txtQueQuan.setEditable(false);
		txtQueQuan.setText("Vuong quoc Goa");
		
		InputField txtNoiSinh = new InputField("Noi sinh");
		txtNoiSinh.setEditable(false);
		txtNoiSinh.setText("Vuong quoc Goa");
		
		InputField txtHoTen = new InputField("Ho va ten");
		txtHoTen.setEditable(false);
		txtHoTen.setText("Monkey D. Luffy");
		
		InputField txtBiDanh = new InputField("Bi Danh");
		txtBiDanh.setEditable(false);
		txtBiDanh.setText("Mu rom");
		
	/*
	 * ComboBox
	 * */
		ComboBox<String> txtNgayCap = new ComboBox<String>();
		txtNgayCap.setEnabled(false);
		txtNgayCap.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		txtNgayCap.setSelectedIndex(4);
		txtNgayCap.setMaximumRowCount(32);
		txtNgayCap.setLabelText("Ngay cap");
		
		ComboBox<String> txtThangCap = new ComboBox<String>();
		txtThangCap.setEnabled(false);
		txtThangCap.setModel(new DefaultComboBoxModel<String>(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		txtThangCap.setSelectedIndex(4);
		txtThangCap.setMaximumRowCount(30);
		txtThangCap.setLabelText("Thang cap");
		
		ComboBox<String> txtNgayDK = new ComboBox<String>();
		txtNgayDK.setEnabled(false);
		txtNgayDK.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		txtNgayDK.setSelectedIndex(4);
		txtNgayDK.setMaximumRowCount(32);
		txtNgayDK.setLabelText("Ngay dang ky");
		
		ComboBox<String> txtThangDK = new ComboBox<String>();
		txtThangDK.setEnabled(false);
		txtThangDK.setModel(new DefaultComboBoxModel<String>(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		txtThangDK.setSelectedIndex(4);
		txtThangDK.setMaximumRowCount(30);
		txtThangDK.setLabelText("Thang dang ky");
		
		ComboBox<String> txtNgaySinh = new ComboBox<String>();
		txtNgaySinh.setEnabled(false);
		txtNgaySinh.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		txtNgaySinh.setSelectedIndex(4);
		txtNgaySinh.setMaximumRowCount(32);
		txtNgaySinh.setLabelText("Ngay Sinh");
		
		ComboBox<String> txtThangSinh = new ComboBox<String>();
		txtThangSinh.setEnabled(false);
		txtThangSinh.setModel(new DefaultComboBoxModel<String>(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		txtThangSinh.setSelectedIndex(4);
		txtThangSinh.setMaximumRowCount(30);
		txtThangSinh.setLabelText("Thang Sinh");
		
		InputField txtNamSinh = new InputField("Ho va ten");
		txtNamSinh.setEditable(false);
		txtNamSinh.setText("2001");
		txtNamSinh.setLabel("Nam sinh");
		
		ComboBox<String> comboBox_1 = new ComboBox<String>();
		comboBox_1.setEnabled(false);
		comboBox_1.setModel(new DefaultComboBoxModel<String>(new String[] {"Nam", "Nu", "Khac"}));
		comboBox_1.setSelectedIndex(2);
		comboBox_1.setMaximumRowCount(30);
		comboBox_1.setLabelText("Gioi tinh");
		
	/*
	 * Group
	 * */
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(txtHoTen, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(txtBiDanh, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(txtNgaySinh, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
							.addGap(19)
							.addComponent(txtThangSinh, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
							.addGap(21)
							.addComponent(txtNamSinh, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
							.addGap(128)
							.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtNoiSinh, GroupLayout.PREFERRED_SIZE, 612, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtQueQuan, GroupLayout.PREFERRED_SIZE, 612, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(txtDanToc, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
							.addGap(128)
							.addComponent(txtNgheNghiep, GroupLayout.PREFERRED_SIZE, 333, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtNoiLamViec, GroupLayout.PREFERRED_SIZE, 612, GroupLayout.PREFERRED_SIZE)
						.addComponent(CCCD, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
						.addComponent(separator, GroupLayout.PREFERRED_SIZE, 612, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(txtCCCD, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
							.addGap(29)
							.addComponent(txtNgayCap, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
							.addGap(19)
							.addComponent(txtThangCap, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
							.addGap(21)
							.addComponent(txtNamCap, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtNoiCap, GroupLayout.PREFERRED_SIZE, 612, GroupLayout.PREFERRED_SIZE)
						.addComponent(ThuongTru, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
						.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 612, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(txtNgayDK, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
							.addGap(19)
							.addComponent(txtThangDK, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
							.addGap(21)
							.addComponent(txtNamDK, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtThuongTru, GroupLayout.PREFERRED_SIZE, 612, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtThuongTru_Truoc, GroupLayout.PREFERRED_SIZE, 612, GroupLayout.PREFERRED_SIZE)))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtHoTen, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtBiDanh, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtNgaySinh, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtThangSinh, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNamSinh, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addComponent(txtNoiSinh, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(txtQueQuan, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtDanToc, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNgheNghiep, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addComponent(txtNoiLamViec, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(CCCD, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtCCCD, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNgayCap, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtThangCap, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNamCap, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
					.addGap(15)
					.addComponent(txtNoiCap, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addComponent(ThuongTru, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtNgayDK, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtThangDK, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNamDK, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addComponent(txtThuongTru, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(txtThuongTru_Truoc, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
		);
		setLayout(groupLayout);

	}
}
