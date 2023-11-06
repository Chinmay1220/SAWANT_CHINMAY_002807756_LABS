/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import javax.swing.ImageIcon;

/**
 *
 * @author Rushabh
 */
public class Supplier {
    
    private String supplyName;
    private String supplyDesc;
    private ProductCatalog productCatalog;
    private ImageIcon imageItems;

    public ImageIcon getImageItems() {
        return imageItems;
    }

    public void setImageItems(ImageIcon imageItems) {
        this.imageItems = imageItems;
    }

    
    
    public Supplier() {
        productCatalog = new ProductCatalog();
    }

    public String getSupplyName() {
        return supplyName;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }
    
    
    public String getSupplyDesc() {
        return supplyDesc;
    }

    public void setSupplyDesc(String supplyDesc) {
        this.supplyDesc = supplyDesc;
    }
    
    @Override
    public String toString() {
        return supplyName;
    }
    
}
