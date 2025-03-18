import org.junit.Test;
import static org.junit.Assert.*;

public class ToDoListTest {
    @Test
    public void testAddTaskIncreasesTaskCount() {
        ToDoList todo = new ToDoList();
        int initialCount = todo.getTaskCount();
        todo.addTask("Test Task");
        assertEquals(initialCount + 1, todo.getTaskCount());
    }

    @Test
    public void testTaskIsAddedCorrectly() {
        ToDoList todo = new ToDoList();
        String taskName = "Buy groceries";
        todo.addTask(taskName);
        String[][] tasks = todo.getTasks();
        assertEquals(taskName, tasks[0][0]);
        assertEquals("[]", tasks[0][1]);
    }

    @Test
    public void testMarkTaskCompleteChangesStatus() {
        ToDoList todo = new ToDoList();
        todo.addTask("Clean room");
        todo.markTaskComplete(1);
        String[][] tasks = todo.getTasks();
        assertEquals("[X]", tasks[0][1]);
    }

    @Test
    public void testDeleteTaskDecreasesTaskCount() {
        ToDoList todo = new ToDoList();
        todo.addTask("Do homework");
        int initialCount = todo.getTaskCount();
        todo.deleteTask(1);
        assertEquals(initialCount - 1, todo.getTaskCount());
    }

    @Test
    public void testParseNumberConvertsStringToInt() {
        ToDoList todo = new ToDoList();
        int result = todo.parseNumber("123");
        assertEquals(123, result);
    }

    private void addTaskDirectly(ToDoList todo, String taskName) {
        String[][] tasks = todo.getTasks();
        int count = todo.getTaskCount();
        tasks[count][0] = taskName;
        tasks[count][1] = "[]";
        todo.incrementTaskCount();
    }
}
