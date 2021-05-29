package net.hbasstu.entity;

import lombok.Data;

import java.util.Date;

@Data
public class India_month {
    int sno;
    Date date;
    Date total_cases;
    int discharged;
    int deaths_count;
}
