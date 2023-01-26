package layouts;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Main_Panel extends JFrame {

	Login_Panel login;
	private NhanKhau_Panel tabHienThiNhanKhau;
	private HoKhau_Panel tabHienThiHoKhau;
	JTabbedPane tab;
	
	private static final long serialVersionUID = 2730626704474033277L;
	JTabbedPane menu;

	/**
	 * Create the frame.
	 */
	public Main_Panel(Login_Panel login) {
		this.login = login;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		getContentPane().setLayout(null);
		setTitle("Quản Lý Nhân Khẩu");
		setIconImage(Toolkit.getDefaultToolkit().getImage("otherResource/icon.png"));
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 900, 32);
		getContentPane().add(menuBar);
		
		tab = new JTabbedPane(JTabbedPane.TOP);
		tab.setBounds(10, 116, 870, 530);
		getContentPane().add(tab);
		
	/* 
	 * SYSTEM Management
	 */
		JMenu HeThong = new JMenu("Hệ Thống");
		HeThong.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(HeThong);
		
		JMenuItem DangXuat = new JMenuItem("�?ăng Xuất");
		DangXuat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login.setVisible(true);
				dispose();
			}
		});
		DangXuat.setIcon(new ImageIcon("otherResource/LogOut16.png"));
		HeThong.add(DangXuat);
		
		JSeparator separator = new JSeparator();
		HeThong.add(separator);
		
		JMenuItem Thoat = new JMenuItem("Thoát");
		Thoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		HeThong.add(Thoat);
		Thoat.setIcon(new ImageIcon("otherResource/Thoat16.png"));
		
	/*
	 * MANAGEMENT
	 */
		JMenu QuanLy = new JMenu("Quản Lý");
		menuBar.add(QuanLy);
		
		JMenuItem QuanLyNhanKhau = new JMenuItem("Quản Lý Nhân Khẩu");
		QuanLy.add(QuanLyNhanKhau);
		QuanLyNhanKhau.setIcon(new ImageIcon("otherResource/NhanKhau16.png"));
	// Event NhanKhau
		QuanLyNhanKhau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addTabHienThiNhanKhau();
			}
		});
		
		JSeparator separator_1 = new JSeparator();
		QuanLy.add(separator_1);
		
		JMenuItem QuanLyHoKhau = new JMenuItem("Quản Lý Hộ Khẩu");
		QuanLy.add(QuanLyHoKhau);
		QuanLyHoKhau.setIcon(new ImageIcon("otherResource/HoKhau16.png"));
		
	/*
	 * SUPPORT
	 */
		
		JMenu mnDchV = new JMenu("Dịch Vụ");
		menuBar.add(mnDchV);
		
		JMenuItem mntmKhaiSinh = new JMenuItem("Khai Sinh");
		mnDchV.add(mntmKhaiSinh);
		
		JSeparator separator_1_1 = new JSeparator();
		mnDchV.add(separator_1_1);
		
		JMenuItem mntmKhaiT = new JMenuItem("Khai tử");
		mnDchV.add(mntmKhaiT);
		
		JSeparator separator_3 = new JSeparator();
		mnDchV.add(separator_3);
		
		JMenuItem mntmTmTrTm = new JMenuItem("Tạm Trú, Tạm Vắng");
		mnDchV.add(mntmTmTrTm);
		
		JSeparator separator_4 = new JSeparator();
		mnDchV.add(separator_4);
		
		JMenuItem mntmKhaiT_1_1 = new JMenuItem("Chuyển Nhân Khẩu");
		mnDchV.add(mntmKhaiT_1_1);
		
		JSeparator separator_4_1 = new JSeparator();
		mnDchV.add(separator_4_1);
		
		JMenuItem mntmKhaiT_1_1_1 = new JMenuItem("Tách Hộ Khẩu");
		mnDchV.add(mntmKhaiT_1_1_1);
		JMenu TroGiup = new JMenu("Trợ Giúp");
		menuBar.add(TroGiup);
		
		JMenuItem NoiDung = new JMenuItem("Nội Dung");
		TroGiup.add(NoiDung);
		NoiDung.setIcon(new ImageIcon("otherResource/NoiDung16.png"));
		
		JSeparator separator_2 = new JSeparator();
		TroGiup.add(separator_2);
		
		JMenuItem GioiThieu = new JMenuItem("Giới Thiệu");
		TroGiup.add(GioiThieu);
		GioiThieu.setIcon(new ImageIcon("otherResource/GioiThieu16.png"));
		
	/*
	 * Tool Bar
	 */
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 32, 890, 77);
		getContentPane().add(toolBar);
		
		JButton dangXuatButton = new JButton("Đăng xuất");
		dangXuatButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login.setVisible(true);
				dispose();
			}
		});
		dangXuatButton.setIcon(new ImageIcon("otherResource/LogOut48.png"));
		toolBar.add(dangXuatButton);
		
		JButton quanLyHoKhauButton = new JButton("Quản Lý Hộ Khẩu");
		quanLyHoKhauButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addTabHienThiHoKhau();
			}
		});
		quanLyHoKhauButton.setIcon(new ImageIcon("otherResource/HoKhau48.png"));
		toolBar.add(quanLyHoKhauButton);
		
		JButton quanLyNhanKhauButton = new JButton("Quản Lý Nhân Khẩu");
		quanLyNhanKhauButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addTabHienThiNhanKhau();;
			}
		});
		quanLyNhanKhauButton.setIcon(new ImageIcon("otherResource/NhanKhau48.png"));
		toolBar.add(quanLyNhanKhauButton);
		
		JButton btnNewButton = new JButton("Dịch Vụ");
		btnNewButton.setIcon(new ImageIcon("otherResource/Service48.png"));
		toolBar.add(btnNewButton);
		
		JButton gioiThieuButton = new JButton("Giới Thiệu");
		gioiThieuButton.setIcon(new ImageIcon("otherResource/GioiThieu48.png"));
		toolBar.add(gioiThieuButton);
		
		JButton thoatButton = new JButton("Thoát");
		thoatButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		thoatButton.setIcon(new ImageIcon("otherResource/Thoat48.png"));
		toolBar.add(thoatButton);
		
		JMenuItem menuItem = new JMenuItem("New menu item");
		menuItem.setBounds(0, 43, 137, 26);
		getContentPane().add(menuItem);
	
	}
	
	/*
	 * Event
	 */
	
		void addTabHienThiNhanKhau() {
			if(tabHienThiNhanKhau == null) {
				tabHienThiNhanKhau = new NhanKhau_Panel();
				tab.addTab("Quản Lý Nhân Khẩu", new ImageIcon(), tabHienThiNhanKhau, "Quản Lý Nhân Khẩu");
			}
			tab.setSelectedComponent(tabHienThiNhanKhau);
		}
		
		
		void addTabHienThiHoKhau() {
			if(tabHienThiHoKhau == null) {
				tabHienThiHoKhau = new HoKhau_Panel();
				tab.addTab("Quản Lý Hộ Khẩu", new ImageIcon(), tabHienThiHoKhau, "Quản Lý Hộ Khẩu");
			}
			tab.setSelectedComponent(tabHienThiHoKhau);
		}
}
