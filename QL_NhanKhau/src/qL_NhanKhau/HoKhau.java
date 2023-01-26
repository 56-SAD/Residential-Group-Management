package qL_NhanKhau;

public class HoKhau {
	private Integer ID;
	private Integer soHoKhau;
	private String chuHo;
	private String diaChi;
	
	public HoKhau(Integer ID, int soHoKhau, String chuHo, String diaChi) {
		this.ID = ID;
		this.chuHo = chuHo;
		this.soHoKhau = soHoKhau;
		this.diaChi = diaChi;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public int getSoHoKhau() {
		return soHoKhau;
	}

	public void setSoHoKhau(int soHoKhau) {
		this.soHoKhau = soHoKhau;
	}

	public String getChuHo() {
		return chuHo;
	}

	public void setChuHo(String chuHo) {
		this.chuHo = chuHo;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
}
