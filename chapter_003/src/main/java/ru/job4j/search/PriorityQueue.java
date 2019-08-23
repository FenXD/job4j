package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Method for add task into queue
     * @param task - task for queue
     */
    public void put(Task task) {
        if (tasks.size() != 0) {
            if (task.getPriority() >= tasks.getLast().getPriority()) {
            tasks.add(tasks.size(), task);
            return;
        }
            for (int index = 0; index < tasks.size(); index++) {

                if (task.getPriority() <= tasks.get(index).getPriority()) {
                    tasks.add(index, task);
                    break;
                }
            }
        } else {
            tasks.add(0, task);
        }
    }

    /**
     * Getting the most priority task
     * @return - first task in list
     */
    public Task take() {
        return this.tasks.poll();
    }
}
