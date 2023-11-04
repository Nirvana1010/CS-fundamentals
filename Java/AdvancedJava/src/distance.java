import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import static java.lang.Float.NaN;

public class distance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String city = in.next();
        HashMap<String, HashMap> map = new HashMap<>();
        ArrayList<String> cities = new ArrayList<String>();
        while (!city.equals("###")) {
            map.put(city, new HashMap<>());
            cities.add(city);
            city = in.next();
        }
        in.nextLine();
        int n = cities.size();
        for (int i = 0; i < n; i++) {
            String dist = in.nextLine();
            String[] dists = dist.split(" ");
            for (int j = 0; j < n; j++) {
                String city1 = cities.get(i);
                String city2 = cities.get(j);
                map.get(city1).put(city2, dists[j]);
            }
        }
        String city1 = in.next();
        String city2 = in.next();
        System.out.println(map.get(city1).get(city2));
    }
}
