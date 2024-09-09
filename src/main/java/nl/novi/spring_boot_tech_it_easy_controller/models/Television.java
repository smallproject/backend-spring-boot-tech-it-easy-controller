package nl.novi.spring_boot_tech_it_easy_controller.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity(name = "televisions")
public class Television {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String brand;
    private double price;
    private int currentStock;
    private int sold;
    private Date localDate;
    private String type;

    private double height;
    private double width;
    private String screenQuality;
    private String screenType;
    private Boolean wifi;
    private Boolean smartTv;
    private Boolean voiceControl;
    private Boolean hdr;
}
