package com.collections.mapinterface.groupobjectbyproperty;
class Department {
    String name;

    Department(String name) {
        this.name = name;
    }

    // Important for Map key
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department d = (Department) o;
        return name.equals(d.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}