import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkList<Buku> linkList = new SingleLinkList<>();
        boolean lanjut = true;
        while(lanjut){
        System.out.println("1. Tambah Buku? (Klik 1)");
        System.out.println("2. Hapus Buku? (Klik 2)");
        System.out.println("3. Mau lihat ada buku apa saja? (Klik 3)");
        
        int pilih = sc.nextInt();
        String judulBuku = sc.nextLine();
        
        switch (pilih) {
            case 1:
                System.out.print("Masukkan Judul Buku ");
                judulBuku = sc.nextLine();
                System.out.print("Masukkan Penulis Buku ");
                String penulisBuku = sc.nextLine();
                System.out.print("Masukkan Tahun Terbit Buku ");
                String terbitBuku = sc.nextLine();
                linkList.insertAtFront(new Buku(judulBuku, penulisBuku, terbitBuku));
                break;

            case 2:
            linkList.removeFromBack();
                break;

            case 3:
            linkList.print();
                break;
            default:
                System.out.println("Tolong Hanya angka 1-3");
                break;
                
        }
        sc.close();
        }
    }
    
}