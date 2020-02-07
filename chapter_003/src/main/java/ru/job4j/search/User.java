package ru.job4j.search;

import java.util.Objects;

public class User implements Comparable<User> {
    private int id;
    private String name;
    private String city;
    private int age;

    public User(int id, String name, String city, int age) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return id == user.id
                && age == user.age
                && Objects.equals(name, user.name)
                && Objects.equals(city, user.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, city, age);
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(User u) {
        return this.name.compareTo(u.getName()) == 0 ? Integer.compare(this.age, u.getAge()) : this.name.compareTo(u.getName());
    }
}
