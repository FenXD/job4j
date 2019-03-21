package ru.job4j.tracker;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Тестировние работы пользователя с приложением
 * @author Maksim Katorgin
 * @since 0.1
 * @version $Id$
 */
public class StartUITest {

    @Test
    public void whenAddNewItemToTrackerThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[] {"1", "name", "Discr", "123", "0"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("name"));
    }

    @Test
    public void whenChangingNameOfItemThenTrackerHasChangedName() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("name", "discr", 12L));
        Input input = new StubInput(new String[] {"3", item.getId(), "new name", "new descr", "21", "0"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("new name"));
    }

    @Test
    public void whenDeleteOneOfTwoThenOneLasts() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("name", "descr", 12L));
        tracker.add(new Item("secname", "secdescr", 123L));
        Input input = new StubInput(new String[] {"4", item.getId(), "0"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("secname"));
    }
}
