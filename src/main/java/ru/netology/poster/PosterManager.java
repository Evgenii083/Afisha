package ru.netology.poster;

public class PosterManager {

    public PosterManager(int posterLimit) {
        this.posterLimit = posterLimit;
    }

    public PosterManager() {
    }

    int posterLimit = 10;


    private Films[] posters = new Films[0];


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
        return getPosters();
    }


    public Films[] getLimitPosters() {
        int lmt = posterLimit;
        int limitSize = 0;
        int realSize = lmt;

        if (lmt <= 0) {
            realSize = 1;
        } else {
            if (lmt > posters.length) {
                realSize = posters.length;
            }
        }

        Films[] tmp1 = new Films[realSize];
        for (int i = posters.length - 1; i >= 0; i--) {
            if (limitSize < realSize) {
                tmp1[limitSize] = posters[i];
                limitSize++;
            }
        }
        return tmp1;
    }
}