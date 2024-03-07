public class Buku{
    private String judulBuku;
    private String penulisBuku;
    private String tahunTerbit;

    public Buku(String judulBuku, String penulisBuku, String tahunTerbit){
        this.judulBuku = judulBuku;
        this.penulisBuku = penulisBuku;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudulBuku(){
        return judulBuku;
    }

    @Override
    public String toString(){
        return "| Judul Buku : "+ judulBuku + " | " + "Penulis Buku : "+ penulisBuku + " | " + "Tahun Terbit : " + tahunTerbit + '\n';
    }
}