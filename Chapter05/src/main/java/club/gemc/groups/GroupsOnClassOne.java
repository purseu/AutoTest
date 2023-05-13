package club.gemc.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClassOne {

    public void student1() {
        System.out.println("GroupsOnClassOne.student1 running...");
    }

    public void student2() {
        System.out.println("GroupsOnClassOne.student2 running...");
    }
}
