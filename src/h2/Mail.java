package h2;

import java.time.LocalDateTime;

public class Mail {

        private String senderAddress;
        private String subject;
        private String message;
        private LocalDateTime daytime;
        private boolean read = false;



    public void seen(){
        setRead(true);
    }


    //print Mail
    public String getInfo(){
        return String.format("%s from %s on %s : %s", subject, senderAddress, daytime, message);
    }





    //Konstruktor
    public Mail (String senderAddress, String subject, String message, LocalDateTime daytime) {
        this.senderAddress = senderAddress;
        this.subject = subject;
        this.message = message;
        this.daytime =  LocalDateTime.now();
        this.read = false;
    }




    //Setter
    public void setSenderAddress(String senderAddress){
        this.senderAddress = senderAddress;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public void setDaytime(LocalDateTime daytime){
        this.daytime = daytime;
    }

    public void setRead(boolean read){
        this.read = read;
    }


    //getter

    public String getSenderAddress(){
        return senderAddress;
    }
    public String getSubject(){
        return subject;
    }
    public String getMessage(){
        return message;
    }
    public LocalDateTime getDaytime(){
        return daytime;
    }
    public boolean getRead(){
        return read;
    }
}
