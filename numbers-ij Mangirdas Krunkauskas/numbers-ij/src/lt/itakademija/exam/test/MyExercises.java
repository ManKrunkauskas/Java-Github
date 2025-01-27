package lt.itakademija.exam.test;

import lt.itakademija.exam.Exercises;
import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;

import java.util.*;

public class MyExercises implements Exercises {
    @Override
    public Integer findSmallest(List<Integer> list) {
        if (list == null || list.size() == 0) {
            return Integer.MIN_VALUE;
        }

        List<Integer> sortedlist = new ArrayList<>(list);
        Collections.sort(sortedlist);
        return sortedlist.get(0);
    }

    @Override
    public Integer findLargest(List<Integer> list) {
        if (list == null || list.size() == 0) {
            return Integer.MIN_VALUE;
        }

       return Collections.max(list);
    }

    @Override
    public boolean isEqual(Object o, Object o1) {
            if (o == null && o1 == null) return true;
            if (o == null || o1 == null) return false;
            return o.equals(o1);
        }

    @Override
    public boolean isSameObject(Object o, Object o1) {
        return o == o1;
    }

    @Override
    public List<Integer> consume(Iterator<Integer> iterator) {
        List<Integer> consumed = new ArrayList<>();
        while (iterator.hasNext()) {
            consumed.add(iterator.next());
        }
        return consumed;
    }

    @Override
    public int computeSumOfNumbers(int i) {
        int sum = 0;
        while (i != 0) {
            sum += i % 10;
            i = i / 10;
        }
        return sum;
    }


        @Override
        public int computeSumOfNumbers(int n, NumberFilter numberFilter) {
            if (n <= 0 || numberFilter == null) return 0;
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (numberFilter.accept(i)) {
                    sum += i;
                }
            }
            return sum;
        }

    @Override
    public List<Integer> computeNumbersUpTo(int n) {
        if (n <= 1) return new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    @Override
    public Map<Integer, Integer> countOccurrences(List<Integer> list) {
        if (list == null || list.isEmpty()) return Collections.emptyMap();
        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        for (Integer num : list) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        return countMap;
    }

    @Override
    public IntegerGenerator createIntegerGenerator(int i, int i1) {
        Random ran = new Random();
        int nxt = ran.nextInt();
        System.out.println(nxt);
        return null;
    }

    @Override
    public IntegerGenerator createFilteredIntegerGenerator(IntegerGenerator integerGenerator, NumberFilter numberFilter) {
        return null;
    }
}
