package ch.nostromo.xmlresponsetest.dto;


import java.util.Date;

public class MyCoolObject {

    public MyCoolObject(String text, Date date) {
        this.text = text;
        this.date = date;
    }

    String text;

    Date date;
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
