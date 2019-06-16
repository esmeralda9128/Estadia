package com.magnapiel.mx.aplicacion;

import com.magnapiel.mx.modelo.bean.BeanCliente;
import com.magnapiel.mx.modelo.dao.DaoCliente;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Esmeralda Estefanía Rodríguez Ramos
 * @version 1 10/06/2019
 *
 */
@Path("/SIGCIM")

public class AplicacionSIGCIM extends Application {

    private BeanCliente unCliente;
    private List<BeanCliente> clientes = null;
    private DaoCliente dao;
    Map respuestas = new HashMap();

  
    @Path("consultarClientesAdministrador")
@Produces({"text/plain", "text/html","text/xml", "application/json"}) //Indicamos que el tipo de salida es texto plano, XML, HTML o JSON
    public Response consultarProyectos() {
        System.out.println("Entra aqui");
        dao = new DaoCliente();
        clientes = dao.consultarClientes();
        respuestas.put("clientes", clientes);
        JSONObject objeto = new JSONObject();
        try {
            objeto.put("respuesta", respuestas);

        } catch (JSONException e) {
            System.out.println("Error" + e);
        }
        Response.ResponseBuilder constructor = Response.ok(objeto.toString());
        constructor.header("Access-Control-Allow-Origin", "*");
        constructor.header("Access-Control-Allow-Methods", "*");
        return constructor.build();

    }

}
