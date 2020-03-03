package headfirstdesignpatterns.templatemethod;

import org.junit.Test;

import java.util.Arrays;

public class DuckSortTestDrive {

    @Test
    public void sortDucks() {
        Duck[] ducks = {
                        new Duck("Daffy", 8),
                        new Duck("Dewey", 2),
                        new Duck("Howard", 7),
                        new Duck("Louie", 2),
                        new Duck("Donald", 10),
                        new Duck("Huey", 2)
        };
        System.out.println("Before sorting:");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("After sorting:");
        display(ducks);
    }

    private void display(Duck[] ducks) {
        for (Duck d : ducks) {
            System.out.println(d);
        }
    }
}
