package Uppgift17;

public class Artikel {
    private String artikelNamn;
    private int kvantitet = 0, totaltVarde;
    private double prisPerArtikel = 0.0;
    static int antalInstanser, totalsumman;
    public Artikel (String artikelNamn, int kvantitet, double prisPerArtikel){
        this.artikelNamn = artikelNamn;
        this.kvantitet = kvantitet;
        this.prisPerArtikel = prisPerArtikel;
        antalInstanser++;
        totalsumman += prisPerArtikel;
    }

    public void calculateAmount(){
        totaltVarde = kvantitet * (int) prisPerArtikel;
        if (totaltVarde < 0){
            totaltVarde = 0;
        }
    }

    public String getArtikelNamn() {
        return artikelNamn;
    }

    public void setArtikelNamn(String artikelNamn) {
        this.artikelNamn = artikelNamn;
    }

    public int getKvantitet() {
        return kvantitet;
    }

    public void setKvantitet(int kvantitet) {
        this.kvantitet = kvantitet;
    }

    public double getPrisPerArtikel() {
        return prisPerArtikel;
    }

    public void setPrisPerArtikel(double prisPerArtikel) {
        this.prisPerArtikel = prisPerArtikel;
    }

    public int getTotaltVarde() {
        return totaltVarde;
    }
}
