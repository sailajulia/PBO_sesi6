package BangunDatar;

public class SegitigaSikuSiku extends SegitigaSembarang {
    public SegitigaSikuSiku(double alas, double tinggi) {
        super(alas, tinggi);
    }

    @Override
    public double luas() {
        return (alas * tinggi) / 2;
    }

    @Override
    public double keliling() {
        return alas + tinggi + Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
    }
}
