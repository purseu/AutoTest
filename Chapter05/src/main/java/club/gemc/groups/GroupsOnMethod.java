package club.gemc.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = { "server" })
    public void testServer1(){
        System.out.println("这是服务端测试1...");
    }

    @Test(groups = { "server" })
    public void testServer2() {
        System.out.println("这是服务端测试2...");
    }

    @Test(groups = { "client" })
    public void testClient1() {
        System.out.println("这是客户端测试1...");
    }

    @BeforeGroups(groups = "server")
    public void beforeServerOnMethod() {
        System.out.println("Before Server running...");
    }

    @AfterGroups(groups = "server")
    public void afterServerOnMethod() {
        System.out.println("After Server running...");
    }
}
