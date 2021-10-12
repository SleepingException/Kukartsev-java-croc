package task3;

import java.util.Arrays;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.stream(args).map(Integer::parseInt).collect(Collectors.toList());
        int max = Collections.max(list);
        int tmp = list.get(list.size()-1);
        int min = Collections.min(list);
        list.set(list.indexOf(max), tmp);
        list.set(list.size()-1, max);
        tmp = list.get(0);
        list.set(list.indexOf(min), tmp);
        list.set(0, min);
        System.out.println(list);
    }
}
