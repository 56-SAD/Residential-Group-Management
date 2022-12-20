package panels;

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

public class MainPanel extends JFrame {

	LoginPanel login;
	private ThemNhanKhau tabThemNhanKhau;
	private HienThiHoKhau tabHienThiHoKhau;
	JTabbedPane tab;
	
	private static final long serialVersionUID = 2730626704474033277L;
	JTabbedPane menu;

	/**
	 * Create the frame.
	 */
	public MainPanel(LoginPanel login) {
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
		
		JMenuItem DangXuat = new JMenuItem("Đăng Xuất");
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
				addTabThemNhanKhau();
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
		
		JButton dangXuatButton = new JButton("Đăng Xuất");
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
				addTabThemNhanKhau();
			}
		});
		quanLyNhanKhauButton.setIcon(new ImageIcon("otherResource/NhanKhau48.png"));
		toolBar.add(quanLyNhanKhauButton);
		
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
		void addTabThemNhanKhau() {
			if(tabThemNhanKhau == null) {
				tabThemNhanKhau = new ThemNhanKhau();
				tab.addTab("Quản Lý Nhân Khẩu", new ImageIcon(), tabThemNhanKhau, "Quản Lý Nhân Khẩu");
			}
			tab.setSelectedComponent(tabThemNhanKhau);
		}
		
		void addTabHienThiHoKhau() {
			if(tabHienThiHoKhau == null) {
				tabHienThiHoKhau = new HienThiHoKhau();
				tab.addTab("Quản Lý Hộ Khẩu", new ImageIcon(), tabHienThiHoKhau, "Quản Lý Hộ Khẩu");
			}
		}
		
}
