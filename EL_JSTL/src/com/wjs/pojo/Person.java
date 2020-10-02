package com.wjs.pojo;

import java.util.List;
import java.util.Map;

public class Person {
    private String name;
    private String[] phones;
    private List<String> city;
    private Map<String,Object> map;

    public Person() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Person(String name, String[] phones, List<String> city, Map<String, Object> map) {
        this.name = name;
        this.phones = phones;
        this.city = city;
        this.map = map;
    }

    public String[] getPhones() {
        return phones;
    }

    public void setPhones(String[] phones) {
        this.phones = phones;
    }

    public List<String> getCity() {
        return city;
    }

    public void setCity(List<String> city) {
        this.city = city;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", phones='" + phones + '\'' +
                ", city=" + city +
                ", map=" + map +
                '}';
    }
}
