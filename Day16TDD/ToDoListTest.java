import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {
    ToDoList toDoList = new ToDoList();


    @BeforeEach
    public void addItemsToList() {
        toDoList.addItemsToList("Buy Milk",true);
        toDoList.addItemsToList("Buy Sugar",false);
        toDoList.addItemsToList("Buy Tea-powder",true);
        toDoList.addItemsToList("Drink Tea",false);
    }


    @Test
    @DisplayName("Adding Items In ToDo List")
    public void addItemsToTodoListTest() {
        String actualList = toDoList.checkToDoList("Buy Milk");
        assertEquals("Buy Milk", actualList);
    }


    @Test
    @DisplayName("Removing Items From ToDo List")
    public void removeItemsFromTodoListTest() {
        boolean actualList = toDoList.removeFromToDoList("Drink Tea");
        assertEquals(true, actualList);
    }


    @Test
    @DisplayName("Retrieved Removed Items From ToDo List")
    public void unRemoveItemsFromTodoListTest() {
        boolean actualList = toDoList.retrieveRemovedItemFromToDoList("Drink Tea");
        assertEquals(true, actualList);
    }


    @Nested
    public class toggleBetweenCompletedAndNotCompletedTodoListTest {

        @Test
        @DisplayName("Checking Task Is Completed In ToDo List")
        public void checkIfTaskIsCompleted() {
            boolean actualList = toDoList.taskCompletedOrNotCompleted("Buy Milk");
            assertEquals(true, actualList);
        }

        @Test
        @DisplayName("Checking Task Is NotCompleted In ToDo List")
        public void checkIfTaskIsNotCompleted() {
            boolean actualList = toDoList.taskCompletedOrNotCompleted("Drink Tea");
            assertEquals(false, actualList);
        }
    }
}

//1. As a note keeper I want to add items to my todo list.
//2. As a note keeper I want to remove items from my todo list.
//3. As a note keeper, I want to be able to bring back the removed items. (un remove)
//4. As a note keeper, I want to toggle between completed and not completed.