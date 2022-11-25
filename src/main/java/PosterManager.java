import ru.netology.poster.Films;
public class PosterManager {
    int limit = 10;
    private Films[] posters = new Films[0];

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public PosterManager() {
    }

    public void save(Films poster) {
        Films[] tmp = new Films[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }
    public Films[] getPosters() {
        return posters;
    }

    public Films[] getAllPosters() {
        Films[] all = getPosters();
        return all;
    }

    public Films[] getLimitPosters() {
        int copyToIndex = 0;
        int realSize = limit;
        if (1 > limit) {
            realSize = 1;
        } else {
            if (limit > posters.length) {
                realSize = posters.length;
            }else {
                if(limit < 0){
                    realSize = 1;
                }
            }
        }
        Films[] tmp1 = new Films[realSize];
        for (int i = posters.length - 1; i >= 0; i--) {
            if (copyToIndex < realSize) {
                tmp1[copyToIndex] = posters[i];
                copyToIndex++;
            }
        }
        return tmp1;
    }
}