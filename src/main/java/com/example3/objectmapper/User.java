package com.example3.objectmapper;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    private String name;
    private int age;
    @JsonProperty("phone_number")
    private String phoneNumber;

    public User() { // default 생성자
        this.name = null;
        this.age = 0;
        this.phoneNumber = null;
    }
    public User(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // object mapper 가 참조하는 클래스에는 메서드명에 임의로 get을 붙이면 안된다.
//    public User getDefaultUser() {
//        return new User("default", 0);
//    }

    public User defaultUser() {
        return new User("default", 0, "010-1111-2222");
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

}
