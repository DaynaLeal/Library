package com.library.speedreader.models;

//import java.util.List;
import javax.persistence.*;


@Entity
@Table(name = "inputs")
public class InputString {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="input_string", columnDefinition="TEXT")
    private String inputString;

    public InputString (String inputString) {
        this.inputString = inputString;
    }

    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }
}
