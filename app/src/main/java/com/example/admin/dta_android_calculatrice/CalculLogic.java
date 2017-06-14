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
    //private int result = 0;
    private String temp = "";

    public void enter(int n){
        Log.d("CalculLogic", "Coucou je suis " + n);
        this.temp += String.valueOf(n);
        Log.d("CalculLogic", "Temp =  " + temp);
    }

    public void enter(){
        if(this.temp.equals("")){
            return;
        }
        this.stack.add(Integer.parseInt(this.temp));
        this.temp = "";
        Log.d("CalculLogic", "List = " + this.stack);
    }

    public void plus(){
        if(this.stack.size() <= MINIMAL_VALUE){
            return;
        }

        int r = this.stack.get(0) + this.stack.get(1);
        Log.d("CalculLogic", "r = " + r);
        this.stack.remove(0);
        Log.d("CalculLogic", "Plus 2 = " + this.stack);
        this.stack.remove(0);
        Log.d("CalculLogic", "Plus 3 = " + this.stack);
        this.stack.add(0, r);
        Log.d("CalculLogic", "Plus r = " + this.stack);
    }

    public void minus(){
        if(this.stack.size() <= MINIMAL_VALUE){
            return;
        }

        int r = this.stack.get(0) - this.stack.get(1);
        Log.d("CalculLogic", "r = " + r);
        this.stack.remove(0);
        Log.d("CalculLogic", "Minus 2 = " + this.stack);
        this.stack.remove(0);
        Log.d("CalculLogic", "Minus 3 = " + this.stack);
        this.stack.add(0, r);
        Log.d("CalculLogic", "Minus r = " + this.stack);
    }

    public void divide(){
        if(this.stack.size() <= MINIMAL_VALUE){
            return;
        }

        int r = this.stack.get(0) / this.stack.get(1);
        Log.d("CalculLogic", "r = " + r);
        this.stack.remove(0);
        Log.d("CalculLogic", "Divide 2 = " + this.stack);
        this.stack.remove(0);
        Log.d("CalculLogic", "Divide 3 = " + this.stack);
        this.stack.add(0, r);
        Log.d("CalculLogic", "Divide r = " + this.stack);

    }

    public void clear(){
        this.stack.clear();
    }

    public void pop(){
        if(this.stack.size() <= MINIMAL_VALUE){
            this.clear();
            return;
        }

        Log.d("CalculLogic", "Pop before = " + this.stack);
        this.stack.remove(0);
        Log.d("CalculLogic", "Pop before = " + this.stack);

    }

    public void swap(){
        if(this.stack.size() <= MINIMAL_VALUE){
            return;
        }

        Log.d("CalculLogic", "Swap before = " + this.stack);
        int temp = this.stack.get(0);
        this.stack.set(0, this.stack.get(1));
        this.stack.set(1, temp);
        Log.d("CalculLogic", "Swap after = " + this.stack);

    }

    public List<Integer> getStack() {
        return stack;
    }

    /*public int getResult() {
        return result;
    }
    */
    public String getTemp() {
        return temp;
    }
}
