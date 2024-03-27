package BangunRuang;
import BangunDatar.PersegiPanjang;

public class Balok extends PersegiPanjang implements Geometri {
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return luasAlas() * tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 2 * (luasAlas() + (getPanjang() * tinggi) + (getLebar() * tinggi));
    }
}
