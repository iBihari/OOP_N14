package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import model.Books;
import model.Librarian;
import model.Main;
import model.Reader;
import view.View;

public class Controller implements ActionListener{
	public View view;
//	public JFrame jFrameAll;
	public Controller() {}
	public Controller(View view) {
        this.view = view;
        
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String getStringAction = e.getActionCommand();
		System.out.println(getStringAction);
		Reader reader = new Reader();
		Librarian librarian = new Librarian();
		String nameUser = "";
		Books book = new Books();
		
		
		if(getStringAction.equals("Đăng nhập")) {
			view.getJFrame().setVisible(false);
		    view.getJFrame().getContentPane().removeAll();
			reader.logIn(view.getJTextField_UserName(), view.getJTextField_PassWork());
		}
		
		if(!Main.logInCurrentReader.isEmpty()) {
		    nameUser = Main.logInCurrentReader.get(0).getNameReader();
		    // code xử lý cho trường hợp đăng nhập của độc giả
		} else if (!Main.logInCurrentLibrarian.isEmpty()) {
		    nameUser = Main.logInCurrentLibrarian.get(0).getNameLibrarian();
		    // code xử lý cho trường hợp đăng nhập của thủ thư
		} else {
		    // code xử lý cho trường hợp không có ai đăng nhập
		}

		
		if(getStringAction.equals("Tìm sách")) {
			view.interfaceFoundBook();
		}
		if(getStringAction.equals("Tìm")) {
			reader.foundBookOfReader(view.getJTextField_FoundBook());
		}
		if(getStringAction.equals("Mượn sách")) {
			view.interfaceBorrowBook();
		}
		if(getStringAction.equals("Đọc giả")){
		    view.getJFrame().setVisible(false);
		    view.getJFrame().getContentPane().removeAll();
		    view.interfaceAdminDocGia(nameUser);
		    view.getJFrame().revalidate();
		    view.getJFrame().repaint();
		    view.getJFrame().setVisible(true);
		}
		
		if(getStringAction.equals("Sách")) {
		    view.getJFrame().setVisible(false);
		    view.getJFrame().getContentPane().removeAll();
		    view.interfaceAdminBook(nameUser);
		    view.getJFrame().revalidate();
		    view.getJFrame().repaint();
		    view.getJFrame().setVisible(true);
		}
		
		// đọc giả
		if(getStringAction.equals("Thêm đọc giả")) {
			view.getJFrame().setVisible(false);
		    view.getJFrame().getContentPane().removeAll();
		    view.interfaceAddReaderInLibrarian(nameUser);
		    view.getJFrame().revalidate();
		    view.getJFrame().repaint();
		    view.getJFrame().setVisible(true);
		}
		if(getStringAction.equals("Xác nhận thêm đọc giả")) {
			librarian.addReader(view.getjTextFieldCodeReader(), view.getjTextFieldUserNameReader(), view.getjTextFieldPassworkReader(),
		    		view.getjTextFieldNameReader(), view.getjTextFieldAgeReader(), view.getjTextFieldAddresssReader(), view.getjTextFieldPhoneNumberReader(),
		    		view.getjTextFieldCMNDReader());
			view.interfaceAddReaderInLibrarianSuccess();
		}
	
		if(getStringAction.equals("Xóa đọc giả")) {
			view.getJFrame().setVisible(false);
		    view.getJFrame().getContentPane().removeAll();
		    view.interfaceDeleteReader(nameUser);
		    view.getJFrame().revalidate();
		    view.getJFrame().repaint();
		    view.getJFrame().setVisible(true);
		}
		if(getStringAction.equals("Xác nhận xóa đọc giả")) {
			view.getJFrame().setVisible(false);
		    view.getJFrame().getContentPane().removeAll();
		    librarian.deleteReader(view.getjTextFieldCodeReaderDelete(), nameUser, view);
		    view.getJFrame().revalidate();
		    view.getJFrame().repaint();
		    view.getJFrame().setVisible(true);
		}
		
		if(getStringAction.equals("Cập nhật đọc giả")) {
			view.getJFrame().setVisible(false);
		    view.getJFrame().getContentPane().removeAll();
		    view.foundUpdateReaderInLibrarian(nameUser);
		    view.getJFrame().revalidate();
		    view.getJFrame().repaint();
		    view.getJFrame().setVisible(true);
		}
		
		
		if(getStringAction.equals("Tìm kiếm đọc giả cần cập nhật")) {
			view.getJFrame().setVisible(false);
		    view.getJFrame().getContentPane().removeAll();
		    view.updateReaderInLibrarian(nameUser);
		    view.getJFrame().revalidate();
		    view.getJFrame().repaint();
		    view.getJFrame().setVisible(true);
		}
		
		if(getStringAction.equals("Xác nhận cập nhật đọc giả")) {
			view.getJFrame().setVisible(false);
		    view.getJFrame().getContentPane().removeAll();
		    view.updateReaderSuccessInLibrarian(nameUser, "khong ngu");
		    view.getJFrame().revalidate();
		    view.getJFrame().repaint();
		    view.getJFrame().setVisible(true);
		}
		
		if(getStringAction.equals("Thông tin đọc giả")) {
			view.getJFrame().setVisible(false);
		    view.getJFrame().getContentPane().removeAll();
		    view.allInformationReader(nameUser);
		    view.getJFrame().revalidate();
		    view.getJFrame().repaint();
		    view.getJFrame().setVisible(true);
		}
		
		if(getStringAction.equals("Truy suất đọc giả")) {
			view.getJFrame().setVisible(false);
		    view.getJFrame().getContentPane().removeAll();
		    view.informationReaderFound(nameUser);
		    view.getJFrame().revalidate();
		    view.getJFrame().repaint();
		    view.getJFrame().setVisible(true);
		}
		if(getStringAction.equals("Xác nhận tìm kiếm đọc giả")) {
			view.getJFrame().setVisible(false);
		    view.getJFrame().getContentPane().removeAll();
		    view.informationReaderFoundConfirm(getStringAction, view.getjTextFieldNameFoundReader());
		    view.getJFrame().revalidate();
		    view.getJFrame().repaint();
		    view.getJFrame().setVisible(true);
		}
		// sách
		if(getStringAction.equals("Thêm sách")) {  
			view.getJFrame().setVisible(false);
		    view.getJFrame().getContentPane().removeAll();
		    view.interfaceAddBookInLibrarian(nameUser);;
		    view.getJFrame().revalidate();
		    view.getJFrame().repaint();
		    view.getJFrame().setVisible(true);
		}
		
		if(getStringAction.equals("Xác nhận thêm sách")){
			view.getJFrame().setVisible(false);
		    view.getJFrame().getContentPane().removeAll();
		    book.addBooks(view.getjTextFieldCodeBookInLibrarian(), view.getjTextFieldUserNameBookInLibrarian(), view.getjTextFieldPassworkBookInLibrarian(), view.getjTextFieldNameBookInLibrarian(), view.getjTextFieldAgeBookInLibrarian(), view.getjTextFieldAddresssBookInLibrarian(), nameUser, view);
		    view.getJFrame().revalidate();
		    view.getJFrame().repaint();
		    view.getJFrame().setVisible(true);
		}
		
		if(getStringAction.equals("Xóa sách")) {
			view.getJFrame().setVisible(false);
		    view.getJFrame().getContentPane().removeAll();
		    view.interfaceDeleteBook(nameUser);
		    view.getJFrame().revalidate();
		    view.getJFrame().repaint();
		    view.getJFrame().setVisible(true);
		}
		if(getStringAction.equals("Xác nhận xóa sách")) {
			view.getJFrame().setVisible(false);
		    view.getJFrame().getContentPane().removeAll();
		    book.deleteBook(view.getjTextFieldCodeBookInLibrarianDelete(), nameUser, view);
		    view.getJFrame().revalidate();
		    view.getJFrame().repaint();
		    view.getJFrame().setVisible(true);
		}
		
		if(getStringAction.equals("Cập nhật sách")) {
			view.getJFrame().setVisible(false);
		    view.getJFrame().getContentPane().removeAll();
		    view.interfaceUpdateBook(nameUser);
		    view.getJFrame().revalidate();
		    view.getJFrame().repaint();
		    view.getJFrame().setVisible(true);
		}
		if(getStringAction.equals("Tìm sách cập nhật")) {
			view.getJFrame().setVisible(false);
		    view.getJFrame().getContentPane().removeAll();
		    view.interfaceUpdateBookUpdated(nameUser);
		    view.getJFrame().revalidate();
		    view.getJFrame().repaint();
		    view.getJFrame().setVisible(true);
		}
		if(getStringAction.equals("Truy suất sách")) {
			view.getJFrame().setVisible(false);
		    view.getJFrame().getContentPane().removeAll();
		    view.interfaceFoundBookinLibrarian(nameUser);
		    view.getJFrame().revalidate();
		    view.getJFrame().repaint();
		    view.getJFrame().setVisible(true);
		}
		
		if(getStringAction.equals("Kho sách")) {
			view.getJFrame().setVisible(false);
		    view.getJFrame().getContentPane().removeAll();
		    view.interfaceImforBookInLibrarian(nameUser);
		    view.getJFrame().revalidate();
		    view.getJFrame().repaint();
		    view.getJFrame().setVisible(true);
		}
		if(getStringAction.equals("Mượn")) {
			reader.borrowBookReader(Main.logInCurrentReader.get(0), view.getJTextField_BorrowBook());
		}
		if(getStringAction.equals("Trả sách")) {
			view.interfacePayBook();
		}
		if(getStringAction.equals("Trả")) {
			reader.returnBookReaderBorrowed(Main.logInCurrentReader.get(0).getIdUser() , view.getJTextField_PayBook());
		}
		if(getStringAction.equals("Sách đã mượn")) {
			view.interfaceReaderBorrowedBook();
		}
		if(getStringAction.equals("Thông tin cá nhân")) {
			view.interfaceImfReader();
		}
	}
	
}

