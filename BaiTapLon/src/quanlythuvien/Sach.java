package quanlythuvien;
//import java.util.ArrayList;

public class Sach{
	public int maSach;
	public String nameSach;
	public String nameTacGia;
	public int namSuatBan;
	public String theLoai;
	public int soLuong;
	public Sach() {}
	public Sach(int maSach, String nameSach, String nameTacGia, int namSuatBan, String theLoai, int soLuong) {
		this.maSach = maSach;
		this.nameSach = nameSach;
		this.nameTacGia = nameTacGia;
		this.namSuatBan = namSuatBan;
		this.theLoai = theLoai;
		this.soLuong = soLuong;
	}
//	public Sach(int maSach, String nameSach, String nameTacGia, int namSuatBan, String theLoai, int soLuong, ArrayList<Sach> duLieuSach) {
//        this.maSach = maSach;
//        this.nameSach = nameSach;
//        this.nameTacGia = nameTacGia;
//        this.namSuatBan = namSuatBan;
//        this.theLoai = theLoai;
//        this.soLuong = soLuong;
//        duLieuSach.add(this);
//    }
	@Override
	public String toString() {
		return "Sach [maSach=" + maSach + ", nameSach=" + nameSach + ", nameTacGia=" + nameTacGia + ", namSuatBan="
				+ namSuatBan + ", theLoai=" + theLoai + ", soLuong=" + soLuong + "]";
	}
	
	public int getMaSach() {
		return maSach;
	}
	public void setMaSach(int maSach) {
		this.maSach = maSach;
	}
	public String getNameSach() {
		return nameSach;
	}
	public void setNameSach(String nameSach) {
		this.nameSach = nameSach;
	}
	public String getNameTacGia() {
		return nameTacGia;
	}
	public void setNameTacGia(String nameTacGia) {
		this.nameTacGia = nameTacGia;
	}
	public int getNamSuatBan() {
		return namSuatBan;
	}
	public void setNamSuatBan(int namSuatBan) {
		this.namSuatBan = namSuatBan;
	}
	public String getTheLoai() {
		return theLoai;
	}
	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
	public void themSach(int maSach, String nameSach, String nameTacGia, int namSuatBan, String theLoai, int soLuong) {
	    Sach sach = new Sach(maSach, nameSach, nameTacGia, namSuatBan, theLoai, soLuong);
	    Main.duLieuSach.add(sach);
	    
	}

	
}
