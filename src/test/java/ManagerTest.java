import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.project.Product;

public class ManagerTest {
    Repository repo = new Repository();
    Manager manager = new Manager(repo);


    Product poster1 = new Product(1, "film1", 11);
    Product poster2 = new Product(2, "film2", 22);
    Product poster3 = new Product(3, "film3", 33);
    Product poster4 = new Product(4, "film4", 44);
    Product poster5 = new Product(5, "film5", 55);
    Product poster6 = new Product(6, "film6", 66);
    Product poster7 = new Product(7, "film7", 77);
    Product poster8 = new Product(8, "film8", 88);

    @BeforeEach
    public void setup() {
        manager.add(poster1);
        manager.add(poster2);
        manager.add(poster3);
        manager.add(poster4);
        manager.add(poster5);
        manager.add(poster6);
        manager.add(poster7);
        manager.add(poster8);

    }

    @Test
    public void shouldGGetLastPosters() {

        Product[] expected = {poster8, poster7, poster6, poster5, poster4, poster3, poster2, poster1};
        Product[] actual = manager.getLastPosters();
        Assertions.assertArrayEquals(expected,actual);
    }


}
