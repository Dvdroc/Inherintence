public class Main {
    public static void main(String[] args) {
        Arthropoda arthropoda1 = new Arthropoda("Lipan", "Tanah", 30);
        Insekta insekta1 = new Insekta("Kupu-Kupu", "Hutan", 6, "Bersisik");
        Arachnida arachnida1 = new Arachnida("Kalajengking", "Padang Pasir", true);
        LabaLaba labalaba1 = new LabaLaba("Tarantula", "Hutan Tropis", true, "Jaring Tebal");
        Crustacea udang = new Crustacea("udang", "Air", 10, "Air Laut", false, false);

        System.out.println(arthropoda1);
        arthropoda1.bergerak();

        System.out.println(insekta1);
        insekta1.bergerak();

        System.out.println(arachnida1);
        arachnida1.bergerak();

        System.out.println(labalaba1);
        labalaba1.bergerak();

        System.out.println(udang);
        udang.bergerak();
    }
}
