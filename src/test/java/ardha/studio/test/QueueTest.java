package ardha.studio.test;

import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.Queue;

@DisplayName("a Queue")
public class QueueTest {
    private Queue<String> queue;

    @Nested
    @DisplayName("WhenNew")
    public class WhenNew{

        @BeforeEach
        void setUp(){
            queue = new LinkedList<>();
        }

        @Test
        @DisplayName("when offer, size must be 1")
        void offerNewData(){
            queue.offer("yohan");
            Assertions.assertEquals(1, queue.size());
        }

        @Test
        @DisplayName("when offer 2 bata, size must be 2")
        void offerMoreData(){
            queue.offer("yohan");
            queue.offer("apriyandi");
            Assertions.assertEquals(2, queue.size());
        }


    }

}
