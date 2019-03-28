package ru.job4j.tracker;

public class ValidateInput extends ConsoleInput {
    public int ask(String question, int[] range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.ask(question, range);
                invalid = false;
            } catch (MenuOutExceprion moe) {
                System.out.println("Out of bounds");
            } catch (NumberFormatException nfe) {
                System.out.println("Неправльный формат данных");
            }
        } while (invalid);
        return value;
    }
}
