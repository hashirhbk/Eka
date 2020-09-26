package com.example.demo;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(unique = true)
    private String email;

//    public List<Place> getPlaceList() {
//        return placeList;
//    }
//
//    public void setPlaceList(List<Place> placeList) {
//        this.placeList = placeList;
//    }
//    @ManyToMany(targetEntity = Place.class, mappedBy = "user", cascade = CascadeType.ALL)
//    private List<Place> placeList;

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String name;

    public Contact() {

    }

    public Contact(String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
