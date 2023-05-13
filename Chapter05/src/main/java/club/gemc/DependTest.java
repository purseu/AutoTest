package club.gemc;

import org.testng.annotations.Test;

public class DependTest {

    @Test
    public void test1() {
        System.out.println("DependTest.test1");
    }

    @Test(dependsOnMethods = { "test1" })
    public void test2() {
        System.out.println("DependTest.test2 depend test1");
    }
}
