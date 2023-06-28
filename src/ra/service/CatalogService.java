package ra.service;

import ra.model.Catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogService implements IService<Catalog, Integer> {
    List<Catalog> catalogs;

    public CatalogService(){
        catalogs = new ArrayList<>();
    }
    public int getSize(){
        return catalogs.size();
    }

    @Override
    public List<Catalog> getAll() {
        return catalogs;
    }

    @Override
    public void save(Catalog catalog) {
        if (findById(catalog.getCatalogId()) == null) {
            catalogs.add(catalog);
        }else {
            catalogs.set(catalogs.indexOf(findById(catalog.getCatalogId())),catalog);
        }

    }

    @Override
    public Catalog findById(Integer id) {
        for (Catalog catalog : catalogs) {
            if(catalog.getCatalogId()==id) {
                return catalog;
            }
        }
        return null;
    }

    @Override
    public void delete(Integer id) {
        if(findById(id)==null) {
            System.out.println("Id không tồn tại!!!");
            return;
        }
        catalogs.remove(findById(id));
    }
}
