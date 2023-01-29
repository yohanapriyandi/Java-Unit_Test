package ardha.studio.test;

import org.junit.jupiter.api.*;

@DisplayName("Information test")
public class InformatioinTest {
    @Test
    @Tags({
            @Tag("one"),
            @Tag("two")
    })
    @DisplayName("This is test 1")
    void test1(TestInfo info) {
        System.out.println(info.getDisplayName());
        System.out.println(info.getTags());
        System.out.println(info.getTestClass().orElse(null));
        System.out.println(info.getTestMethod().orElse(null));
    }
}
