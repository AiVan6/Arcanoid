package com.company.patterns;

import com.company.model.AbstractActor;

import java.io.Serializable;
import java.util.Vector;

public class Singleton implements Serializable {//??
    private static Singleton instance;
    private Vector<AbstractActor> vector=new Vector<>();//вектор в котором хранятся все объекты
    public int life=3;//общее время жизни
    public int points = 0;//очки

    public Vector<AbstractActor> getVector(){
        return vector;
    }

    public static Singleton getInstance() {
        if(instance==null)
            instance=new Singleton();
        return instance;
    }

    public void refreshVector()
    {
        vector.clear();
    }

    public void AddPoints (int points)//добавление очков
    {
        this.points += points;
    }

    public int Getpoints()
    {
        return this.points;
    }

    public void SetPoints(int points)
    {
        this.points = points;
    }
}
