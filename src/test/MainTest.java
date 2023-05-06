import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void plus() {
        int result = Calculator.plus(1, 2);
        assertEquals(3, result);
    }

    @Test
    void 롬테스트() {
        String name = "aaa";
        int age = 1;

        LomTest a = new LomTest();

        a.setName(name);
        a.setAge(age);

        assertEquals(a.getName(), name);
        assertEquals(a.getAge(), age);
    }
}