package com.syntax.Repl;

/*
Count the number of repetitions of words in an ArrayList append that count and return that list.
You need to implement a function countDeviceNames that takes an ArrayList as an input and returns an ArrayList

input ["switch","tv","switch","tv","switch","tv"]

output [switch, tv, switch1, tv1, switch2, tv2]

In this example as word switch is repeated we pick the next entry
where it is repeated and append the count i.e how many times that
word was present previously

More Exmaples

input ["switch","tv","switch","tv","switch","tv","radio"]

output [switch, tv, switch1, tv1, switch2, tv2, radio]

input ["switch","tv","switch","tv"]

output [switch, tv, switch1, tv1]

if words are not repeated we get the same output

input ["switch","tv"]

output [switch, tv]
 */

import java.util.*;

public class Repl218 {

    public static void main(String[] args) {
        List<String> deviceNames = Arrays.asList("switch", "tv", "switch", "tv", "switch", "tv", "radio");
        System.out.println(countDeviceNames(deviceNames));
    }

    public static List<String> countDeviceNames(List<String> deviceNames) {
        List<String> countedList = new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < deviceNames.size(); i++) {
            if (map.containsKey(deviceNames.get(i))) {
                String temp = deviceNames.get(i)+""+map.get(deviceNames.get(i));
                countedList.add(temp);
                map.put(deviceNames.get(i), map.get(deviceNames.get(i))+1);
            } else {
                countedList.add(deviceNames.get(i));
                map.put(deviceNames.get(i),1);
            }
        }
        return countedList;
    }
}