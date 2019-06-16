/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magnapiel.mx.control;
import com.magnapiel.mx.modelo.bean.BeanZona;
import java.util.HashMap;
import java.util.Map;
public class ZonaRepository {
	private static Map<String,BeanZona> map = new HashMap<String,BeanZona>(); 
	public ZonaRepository(){
                 //COnsultar a BASE DE DAToS y ITERAR REGISTROS
		map.put("111", new BeanZona(111, 25, "ABC"));
		map.put("222", new BeanZona(222, 15, "EFG"));
		map.put("333", new BeanZona(333, 25, "XYZ"));
	}
	public  BeanZona getZonaById(String id){
		return map.get(id);
	}
	public  Map<String,BeanZona> findAllZonas(){
		return map;
	}
} 