package pl.coderion;

public class Ulamek {

    private int licznik;

    private int mianownik;

    public Ulamek() {
    }

    public Ulamek(int licznik, int mianownik) {
        this.licznik = licznik;
        this.mianownik = mianownik;
    }

    public int getLicznik() {
        return licznik;
    }

    public void setLicznik(int licznik) {
        this.licznik = licznik;
    }

    public int getMianownik() {
        return mianownik;
    }

    public void setMianownik(int mianownik) {
        this.mianownik = mianownik;
    }

    @Override
    public String toString() {
        return "[" + licznik + "/" + mianownik + "]";
    }
}