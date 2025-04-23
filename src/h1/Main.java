package h1;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Test2");


       Textbook textbook1 = new Textbook(2020, "Diff. Rechnung", "me", "Mathe");

        System.out.println(textbook1.getInfo());


        Publication publication1 = new Publication(2020, "Data Structure");


        System.out.println(publication1.getInfo());
    }


}