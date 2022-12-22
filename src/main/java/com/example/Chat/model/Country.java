package com.example.Chat.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = Country.TABLE_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {

    public static final String TABLE_NAME= "countries";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

       public String iso;
       public String name;
       public String nicename;
       public String iso3;
       public Integer numcode;
       public Integer phonecode;
}
