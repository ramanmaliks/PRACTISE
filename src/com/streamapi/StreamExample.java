package com.streamapi;

/*class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
} */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Product1> productsList = new ArrayList<>();
        //Adding Products
        productsList.add(new Product1(1,"HP Laptop",25000f));
        productsList.add(new Product1(2,"Dell Laptop",30000f));
        productsList.add(new Product1(3,"Lenevo Laptop",28000f));
        productsList.add(new Product1(4,"Sony Laptop",28000f));
        productsList.add(new Product1(5,"Apple Laptop",90000f));
        productsList.forEach(e->System.out.println(e.name)); //using forEach without Stream
        productsList.stream().forEach(e->System.out.println("Stream:"+e.name)); //using Stream with forEach
        productsList.stream().forEachOrdered(e->System.out.println("Ordered"+e.name)); //using Stream with forEachOrdered

        //for(int i=0; i <= productsList.size() ; i++) {
        //System.out.println("Product List" + productsList.[i]);}
        // This is more compact approach for filtering data  (adding all the price)
        Float totalPrice = productsList.stream()
                    .map(Product1->Product1.price)
                    .reduce(0.0f,(sum, price)->sum+price);   // accumulating price
        System.out.println("Total Price" + totalPrice);
        // More precise code   for adding price
        float totalPrice2 = productsList.stream()
                .map(product->product.price)
                .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class
        System.out.println(totalPrice2);
        System.out.println("*************Price Greater than 250000***********");
        // WITHOUT VARIABLE
        productsList.stream()
        .filter(p -> p.price > 25000f)
        .map(product->product.price)
        .forEach(System.out::println);
        productsList.stream().filter(p -> p.price > 25000f).map(product->product.price).forEachOrdered(System.out::println);

        System.out.println("*************Printing Product data using .map***********");
        productsList.stream().map(p-> p.id +","+p.name +","+  p.price ).forEach(System.out::println);
        System.out.println("*************String***********");

        List<String> liststr = Arrays.asList("raman","malik","nakuls");
        liststr.stream().map(str -> str.length()).forEach(System.out::println);
        liststr.stream().forEach(System.out::println);
        liststr.stream().forEach(e -> System.out.println("Name "+e));

        List<Integer> listInt = new ArrayList<>();
        listInt.add(2);
        listInt.add(4);
        listInt.add(232);
        listInt.stream().forEach(System.out::println);
        listInt.stream().forEach(e->System.out.println("Int" +e));

        System.out.println("*************COUNT***********");

        List<String> stringList = new ArrayList<>();

        stringList.add("ONE");
        stringList.add("TWO");
        stringList.add("THREE");

        Stream<String> stream = stringList.stream();

        //long count = stream
        //    .map((value) -> { return value.toLowerCase(); })
        //    .count();

        //System.out.println("count = " + count);

        Stream<String> longStringsStream = stream.filter((value) -> {
            return value.length() >= 3;
        });

        System.out.println("count = " + longStringsStream);
    }
}