package com.diodi.boot.bean;

/**
 * @author diodi
 * @create 2021-05-29-20:52
 */
public class Pet {

    private String name;

    public Pet() {

    }

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{"+"name='"+name+'\''+'}';
    }

}
