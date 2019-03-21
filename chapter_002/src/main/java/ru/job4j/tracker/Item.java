package ru.job4j.tracker;

import java.util.Objects;

public class Item {
    private String id;
    private String name;
    private String description;
    private long time;

    public Item(String name, String descr, long time) {
        this.name = name;
        this.description = descr;
        this.time = time;
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDiscr() {
        return this.description;
    }
    public void setDescr(String desc) {
        this.description = desc;
    }
    public long getTime() {
        return this.time;
    }
    public void setTime(long time) {
        this.time = time;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return time == item.time
                && Objects.equals(id, item.id)
                && Objects.equals(name, item.name)
                && Objects.equals(description, item.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, time);
    }

    /**
     * Вывод информации об объекте
     * @return вывод информации об объекте
     */
    public String toString() {
        return "ID: " + this.id
                + "\nName: " + this.name
                + "\nDiscroption: " + this.description
                + "\nTime: " + this.time;
    }


}
