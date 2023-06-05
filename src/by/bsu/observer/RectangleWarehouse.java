package by.bsu.observer;

import java.util.HashMap;
import java.util.Map;

public class RectangleWarehouse {
    private final static RectangleWarehouse instance = new RectangleWarehouse();
    private Map<Long, Parameter> parameterMap = new HashMap<>();
    private RectangleWarehouse() {
    }
    public static RectangleWarehouse getInstance() {
        return instance;
    }
    private static class Parameter {
       private float perimeter;
       private float square;
       @Override
       public String toString() {
            return "{perimeter=" + perimeter +
                    ", square=" + square +
                    '}';
       }
    }// end of nested class
    public void put(Rectangle value) {
        RectangleAction action = new RectangleAction();
        float newPerimeter = action.definePerimeter(value);
        float newSquare = action.defineSquare(value);
        RectangleWarehouse.Parameter param = new RectangleWarehouse.Parameter();
        param.perimeter = newPerimeter;
        param.square = newSquare;
        parameterMap.put(value.getRectangleId(), param);
    }
    public boolean changePerimeter(Long key, float value) {
       boolean flag = false;
       if(parameterMap.containsKey(key)) {
           RectangleWarehouse.Parameter param = parameterMap.get(key);
           param.perimeter = value;
           parameterMap.put(key, param);
           flag = true;
       }
        return flag;
    }
    public boolean changeSquare(Long key, float value) {

        boolean flag = false;
        if(parameterMap.containsKey(key)) {
            RectangleWarehouse.Parameter param = parameterMap.get(key);
            param.square = value;
            parameterMap.put(key, param);
            flag = true;
        }
        return flag;
    }
    public boolean remove(Long key) {
        boolean flag = false;
        if(parameterMap.containsKey(key)) {
            parameterMap.remove(key);
            flag = true;
        }
        return flag;
    }
    @Override
    public String toString() {
        return "warehouse{parameterMap=" + parameterMap +
                '}';
    }
}
