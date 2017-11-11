package com.pnakaj.thread;


/**
 * Created by pankaj on 4/11/2017.
 */
public class SyncronizedWithMethod {

    public static void main(String[] args) {

        Resource resource = new Resource();
        GetThread getThread = new GetThread(resource);
        PostThread postThread = new PostThread(resource);
        PutThread putThread = new PutThread(resource);
        DeleteThread deletetThread = new DeleteThread(resource);


        getThread.start();
        postThread.start();
        putThread.start();
        deletetThread.start();


        synchronized (resource.getClass()) {
            System.out.println("----------start-----------------");
            try {
                Thread.sleep(50000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("----------end-----------------");
        }
//
    }

}

class Resource {
    static synchronized public void get() {
        for (int i = 0; i < 10; i++) {

            System.out.println("Get Method : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

     synchronized public void post() {
        for (int i = 0; i < 10; i++) {
            System.out.println("post Method : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


     public void put() {
        for (int i = 0; i < 10; i++) {
            System.out.println("put Method : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


    public void delete() {
        for (int i = 0; i < 10; i++) {
            System.out.println("delete Method : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}

class GetThread extends Thread {

    private Resource resource;

    public GetThread(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.get();
    }
}


class PostThread extends Thread {

    private Resource resource;

    public PostThread(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.post();
    }
}


class PutThread extends Thread {

    private Resource resource;

    public PutThread(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.put();
    }
}


class DeleteThread extends Thread {

    private Resource resource;

    public DeleteThread(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.delete();
    }
}


