/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import controllers.RegionController;
import java.util.List;
import models.Region;

/**
 *
 * @author User
 */
public class ManualTest {
    public static void main(String[] args) {
        System.out.println(new Koneksi().getConnection());
        System.out.println(new RegionController().editRegion("1", "Eropa")); //Edit/Update
//        System.out.println(new RegionController().saveRegion("7", "Kutub Selatan")); 
//        System.out.println(new RegionController().saveRegion("8", "Atlantis")); //Insert
        List<Region> data = new RegionController().findRegion("3");
        for (Region region : data) {
            System.out.println(region.getId()+" "+region.getName());
        }
