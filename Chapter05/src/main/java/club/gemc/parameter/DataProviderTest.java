package club.gemc.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age) {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData() {
        Object[][] o = new Object[][] {
                {"zhangsan", 10},
                {"lisi", 20},
                {"wangwu", 30}
        };
        return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name, int age) {
        System.out.println("test1 :" + "name = " + name);
        System.out.println("test1 :" + "age = " + age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name, int age){
        System.out.println("test2 :" + "name = " + name);
        System.out.println("test2 :" + "age = " + age);
    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] o = null;
        if (method.getName().equals("test1")) {
            o = new Object[][] {
                    {"张三", 20},
                    {"李四", 25}
            };
        } else if (method.getName().equals("test2")) {
            o = new Object[][] {
                    {"王五", 50},
                    {"赵六", 60}
            };
        }
        return o;
    }
}
