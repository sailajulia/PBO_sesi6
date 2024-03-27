package BangunRuang;
import BangunDatar.Persegi;

public class Kubus extends Persegi implements Geometri {
    public Kubus(double sisi) {
        super(sisi);
    }

    @Override
    public double volume() {
        return luasAlas() * getSisi();
    }

    @Override
    public double luasPermukaan() {
        return 6 * luasAlas();
    }
}
