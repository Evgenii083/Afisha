import ru.netology.project.Product;

public class Repository {
    Product[] posters = new Product[0];

    public void save(Product films) {
        Product[] tmp = new Product[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = films;
        posters = tmp;
    }

    public void removeById(int id) {
        Product[] tmp = new Product[posters.length - 1];
        int copyToIndex = 0;
        for (Product posters : posters) {
            if (posters.getProductId() != id) {
                tmp[copyToIndex] = posters;
                copyToIndex++;
            }
        }
        posters = tmp;
    }

    public Product[] getPosters() {
        return posters;
    }


    public Product[] findAll() {
        Product[] all = getPosters();
        return all;
    }


    public void findById(int id) {

        Product[] tmp = new Product[1];
        int copyToIndex = 0;
        for (Product posters : posters) {
            if (posters.getProductId() == id) {
                tmp[copyToIndex] = posters;
                copyToIndex++;
            }
            if (id <= 0) {
                tmp = null;
            }
            if (id > getPosters().length) {
                tmp = null;
            }

        }
        posters = tmp;


    }


    public void removeAll() {
        Product[] tmp = new Product[0];
        posters = tmp;
    }
}
