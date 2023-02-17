
package java_with_sqlserver_Gui;


public class HarfNotAgirlik {
    private String harfnotu;
    private double agirlik;
    private int taban;
    private int tavan;

    public HarfNotAgirlik(String harfnotu, double agirlik, int taban, int tavan) {
        this.harfnotu = harfnotu;
        this.agirlik = agirlik;
        this.taban = taban;
        this.tavan = tavan;
    }

    public String getHarfnotu() {
        return harfnotu;
    }

    public void setHarfnotu(String harfnotu) {
        this.harfnotu = harfnotu;
    }

    public double getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(double agirlik) {
        this.agirlik = agirlik;
    }

    public int getTaban() {
        return taban;
    }

    public void setTaban(int taban) {
        this.taban = taban;
    }

    public int getTavan() {
        return tavan;
    }

    public void setTavan(int tavan) {
        this.tavan = tavan;
    }
}
