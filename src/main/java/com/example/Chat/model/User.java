package com.example.Chat.model;

import com.example.Chat.config.AbstractAuditingEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

import java.util.UUID;

@Data
@Entity
@Table(name = User.TABLE_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class User extends AbstractAuditingEntity {

    public static final String TABLE_NAME= "users";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID ID;

    @NotNull
    public String phone;

    public String name;

    public String email;

    @JsonIgnore
    private Boolean isEnabled= true ;

    @OneToOne
    @JoinColumn(name = "roles_id")
    public  Roles role;

    @OneToOne
    @JoinColumn(name = "country_id")
    public Country country;

}
