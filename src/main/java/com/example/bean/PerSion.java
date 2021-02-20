package com.example.bean;

import java.util.Objects;

public class PerSion {
    private String name;
    private Integer age;
    private String code;

    public PerSion() {
        System.out.println("无参构造");
    }

    public PerSion(String name, Integer age) {
        System.out.println("有参构造1");
        this.name = name;
        this.age = age;
    }

    public PerSion(String name, Integer age, String code) {
        System.out.println("有参构造2");
        this.name = name;
        this.age = age;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PerSion perSion = (PerSion) o;
        return age == perSion.age &&
                Objects.equals(name, perSion.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode()+age.hashCode();
    }


    private String addUser(String name){

        return name +"岁";
    }
}
