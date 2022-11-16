import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.project.Product;


public class RepositoryTest {

    Product poster1 = new Product(1, "film1", 11);
    Product poster2 = new Product(2, "film2", 22);
    Product poster3 = new Product(3, "film3", 33);
    Product poster4 = new Product(4, "film4", 44);
    Product poster5 = new Product(5, "film5", 55);
    Product poster6 = new Product(6, "film6", 66);
    Product poster7 = new Product(7, "film7", 77);
    Product poster8 = new Product(8, "film8", 88);

//    @BeforeEach  // не работает...(
//    public void setup() {
//        Repository repo = new Repository();
//
//        repo.save(poster1);
//        repo.save(poster2);
//        repo.save(poster3);
//        repo.save(poster4);
//        repo.save(poster5);
//        repo.save(poster6);
//        repo.save(poster7);
//        repo.save(poster8);
//    }

    @Test
    public void shouldSavePosters() {
        Repository repo = new Repository();

        repo.save(poster1);
        repo.save(poster2);
        repo.save(poster3);
        repo.save(poster4);
        repo.save(poster5);
        repo.save(poster6);
        repo.save(poster7);
        repo.save(poster8);

        Product[] expected = {poster1, poster2, poster3, poster4, poster5, poster6, poster7, poster8};
        Product[] actual = repo.getPosters();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveById() {
        Repository repo = new Repository();

        repo.save(poster1);
        repo.save(poster2);
        repo.save(poster3);
        repo.save(poster4);
        repo.save(poster5);
        repo.save(poster6);
        repo.save(poster7);
        repo.save(poster8);

        repo.removeById(3);
        Product[] expected = {poster1, poster2, poster4, poster5, poster6, poster7, poster8};
        Product[] actual = repo.getPosters();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAll() {    // без фильма №3 и №8
        Repository repo = new Repository();

        repo.save(poster1);
        repo.save(poster2);
        repo.save(poster4);
        repo.save(poster5);
        repo.save(poster6);
        repo.save(poster7);


        repo.findAll();
        Product[] expected = {poster1, poster2, poster4, poster5, poster6, poster7};
        Product[] actual = repo.getPosters();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindById() {
        Repository repo = new Repository();

        repo.save(poster1);
        repo.save(poster2);
        repo.save(poster3);
        repo.save(poster4);
        repo.save(poster5);
        repo.save(poster6);
        repo.save(poster7);
        repo.save(poster8);

        repo.findById(6);

        Product[] expected = {poster6};
        Product[] actual = repo.getPosters();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotFindByNegativeId() {
        Repository repo = new Repository();

        repo.save(poster1);
        repo.save(poster2);
        repo.save(poster3);
        repo.save(poster4);
        repo.save(poster5);
        repo.save(poster6);
        repo.save(poster7);
        repo.save(poster8);

        repo.findById(-7);


        Product[] actual = repo.getPosters();
        Assertions.assertArrayEquals(null, actual);

    }

    @Test
    public void shouldNotFindByWrongId() {
        Repository repo = new Repository();

        repo.save(poster1);
        repo.save(poster2);
        repo.save(poster3);
        repo.save(poster4);
        repo.save(poster5);
        repo.save(poster6);
        repo.save(poster7);
        repo.save(poster8);

        repo.findById(10);

        Product[] actual = repo.getPosters();
        Assertions.assertArrayEquals(null, actual);
    }


    @Test
    public void shouldDeleteAll() {
        Repository repo = new Repository();

        repo.save(poster1);
        repo.save(poster2);
        repo.save(poster3);
        repo.save(poster4);
        repo.save(poster5);
        repo.save(poster6);
        repo.save(poster7);
        repo.save(poster8);

        repo.removeAll();

        Product[] expected = {};
        Product[] actual = repo.getPosters();
        Assertions.assertArrayEquals(expected, actual);
    }
}


