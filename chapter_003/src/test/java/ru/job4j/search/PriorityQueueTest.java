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
        pq.put(new Task(5, "high5"));
        pq.put(new Task(1, "urgent"));
        pq.put(new Task(3, "middle"));
        pq.put(new Task(5, "low5"));
        pq.put(new Task(8, "low8"));
        pq.put(new Task(2, "urgent"));
        assertThat(pq.take().getDesc(), is("urgent"));
    }
}
