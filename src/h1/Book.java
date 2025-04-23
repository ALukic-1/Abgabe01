package h1;

public class Book extends Publication {

    private String author;

    public Book(int year, String title, String author) {
        super(year, title);
        this.author = author;
    }

    @Override
    public String getInfo(){
        return super.getInfo() + String.format(", by: %s" , getAuthor());
    }










    public String getAuthor(){
       return author;
    }

    public void setAuthor(String author){
       this.author = author;
    }



}
