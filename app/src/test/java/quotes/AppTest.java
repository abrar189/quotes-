/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");

    }

    @Test
    void testReader() {
        try {
            String quote = "Quotes{author='Charles Dickens', likes='497 likes', text='Ask no questions, and you'll be told no lies.'}";
            Path path = Paths.get("app/src/main/resources/recentquotes.json");
            ArrayList<Quotes> quotes = App.readerFunction(path);

            assertEquals(quote, quotes.get(1).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
