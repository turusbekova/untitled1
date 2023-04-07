package practice13Test;

import junit.framework.TestCase;
import org.junit.Test;
import practice13.Samsung;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

// * S20+
//         * Unlocking using FingerPrint
//         * Calling to 911 from Samsung...
//         * Sending a message "Help" to 101 from Samsung...
//         * Taking a photo from Samsung S20+ with 12 MP Ultra Wide; 108 MP Wide-Angle
//         * Samsung S20+ has external storage of size: 512

public class SamsungTest {
    Samsung samsung = new Samsung("S20+", "12 MP", "FingerPrint", 512);

    @Test
    public void getTypeTest() {
        assertEquals("S20+", samsung.getType());
    }

    @Test
    public void getCameraSpecsTest() {
        assertEquals("12 MP", samsung.getCameraSpecs());
    }

    @Test
    public void setCameraSpecsTest() {
        samsung.setCameraSpecs("12");
        assertEquals("12", samsung.getCameraSpecs());
    }

    @Test
    public void callTest() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        samsung.call("911");

        String expected = "Calling to 911 from Samsung...";

        TestCase.assertEquals("Output of call method", expected, out.toString().replace("\n", "").replace("\r", ""));
    }

    @Test
    public void textTest() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        samsung.text("101", "Help");

        String expected = "Sending a message \"Help\" to 101 from Samsung...";

        TestCase.assertEquals("Output of text method", expected, out.toString().replace("\n", "").replace("\r", ""));
    }

    @Test
    public void takePhotoTest() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        samsung.takePhoto();

        String expected = "Taking a photo from Samsung S20+ with 12 MP Ultra Wide; 108 MP Wide-Angle";

        TestCase.assertEquals("Output of takePhoto method", expected, out.toString().replace("\n", "").replace("\r", ""));
    }

    @Test
    public void unlockTest() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        samsung.unlock();

        String expected = "Unlocking using FingerPrint";

        TestCase.assertEquals("Output of unlock method", expected, out.toString().replace("\n", "").replace("\r", ""));

    }

    @Test
    public void externalStorageTest(){
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        samsung.externalStorage("S20+", 512);

        String expected = "Samsung S20+ has external storage of size: 512";

        TestCase.assertEquals("Output of unlock method", expected, out.toString().replace("\n", "").replace("\r", ""));
    }
}
