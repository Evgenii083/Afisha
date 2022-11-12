import ru.netology.poster.Films;


public class PosterManager {
    private Films[] posters = new Films[0];


    public  void save(Films poster) {
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

    public Films[] getLimitPosters(int lmt) {
//        for (int i = 0; i < posters.length; i++) {
//
//            System.out.println(posters[posters.length - 1 - i]);
//        }
        int limitSize = 0;

//        int real_size = Math.max(1, Math.min(lmt, posters.length));
        int real_size = lmt;
        if (1 > lmt) {
            real_size = 1;
        } else {
            if (lmt > posters.length) {
                real_size = posters.length;
            }
        }

        Films[] tmp1 = new Films[real_size];
        for (int i = posters.length - 1; i >= 0; i--) {
            if (limitSize < real_size) {
                tmp1[limitSize] = posters[i];
                System.out.println(tmp1[limitSize]);
                limitSize++;
            }
        }
        return tmp1;

    }


}