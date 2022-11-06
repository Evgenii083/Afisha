import ru.netology.poster.Poster;

public class Main {
    public static void main(String[] args) {

        String[] films = {
                "Бладшот",
                "Вперед",
                "Отель Белград",
                "Джентельмены",
                "Человек Неведимка",
                "Тролли",
                "Номер Один",
        };


        String newFilm = "Один Дома";
        String[] tmp = new String[Poster.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = newFilm;
        films = tmp;
    }
}
