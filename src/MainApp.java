import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(" Thong tin sinh vien");
		
		System.out.println("Nhap vao Ten ");
		String Ten = sc.nextLine();
		
		System.out.println(" Nhap vao MXV ");
		String MXV = sc.nextLine();
		
		System.out.println(" Nhap vao CMDD ");
		String CMDD = sc.nextLine();
		
		System.out.println(" Nhap vao LOP ");
		String LOP = sc.nextLine();
		
		System.out.println(" Nhap vao Truong ");
		String Truong = sc.nextLine();
		
		System.out.println(" Nhap vao DTB ");
		String DTB = sc.nextLine();
		
		
		
		
		System.out.println(" Thong tin cong nhan ");
		
		
		System.out.println("Nhap vao ten cong nhan  ");
		String tencongnhan = sc.nextLine();
		
		System.out.println("Nhap vao Dia chi ");
		String Diachi = sc.nextLine();
		
		System.out.println("Nhap vao SDT ");
		String SDT = sc.nextLine();
		
		System.out.println("Nhap vao he so luong ");
		String hesoluong = sc.nextLine();
		
		System.out.println(" Thong tin xe Car ");
		
		System.out.println("Nhap vao Ten xe ");
		String Tenxe = sc.nextLine();
		
		System.out.println("Nhap vao hang ");
		String hang = sc.nextLine();
		
		System.out.println("Nhap vao mau son ");
		String mauson = sc.nextLine();
		
		
		
		System.out.println("Ten" + Ten +"-MXV" + MXV + "-CMDD" + CMDD + "-LOP"+ LOP + "-Truong"+ Truong + "-DTB"+ DTB  );
		
					
		System.out.println(" ten cong nhan" + tencongnhan + "-Dia chi" + Diachi + "-SDT" + SDT + "-he so luong" + hesoluong );
		
		System.out.println("Ten xe" + Tenxe + "-hang" + hang + "mau son" + mauson );
		
	
		
	}

}
