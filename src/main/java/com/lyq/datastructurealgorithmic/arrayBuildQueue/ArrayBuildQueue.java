package com.lyq.datastructurealgorithmic.arrayBuildQueue;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author lyq
 * @description: 数组构建队列
 * @date 2022/1/25 11:36
 */
@Component
public class ArrayBuildQueue {
    //数组存储数据
    private int front;
    private int rear;
    private int[] arr;
    private int maxSize;
    //构建队列构造器
    public ArrayBuildQueue( int arrmaxSize) {
        //指向头数据的前一个位置
        this.front =-1;
        //指向尾数据的位置
        this.rear = -1;
        //数组容量
        maxSize=arrmaxSize;
        this.arr = new int[maxSize];
    }



    //判断队列是否满了
    public  boolean isFull(){
        if(rear==maxSize-1){
            return  true;
        }
        return  false;
    }
    //判断队列是否为空
    public  boolean isNull(){
        if(rear==front){
            return  true;
        }
        return  false;
    }
    //添加数据到队列--其中要判断啥--考虑
    public void addQueue(int n){
        if(isFull()){
            return;
        }
        rear++;
        arr[rear]=n;
    }
    //获取队列数据（取出数据）--出队列--判断什么--考虑
    public int getQueue(){
        if(isNull()){
            System.out.println("此队列为空，不能获取数据");
        }
        front++;
        int result=arr[front];
        //取出数据
        arr[front]=0;
      return  result;
    }
    //获取队列头部数据（不取出数据）--不出队列--判断什么--考虑
    public int showHeadQueue(){
        if(isNull()){
            System.out.println("此队列为空，不能显示头数据");
        }
        front++;
        //只显示不取出
        return   arr[front];
    }
    //显示队列所有数据--考虑一下
    public void getAllQueue(){
        if(isNull()){
            System.out.println("此队列为空，不能显示所有数据");
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("显示完毕");
    }

}
