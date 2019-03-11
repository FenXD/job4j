package ru.job4j.tracker;

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
        for (int i = 0; i < this.items.length; i++) {
            if (items[i].getId().equals(id)) {
                result = items[i];
                break;
            }
        }
        return result;

    }

    /**
     * Нахождение позиции элемента в массиве
     * @param task - элемент поиска
     * @return - номер позициии в массива
     */
    public int inArrayId(Item task) {
        int result = -1;
        for (int i = 0; i < this.items.length; i++) {
            if (items[i].equals(task)) {
                result = i;
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
        int pos = this.inArrayId(this.findById(id));
        for (int i = pos; i < this.items.length; i++) {
            if (i == this.items.length - 1) {
                this.items[i] = null;
                result = true;
            } else {
                this.items[i] = this.items[i + 1];
                result = true;
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
        if (this.findById(id) != null) {
            Item old = this.findById(id);
            old.setName(task.getName());
            old.setTime(task.getTime());
            old.setDescr(task.getDiscr());
            result = true;
        }
        return result;
    }

    /**
     * Получение массива всех ненулевых элментов
     * @return массив ненулевых элементов
     */
    public Item[] findAll() {
        int count = 0;
        for (Item item:items) {
            if (item != null) {
                count += 1;
            }
        }
        Item[] result = new Item[count];
        System.arraycopy(this.items, 0, result, 0, count);
        return result;
    }

    /**
     * Поиск элементов по имени
     * @param key - имя для поиска
     * @return массив найденных элементов
     */
    public Item[] findByName(String key) {
        int count = 0;

        for (Item item : items) {
            if (item != null && item.getName().equals(key)) {
                count++;
            }
        }
        int position = 0;
        Item[] result = new Item[count];
        for (Item item:items) {
            if (item != null && item.getName().equals(key)) {
                result[position] = item;
                position++;
            }
        }
        return result;
    }

    /**
     * Уникальный ключ для заявки
     * @return Уникальный ключ.
     */
    private String generateId() {
        long id = System.currentTimeMillis();
        return Long.toString(id);
    }
}