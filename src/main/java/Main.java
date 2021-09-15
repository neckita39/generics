import ru.biblio.*;
import ru.generics.Biblio;

public class Main {
    public static void main(String[] args) throws Exception{
        try {
            Anything a=new Book("Книга");
            Anything a1=new Video("Видео");
            Anything a2=new Magazine("Газета");
            Biblio<Anything> bib=new Biblio<>();
            bib.add(a);
            bib.add(a1);
            bib.add(a2);
            for (Anything it: bib.els){
                System.out.println(it.getName());
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
