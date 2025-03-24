public class Crustacea extends Arthropoda {
    private final String jenisAir;
    private final boolean bercangkang;
    private final boolean bercapit;

    public Crustacea(String nama, String habitat, int jumlahKaki, String jenisAir) {
        super(nama, habitat, jumlahKaki);
        this.jenisAir = jenisAir;
        this.bercangkang = false;
        this.bercapit = false;
    }

    public Crustacea(String nama, String habitat, int jumlahKaki, String jenisAir, boolean bercangkang, boolean bercapit) {
        super(nama, habitat, jumlahKaki);
        this.jenisAir = jenisAir;
        this.bercangkang = bercangkang;
        this.bercapit = bercapit;
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " berenang di air " + jenisAir + ".");
    }

    @Override
    public String toString() {
        return super.toString() + ", Jenis Air: " + jenisAir + ", Bercangkang: " + (bercangkang ? "Ya" : "Tidak") + ", Bercapit: " + (bercapit ? "Ya" : "Tidak");
    }
}
