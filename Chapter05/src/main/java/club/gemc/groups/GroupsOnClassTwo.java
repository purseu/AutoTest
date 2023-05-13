package club.gemc.groups;

import org.testng.annotations.Test;

@Test(groups = {"stu"})
public class GroupsOnClassTwo {

    public void student1(){
        System.out.println("GroupsOnClassTwo.student1 running...");
    }

    public void student2() {
        System.out.println("GroupsOnClassTwo.student2 running...");
    }
}
