import Service.ItClinicalExercise;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ItClinicalTest {

    ItClinicalExercise service;

    @Before
    public void setUp() {
        service = new ItClinicalExercise();
    }

    @Test
    public void testGetUpperCharWithNth1() {
        String result = ItClinicalExercise.getUpper("ITCLiNicA1", 1);
        Assert.assertEquals("ITCLNA", result);
    }

    @Test
    public void testGetUpperCharWithNth2() {
        String result = ItClinicalExercise.getUpper("ITCLiNicAl", 2);
        Assert.assertEquals("TLN", result);
    }

    @Test
    public void testGetUpperCharWithNth3() {
        String result = ItClinicalExercise.getUpper("ITCLiNicAl", 3);
        Assert.assertEquals("CNA", result);
    }

    @Test
    public void testGetUpperCharWithNth100() {
        String result = ItClinicalExercise.getUpper("ITCLiNicAl", 100);
        Assert.assertEquals("", result);
    }

    @Test
    public void testGetUpperCharWithNMinus1() {
        String result = ItClinicalExercise.getUpper("ITCLiNicAl", -1);
        Assert.assertEquals("", result);
    }
}