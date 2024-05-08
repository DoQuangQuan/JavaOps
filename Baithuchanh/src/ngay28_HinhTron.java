import java.util.Scanner;

public class ngay28_HinhTron {

    //cac thhuoc tinh 
     public float R;
     public final float Pi = 3.14f ;
     public float chuVi ;
     public float dienTich ;
    //cac phuong thuc 
    public void nhapBanKinh(){
        System.out.println("nhap vao ban kinh R = ");
        Scanner scanner = new Scanner(System.in  );
        R = scanner.nextFloat();
        scanner.close();
    }
    public void tinhChuVi(){
        chuVi = 2 * Pi * R ; 

    }  
    public void tinhDienTich(){
        dienTich = Pi * R * R ;
    }
    public void inChuVi(){
        System.out.println("Chu Vi Hinh Tron La :" + chuVi);
    }
    public void inDienTich(){
        System.out.println("Dien Tich Hinh Tron La :" + dienTich);
    }
    
}

