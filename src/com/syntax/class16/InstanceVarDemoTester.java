package com.syntax.class16;

public class InstanceVarDemoTester {
    public static void main(String[] args) {
        InstanceVarDemo instanceVarDemo = new InstanceVarDemo();
        System.out.println(instanceVarDemo.sum);
        instanceVarDemo.sum();
        System.out.println(instanceVarDemo.sum);
        instanceVarDemo.calculateAverage();
    }
}
