import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.poster.Films;


public class PosterManagerTest {

    Films poster0 = new Films("Отель'Белград'");
    Films poster1 = new Films("Вперед");
    Films poster2 = new Films("Бладшот");
    Films poster3 = new Films("Джентельмены");
    Films poster4 = new Films("Человек Неведимка");
    Films poster5 = new Films("Тролли");
    Films poster6 = new Films("Номер один");




    @Test
    public void shouldSaveNewPosters() {
        PosterManager Posters = new PosterManager();


        Posters.save(poster0);
        Posters.save(poster1);
        Posters.save(poster2);
        Posters.save(poster3);
        Posters.save(poster4);
        Posters.save(poster5);
        Posters.save(poster6);

        Films[] expected = {poster0, poster1, poster2, poster3, poster4, poster5, poster6};
        Films[] actual = Posters.getPosters();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldGetAllPosters() {
        PosterManager Posters = new PosterManager();
        Posters.save(poster0);
        Posters.save(poster1);
        Posters.save(poster2);
        Posters.save(poster3);
        Posters.save(poster4);
        Posters.save(poster5);
        Posters.save(poster6);
        Posters.getAllPosters();

        Films[] expected = {poster0, poster1, poster2, poster3, poster4, poster5, poster6};
        Films[] actual = Posters.getPosters();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLimitPosters() {
        PosterManager Posters = new PosterManager();
        Posters.save(poster0);
        Posters.save(poster1);
        Posters.save(poster2);
        Posters.save(poster3);
        Posters.save(poster4);
        Posters.save(poster5);
        Posters.save(poster6);
        Posters.getLimitPosters(2);

        Films[] expected = {poster6, poster5, poster4, poster3};
        Films[] actual = Posters.getLimitPosters(4);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldGetLimitPostersIfSizeOfArrIsTooMach() {
        PosterManager Posters = new PosterManager();
        Posters.save(poster0);
        Posters.save(poster1);
        Posters.save(poster2);
        Posters.save(poster3);
        Posters.save(poster4);
        Posters.save(poster5);
        Posters.save(poster6);

        Films[] expected = {poster6, poster5, poster4, poster3, poster2, poster1, poster0};
        Films[] actual = Posters.getLimitPosters(8);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLimitPostersIfSizeOfArrayIsNegative() {
        PosterManager Posters = new PosterManager();
        Posters.save(poster0);
        Posters.save(poster1);
        Posters.save(poster2);
        Posters.save(poster3);
        Posters.save(poster4);
        Posters.save(poster5);
        Posters.save(poster6);

        Films[] expected = {poster6};
        Films[] actual = Posters.getLimitPosters(-4);

        Assertions.assertArrayEquals(expected, actual);

    }
}


