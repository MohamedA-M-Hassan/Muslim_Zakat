package com.zakat.mamohamed.zakat;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
/**
 * Created by mamohamed on 5/19/2018.
 */

public class Zakat {
    // Key = Month ( date ) || Value = amount
    private Map<String,Double> monthly_amount = new HashMap<String, Double>();
    double total_amount = 0;


    //----- Control the map
    public Map<String, Double> getMonthly_amount() {
        return monthly_amount;
    }

    public void setMonthly_amount(Map<String, Double> monthly_amount) {
        this.monthly_amount = monthly_amount;
    }
    public void add_element_to_monthly_amount_map( String key, Double value){

        this.monthly_amount.put(key,value);
    }

    //-------- end of Control map


    public void update_total_amount()
    {

        for (String key: this.monthly_amount.keySet())
        {
            this.total_amount += this.monthly_amount.get(key);
        }
    }
    public boolean zakat_algorithem(double  gold_price)
    {
        double gold_price_85_gm = 85*gold_price;
        this.update_total_amount();

        if(total_amount >= gold_price_85_gm)
            return true;
        else
            return  false;

    }


}



///////////////  Zakat  Test
/*

Zakat trial = new Zakat();
		boolean m;
		Map<String,Double> monthly_amount = new HashMap<String, Double>();
		monthly_amount.put("mar", 50.0);
		monthly_amount.put("apr", 35.0);
		trial.setMonthly_amount(monthly_amount);
		m = trial.zakat_algorithem(1.0);
		System.out.println(m);




 */
