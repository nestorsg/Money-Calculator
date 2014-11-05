package View_Persistent;

import Model.Currency;
import Model.CurrencySet;

public class CurrencySetLoader {

    private CurrencySet set;
    
    public void load() {
        set.add(new Currency("EUR", "Euro", "€"));
        set.add(new Currency("USD", "Dolar", "$"));
            
    }
}
