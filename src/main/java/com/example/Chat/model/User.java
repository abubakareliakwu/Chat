package com.example.Chat.model;

import com.Ebra_backend.config.AbstractAuditingEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
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
