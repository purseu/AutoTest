package club.gemc;

import org.testng.annotations.Test;

public class ExpectedException {

    // 一个测试结果会失败的异常测试

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed() {
        System.out.println("这是一个失败的异常测试");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess() {
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }
}
