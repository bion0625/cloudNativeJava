package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Cat {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Cat() {}

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" + "id=" + this.id + ", name='" + this.name + '\'' + '}';
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
