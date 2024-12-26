package soal2;

public class Anjing extends HewanPeliharaan{
	private String warnaBulu;
    private String[] kemampuan;

    public Anjing(String n, String r, String w, String[] k) {
        super(r, n);
        this.warnaBulu = w;
        this.kemampuan = k;
    }

    public void displayDetailAnjing() {
        super.display();
        System.out.println("Memiliki warna bulu: " + warnaBulu);
        System.out.print("Dan kemampuan: ");
        for (String kemampuan : this.kemampuan) {
            System.out.print(kemampuan + " ");
        }
        System.out.println();
    }
}
