package com.pnakaj.io.serilization;

import java.io.*;

//Unpublished Work © 2017 Deere & Company.

public class NonSerilizedRefrenceClass {

    public static void main(String[] args) {
        BaseCustomer baseCustomer = new BaseCustomer();
        baseCustomer.setId(1);
        baseCustomer.setName("A");
        baseCustomer.setBaseId(100);
        PermanentCustomer permanentCustomer = new PermanentCustomer();
        permanentCustomer.setBaseCustomer(baseCustomer);

        permanentCustomer.setBaseLocation("Pune");
        System.out.println("Before Serilizaiton");
        serilized(permanentCustomer);
        System.out.println("Before Deseilizaiton");
        baseCustomer.setBaseId(200);

        deSerilized();
    }

    private static void deSerilized() {
        try {
            System.out.println(new ObjectInputStream(new FileInputStream("c:\\test.json")).readObject());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void serilized(Object permanentEmployee) {

        try {
            new ObjectOutputStream(new FileOutputStream("c:\\test.json")).writeObject(permanentEmployee);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class BaseCustomer {
    private int id;
    private String name;
    private transient static int baseId;

    BaseCustomer() {
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

class PermanentCustomer implements Serializable {

    private String baseLocation;
    private BaseCustomer baseCustomer;

    public void setBaseCustomer(BaseCustomer baseCustomer) {
        this.baseCustomer = baseCustomer;
    }

    private void writeObject(java.io.ObjectOutputStream out)
            throws IOException{
        out.writeInt(baseCustomer.getBaseId());
        out.writeObject(baseCustomer.getName());
    }

    private void readObject(java.io.ObjectInputStream in)
            throws IOException {
        baseCustomer = new BaseCustomer();
        baseCustomer.setId(in.readInt());
        try {
            baseCustomer.setName((String) in.readObject());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    class PermanentEmployeeInner {
        int pId;

        public int getpId() {
            return pId;
        }

        public void setpId(int pId) {
            this.pId = pId;
        }
    }

    public PermanentCustomer() {
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
                "id='" + baseCustomer.getId() + '\'' +
                "name='" + baseCustomer.getName() + '\'' +
                "baseId='" + baseCustomer.getBaseId() + '\'' +
                '}';
    }
}
