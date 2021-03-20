package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Java堆 溢出
 * <p>
 * VM Args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * -Xms20m
 * -Xmx20m
 * -XX:+HeapDumpOnOutOfMemoryError
 *
 * @author : jacob
 * @date : 2021/03/20
 */

import  java.sql.Connection;
public class HeapOOM {
    static class OOMObject {

    }

    public static void main(String[] args) throws InterruptedException {

        List<OOMObject> list = new ArrayList<>();

        Thread.sleep(5000L);

        while (true) {
            list.add(new OOMObject());
        }
    }
}
