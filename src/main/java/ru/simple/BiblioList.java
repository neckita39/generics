package ru.simple;

import ru.biblio.Anything;

import java.util.ArrayList;
import java.util.List;

public class BiblioList {
    BiblioList(){}
    public void add(Anything b){
        bibs.add(b);
    }
    public void remove(int i) throws Exception{
        if (!bibs.isEmpty())
            bibs.remove(i);
        else throw new Exception("Список пуст");
    }
    public Anything get(int i)throws Exception{
        if (i>=0 && i<bibs.size())
            return bibs.get(i);
        else throw new Exception("Неверный индекс");
    }
    private List<Anything> bibs=new ArrayList<>();
}

