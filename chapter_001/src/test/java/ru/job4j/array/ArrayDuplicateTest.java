package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;

/**
 * Тестирование удаления дабликатов
 * @author Maksim Katorgin
 * @since 0.1
 * @version $Id$
 */
public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicates() {
        ArrayDuplicate array = new ArrayDuplicate();
        String[] duplicates = new String[] {"1", "2", "2"};
        String[] expect = new String[] {"1", "2"};
        assertThat(array.remove(duplicates), arrayContainingInAnyOrder(expect));
    }
}
