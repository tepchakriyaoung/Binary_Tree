import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import com.inflectra.spiratest.addons.junitextension.SpiraTestCase;
import com.inflectra.spiratest.addons.junitextension.SpiraTestConfiguration;

@SpiraTestConfiguration (
//following are REQUIRED
        url = "https://rmit.spiraservice.net/",
        login = "S4064858",
        rssToken = "{83B01DDE-65A1-4AC4-8DEE-7C5FE74D95CD}",
        projectId = 1216,
//following are OPTIONAL
        releaseId = 7,
        testSetId = 1
)

class BTTest {


    BT bt;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();


    @BeforeEach
    public void setup() {
        this.bt = new BT();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void isEmpty(){

    }

    @Test
    public void search() {
    }

    @Test
    public void countOneNodeTreeTest() {
    }

    @Test
    public void countMultiNodesTreeTest() {
    }

    @Test
    void inorderEmptyTree() {
    }

}