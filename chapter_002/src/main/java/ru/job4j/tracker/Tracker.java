package ru.job4j.tracker;


import java.util.Arrays;

/**
 * @author Maksim Katorgin
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    private final Item[] items = new Item[100];
    private int position = 0;

    /**
     * добавление заявки
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
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
            if (items[i].getId().equals(id)) {
                result = items[i];
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
            if (this.items[i].getId().equals(id)) {
                System.arraycopy(this.items, i + 1, this.items, i, this.position - i - 1);
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
            if (this.items[i].getId().equals(id)) {
                task.setId(this.items[i].getId());
                this.items[i] = task;
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
    public Item[] findAll() {
        return Arrays.copyOf(this.items, position);
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
            if (items[i].getName().equals(key)) {
                result[count++] = items[i];
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