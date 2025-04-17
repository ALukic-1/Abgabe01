package h1;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Test2");


       Textbook textbook1 = new Textbook();

        textbook1.setSubject("Mathe");
        textbook1.setTitle("Diff. Rechnung");
        textbook1.setAuthor("me");
        textbook1.setYear(2020);

        System.out.println(textbook1.getInfo());



        Publication publication1 = new Publication();
        publication1.setTitle("Data Structure");
        publication1.setYear(2020);

        System.out.println(publication1.getInfo());
    }


}