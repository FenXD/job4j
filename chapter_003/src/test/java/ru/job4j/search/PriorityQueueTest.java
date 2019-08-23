package ru.job4j.search;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Tests for PriorityQueue
 * @author Maksim
 * @since 0.1
 * @version $Id$
 */
public class PriorityQueueTest {
    @Test
    public void whenAddHigherPriority() {
        PriorityQueue pq = new PriorityQueue();
        pq.put(new Task(2, "Second"));
        pq.put(new Task(1, "First"));
        pq.put(new Task(5, "Fifth"));
        assertThat(pq.take().getDesc(), is("First"));
    }
}
