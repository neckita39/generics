package ru.biblio;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Biblio<T> {
    private List<T> els=new ArrayList<>();


    public Biblio(){

    }
    public void add(T obj){
        this.els.add(obj);
    }
    public void remove(int i) throws Exception{
        if(i>=0 && i<els.size())
            this.els.remove(i);
        else throw new Exception("Список пуст");
    }
    public T get(int i) throws Exception {
            if (i >= 0 && i < els.size())
                return els.get(i);
            else throw new Exception("Неверный индекс");
    }




}
