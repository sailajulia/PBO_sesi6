package BangunDatar;

public class SegitigaSamaSisi extends SegitigaSamaKaki {
    public SegitigaSamaSisi(double alas) {
        super(alas, (alas * Math.sqrt(3)) / 2);
    }

    @Override
    public double luas() {
        return (alas * tinggi) / 2;
    }

    @Override
    public double keliling() {
        return 3 * alas;
    }
}
