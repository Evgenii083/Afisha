import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.poster.Films;
import ru.netology.poster.PosterManager;


public class PosterManagerTest {

    Films poster1 = new Films("фильм 1 ");
    Films poster2 = new Films("фильм 2");
    Films poster3 = new Films("фильм 3");
    Films poster4 = new Films("фильм 4");
    Films poster5 = new Films("фильм 5");
    Films poster6 = new Films("фильм 6");
    Films poster7 = new Films("фильм 7");
    Films poster8 = new Films("фильм 8");
    Films poster9 = new Films("фильм 9");
    Films poster10 = new Films("фильм 10");
    Films poster11 = new Films("фильм 12");





    @Test
    public void shouldSaveNewPosters() {
        PosterManager Posters = new PosterManager();

        Posters.save(poster1);
        Posters.save(poster2);
        Posters.save(poster3);
        Posters.save(poster4);
        Posters.save(poster5);
        Posters.save(poster6);

        Films[] expected = { poster1, poster2, poster3, poster4, poster5, poster6};
        Films[] actual = Posters.getPosters();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetAllPosters() {
        PosterManager Posters = new PosterManager();
        Posters.save(poster1);
        Posters.save(poster2);
        Posters.save(poster3);
        Posters.save(poster4);
        Posters.save(poster5);
        Posters.save(poster6);
        Posters.getAllPosters();

        Films[] expected = { poster1, poster2, poster3, poster4,poster5,poster6};
        Films[] actual = Posters.getPosters();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLimitPostersDefault() {
        PosterManager Posters = new PosterManager();
        Posters.save(poster1);
        Posters.save(poster2);
        Posters.save(poster3);
        Posters.save(poster4);
        Posters.save(poster5);
        Posters.save(poster6);
        Posters.save(poster7);
        Posters.save(poster8);
        Posters.save(poster9);
        Posters.save(poster10);
        Posters.save(poster11);

        Posters.getLimitPosters();

        Films[] expected = {poster11,poster10,poster9,poster8,poster7,poster6, poster5, poster4, poster3,poster2};
        Films[] actual = Posters.getLimitPosters();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLimitPostersWithManualLimit() {
        PosterManager Posters = new PosterManager(5);
        Posters.save(poster1);
        Posters.save(poster2);
        Posters.save(poster3);
        Posters.save(poster4);
        Posters.save(poster5);
        Posters.save(poster6);
        Posters.save(poster7);
        Posters.save(poster8);
        Posters.save(poster9);
        Posters.save(poster10);
        Posters.save(poster11);

        Posters.getLimitPosters();

        Films[] expected = {poster11,poster10,poster9,poster8,poster7};
        Films[] actual = Posters.getLimitPosters();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldGetLimitPostersIfSizeOfArrIsTooMach() {
        PosterManager Posters = new PosterManager(46);
        Posters.save(poster1);
        Posters.save(poster2);
        Posters.save(poster3);
        Posters.save(poster4);
        Posters.save(poster5);
        Posters.save(poster6);
        Posters.save(poster7);
        Posters.save(poster8);
        Posters.save(poster9);
        Posters.save(poster10);
        Posters.save(poster11);

        Films[] expected = {poster11,poster10,poster9,poster8,poster7,poster6, poster5, poster4, poster3,poster2,poster1};
        Films[] actual = Posters.getLimitPosters();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLimitPostersIfSizeOfArrayIsNegative() {
        PosterManager Posters = new PosterManager(-9);

        Posters.save(poster1);
        Posters.save(poster2);
        Posters.save(poster3);
        Posters.save(poster4);
        Posters.save(poster5);
        Posters.save(poster6);

        Films[] expected = {poster6};
        Films[] actual = Posters.getLimitPosters();

        Assertions.assertArrayEquals(expected, actual);
    }
}


