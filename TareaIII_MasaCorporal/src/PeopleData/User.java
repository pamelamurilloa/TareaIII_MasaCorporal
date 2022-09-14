package PeopleData;

import java.util.HashMap;

/**
 *
 * @author pamelamurillo
 */
public class User {
    
    private HashMap usersInfoHM = new HashMap(); 
    
    private String name;
    private int id;
    private int age;
    private int weight; //This will always be in kilograms
    private int height; //This will always be in meters
    private int bodyMass = weight/height;        

    public User(String name, int id, int age, int weight, int height) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.height = height;
    } 
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBodyMass() {
        return bodyMass;
    }

    public void setBodyMass(int bodyMass) {
        this.bodyMass = bodyMass;
    }
            
    
    
}
