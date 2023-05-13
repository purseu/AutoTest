package club.gemc.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass {

    public void teacher1() {
        System.out.println("GroupsOnClass.teacher1 running...");
    }

    public void teacher2() {
        System.out.println("GroupsOnClass.teacher2 running...");
    }
}
