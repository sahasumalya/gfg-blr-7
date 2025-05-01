package org.example.generics;

public class CustomGenerics <T>{
    private T t;
    public CustomGenerics(T t) {
        this.t = t;
    }
    public T getT() {
        return t;
    }
    public String getName(){
        if(t instanceof Employee){
            return ((Employee)t).getName();
        }
        return null;
    }

    public String getAddress(){
        if(t instanceof Company){
            return ((Company)t).getAddress();
        }
        return null;
    }
}
