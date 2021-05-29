package net.hbasstu.entity;

import lombok.Data;

import java.util.Date;

public class India_day {
    int sno;
    Date date;
    Date total_cases;
    int discharged;
    int deathsCount;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTotal_cases() {
        return total_cases;
    }

    public void setTotal_cases(Date total_cases) {
        this.total_cases = total_cases;
    }

    public int getDischarged() {
        return discharged;
    }

    public void setDischarged(int discharged) {
        this.discharged = discharged;
    }

    public int getDeaths_count() {
        return deathsCount;
    }

    public void setDeaths_count(int deathsCount) {
        this.deathsCount = deathsCount;
    }
}
