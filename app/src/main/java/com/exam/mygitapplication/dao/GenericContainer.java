package com.exam.mygitapplication.dao;

/**
 * Created by YuShuangPing on 2019/4/2.
 */
public class GenericContainer<T> {
    private T obj;

    public GenericContainer(){
    }

    public GenericContainer(T t){
        obj=t;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
