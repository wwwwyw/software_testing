package wyw;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public  class Money {
    public static boolean whetherOrNot(int x) {
        int[] initialNum = {50, 20, 10, 5, 5, 1, 1, 1};
        List<Integer> afterNum = new ArrayList<Integer>();
        afterNum.add(0);
        for (int i = 0; i < initialNum.length; i++) {
            afterNum.add(initialNum[i]);//先把单个的加入list
            for (int l = i + 1; l < initialNum.length; l++) {
                afterNum.add(initialNum[i] + initialNum[l]);//再把两个两个加入list
                for (int k = l + 1; k < initialNum.length; k++) {
                    afterNum.add(initialNum[i] + initialNum[l] + initialNum[k]);//再三个三个加入list
                    for (int m = k + 1; m < initialNum.length; m++) {
                        afterNum.add(initialNum[i] + initialNum[l] + initialNum[k] + initialNum[m]);//再四个四个加入list
                        for (int n = m + 1; n < initialNum.length; n++) {
                            afterNum.add(initialNum[i] + initialNum[l] + initialNum[k] + initialNum[m] + initialNum[n]);//再五个五个加入list
                            for (int o = n + 1; o < initialNum.length; o++) {
                                afterNum.add(initialNum[i] + initialNum[l] + initialNum[k] + initialNum[m] + initialNum[n] + initialNum[o]);//再6个6个加入list
                                for (int p = o + 1; p < initialNum.length; p++) {
                                    afterNum.add(initialNum[i] + initialNum[l] + initialNum[k] + initialNum[m] + initialNum[n] + initialNum[o] + initialNum[p]);//再7个7个加入list
                                    for (int j = p + 1; j < initialNum.length; j++) {
                                        afterNum.add(initialNum[i] + initialNum[l] + initialNum[k] + initialNum[m] + initialNum[n] + initialNum[o] + initialNum[p] + initialNum[j]);//再8个8个加入list

                                    }
                                }
                            }
                        }
                    }

                }

            }
        }
        if (afterNum.contains(x)) {
            return true;
        } else {
            return false;
        }
    }



}
