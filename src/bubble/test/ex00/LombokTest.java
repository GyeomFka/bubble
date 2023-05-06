package bubble.test.ex00;

import lombok.Data;

import java.util.logging.Logger;

@Data
class Dog {
    private String name;
}
public class LombokTest {

    static Logger logger = Logger.getLogger(LombokTest.class.getName());
    public static void main(String[] args) {
        Dog d = new Dog();

        logger.info("###method");
        logger.warning("####");
    }
}
