package qL_NhanKhau;

public class HoKhau {
	private String ID;
	private int soHoKhau;
	private ChuHo chuHo;
	private String diaChi;
	
	public HoKhau(String ID, int soHoKhau, ChuHo chuHo, String diaChi) {
		this.ID = ID;
		this.chuHo = chuHo;
		this.soHoKhau = soHoKhau;
		this.diaChi = diaChi;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public int getSoHoKhau() {
		return soHoKhau;
	}

	public void setSoHoKhau(int soHoKhau) {
		this.soHoKhau = soHoKhau;
	}

	public ChuHo getChuHo() {
		return chuHo;
	}

	public void setChuHo(ChuHo chuHo) {
		this.chuHo = chuHo;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
}
