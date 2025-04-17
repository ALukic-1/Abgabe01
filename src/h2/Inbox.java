package h2;

import java.util.ArrayList;

public class Inbox {

    public ArrayList<Mail> mailList;




    public Inbox(){
        mailList = new ArrayList<>();
    }

    public void addMail( Mail m){
        mailList.add(m);
    }



    public void getMailHeader(){
        for (Mail x : mailList) {
            System.out.println(String.format("%s | %s | %s | %s ", x.getRead(), x.getSubject(), x.getSenderAddress(), x.getDaytime()));
        }
    }


    public void open(int index){
        if (index >= mailList.size()){
            System.out.println("Email does not exist");
        } else{
        System.out.println(mailList.get(index).getInfo());
        mailList.get(index).seen();}
    }

    public int countUnread(){
        int count =0;
        for (Mail m : mailList){
            if (!m.getRead()){
                count++;
            }
        }
        return count;

    }

}
