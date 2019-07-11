package com.pnakaj.io.serilization;



import java.io.*;

public class NonSerializedSuperClassTest {

    public static void main(String[] args) {
        PermanentEmployee permanentEmployee = new PermanentEmployee();
        permanentEmployee.setId(1);
        permanentEmployee.setName("A");
        permanentEmployee.setBaseId(100);
        permanentEmployee.setBaseLocation("Pune");

        System.out.println("Before Serilizaiton");
        serilized(permanentEmployee);

        System.out.println("Before Deseilizaiton");
        permanentEmployee.setBaseId(200);
        deSerilized();
    }

    private static void deSerilized() {
        try {
            System.out.println(new ObjectInputStream(new FileInputStream("d:\\test.json")).readObject());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void serilized(PermanentEmployee permanentEmployee) {

        try {
            new ObjectOutputStream(new FileOutputStream("d:\\test.json")).writeObject(permanentEmployee);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class BaseEmployee {
    private int id;
    private String name;
    private transient static int baseId;

    BaseEmployee(){
        System.out.println("BaseEmployee.BaseEmployee");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseId() {
        return baseId;
    }

    public void setBaseId(int baseId) {
        this.baseId = baseId;
    }
}

class PermanentEmployee extends BaseEmployee implements Serializable{

    private String baseLocation;

    class PermanentEmployeeInner {
        int pId;

        public int getpId() {
            return pId;
        }

        public void setpId(int pId) {
            this.pId = pId;
        }
    }

    public PermanentEmployee() {
        System.out.println("PermanentEmployee.PermanentEmployee");
    }

    public String getBaseLocation() {
        return baseLocation;
    }

    public void setBaseLocation(String baseLocation) {
        this.baseLocation = baseLocation;
    }

    @Override
    public String toString() {
        return "PermanentEmployee{" +
                "baseLocation='" + baseLocation + '\'' +
                "id='" + getId() + '\'' +
                "name='" + getName() + '\'' +
                "baseId='" + getBaseId() + '\'' +
                "pIEd='" +  + '\'' +
                '}';
    }
}
