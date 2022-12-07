package com.codecademy.restorant.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    Integer id;

    @Column(unique=true)
    String name;



    Boolean interestedPeanut;

    Boolean interestedEgg;

    Boolean interestedDairy;

}
