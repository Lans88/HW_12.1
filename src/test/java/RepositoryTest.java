import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.hw12.*;

public class RepositoryTest {
    @Test
    public void removeByIdSmartphone() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Book book1 = new Book(12, "Harry Potter 1", 14, "J. Rouling");
        Book book2 = new Book(13, "Harry Potter 2", 13, "J. Rouling");
        Book book3 = new Book(10, "Harry Potter 3", 17, "J. Rouling");
        Smartphone smartphone1 = new Smartphone(23, "iPhone 14 Pro", 990, "Apple inc.");
        Smartphone smartphone2 = new Smartphone(22, "iPhone 14", 590, "Apple inc.");
        Smartphone smartphone3 = new Smartphone(21, "iPhone 14 Mini", 490, "Apple inc.");
        Smartphone smartphone4 = new Smartphone(29, "iPhone 14 Pro Max", 1190, "Apple inc.");

        manager.save(book1);
        manager.save(book2);
        manager.save(book3);
        manager.save(smartphone1);
        manager.save(smartphone2);
        manager.save(smartphone3);
        manager.save(smartphone4);
        repo.removeById(22);

        Product[] expected = {book1, book2, book3, smartphone1, smartphone3, smartphone4};
        Product[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

}
