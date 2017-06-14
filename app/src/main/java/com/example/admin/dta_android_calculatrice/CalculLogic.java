package com.example.admin.dta_android_calculatrice;

import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 14/06/2017.
 */

public class CalculLogic {
    private int MINIMAL_VALUE = 1;
    private List<Integer> stack = new ArrayList<Integer>();
    private String result = "";
    private String temp = "";

    public void enter(int n){
        this.temp += String.valueOf(n);
        this.result = this.temp;
        Log.d("CalculLogic", "Temp =  " + temp);
    }

    public void enter(){
        if(this.temp.equals("")){
            return;
        }
        this.stack.add(0, Integer.parseInt(this.temp));
        this.result = "";
        this.temp = "";
        Log.d("CalculLogic", "List = " + this.stack);
    }

    public void plus(){
        if(this.stack.size() <= MINIMAL_VALUE){
            return;
        }

        int r = this.stack.get(0) + this.stack.get(1);
        this.stack.remove(0);
        this.stack.remove(0);
        this.stack.add(0, r);
    }

    public void minus(){
        if(this.stack.size() <= MINIMAL_VALUE){
            return;
        }

        int r = this.stack.get(1) - this.stack.get(0);
        this.stack.remove(0);
        this.stack.remove(0);
        this.stack.add(0, r);
    }

    public void divide(){
        if(this.stack.size() <= MINIMAL_VALUE){
            return;
        }

        int r = this.stack.get(1) / this.stack.get(0);
        this.stack.remove(0);
        this.stack.remove(0);
        this.stack.add(0, r);

    }

    public void clear(){
        this.stack.clear();
    }

    public void pop(){
        if(this.stack.size() <= MINIMAL_VALUE){
            this.clear();
            return;
        }

        this.stack.remove(0);

    }

    public void swap(){
        if(this.stack.size() <= MINIMAL_VALUE){
            return;
        }

        int temp = this.stack.get(0);
        this.stack.set(0, this.stack.get(1));
        this.stack.set(1, temp);

    }

    public List<Integer> getStack() {
        if(this.stack.size() > 4)
            return stack.subList(0, 4);

        return stack;
    }

    public String getResult() {
        return result;
    }

    public String getTemp() {
        return temp;
    }
}
