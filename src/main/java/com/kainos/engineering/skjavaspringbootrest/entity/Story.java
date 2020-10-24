package com.kainos.engineering.skjavaspringbootrest.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Story {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String description;
    private String sizing;
    private int estimate;

    public enum sizes {S,M,L,XL}
}
