package headfirstdesignpatterns.decorator;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

public class DecoratorTest {

    @Test
    public void playgroundTest() {
        Beverage beverage = new DarkRoast();
        System.out.println(beverage.getDescription() + " " + beverage.cost());

        beverage = new Mocca(new DarkRoast());
        System.out.println(beverage.getDescription() + " " + beverage.cost());

        beverage = new Whip(beverage);

        System.out.println(beverage.getDescription() + " " + beverage.cost());
    }

    @Test
    public void givenMixedCaseInputWhenUseLowercaseInputStreamThenLowercaseInput() {
        String mixedCase = "This Is some Mixed case TeSt";
        byte[] bytesString = mixedCase.getBytes(StandardCharsets.US_ASCII);

        StringBuilder output = new StringBuilder();
        try {
            InputStream i = new LowercaseInputStream(new BufferedInputStream(
                    new ByteArrayInputStream(bytesString, 0, bytesString.length)));
            int c;
            while((c = i.read()) > 0) {
                output.append((char) c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(mixedCase.toLowerCase(), output.toString());
    }
}
