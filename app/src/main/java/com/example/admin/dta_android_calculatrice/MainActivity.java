package com.example.admin.dta_android_calculatrice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private CalculLogic logic = new CalculLogic();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.button_un:
                logic.enter(1);
                break;

            case R.id.button_deux:
                logic.enter(2);
                break;

            case R.id.button_trois:
                logic.enter(3);
                break;

            case R.id.button_quatre:
                logic.enter(4);
                break;

            case R.id.button_cinq:
                logic.enter(5);
                break;

            case R.id.button_six:
                logic.enter(6);
                break;

            case R.id.button_sept:
                logic.enter(7);
                break;

            case R.id.button_huit:
                logic.enter(8);
                break;

            case R.id.button_neuf:
                logic.enter(9);
                break;

            case R.id.button_plus:
                logic.plus();
                break;

            case R.id.button_moins:
                logic.minus();
                break;

            case R.id.button_diviser:
                logic.divide();
                break;

            case R.id.button_swap:
                logic.swap();
                break;

            case R.id.button_clear:
                logic.clear();
                break;

            case R.id.button_pop:
                logic.pop();
                break;

            case R.id.button_enter:
                logic.enter();
                break;

        }

        updateView();
    }


    public void updateView(){
        TextView affiche_resultat = (TextView) findViewById(R.id.tv_affiche_resultat);
        TextView stack_un = (TextView) findViewById(R.id.tv_stack_un);
        TextView stack_deux = (TextView) findViewById(R.id.tv_stack_deux);
        TextView stack_trois = (TextView) findViewById(R.id.tv_stack_trois);
        TextView stack_quatre = (TextView) findViewById(R.id.tv_stack_quatre);

        affiche_resultat.setText(logic.getTemp());
        List<Integer> temp_list = logic.getStack();

        if(!temp_list.isEmpty())
            stack_un.setText(String.valueOf(temp_list.get(0)));



    }
}
