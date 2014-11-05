package Model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CurrencySet implements Iterable  {
    private final Map<String,Currency> currencySet;

    public CurrencySet() {
        this.currencySet = new HashMap<>();
    }

       @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void add (Currency currency){
        currencySet.put(currency.getCode(), currency);
    }
}
