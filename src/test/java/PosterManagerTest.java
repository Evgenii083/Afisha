import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.poster.Films;


public class PosterManagerTest {

    Films poster1 = new Films("film1");
    Films poster2 = new Films("film2");
    Films poster3 = new Films("film3");
    Films poster4 = new Films("film4");
    Films poster5 = new Films("film5");
    Films poster6 = new Films("film6");
    Films poster7 = new Films("film7");
    Films poster8 = new Films("film8");
    Films poster9 = new Films("film9");
    Films poster10 = new Films("film10");
    Films poster11 = new Films("film11");

PosterManager manager = new PosterManager();


    @Test
    public void shouldSaveNewPosters() {
        manager.save(poster1);
        manager.save(poster2);
        manager.save(poster3);
        manager.save(poster4);
        manager.save(poster5);
        manager.save(poster6);
        manager.save(poster7);
        manager.save(poster8);
        manager.save(poster9);
        manager.save(poster10);
        manager.save(poster11);

        Films[] expected = { poster1, poster2, poster3, poster4, poster5, poster6,poster7,poster8,poster9,poster10,poster11};
        Films[] actual = manager.getPosters();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldGetAllPosters() {
        manager.save(poster1);
        manager.save(poster2);
        manager.save(poster3);
        manager.save(poster4);
        manager.save(poster5);
        manager.save(poster6);
        manager.save(poster7);
        manager.save(poster8);
        manager.save(poster9);
        manager.save(poster10);
        manager.save(poster11);

        manager.getAllPosters();

        Films[] expected = {poster1, poster2, poster3, poster4, poster5, poster6,poster7,poster8,poster9,poster10,poster11};
        Films[] actual = manager.getPosters();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLimitPosters() {
        PosterManager manager = new PosterManager(4);
        manager.save(poster1);
        manager.save(poster2);
        manager.save(poster3);
        manager.save(poster4);
        manager.save(poster5);
        manager.save(poster6);
        manager.save(poster7);
        manager.save(poster8);
        manager.save(poster9);
        manager.save(poster10);
        manager.save(poster11);


        Films[] expected = {poster11, poster10, poster9, poster8};
        Films[] actual = manager.getLimitPosters();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldGetLimitPostersWithNullConstructor(){
        PosterManager manager = new PosterManager();
        manager.save(poster1);
        manager.save(poster2);
        manager.save(poster3);
        manager.save(poster4);
        manager.save(poster5);
        manager.save(poster6);
        manager.save(poster7);
        manager.save(poster8);
        manager.save(poster9);
        manager.save(poster10);
        manager.save(poster11);


        Films[] expected = {poster11, poster10, poster9, poster8,poster7,poster6,poster5,poster4,poster3,poster2};
        Films[] actual = manager.getLimitPosters();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLimitPostersIfSizeOfArrIsTooMach() {
        PosterManager manager = new PosterManager(40);
        manager.save(poster1);
        manager.save(poster2);
        manager.save(poster3);
        manager.save(poster4);
        manager.save(poster5);
        manager.save(poster6);
        manager.save(poster7);
        manager.save(poster8);
        manager.save(poster9);
        manager.save(poster10);
        manager.save(poster11);

        Films[] expected = {poster11,poster10,poster9,poster8,poster7,poster6,poster5,poster4,poster3,poster2,poster1};
        Films[] actual = manager.getLimitPosters();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLimitPostersIfSizeOfArrayIsNegative() {
        PosterManager manager = new PosterManager(-2);
        manager.save(poster1);
        manager.save(poster2);
        manager.save(poster3);
        manager.save(poster4);
        manager.save(poster5);
        manager.save(poster6);
        manager.save(poster7);
        manager.save(poster8);
        manager.save(poster9);
        manager.save(poster10);
        manager.save(poster11);

        Films[] expected = {poster11};
        Films[] actual = manager.getLimitPosters();

        Assertions.assertArrayEquals(expected, actual);

    }
}


