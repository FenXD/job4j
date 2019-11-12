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

    /**
     * добавление заявки
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        items.add(item);
        return item;
    }

    /**
     * Поиск элемента массива по ID
     * @param id - идентификатор для поиска
     * @return элемент массива
     */
    public Item findById(String id) {
        Item result = null;
        for (int i = 0; i < this.items.size(); i++) {
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
        for (int i = 0; i < this.items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
                items.remove(i);
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
        for (int i = 0; i < this.items.size(); i++) {
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
    public List<Item> findByName(String key) {
        int count = 0;
        List<Item> result = new ArrayList<Item>();
        for (int i = 0; i < this.items.size(); i++) {
            if (items.get(i).getName().equals(key)) {
                result.add(items.get(i));
            }
        }
        return result;
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