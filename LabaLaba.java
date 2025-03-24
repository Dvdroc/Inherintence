class LabaLaba extends Arachnida {
    private final String jenisJaring;

    public LabaLaba(String nama, String habitat) {
        super(nama, habitat, false);
        this.jenisJaring = "Tidak diketahui";
    }

    public LabaLaba(String nama, String habitat, boolean bisaBeracun, String jenisJaring) {
        super(nama, habitat, bisaBeracun);
        this.jenisJaring = jenisJaring;
    }


    @Override
    public void bergerak() {
        System.out.println(nama + " berjalan di jaring " + jenisJaring + ".");
    }

    @Override
    public String toString() {
        return super.toString() + ", Jenis Jaring: " + jenisJaring;
    }
}
