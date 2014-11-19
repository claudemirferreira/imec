// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package br.fucapi.wspoc.controller;

import br.fucapi.wspoc.controller.PessoaController;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

privileged aspect PessoaController_Roo_Json {
    
    public String PessoaController.toJson() {
        return new JSONSerializer().exclude("*.class").serialize(this);
    }
    
    public String PessoaController.toJson(String[] fields) {
        return new JSONSerializer().include(fields).exclude("*.class").serialize(this);
    }
    
    public static PessoaController PessoaController.fromJsonToPessoaController(String json) {
        return new JSONDeserializer<PessoaController>().use(null, PessoaController.class).deserialize(json);
    }
    
    public static String PessoaController.toJsonArray(Collection<PessoaController> collection) {
        return new JSONSerializer().exclude("*.class").serialize(collection);
    }
    
    public static String PessoaController.toJsonArray(Collection<PessoaController> collection, String[] fields) {
        return new JSONSerializer().include(fields).exclude("*.class").serialize(collection);
    }
    
    public static Collection<PessoaController> PessoaController.fromJsonArrayToPessoaControllers(String json) {
        return new JSONDeserializer<List<PessoaController>>().use(null, ArrayList.class).use("values", PessoaController.class).deserialize(json);
    }
    
}
