import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.project.Product;

import static org.mockito.Mockito.*;

public class ManagerTestMockito {

    Repository repo = Mockito.mock(Repository.class);
    Manager manager = new Manager(repo);


    Product poster1 = new Product(1, "film1", 11);
    Product poster2 = new Product(2, "film2", 22);
    Product poster3 = new Product(3, "film3", 33);
    Product poster4 = new Product(4, "film4", 44);
    Product poster5 = new Product(5, "film5", 55);
    Product poster6 = new Product(6, "film6", 66);
    Product poster7 = new Product(7, "film7", 77);
    Product poster8 = new Product(8, "film8", 88);

    @Test
    public void shouldGetReversArray() {
        Product[] posters = {poster1, poster2, poster3, poster4, poster5, poster6, poster7, poster8};
        doReturn(posters).when(repo).getPosters();

        Product[] expected = {poster8, poster7, poster6, poster5, poster4, poster3, poster2, poster1};
        Product[] actual = manager.getLastPosters();
        Assertions.assertArrayEquals(expected, actual);
    }
}
