/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Rushabh
 */
public class Product {
    
    private String name;
    private int price;
    private int id;
    private ImageIcon productImage;
    private String Feature;

    public String getFeature() {
        return Feature;
    }

    public void setFeature(String Feature) {
        this.Feature = Feature;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String Value) {
        this.Value = Value;
    }
    private String Value;
    
    private ArrayList<Feature> features;    
    
    private static int count = 0;
    
    public Product() {
        count++;
        id = count;
        features = new ArrayList<Feature>();
    }
    
    public ImageIcon getProductImage() {
        return productImage;
    }

    public void setProductImage(ImageIcon productImage) {
        this.productImage = productImage;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }
    
    public Feature addFeatures(Product product, String feature_name, Object value) {
        Feature new_features;
        new_features = new Feature(product,feature_name,value);
        this.features.add(new_features);
        return new_features;
        
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
