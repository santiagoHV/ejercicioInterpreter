package controller;
import javax.swing.*;
import java.util.HashMap;

public class Context {
    private HashMap varList = new HashMap();

    public void assign(String var, int value) {
        varList.put(var, new Integer(value));
    }
    public int getValue(String var) {
        Integer objInt = (Integer) varList.get(var);
        try{
            return objInt.intValue();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Ingresó variables no permitidas en la operación, se toman como 0");
            return 0;
        }
    }

    public Context() {}
}
