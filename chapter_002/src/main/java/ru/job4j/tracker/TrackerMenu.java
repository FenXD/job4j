package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class TrackerMenu {
    private Input input;
    private Tracker tracker;
    public int[] range;

    private List<UserAction> actions = new ArrayList<>();

    public TrackerMenu(Input input, Tracker tracker) {
        this.tracker = tracker;
        this.input = input;
    }

    public void show() {
        for (UserAction action:actions) {
            if (action != null) {
                System.out.print(action.key() + ". ");
                System.out.println(action.info());
            }
        }
    }

    public int getActionLength() {
        return this.actions.size();
    }
    public void fillActions() {
        this.actions.add(new AddItem(1, "Add new Item"));
        this.actions.add(new ShowAll(2, "Show all items"));
        this.actions.add(new EditItem(3, "Edit Item"));
        this.actions.add(new DeleteItem(4, "Delete item"));
        this.actions.add(new FindById(5, "Find item by id"));
        this.actions.add(new FindByName(6, "Find item by name"));
        this.range = new int[this.getActionLength()];
        for (int i = 1; i <= range.length; i++) {
            range[i - 1] = i;
        }

    }
    public void select(int key) {
        this.actions.get(key - 1).execute(this.input, this.tracker);
    }
}
