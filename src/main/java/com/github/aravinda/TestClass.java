package com.github.aravinda;


import org.testng.annotations.Test;

@Deprecated
public class TestClass extends Driver{

    @DriverSettings(
            OS = DriverSet.OS.LINUX,
            WINDOW_SIZE = DriverSet.WINDOW_SIZE.DEFAULT,
            BASE_URL = "https://www.check24.de/",
            IMPLICIT_WAIT = 100
    )

    @Test
    public void sampleTest() {
    }

}
