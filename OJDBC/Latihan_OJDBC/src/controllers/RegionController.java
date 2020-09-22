/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.RegionDao;
import java.util.List;
import tools.Koneksi;
import models.Region;
import tools.Koneksi;

/**
 *
 * @author Deo Lahara
 */
public class RegionController {
    private RegionDao regionDao;

    public RegionController() {
        this.regionDao = new RegionDao(new Koneksi().getConnection());
    }
    
    public List<Region> getDataRegion (){
        return regionDao.getRegions();
    }
    
    public String saveRegion (String id, String name){
        int rId = Integer.parseInt(id);
        Region region = new Region(rId, name);
        return regionDao.insertRegion(region)? "Sukses":"Gagal";
    }
    
    public String editRegion(String id, String name){
        int rId = Integer.parseInt(id);
        Region region = new Region(rId, name);
        return regionDao.updateRegion(region)? "Sukses":"Gagal";
    }
    
    public List<Region> findRegion(String id){
        int rId = Integer.parseInt(id);
        return regionDao.searchRegion(rId);
    }
    
}
