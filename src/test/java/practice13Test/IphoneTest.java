package practice13Test;

import junit.framework.TestCase;
import org.junit.Test;
import practice13.iPhone;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class IphoneTest {
    iPhone iphone = new iPhone("11", "12 MP", "FID");

    @Test
    public void getTypeTest() {
        assertEquals("11", iphone.getType());
    }

    @Test
    public void getCameraSpecsTest() {
        assertEquals("12 MP", iphone.getCameraSpecs());
    }

    @Test
    public void setCameraSpecsTest() {
        iphone.setCameraSpecs("12");
        assertEquals("12", iphone.getCameraSpecs());
    }

    @Test
    public void callTest() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        iphone.call("911");

        String expected = "Calling to 911 from iPhone...";

        TestCase.assertEquals("Output of call method", expected, out.toString().replace("\n", "").replace("\r", ""));
    }

    @Test
    public void textTest() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        iphone.text("911", "A");

        String expected = "Sending a message \"A\" to 911 from iPhone...";

        TestCase.assertEquals("Output of text method", expected, out.toString().replace("\n", "").replace("\r", ""));
    }

    @Test
    public void takePhotoTest() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        iphone.takePhoto();

        String expected = "Taking a photo from iPhone 11 with 12 MP";

        TestCase.assertEquals("Output of takePhoto method", expected, out.toString().replace("\n", "").replace("\r", ""));
    }

    @Test
    public void unlockTest() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        iphone.unlock();

        String expected = "Unlocking using FID";

        TestCase.assertEquals("Output of unlock method", expected, out.toString().replace("\n", "").replace("\r", ""));

    }
}
