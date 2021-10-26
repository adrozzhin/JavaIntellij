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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Repl218_Serge {

    public static void main(String[] args) {
        List<String> deviceNames = Arrays.asList("switch", "t0v", "switch", "tv", "switch", "tv", "radio");
        System.out.println(countDeviceNames(deviceNames));
    }

    public static List<String> countDeviceNames(List<String> deviceNames) {
        for (int i=0; i < deviceNames.size(); i++) {
            String str1 = deviceNames.get(i);
            if (!str1.contains("[0-9]")) {
                int index = 1;
                for (int j = i+1; j < deviceNames.size(); j++) {
                    String str2 = deviceNames.get(j);
                    if (str1.equals(str2)) {
                        str2 = str2 + index;
                        index++;
                        deviceNames.set(j, str2);
                    }
                }
            }
        }
        return deviceNames;
    }
}