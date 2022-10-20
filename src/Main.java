import person.Person;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {
        Queue<Person> queueAttraction = new LinkedList<>(generateClients());
        while (!queueAttraction.isEmpty()) {
            Person currentPerson = queueAttraction.poll();
            System.out.printf("%s %s Зашел на атракцион, имея - %d билет(а/ов)\n",
                    currentPerson.getName(),
                    currentPerson.getSureName(),
                    currentPerson.getQuatityTickets());

            int quatityTickets = currentPerson.getQuatityTickets();
            if (quatityTickets > 0) {
                System.out.printf("%s %s прокатился на атракционе 1 раз, имея - %d билет(а/ов)\n",
                        currentPerson.getName(),
                        currentPerson.getSureName(),
                        currentPerson.getQuatityTickets());
                currentPerson.setQuatityTickets(--quatityTickets);
                queueAttraction.offer(currentPerson);
            } else {
                System.out.printf("%s %s не сможет прокатиться на атракционе, имея - %d билетов\n",
                        currentPerson.getName(),
                        currentPerson.getSureName(),
                        currentPerson.getQuatityTickets());
            }
        }
        System.out.println("У всех билетики кончились :(");
    }

    private static List<Person> generateClients() {
        return List.of(
                new Person("Петя", "Петров", 2),
                new Person("Алексей", "Пупкин", 5),
                new Person("Игорь", "Корсаков", 7),
                new Person("Алена", "Воздух", 10),
                new Person("Михаил", "Киркоров", 8)
        );
    }
}