class Arthropoda {
    protected String nama;
    protected String habitat;
    protected int jumlahKaki;
    public Arthropoda(String nama, String habitat) {
        this.nama = nama;
        this.habitat = habitat;
        this.jumlahKaki = 0; // Default jika tidak disebutkan
    }

    public Arthropoda(String nama, String habitat, int jumlahKaki) {
        this.nama = nama;
        this.habitat = habitat;
        this.jumlahKaki = jumlahKaki;
    }

    public void bergerak() {
        System.out.println(nama + " sedang bergerak.");
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Habitat: " + habitat + ", Jumlah Kaki: " + jumlahKaki;
    }
}
