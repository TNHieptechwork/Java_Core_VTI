package org.example.bt6;

import java.util.*;
import java.util.function.Supplier;

public class RegistryFactory {
    private static final Map<String, Supplier<Product>> registry = new HashMap<>();
    public static void register(String type, Supplier<Product> supplier){
        registry.put(type.toLowerCase(),supplier);
    }

    public static Product create(String type){
        Supplier<Product> supplier = registry.get(type.toLowerCase());
        if(supplier != null){
            return supplier.get();
        }
        return  null;
    }
}
