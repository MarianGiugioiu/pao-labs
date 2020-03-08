public class patrat {
    private int lungime;
    private String culoare;

    public patrat(int lungime, String culoare) {
        this.lungime = lungime;
        this.culoare = culoare;
    }

    public int getLungime() {
        return lungime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void incrementLungime(int x){
        this.lungime += x;
    }
}

