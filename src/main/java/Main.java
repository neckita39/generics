import ru.biblio.*;

public class Main {
    public static void main(String[] args) throws Exception{

        try {
            System.out.println("Книги:");
            Biblio<Book> bibB = new Biblio();
            Book b = new Book("Война и Мир том первый");
            Book b1 = new Book("Война и мир том второй");
            bibB.add(b);
            bibB.add(b1);
            for (int i = 0; i < 2; i++) {
                System.out.println(bibB.get(i).getName());
            }
            System.out.println("Фильмы: ");
            Biblio<Video> bibV = new Biblio();
            Video v = new Video("Криминальное Чтиво");
            Video v1 = new Video("Большой Лебовски");
            bibV.add(v);
            bibV.add(v1);
            System.out.println("Первый фильм из списка - " + bibV.get(0).getName());
            System.out.println("Газеты: ");
            Biblio<Magazine> bibM = new Biblio();
            Magazine m = new Magazine("Комсомольская правда");
            bibM.add(m);


            System.out.println(bibM.get(0).getName());

            bibM.remove(0);
            System.out.println(bibM.get(0).getName());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
