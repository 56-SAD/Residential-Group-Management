package qL_NhanKhau;

import java.util.Date;

public class NhanKhauChuyenDi extends NhanKhau {
	private Date ngayChuyen;
	private String noiChuyen;
	private String ghiChu;
	
	public NhanKhauChuyenDi(String ten, String biDanh, Date ngaySinh, String noiSinh, String queQuan, String danToc,
			String ngheNghiep, String noiLamViec, String CCCD, Date ngayCap, String noiCap, Date ngayDangKyThuongTru,
			String diaChiThuongTruTruoc, String quanHeChuHo, Date ngayChuyen, String noiChuyen, String ghiChu) {
		super(ten, biDanh, ngaySinh, noiSinh, queQuan, danToc, ngheNghiep, noiLamViec, CCCD, ngayCap, noiCap,
				ngayDangKyThuongTru, diaChiThuongTruTruoc, quanHeChuHo);
		this.ngayChuyen = ngayChuyen;
		this.noiChuyen = noiChuyen;
		this.ghiChu = ghiChu;
		// TODO Auto-generated constructor stub
	}

	public Date getNgayChuyen() {
		return ngayChuyen;
	}

	public void setNgayChuyen(Date ngayChuyen) {
		this.ngayChuyen = ngayChuyen;
	}

	public String getNoiChuyen() {
		return noiChuyen;
	}

	public void setNoiChuyen(String noiChuyen) {
		this.noiChuyen = noiChuyen;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	
	
	
}
