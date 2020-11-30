package com.example.bean;

import java.util.Objects;

public class PerSion {
    private String name;
    private Integer age;

    public PerSion() {
    }

    public PerSion(String name, int age) {
        this.name = name;
        this.age = age;
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
}
