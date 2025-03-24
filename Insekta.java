class Insekta extends Arthropoda {
    private final String jenisSayap;

    public Insekta(String nama, String habitat, int jumlahKaki) {
        super(nama, habitat, jumlahKaki);
        this.jenisSayap = "Tidak diketahui";
    }

    public Insekta(String nama, String habitat, int jumlahKaki, String jenisSayap) {
        super(nama, habitat, jumlahKaki);
        this.jenisSayap = jenisSayap;
    }
    
    @Override
    public void bergerak() {
        System.out.println(nama + " terbang dengan sayap " + jenisSayap + ".");
    }

    @Override
    public String toString() {
        return super.toString() + ", Jenis Sayap: " + jenisSayap;
    }
}
