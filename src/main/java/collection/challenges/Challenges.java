package collection.challenges;

import java.util.*;

public class Challenges {


    //You must complete the implementation of these methods so that unit test pass.

    /*
        Given an array nums, return a new array where only unique sorted values exist
    */
    public int[] uniqueValues(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int[] result  = new int[set.size()];
        Iterator<Integer> iterator = set.iterator();
        int i = 0;
        while(iterator.hasNext()){
            result[i] = iterator.next();
            i++;
        }
        Arrays.sort(result);
        return result;
    }


    /*
        Given an array nums, return the max value. If the array is empty, simply return -1
    */
    public int maxFromArray(int[] nums){
        if(nums.length == 0)
            return -1;
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
           if(nums[i] > max) max = nums[i];
        }
        return max;
    }

    /*
        Given a list of String elements, return a new list where
         there are only elements that have more than 3 chars
    */
    public List<String> charsOver3(List<String> list){
        List<String> newList  = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length()  > 3)
                newList.add(list.get(i));
        }
        return newList;
    }

    /*
        Given two lists, return a new list where only unique elements
        from 2 lists exist
    */
    public List<Integer> addTwoLists(List<Integer> list1, List<Integer> list2){
        Set<Integer> newSet = new HashSet<>();
        for (int i = 0; i < list1.size(); i++) {
            newSet.add(list1.get(i));
        }
        for (int j = 0; j < list2.size(); j++) {
            newSet.add(list2.get(j));
        }
        List<Integer> newList = new ArrayList<>();
        Iterator<Integer> iterator = newSet.iterator();
        while (iterator.hasNext()){
            newList.add(iterator.next());
        }
            return newList;

    }

    /*
        Given String str, return how many 'ab' repeats in this str. You can ignore case sensitivity
    */
    public int repeatAbCount(String str){
        int count = 0;

        if(str == null) return count;
        str = str.toLowerCase();

        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) =='a' && str.charAt(i+1) =='b')
                count++;
        }
        return count;
    }


    /*
        Given the argument list, return the difference between the largest and the smallest values.
        In case of empty list, return -1
    */
    public int bigDiff(List<Integer> list){
        if(list.size() == 0) return -1;
        int largest = list.get(0);
        int smallest = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) > largest)
                largest = list.get(i);
            if(list.get(i) < smallest)
                smallest = list.get(i);

        }
        return (largest-smallest);
    }

    /*
        Given two lists, calculate their averages separately and return the largest of them.
        Return 0 in case both lists are empty
    */
    public double maxAverage(List<Integer> list1, List<Integer> list2) {
        if (list1 == null && list2 == null) return 0;
        int sum1 = 0;
        int sum2 = 0;
        int avarage1 = 0;
        int avarage2 = 0;
        int max;
        for (int i = 0; i < list1.size(); i++) {
            sum1 = sum1 + list1.get(i);
        }
        avarage1 = (sum1 / list1.size());
        for (int j = 0; j < list2.size(); j++) {
            sum2 = sum2 + list2.get(j);
        }
        avarage2 = (sum2 / list2.size());
        max = Math.max(avarage1, avarage2);
        return max;

    }

    /*
        Given a list of String values and leng, return the number of elements that have the same length as leng
    */
    public int wordsCount(List<String> list, int leng){
        int number = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length() == leng)
                number++;
        }
        return number;
    }

    /*
        Given int num, return a list where it contains values from 0 to num (excluded)
    */
    public List<Integer> fillArr(int num){
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list1.add(i);
        }
        return list1;
    }
}
