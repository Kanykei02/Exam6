package com.company;

public class Student {
    private Long id;
    private String name;
    private Double averageRating;
    private int age;
    private String sex;

    public Student(){}

    public Student(Long id, String name, Double averageRating, int age, String sex) {
        this.id = id;
        this.name = name;
        this.averageRating = averageRating;
        this.age = age;
        this.sex = sex;
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

    public Double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Double averageRating) {
        this.averageRating = averageRating;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "id: " + getId() + ", name: " + getName() + ", average rating: " + getAverageRating() + ", age: " + getAge() + ", sex: " + getSex();
    }
}
