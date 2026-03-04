import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    TemperatureConverter converter = new TemperatureConverter();
    @Test
    void OneCelsiusShouldReturn33InFahrenheit(){
        double celsius = converter.celsiusToFahrenheit(1);
        assertEquals(33.8, celsius);
    }

    @Test
    void ThirtyCelsiusShouldReturn86InFahrenheit(){
        double celsius = converter.celsiusToFahrenheit(30);
        assertEquals(86, celsius);
    }

    @Test
    void OneNine0FahrenheitShouldReturnEightSevenPointSevenInCelsius(){
        double fahrenheit = converter.fahrenheitToCelsius(190);
        assertEquals(87.77777777777777, fahrenheit);
    }

    @Test    void Minus123FahrenheitShouldReturnMinus86PointOneInCelsius(){
        double fahrenheit = converter.fahrenheitToCelsius(-123);
        assertEquals(-86.11111111111111,fahrenheit);
    }

    @Test
    void IsExtremeTemperatureShouldReturnTrueForMinus45C(){
        boolean isExtreme = converter.isExtremeTemperature(-45);
        assertTrue(isExtreme);
    }

    @Test
    void IsExtremeTrueShouldReturnFalseFor20C(){
        boolean isExtreme = converter.isExtremeTemperature(20);
        assertFalse(isExtreme);
    }

    @Test
    void IsExtremeTrueShouldReturnTrueFor51C(){
        boolean isExtreme = converter.isExtremeTemperature(51);
        assertTrue(isExtreme);
    }

    @Test
    void Kelvin300ShouldBe26Point85InCelsius(){
        double celsius = converter.KelvinToCelsius(300);
        assertEquals(26.850000000000023, celsius);
    }

    @Test
    void Kelvin250ShouldBeMinus23Point15InCelsius(){
        double celsius = converter.KelvinToCelsius(250);
        assertEquals(-23.149999999999977, celsius);
    }

    @Ignore("Test is ignored as it is not yet implemented")
    void MainTesting(){
        fail("Test has not been implemented yet");
    }

}