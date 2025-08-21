import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GroceryAppTest {

    @Test
    void testRemoveNonExistentItem() {
        String item = "Apples";
        app.addItem(item);
        assertEquals(1, app.getItems().size());

        app.removeItem("Bananas");
        assertEquals(1, app.getItems().size(), "List size should not change when removing a non-existent item.");
        assertTrue(app.getItems().contains(item), "The original item should still be in the list.");
    }
}


