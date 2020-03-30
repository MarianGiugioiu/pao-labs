import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Album implements Comparable<Album>{
    String nume;
    int anulPublicarii;
    int rating;

    public Album(String nume, int anulPublicarii, int rating) {
        this.nume = nume;
        this.anulPublicarii = anulPublicarii;
        this.rating = rating;
    }

    public String getNume() {
        return nume;
    }

    public int getAnulPublicarii() {
        return anulPublicarii;
    }

    public int getRating() {
        return rating;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setAnulPublicarii(int anulPublicarii) {
        this.anulPublicarii = anulPublicarii;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public int compareTo(Album o) {
        if (this.nume.compareTo(o.nume) == 0) {
            if (this.rating == o.rating){
                return 0;
            } else if (this.rating < o.rating) {
                return -1;
            }
            return 1;
        }
        return this.nume.compareTo(o.nume);
    }

    @Override
    public String toString() {
        return "Album{" +
                "nume='" + nume + '\'' +
                ", anulPublicarii=" + anulPublicarii +
                ", rating=" + rating +
                '}';
    }

    public static void main(String[] args) {
        List<Album> list = new ArrayList<Album>();
        list.add(new Album("asd", 2020, 7));
        list.add(new Album("asd", 2019, 3));
        list.add(new Album("acd", 2018, 5));
        list.add(new Album("aadc", 2017, 1));
        System.out.println(list);
        Collections.sort(list);
        System.out.println();
        System.out.println(list);
    }
}
