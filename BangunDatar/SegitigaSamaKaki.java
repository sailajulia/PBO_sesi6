package BangunDatar;

public class SegitigaSamaKaki extends SegitigaSembarang {
    public SegitigaSamaKaki(double alas, double tinggi) {
        super(alas, tinggi);
    }

    @Override
    public double luas() {
        return (alas * tinggi) / 2;
    }

    @Override
    public double keliling() {
        return alas + 2 * Math.sqrt(Math.pow(alas / 2, 2) + Math.pow(tinggi, 2));
    }
}
