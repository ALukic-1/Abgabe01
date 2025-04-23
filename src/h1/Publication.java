package h1;

public class Publication {

    private String title;
    private int year;

    public String getInfo() {
        String info = String.format("Title: %s, published in %d", title, year);
        return info;
    }

    public Publication(int year, String title) {
        this.year = year;
        this.title = title;
    }

    //Getter
    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    //Setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
