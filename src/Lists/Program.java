package Lists;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();

        list.add("Testeson");
        list.add("Sideshow");
        list.add("Bob");
        list.add("Naveem");
        list.add(2, "Krusty"); //Adiciona "Krusty" na posição 2 da lista
        System.out.println("Size of list: " + list.size());


        System.out.println("List after: ");
        for(String item : list ){
            System.out.println("Item: " + item);
        }

        list.remove(1);
        list.removeIf(item -> item.charAt(0) == 'B');

        System.out.println("List before: \n");
        for(String item : list ){
            System.out.println("Item: " + item);
        }

        System.out.println("\n------------------------------\n");
        System.out.println("Index of Naveem: " + list.indexOf("Naveem"));

        System.out.println("\n------------------------------\n");
        System.out.println("Filtering list by names with N character: \n");

        List<String> filteredList = list.stream().filter(item -> item.charAt(0) == 'N').toList();

        for(String item : filteredList ){
            System.out.println("Item: " + item);
        }
        System.out.println("\n------------------------------\n");
        String name = list.stream().filter(item -> item.charAt(0) == 'N').findFirst().orElse(null);
        System.out.println("Filtered name: " + name);
    }
}
