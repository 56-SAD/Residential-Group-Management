package qL_NhanKhau;

import java.util.Date;

public class NhanKhau {
	private String ten;
	private String biDanh;
	private Date ngaySinh;
	private String noiSinh;
	private String queQuan;
	private String danToc;
	private String ngheNghiep;
	private String noiLamViec;
	private String CCCD;
	private Date ngayCap;
	private String noiCap;
	private Date ngayDangKyThuongTru;
	private String diaChiThuongTruTruoc;
	private String quanHeChuHo;
	private Date ngayChuyen;
	private String noiChuyen;
	private String ghiChu;
	
	public NhanKhau(
			String ten,
			String biDanh,
			Date ngaySinh,
			String noiSinh,
			String queQuan,
			String danToc,
			String ngheNghiep,
			String noiLamViec,
			String CCCD,
			Date ngayCap,
			String noiCap,
			Date ngayDangKyThuongTru,
			String diaChiThuongTruTruoc,
			String quanHeChuHo
			) {
		this.ten = ten;
		this.biDanh = biDanh;
		this.ngaySinh = ngaySinh;
		this.noiSinh = noiSinh;
		this.queQuan = queQuan;
		this.danToc = danToc;
		this.ngheNghiep = ngheNghiep;
		this.noiLamViec = noiLamViec;
		this.CCCD = CCCD;
		this.ngayCap = ngayCap;
		this.noiCap = noiCap;
		this.ngayDangKyThuongTru = ngayDangKyThuongTru;
		this.diaChiThuongTruTruoc = diaChiThuongTruTruoc;
		this.quanHeChuHo = quanHeChuHo;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getBiDanh() {
		return biDanh;
	}

	public void setBiDanh(String biDanh) {
		this.biDanh = biDanh;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getNoiSinh() {
		return noiSinh;
	}

	public void setNoiSinh(String noiSinh) {
		this.noiSinh = noiSinh;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	public String getDanToc() {
		return danToc;
	}

	public void setDanToc(String danToc) {
		this.danToc = danToc;
	}

	public String getNgheNghiep() {
		return ngheNghiep;
	}

	public void setNgheNghiep(String ngheNghiep) {
		this.ngheNghiep = ngheNghiep;
	}

	public String getNoiLamViec() {
		return noiLamViec;
	}

	public void setNoiLamViec(String noiLamViec) {
		this.noiLamViec = noiLamViec;
	}

	public String getCCCD() {
		return CCCD;
	}

	public void setCCCD(String cCCD) {
		CCCD = cCCD;
	}

	public Date getNgayCap() {
		return ngayCap;
	}

	public void setNgayCap(Date ngayCap) {
		this.ngayCap = ngayCap;
	}

	public String getNoiCap() {
		return noiCap;
	}

	public void setNoiCap(String noiCap) {
		this.noiCap = noiCap;
	}

	public Date getNgayDangKyThuongTru() {
		return ngayDangKyThuongTru;
	}

	public void setNgayDangKyThuongTru(Date ngayDangKyThuongTru) {
		this.ngayDangKyThuongTru = ngayDangKyThuongTru;
	}

	public String getQuanHeChuHo() {
		return quanHeChuHo;
	}

	public void setQuanHeChuHo(String quanHeChuHo) {
		this.quanHeChuHo = quanHeChuHo;
	}

	public String getDiaChiThuongTruTruoc() {
		return diaChiThuongTruTruoc;
	}

	public void setDiaChiThuongTruTruoc(String diaChiThuongTruTruoc) {
		this.diaChiThuongTruTruoc = diaChiThuongTruTruoc;
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
