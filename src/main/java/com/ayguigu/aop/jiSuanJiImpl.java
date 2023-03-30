package com.ayguigu.aop;

import org.springframework.stereotype.Component;

@Component
public class jiSuanJiImpl implements jiSuanJi {
    @Override
    public int add(int i, int j) {
        int result=i+j;
        System.out.println(result);
        return result;
    }

    @Override
    public int shan(int i, int j) {
        int result=i-j;
        System.out.println(result);
        return result;
    }

    @Override
    public int cheng(int i, int j) {
        int result=i*j;
        System.out.println(result);
        return result;
    }
    @Override
    public int chu(int i,int j){
        int result=i/j;
        System.out.println(result);
        return result;
    }
}
