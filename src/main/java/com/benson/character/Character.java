package com.benson.character;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Character {

    @Id
    @SequenceGenerator(
            name = "character_sequence",
            sequenceName = "character_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "character_sequence"
    )
    Long id;
    String name;
    String gender;
    LocalDate dob;
    String homeTown;
    String desc;

    public Character() {
    }

    public Character(Long id, String name, String gender, LocalDate dob, String homeTown, String desc) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.homeTown = homeTown;
        this.desc = desc;
    }

    public Character(String name, String gender, LocalDate dob, String homeTown, String desc) {
        this.name = name;
        this.dob = dob;
        this.homeTown = homeTown;
        this.desc = desc;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dob=" + dob +
                ", homeTown='" + homeTown + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

