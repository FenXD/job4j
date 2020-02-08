package ru.job4j.search;

/**
 * Task for PriorityQueue
 * @author Maksim
 * @since 0.1
 * @version $Id$
 */
public class Task implements Comparable<Task> {
    private int priority;
    private String desc;

    public Task(int priority, String desc) {
        this.priority = priority;
        this.desc = desc;
    }

    public int getPriority() {
        return priority;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public int compareTo(Task t) {
        return Integer.compare(this.priority, t.getPriority());
    }
}
