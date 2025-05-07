package Opps;

import Opps.pojo.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String args[]) {
        Map<String, Employee> emp = new HashMap<>();
        emp.put("1", new Employee(1, "Jaiky", 20000));
        emp.put("2", new Employee(2, "Kumar", 3000));
        emp.put("3", new Employee(3, "Kumar", 500000));

        /*emp.entrySet().stream().filter(e ->e.getValue().getName().equals("Kumar"))
                .map(e->e.getValue().getSalary()).forEach(System.out::println);*/

        ThreadPrinting th = new ThreadPrinting();
        new Thread(th::print).start();
        new Thread(() -> {th.print(); th.num++;th.print();th.num++;th.print();}).start();


    }
}
