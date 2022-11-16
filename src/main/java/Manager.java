import ru.netology.project.Product;

public class Manager {
    private Repository repo;

    public Manager(Repository repo) {
        this.repo = repo;
    }

    public void add(Product posters) {
        repo.save(posters);
    }

    public Product[] getLastPosters() {
        Product[] all = repo.getPosters();
        Product[] reversed = new Product[all.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

}
