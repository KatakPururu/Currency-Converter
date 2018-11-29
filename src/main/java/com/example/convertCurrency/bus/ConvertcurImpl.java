package com.example.convertCurrency.bus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.xml.transform.Result;

import com.example.convertCurrency.model.*;


public class ConvertcurImpl {
	private Map<String, ArrayList> currenciesMap = new HashMap<>();
	private ArrayList<Convert> list;
	
	public ConvertcurImpl() {
		Convert currencyMalaysia0= new Convert( "CNY",  1.65919);
		Convert currencyMalaysia1 = new Convert( "BND", 0.327728);
		Convert currencyMalaysia2 = new Convert( "IDR", 3432.25);
		
		list = new ArrayList<>();
		list.add(currencyMalaysia0);
		list.add(currencyMalaysia1);
		list.add(currencyMalaysia2);
		currenciesMap.put("RM", list);
		
		Convert currencyBrunei0= new Convert( "CNY", 5.06101);
		Convert currencyBrunei1 = new Convert( "RM", 3.05038);
		Convert currencyBrunei2 = new Convert( "IDR", 10483.07);
		
		list = new ArrayList<>();
		list.add(currencyBrunei0);
		list.add(currencyBrunei1);
		list.add(currencyBrunei2);
		currenciesMap.put("BND", list);
		
		Convert currencyChina0= new Convert( "BND", 0.197623);
		Convert currencyChina1 = new Convert( "RM", 0.602780);
		Convert currencyChina2 = new Convert( "IDR", 2069.97);
		
		list = new ArrayList<>();
		list.add(currencyChina0);
		list.add(currencyChina1);
		list.add(currencyChina2);
		currenciesMap.put("CNY", list);
		
		Convert currencyIndonesia0= new Convert( "BND", 0.0000954484);
		Convert currencyIndonesia1 = new Convert( "RM", 0.000291215);
		Convert currencyIndonesia2 = new Convert( "CNY", 0.000483142);
		
		list = new ArrayList<>();
		list.add(currencyIndonesia0);
		list.add(currencyIndonesia1);
		list.add(currencyIndonesia2);
		currenciesMap.put("IDR", list);
		
		
	}
	
	public ArrayList getCurrencyResult (String denomination) {
		return currenciesMap.get(denomination);
	}


}
