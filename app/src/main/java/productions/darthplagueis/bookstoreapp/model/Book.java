package productions.darthplagueis.bookstoreapp.model;

import java.util.List;

/**
 * Created by oleg on 1/3/18.
 */

public class Book {
    private String id;
    private List<String> cat;
    private String name;
    private String author;
    private String series_t;
    private int sequence_i;
    private String genre_s;
    private boolean inStock;
    private int price;
    private int pages_i;

    public String getId() {
        return id;
    }

    public List<String> getCat() {
        return cat;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getSeries_t() {
        return series_t;
    }

    public int getSequence_i() {
        return sequence_i;
    }

    public String getGenre_s() {
        return genre_s;
    }

    public boolean isInStock() {
        return inStock;
    }

    public int getPrice() {
        return price;
    }

    public int getPages_i() {
        return pages_i;
    }
}
