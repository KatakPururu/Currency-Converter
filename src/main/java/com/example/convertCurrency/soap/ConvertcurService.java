package com.example.convertCurrency.soap;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.example.convertCurrency.bus.ConvertcurImpl;
import com.example.convertCurrency.model.Convert;

@WebService
public class ConvertcurService {
	ConvertcurImpl cc = new ConvertcurImpl();
	
	@WebMethod
	public ArrayList<Convert> getCurrencyResult (String denomination) {
		return cc.getCurrencyResult(denomination);
	}
}
