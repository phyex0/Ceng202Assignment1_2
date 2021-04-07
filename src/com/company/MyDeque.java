/*
    Halit Burak Yeşildal
    18050111043
 */

package com.company;

import java.util.LinkedList;


public class MyDeque<E> {

    private LinkedList<E>  myQue = new LinkedList<>();

    public void push( E data){
        myQue.addFirst(data);
    }

    public E pop(){
        return myQue.removeFirst();
    }

    public void inject(E data){
        myQue.addLast(data);
    }

    public E eject(){
        return myQue.removeLast();
    }





}
