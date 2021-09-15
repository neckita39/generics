package ru.biblio;

public class Magazine extends Anything{
    private String name;
    public Magazine(){}
    public Magazine(String m_name){
        name=m_name;
    }
    public String getName() {
        return name;
    }
}
