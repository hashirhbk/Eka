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

    public List<Place> getPlaceList() {
        return places;
    }

    public void setPlaceList(List<Place> placeList) {
        this.places = placeList;
    }
    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(
            name = "places",
            joinColumns = @JoinColumn(name = "contact_id"),
            inverseJoinColumns = @JoinColumn(name = "place_id"))
    private List<Place> places;

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
