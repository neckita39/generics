import ru.biblio.*;

public class Main {
    public static void main(String[] args) throws Exception{

        try {
            System.out.println("Книги:");
            Biblio<Book> bibB = new Biblio(2);
            Book b = new Book("Война и Мир том первый");
            Book b1 = new Book("Война и мир том второй");
            bibB.add(b);
            bibB.add(b1);
            for (int i = 0; i < bibB.size(); i++) {
                System.out.println(bibB.get(i).getName());
            }
            System.out.println("Фильмы: ");
            Biblio<Video> bibV = new Biblio(2);
            Video v = new Video("Криминальное Чтиво");
            Video v1 = new Video("Большой Лебовски");
            bibV.add(v);
            bibV.add(v1);
            System.out.println("Первый фильм из списка - " + bibV.get(0).getName());
            System.out.println("Газеты: ");
            Biblio<Magazine> bibM = new Biblio(2);
            Magazine m = new Magazine("Комсомольская правда");
            bibM.add(m);
            bibM.add(m);
            for (int i = 0; i < bibM.size(); i++) {
                System.out.println(bibM.get(i).getName());
            }
            bibM.remove(1);
            for (int i = 0; i < bibM.size(); i++) {
                System.out.println(bibM.get(i).getName());
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
