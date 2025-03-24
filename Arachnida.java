class Arachnida extends Arthropoda {
    private final boolean bisaBeracun;

    public Arachnida(String nama, String habitat) {
        super(nama, habitat, 8); // Default kaki 8
        this.bisaBeracun = false;
    }

    public Arachnida(String nama, String habitat, boolean bisaBeracun) {
        super(nama, habitat, 8);
        this.bisaBeracun = bisaBeracun;
    }

    
    @Override
    public void bergerak() {
        System.out.println(nama + " merayap dengan cepat.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Bisa Beracun: " + (bisaBeracun ? "Ya" : "Tidak");
    }
}