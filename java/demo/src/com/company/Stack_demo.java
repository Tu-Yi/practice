package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * 栈的实现
 * @param <T>
 */
public class Stack_demo<T> {

    ArrayList<T> stack = new ArrayList<T>();
    private int top = -1;


    /**
     * 入栈
     * @param item
     */
    public void push(T item){
        stack.add(item);
        top++;
    }


    /**
     * 出栈
     * @return T
     */
    public T pop(){
        List<String> list  = new ArrayList<>();
        T tmp = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        top--;
        return tmp;
    }


    /**
     * 判断是否为空
     * @return boolean
     */
    public Boolean stackempty(){
        if(top == -1){
            return true;
        }
        else{
            return false;
        }

    }
}
