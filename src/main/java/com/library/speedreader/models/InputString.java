package com.library.speedreader.models;

import javax.persistence.*;


@Entity
@Table(name = "inputs")
public class InputString {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="input_string", columnDefinition="TEXT")
    private String inputString;

    //constructors
    public InputString(){}

    public InputString (long id, String inputString) {
        this.id = id;
        this.inputString = inputString;
    }

    //getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }
}
