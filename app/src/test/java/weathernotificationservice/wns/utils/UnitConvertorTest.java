package weathernotificationservice.wns.utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jun Lin on 4/30/2017.
 */
public class UnitConvertorTest {
    @Test
    public void kelvinToCelsius() throws Exception {
        float input = 300;
        float output;
        double expect = 26.85;
        double delta = .1;
        UnitConvertor unitConvertor = new UnitConvertor();
        output = unitConvertor.kelvinToCelsius(input);
        assertEquals(expect,output,delta);
    }

    @Test
    public void kelvinToFahrenheit() throws Exception {
        float input = 300;
        float output;
        double expect = 80.33;
        double delta = .1;
        UnitConvertor unitConvertor = new UnitConvertor();
        output = unitConvertor.kelvinToFahrenheit(input);
        assertEquals(expect,output,delta);
    }

    @Test
    public void getBeaufortName() throws Exception {
        int input = 2;
        String output;
        String expect = "Light breeze";
        UnitConvertor unitConvertor = new UnitConvertor();
        output = unitConvertor.getBeaufortName(input);
        assertEquals(expect,output);
    }

}