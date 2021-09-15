package ru.biblio;

public class Book extends Anything{
    private String name;
    public Book(String m_name){
        name=m_name;
    }
    public String getName() {
        return name;
    }
}
