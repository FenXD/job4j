package ru.job4j.tracker;

public abstract class BaseAction implements UserAction {
    private int number;
    private String info;

    public BaseAction(int key, String info) {
        this.number = key;
        this.info = info;
    }
    public int key() {
        return this.number;
    }

    public String info() {
        return this.info;
    }

}
