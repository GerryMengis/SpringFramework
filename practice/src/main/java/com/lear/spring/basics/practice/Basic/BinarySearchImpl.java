package com.lear.spring.basics.practice.Basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

    @Autowired
    @Qualifier("quick")
    private SortAlgorithm sortAlgorithm;

    // Setter/no setter injection by taking Constructor out

    // public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
    //     super();
    //     this.sortAlgorithm = sortAlgorithm;
    // }

    public int binarySearch(int[] number, int value) {
        // Bubble Sort Algorithm
        BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        int[] sortedNumbers = bubbleSortAlgorithm.sort(number);
        System.out.println(sortAlgorithm);

        // Implement Search array
        // return result
        return value;
    }
}
