package quanlythuvien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	public static ArrayList<Sach> duLieuSach = new ArrayList<Sach>();
	public static void main(String[] args) {
//		ArrayList<Sach> duLieuSach = new ArrayList<Sach>();
		File file = new File("C:\\Users\\dodan\\eclipse-workspace\\BaiTapLon\\src\\quanlythuvien\\dulieu.txt");
		try {
			Scanner scanner = new Scanner(file);
			 while (scanner.hasNextLine()) {
	                String data = scanner.nextLine();
	                String[] sachArr = data.split(",");
	                int maSach = Integer.parseInt(sachArr[0]);
	                String tenSach = sachArr[1];
	                String tacGia = sachArr[2];
	                int namXuatBan = Integer.parseInt(sachArr[3]);
	                String theLoai = sachArr[4];
	                int soLuong = Integer.parseInt(sachArr[5]);
	                
	                Sach sach = new Sach(maSach, tenSach, tacGia, namXuatBan,theLoai, soLuong);
	                duLieuSach.add(sach);
	            }
	            scanner.close();
		}catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Danh sách sách: ");
        for (Sach sach : duLieuSach) {
            System.out.println(sach);
        }
        Sach sach1 = new Sach();
        sach1.themSach(4, "ddd", "hoan",2123,"hoat hinh",21);
        Sach sach2 = new Sach();
        sach2.themSach(5, "dsdadsad", "hoasadn",2123,"hoasdat hinh",21);
        try {
            FileWriter writer = new FileWriter("C:\\\\Users\\\\dodan\\\\eclipse-workspace\\\\BaiTapLon\\\\src\\\\quanlythuvien\\\\dulieu.txt", true);
            PrintWriter printWriter = new PrintWriter(writer);

            // Lấy ra phần tử cuối cùng của mảng để ghi vào file
            Sach sach = duLieuSach.get(duLieuSach.size() - 1);

            printWriter.println(sach.getMaSach() + "," + sach.getNameSach() + "," + sach.getNameTacGia() + "," + sach.getNamSuatBan() + "," + sach.getTheLoai() + "," + sach.getSoLuong());
            printWriter.close();
        } catch (IOException e) {
            System.out.println("Error occurred while writing data to file: " + e.getMessage());
        }
        System.out.println("Danh sách sách: ");
        for (Sach sach : duLieuSach) {
            System.out.println(sach);
        }
        
	}
}
