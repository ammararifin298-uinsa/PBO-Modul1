// Interface Segregation & Dependency Inversion
interface Hewan {
    void bersuara();
}

// SRP: Class hanya punya satu tanggung jawab
class Anjing implements Hewan {
    @Override
    public void bersuara() {
        System.out.println("Guk guk!");
    }
}

class Kucing implements Hewan {
    @Override
    public void bersuara() {
        System.out.println("Meong!");
    }
}

// DIP: Pemilik bergantung pada abstraksi (Hewan), bukan implementasi
class Pemilik {
    private Hewan hewan;

    public Pemilik(Hewan hewan) {
        this.hewan = hewan;
    }

    public void panggilHewan() {
        hewan.bersuara();
    }
}

public class Soal5_SOLID {
    public static void main(String[] args) {
        Hewan anjing = new Anjing();
        Hewan kucing = new Kucing();

        Pemilik pemilik1 = new Pemilik(anjing);
        Pemilik pemilik2 = new Pemilik(kucing);

        pemilik1.panggilHewan(); // Guk guk!
        pemilik2.panggilHewan(); // Meong!
    }
}
