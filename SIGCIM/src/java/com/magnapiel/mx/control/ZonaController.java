///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.magnapiel.mx.control;
//
//import java.util.Map;
//import org.
//import org.apache.struts2.rest.DefaultHttpHeaders;
//import org.apache.struts2.rest.HttpHeaders;
//import com.opensymphony.xwork2.ModelDriven;
//import com.magnapiel.mx.modelo.bean.BeanZona;
//
//public class ZonaController implements ModelDriven<Object> {
//
//    private static final long serialVersionUID = 1L;
//    private String id;
//    private Object model;
//    private ZonaRepository employeeRepository = new ZonaRepository();
//
//    private static Map<String, BeanZona> map;
//
//    {
//        map = employeeRepository.findAllZonas();
//    }
//
//    public HttpHeaders index() {
//        model = map;
//        return new DefaultHttpHeaders("index").disableCaching();
//    }
//
//    public String add() {
//        Integer empId = Integer.parseInt(id);
//        BeanZona emp = new BeanZona(empId, 15, "PQR");
//        model = emp;
//        return "SUCCESS";
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        model = employeeRepository.getZonaById(id);
//        this.id = id;
//    }
//
//    @Override
//    public Object getModel() {
//        return model;
//    }
//}
