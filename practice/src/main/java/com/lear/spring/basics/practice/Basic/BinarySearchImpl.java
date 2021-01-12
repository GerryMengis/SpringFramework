package com.lear.spring.basics.practice.Basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

    private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm;

    // Setter/no setter injection by taking Constructor out

    // public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
    // super();
    // this.sortAlgorithm = sortAlgorithm;
    // }

    public int binarySearch(int[] number, int value) {
        // Bubble Sort Algorithm
        // BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        int[] sortedNumbers = sortAlgorithm.sort(number);
        System.out.println(sortAlgorithm);
        // Implement Search array
        // return result
        return 3;
    }

    @PostConstruct
    public void postConstruct() {
    logger.info("postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("preDestroy");
    }
}
