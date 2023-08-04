public class Kitap {
    public String kitapAdi,yazar;

    private int sayfaSayisi;

    public Kitap(String kitapAdi, String yazar, int sayfaSayisi) {
        this.kitapAdi = kitapAdi;
        this.yazar = yazar;
        if(sayfaSayisi<1){
            this.sayfaSayisi = 0;
        }else {
            this.sayfaSayisi = sayfaSayisi;
        }
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        if(sayfaSayisi<1){
            this.sayfaSayisi = 0;
        }else {
            this.sayfaSayisi = sayfaSayisi;
        }
    }
}
