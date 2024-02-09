package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {
    @Test
    public void testTask() {
    }
    @Test
    public void simpleTaskTest() {
        SimpleTask simpleTask = new SimpleTask(1, "Позвонить родителям");
        Assertions.assertTrue(simpleTask.matches("Позвонить родителям"));
        Assertions.assertTrue(simpleTask.matches(""));
        Assertions.assertFalse(simpleTask.matches("Учить Java"));
    }

    @Test
    public void epicTest() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(1, subtasks);
        Assertions.assertTrue(epic.matches("Молоко"));
        Assertions.assertTrue(epic.matches(""));
        Assertions.assertFalse(epic.matches("Батон"));
    }
    @Test
    public void meetingTest() {
        Meeting meeting = new Meeting(2, "Тема", "Проект", "Дата");
        Assertions.assertTrue(meeting.matches("Тема"));
        Assertions.assertTrue(meeting.matches(""));
        Assertions.assertFalse(meeting.matches("Учить Java"));
    }
}