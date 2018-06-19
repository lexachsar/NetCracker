package com.lexach.netcracker.projects.bool.simplification;

import java.util.ArrayList;

public class Not extends BooleanObject {
    Not(char inObj){
        super(inObj);
    }

    public boolean getResult(boolean var) {
        return !var;
    }

    //Удаляем лишние отрицания
    public ArrayList<BooleanObject> simplify(ArrayList<BooleanObject> function, int i) {
        int summator = 0;
        while (function.get(i + 1).getObject() == Consts.not) {
            function.remove(i + 1);
            summator++;
        }
        if (!(summator % 2 == 0))
            function.remove(i);
        return function;
    }
}
