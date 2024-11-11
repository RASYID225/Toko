import java.util.Scanner;
public class TesterAray {
    public static void main(String[] args) {
        int[] angka = {1, 2, 3};
        int[] number = new int[3];
        number[2] = 10;
        
        // array object
        product[] pro = new product[5];
        CD[] cd1 = new CD[10];
        DVD[] dvd1 = new DVD[8];
        Scanner in = new Scanner(System.in);
        System.out.println("Product, CD, DVD");
        int pilihan = in.nextInt();
        if (pilihan == 1) {
            System.out.println("Pilihan 1: ");
            System.out.println("Number: ");
            System.out.println("Name: ");
            System.out.println("Quantity: ");
            System.out.println("Price: ");
            pro[0] = new product();
            pro[0].print();
        } else if(pilihan == 2){
            System.out.println("Pilihan 2: ");
            System.out.println("Artist: ");
            System.out.println("NumSong: ");
            System.out.println("Label: ");
            cd1[0] = new CD();
            cd1[0].print();
        }else if(pilihan == 3) {
            System.out.println("Pilihan 3: ");
            System.out.println("Length: ");
            System.out.println("Rating: ");
            System.out.println("Studio: ");
            dvd1[1]= new DVD();
            dvd1[1].print();
        } else {
            System.out.println("Tidak ada pilihan lagi.");
        }
        in.close();
        
               
        
        product[] p = new product[5];
        System.out.println("Product");
        p[3] = new product();
        p[3].print();
        System.out.println("CD");
        p[0] = new CD();//jika sudah menerapkan inheritance
        p[0].print();
        p[1] = new DVD();
        p[1].print();

        CD[] cd = new CD[10];
        cd[0] = new CD();
        cd[0].print();

        DVD[] dvd = new DVD[8];
        dvd[6] = new DVD();
        dvd[6].print();
    }
}
