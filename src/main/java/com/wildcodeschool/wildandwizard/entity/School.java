package com.wildcodeschool.wildandwizard.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // indique l'objet doit être géré par Spring Data et que ses attributs doivent être convertis en colonnes de tables de BDD.
public class School {
@Id //indique que l'attribut devra être utilisé en tant que clé primaire dans la table correspondante à l'entité.
@GeneratedValue(strategy = GenerationType.IDENTITY) //indique que la valeur de l'id sera générée automatiquement, par incrémentation, lors de l'insertion dans la base de données. 
    private Long id;
    private String name;
    private Long capacity;
    private String country;

    public School() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}