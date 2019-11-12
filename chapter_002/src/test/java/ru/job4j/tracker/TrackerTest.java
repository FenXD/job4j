package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1", "testDescription", created);
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2", "testDescription2", 1234L);
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.replace(previous.getId(), next);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(true, is(tracker.replace(previous.getId(), next)));
    }

    @Test
    public void whenDeleteOneThenDeleted() {
        Tracker tracker = new Tracker();
        Item first = new Item("first", "first", 123L);
        Item second = new Item("second", "second", 1234L);
        tracker.add(first);
        tracker.add(second);
        assertThat(true, is(tracker.delete(second.getId())));
    }

    @Test
    public void wherAddTwoElementsThenFindAllLengthEqualsTwo() {
        Tracker tracker = new Tracker();
        Item first = new Item("first", "first", 123L);
        Item second = new Item("second", "second", 1234L);
        tracker.add(first);
        tracker.add(second);
        assertThat(2, is(tracker.findAll().size()));
    }

    @Test
    public void wherAddTwoElementsThenFindByNameLengthEqualsOne() {
        Tracker tracker = new Tracker();
        Item first = new Item("first", "first", 123L);
        Item second = new Item("second", "second", 1234L);
        tracker.add(first);
        tracker.add(second);
        assertThat(1, is(tracker.findByName("first").size()));
    }

    @Test
    public void whenAddTwoElementsThenFindByIdEqualsElementsId() {
        Tracker tracker = new Tracker();
        Item first = new Item("first", "first", 123L);
        Item second = new Item("second", "second", 1234L);
        tracker.add(first);
        tracker.add(second);
        assertThat(first, is(tracker.findById(first.getId())));
    }

}