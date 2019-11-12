package ru.job4j.tracker;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Maksim Katorgin
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    private final List<Item> items = new ArrayList<Item>();
    private int position = 0;

    /**
     * добавление заявки
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        items.add(item);
        position++;
        return item;
    }

    /**
     * Поиск элемента массива по ID
     * @param id - идентификатор для поиска
     * @return элемент массива
     */
    public Item findById(String id) {
        Item result = null;
        for (int i = 0; i < this.position; i++) {
            if (items.get(i).getId().equals(id)) {
                result = items.get(i);
                break;
            }
        }
        return result;

    }


    /**
     * Удаление эемента массива
     * @param id идентификатор
     * @return удалось ли провести операцию
     */
    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < position; i++) {
            if (items.get(i).getId().equals(id)) {
                items.remove(i);
                //System.arraycopy(this.items, i + 1, this.items, i, this.position - i);
                position--;
                result = true;
                break;
            }
        }

        return result;
    }

    /**
     * Замена заявки
     * @param id - идентификатор заявки для замены
     * @param task - новая заявка
     * @return результат замены
     */
    public boolean replace(String id, Item task) {
        boolean result = false;
        for (int i = 0; i < this.position; i++) {
            if (items.get(i).getId().equals(id)) {
                task.setId(items.get(i).getId());
                items.add(i, task);
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Получение массива всех ненулевых элментов
     * @return массив ненулевых элементов
     */
    public List<Item> findAll() {
        return this.items;
    }

    /**
     * Поиск элементов по имени
     * @param key - имя для поиска
     * @return массив найденных элементов
     */
    public Item[] findByName(String key) {
        int count = 0;
        Item[] result = new Item[position];
        for (int i = 0; i < position; i++) {
            if (items.get(i).getName().equals(key)) {
                result[count++] = items.get(i);
            }
        }
        return Arrays.copyOf(result, count);
    }

    /**
     * Уникальный ключ для заявки
     * @return Уникальный ключ.
     */
    private String generateId() {
        long rand = (long) Math.random();
        long id = System.currentTimeMillis() + rand;
        return Long.toString(id);
    }
}