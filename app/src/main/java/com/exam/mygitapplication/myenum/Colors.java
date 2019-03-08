package com.exam.mygitapplication.myenum;

/**
 * Created by YuShuangPing on 2018/12/25.
 */
public enum Colors{
    RED("红色",1),
    GREEN("绿色",2),
    BLANK("白色",3),
    YELLOW("黄色",4);
    //成员变量
    private String name;
    private int index;
    //构造方法

    Colors(String name, int index) {
        this.name = name;
        this.index = index;
    }
    //get set 方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    //普通方法
    public static String getName(int index){
        for (Colors c:Colors.values()){
            if (c.getIndex()==index){
                return c.name;
            }
        }
        return "";
    }

}
