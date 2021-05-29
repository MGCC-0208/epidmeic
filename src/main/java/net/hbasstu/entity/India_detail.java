package net.hbasstu.entity;

import lombok.Data;

import java.util.Date;

@Data
public class India_detail {
    int sno;
    Date date;
    Date time;
    String state;
    int cured;
    int deaths;
    int confirmed;

    public int getSno() {
        return sno;
    }

    public Date getDate() {
        return date;
    }

    public Date getTime() {
        return time;
    }

    public String getState() {
        return state;
    }

    public int getCured() {
        return cured;
    }

    public int getDeaths() {
        return deaths;
    }

    public int getConfirmed() {
        return confirmed;
    }
}
