package h2;

import java.time.LocalDateTime;

public class Mail {

        private String senderAddress;
        private String subject;
        private String message;
        private LocalDateTime datetime;
        private boolean read = false;



    public void seen(){
        setRead(true);
    }


    //print Mail
    public String getInfo(){
        return String.format("%s from %s on %s : %s", subject, senderAddress, datetime, message);
    }





    //Konstruktor
    public Mail (String senderAddress, String subject, String message, LocalDateTime datetime) {
        this.senderAddress = senderAddress;
        this.subject = subject;
        this.message = message;
        this.datetime =  datetime.now();
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
    public void setDatetime(LocalDateTime datetime){
        this.datetime = datetime;
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
    public LocalDateTime getDatetime(){
        return datetime;
    }
    public boolean getRead(){
        return read;
    }
}
