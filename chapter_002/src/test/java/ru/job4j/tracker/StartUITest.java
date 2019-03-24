package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Тестировние работы пользователя с приложением
 * @author Maksim Katorgin
 * @since 0.1
 * @version $Id$
 */
public class StartUITest {

    private final PrintStream stout = System.out;

    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private String menu = "1. Add new Item\n" + "2. Show all items\n" + "3. Edit item\n" + "4. Delete item\n" + "5. Find item by Id\n" + "6. Find items by name\n" + "0. Exit Program\r\n";

    @Before
    public void loarOut() {
        System.setOut(new PrintStream(this.out));
    }
    @After
    public void resetOut() {
        System.setOut(this.stout);
    }

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

    @Test
    public void whenTwoElementsAddedThenprintingTwoElements() {
        Tracker tracker = new Tracker();
        Item fitem = tracker.add(new Item("first", "first", 1L));
        Input input = new StubInput(new String[] {"2", "0"});
        new StartUI(input, tracker).init();
        assertThat(this.out.toString(), is(new StringBuilder()
                .append(menu)
                .append("ID: " + fitem.getId())
                .append("\nName: " + fitem.getName())
                .append("\nDiscroption: " + fitem.getDiscr())
                .append("\nTime: " + fitem.getTime())
                .append(System.lineSeparator())
                .append("__________________")
                .append(System.lineSeparator())
                .append(menu)
                .toString()));
    }
    @Test
    public void whenFindByIdThenPrint() {
        Tracker tracker = new Tracker();
        Item fitem = tracker.add(new Item("first", "first", 1L));
        Input input = new StubInput(new String[] {"5", fitem.getId(), "0"});
        new StartUI(input, tracker).init();
        assertThat(this.out.toString(), is(new StringBuilder()
                .append(menu)
                .append("ID: " + fitem.getId())
                .append("\nName: " + fitem.getName())
                .append("\nDiscroption: " + fitem.getDiscr())
                .append("\nTime: " + fitem.getTime())
                .append(System.lineSeparator())
                .append("__________________")
                .append(System.lineSeparator())
                .append(menu)
                .toString()));
    }

    @Test
    public void whenFindByNameThenPrint() {
        Tracker tracker = new Tracker();
        Item fitem = tracker.add(new Item("first", "first", 1L));
        Input input = new StubInput(new String[] {"6", "first", "0"});
        new StartUI(input, tracker).init();
        assertThat(this.out.toString(), is(new StringBuilder()
                .append(menu)
                .append("ID: " + fitem.getId())
                .append("\nName: " + fitem.getName())
                .append("\nDiscroption: " + fitem.getDiscr())
                .append("\nTime: " + fitem.getTime())
                .append(System.lineSeparator())
                .append("__________________")
                .append(System.lineSeparator())
                .append(menu)
                .toString()));
    }
}
