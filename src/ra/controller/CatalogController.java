package ra.controller;

import ra.model.Catalog;
import ra.service.CatalogService;

import java.util.List;

public class CatalogController {
    CatalogService catalogService = new CatalogService();

    public List<Catalog> getAll(){
        return catalogService.getAll();
    }
    public int getSize(){
        return catalogService.getSize();
    }
    public void save(Catalog catalog){
        catalogService.save(catalog);
    }
    public void delete(Integer id){
        catalogService.delete(id);
    }
    public Catalog findById(Integer id){
        return catalogService.findById(id);
    }
}
