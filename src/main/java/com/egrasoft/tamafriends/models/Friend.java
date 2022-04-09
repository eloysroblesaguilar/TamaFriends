package com.egrasoft.tamafriends.models;

import javax.persistence.*;

@Entity
@Table(name = "friends")
public class Friend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private int health;

    @Column
    private int hunger;

    @Column
    private int cleanliness;

    @Column
    private int bowels;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Friend() {
    }

    public Friend(String name, int health, int hunger, int cleanliness, int bowels, User user) {
        this.name = name;
        this.health = health;
        this.hunger = hunger;
        this.cleanliness = cleanliness;
        this.bowels = bowels;
        this.user = user;
    }

    public Friend(Long id, String name, int health, int hunger, int cleanliness, int bowels, User user) {
        this.id = id;
        this.name = name;
        this.health = health;
        this.hunger = hunger;
        this.cleanliness = cleanliness;
        this.bowels = bowels;
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getCleanliness() {
        return cleanliness;
    }

    public void setCleanliness(int cleanliness) {
        this.cleanliness = cleanliness;
    }

    public int getBowels() {
        return bowels;
    }

    public void setBowels(int bowels) {
        this.bowels = bowels;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
