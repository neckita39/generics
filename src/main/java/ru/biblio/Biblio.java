package ru.biblio;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Biblio<T> {
    private List<T> els=new ArrayList<>();
    private int s;

    public Biblio(int s){
        this.s=s;
        els=new ArrayList<T>(s);
    }
    public void add(T obj){
        this.els.add(obj);
    }
    public void remove(int i) throws Exception{
        if(!els.isEmpty())
            this.els.remove(i);
        else throw new Exception("Список пуст");
    }
    public T get(int i) throws Exception {
            if (i >= 0 && i < s)
                return els.get(i);
            else throw new Exception("Неверный индекс");
    }
    public int size(){
        return s;
    }



}
