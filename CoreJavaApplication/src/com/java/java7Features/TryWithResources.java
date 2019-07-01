package com.java.java7Features;

public class TryWithResources {

    public static void main(String[] args) {
        try (TestMe r = new TestMe()) {
            r.generalTest();
        } catch(Exception e) {
            System.out.println("From Exception Block");
        } finally {
            System.out.println("From Final Block");
        }
    }
}



class TestMe implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println(" From Close -  AutoCloseable  ");
    }

    public void generalTest() {
        System.out.println(" GeneralTest ");
    }
}
