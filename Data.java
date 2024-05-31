import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    public ArrayList<Tanaman> tanamans;
    public ArrayList<Integer> lokasi;
    public Scanner in;

    public Data() {
        tanamans = new ArrayList<>();
        lokasi = new ArrayList<>();
        in = new Scanner(System.in);
    }

    public void mulai() {
        System.out.println("Program mulai...");
        
    }

    public void menanam() {
        System.out.println("Menanam tanaman...");
        
    }

    public void info() {
        System.out.println("Informasi tanaman:");
        for (int i = 0; i < tanamans.size(); i++) {
            System.out.println("Tanaman: " + tanamans.get(i) + ", Lokasi: " + lokasi.get(i));
        }
    }

    public static void main(String[] args) {
        Data data = new Data();
        data.mulai();
        data.menanam();
        data.info();
    }
}

class Tanaman {
    private String nama;

    public Tanaman(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return nama;
    }
}
