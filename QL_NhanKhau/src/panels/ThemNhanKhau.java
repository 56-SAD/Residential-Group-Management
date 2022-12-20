package panels;

import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class ThemNhanKhau extends JPanel {
	private static final long serialVersionUID = -6228536132941256049L;
	
	private JTextField txtHoTen;
	private JTextField txtSoHoKhauSapNhap;
	private JTextField txtDiaChiThuongTruTruoc;
	private JTextField txtDiaChiThuongTru;
	private JTextField txtNgayDangKy;
	private JTextField txtNoiCap;
	private JTextField txtNgayCap;
	private JTextField txtCCCD;
	private JTextField txtBiDanh;
	private JTextField txtNoiLamViec;
	private JTextField txtNgheNghiep;
	private JTextField txtDanToc;
	private JTextField txtQueQuan;
	private JTextField txtNoiSinh;
	private JTextField txtNgaySinh;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Create the panel.
	 */
	public ThemNhanKhau() {
		setLayout(null);
		setBounds(100, 100, 700, 500);
	
		/*
		 * Create 
		 */
		
			JLabel lblNewLabel = new JLabel("Thêm Nhân Khẩu");
			lblNewLabel.setIcon(new ImageIcon("otherResource/NhanKhau16.png"));
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel.setBounds(10, 10, 167, 19);
			add(lblNewLabel);
			
			JSeparator separator = new JSeparator();
			separator.setBounds(10, 35, 850, 2);
			add(separator);
			
		/*
		 * Thông tin chung
		 */
			JLabel lblNewLabel_1 = new JLabel("Thông tin chung");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1.setBounds(10, 40, 140, 25);
			add(lblNewLabel_1);
			
			JLabel hoTenJLabel = new JLabel("Họ và tên");
			hoTenJLabel.setBounds(10, 75, 60, 14);
			add(hoTenJLabel);
			txtHoTen = new JTextField();
			txtHoTen.setBounds(80, 75, 183, 20);
			add(txtHoTen);
			txtHoTen.setColumns(10);
			
			JLabel gioiTinhJLabel = new JLabel("Giới tính");
			gioiTinhJLabel.setBounds(300, 75, 60, 14);
			add(gioiTinhJLabel);
			JRadioButton namButton = new JRadioButton("Nam");
			buttonGroup.add(namButton);
			namButton.setBounds(350, 71, 55, 23);
			add(namButton);
			JRadioButton nuButton = new JRadioButton("Nữ");
			buttonGroup.add(nuButton);
			nuButton.setBounds(350, 91, 55, 23);
			add(nuButton);
			JRadioButton khacButton = new JRadioButton("Khác");
			buttonGroup.add(khacButton);
			khacButton.setBounds(350, 111, 55, 23);
			add(khacButton);
			
			JLabel biDanhJLabel = new JLabel("Bí danh");
			biDanhJLabel.setBounds(10, 100, 46, 14);
			add(biDanhJLabel);
			txtBiDanh = new JTextField();
			txtBiDanh.setBounds(80, 100, 183, 20);
			add(txtBiDanh);
			txtBiDanh.setColumns(10);
			
			JLabel ngaySinhJLabel = new JLabel("Ngày sinh");
			ngaySinhJLabel.setBounds(10, 125, 60, 14);
			add(ngaySinhJLabel);
			txtNgaySinh = new JTextField();
			txtNgaySinh.setBounds(80, 125, 183, 20);
			add(txtNgaySinh);
			txtNgaySinh.setColumns(10);
			
			JLabel noiSinhJLabel = new JLabel("Nơi sinh");
			noiSinhJLabel.setBounds(10, 150, 60, 14);
			add(noiSinhJLabel);
			txtNoiSinh = new JTextField();
			txtNoiSinh.setBounds(80, 150, 325, 20);
			add(txtNoiSinh);
			txtNoiSinh.setColumns(10);
			
			JLabel queQuanJLabel = new JLabel("Quê quán");
			queQuanJLabel.setBounds(10, 175, 60, 14);
			add(queQuanJLabel);
			txtQueQuan = new JTextField();
			txtQueQuan.setBounds(80, 175, 325, 20);
			add(txtQueQuan);
			txtQueQuan.setColumns(10);
			
			JLabel danTocJLabel = new JLabel("Dân tộc");
			danTocJLabel.setBounds(10, 200, 60, 14);
			add(danTocJLabel);
			txtDanToc = new JTextField();
			txtDanToc.setBounds(80, 200, 325, 20);
			add(txtDanToc);
			txtDanToc.setColumns(10);
			
			JLabel ngheNghiepJLabel = new JLabel("Nghề nghiệp");
			ngheNghiepJLabel.setBounds(10, 225, 71, 14);
			add(ngheNghiepJLabel);
			txtNgheNghiep = new JTextField();
			txtNgheNghiep.setBounds(90, 225, 315, 20);
			add(txtNgheNghiep);
			txtNgheNghiep.setColumns(10);
			
			JLabel noiLamViecJLabel = new JLabel("Nơi làm việc");
			noiLamViecJLabel.setBounds(10, 250, 71, 14);
			add(noiLamViecJLabel);
			txtNoiLamViec = new JTextField();
			txtNoiLamViec.setBounds(90, 250, 315, 20);
			add(txtNoiLamViec);
			txtNoiLamViec.setColumns(10);
			
		/*
		 * Căn cước công dân
		 */
			JLabel CCCD = new JLabel("Căn cước công dân");
			CCCD.setFont(new Font("Tahoma", Font.BOLD, 14));
			CCCD.setBounds(460, 40, 140, 25);
			add(CCCD);
			
			JLabel cccdJLabel = new JLabel("CCCD/CMND");
			cccdJLabel.setBounds(460, 75, 60, 14);
			add(cccdJLabel);
			txtCCCD = new JTextField();
			txtCCCD.setBounds(530, 75, 183, 20);
			add(txtCCCD);
			txtCCCD.setColumns(10);
			
			JLabel ngayCapJLabel = new JLabel("Ngày cấp");
			ngayCapJLabel.setBounds(460, 100, 60, 14);
			add(ngayCapJLabel);
			txtNgayCap = new JTextField();
			txtNgayCap.setBounds(530, 100, 183, 20);
			add(txtNgayCap);
			txtNgayCap.setColumns(10);
			
			JLabel noiCapJLabel = new JLabel("Nơi cấp");
			noiCapJLabel.setBounds(460, 125, 60, 14);
			add(noiCapJLabel);
			txtNoiCap = new JTextField();
			txtNoiCap.setBounds(530, 125, 315, 20);
			add(txtNoiCap);
			txtNoiCap.setColumns(10);
			
		/*
		 * Thường trú
		 */
			JLabel thuongTruJLabel = new JLabel("Thường trú");
			thuongTruJLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
			thuongTruJLabel.setBounds(460, 150, 140, 25);
			add(thuongTruJLabel);
			
			JLabel ngayDangKyThuongTruJLabel = new JLabel("Ngày đăng ký");
			ngayDangKyThuongTruJLabel.setBounds(460, 190, 85, 14);
			add(ngayDangKyThuongTruJLabel);
			txtNgayDangKy = new JTextField();
			txtNgayDangKy.setBounds(610, 190, 240, 20);
			add(txtNgayDangKy);
			txtNgayDangKy.setColumns(10);
			
			JLabel diaChiThuongTruJLabel = new JLabel("Địa chỉ thường trú");
			diaChiThuongTruJLabel.setBounds(460, 215, 105, 14);
			add(diaChiThuongTruJLabel);
			txtDiaChiThuongTru = new JTextField();
			txtDiaChiThuongTru.setBounds(610, 215, 240, 20);
			add(txtDiaChiThuongTru);
			txtDiaChiThuongTru.setColumns(10);
			
			JLabel diaChiThuongTruTruocJLabel = new JLabel("Địa chỉ thường trú trước");
			diaChiThuongTruTruocJLabel.setBounds(460, 240, 156, 14);
			add(diaChiThuongTruTruocJLabel);
			txtDiaChiThuongTruTruoc = new JTextField();
			txtDiaChiThuongTruTruoc.setBounds(610, 240, 240, 20);
			add(txtDiaChiThuongTruTruoc);
			txtDiaChiThuongTruTruoc.setColumns(10);
			
			JLabel soHoKhauJLabel = new JLabel("Số hộ khẩu sáp nhập");
			soHoKhauJLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
			soHoKhauJLabel.setBounds(10, 320, 156, 14);
			add(soHoKhauJLabel);
			txtSoHoKhauSapNhap = new JTextField();
			txtSoHoKhauSapNhap.setBounds(160, 320, 240, 20);
			add(txtSoHoKhauSapNhap);
			txtSoHoKhauSapNhap.setColumns(10);
			
			JSeparator separator_1 = new JSeparator();
			separator_1.setBounds(10, 301, 850, 2);
			add(separator_1);
		
		
	}
}
