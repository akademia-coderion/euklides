package pl.coderion;

public class Euklides {

    public static int nwd(int a, int b) {
        if (a == b) {
            return a;
        }

        while (a != b) {
            if (a > b) {
                a = a - b;  // a -= b
            } else {
                b = b - a;
            }
        }

        return b;
    }

    public static int nww(int a, int b) {
        return (a * b) / nwd(a, b);
    }

    public static Ulamek uprosc(Ulamek u) {
        int nwdLM = nwd(u.getLicznik(), u.getMianownik());

        int nowyLicznik = u.getLicznik() / nwdLM;
        int nowyMianownik = u.getMianownik() / nwdLM;

        Ulamek wynikowy = new Ulamek(nowyLicznik, nowyMianownik);

        return wynikowy;
    }

    public static Ulamek dodaj(Ulamek u1, Ulamek u2) {
        int wspolnyMianownik = nww(u1.getMianownik(), u2.getMianownik());

        int nowyLicznik1 = u1.getLicznik() * (wspolnyMianownik / u1.getMianownik());
        int nowyLicznik2 = u2.getLicznik() * (wspolnyMianownik / u2.getMianownik());
        int nowyLicznik = nowyLicznik1 + nowyLicznik2;

        return uprosc(new Ulamek(nowyLicznik, wspolnyMianownik));
    }
}
