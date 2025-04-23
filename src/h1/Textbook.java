package h1;

public class Textbook extends Book {

    private String subject;

    public Textbook(int year, String title, String author, String subject) {
        super(year, title, author);
        this.subject = subject;
    }


    @Override
    public String getInfo() {
        return super.getInfo() + String.format(", Subject: %s", subject);
    }


    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
}
