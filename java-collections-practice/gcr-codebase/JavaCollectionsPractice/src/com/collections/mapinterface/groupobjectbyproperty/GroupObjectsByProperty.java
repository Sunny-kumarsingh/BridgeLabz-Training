package com.collections.mapinterface.groupobjectbyproperty;
import java.util.*;
public class GroupObjectsByProperty {
    public static void main(String[] args) {

        Department hr = new Department("HR");
        Department it = new Department("IT");

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", hr));
        employees.add(new Employee("Bob", it));
        employees.add(new Employee("Carol", hr));

        Map<Department, List<Employee>> map = new HashMap<>();

        for (Employee e : employees) {
            if (!map.containsKey(e.department)) {
                map.put(e.department, new ArrayList<>());
            }
            map.get(e.department).add(e);
        }

        // Output
        for (Department d : map.keySet()) {
            System.out.print(d.name + ": ");
            for (Employee e : map.get(d)) {
                System.out.print(e.name + " ");
            }
            System.out.println();
        }
    }
}