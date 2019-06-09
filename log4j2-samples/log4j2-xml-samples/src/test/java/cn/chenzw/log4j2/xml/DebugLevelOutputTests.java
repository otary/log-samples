package cn.chenzw.log4j2.xml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class DebugLevelOutputTests {

    @Test
    public void test(){
        DebugLevelOutput debugLevelOutput = new DebugLevelOutput();
        debugLevelOutput.print();
    }
}
