package dsa;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
//ArrayList
public class DynaminArray<T> implements Iterable<T>{
    
    int initaiCapa=8;
    T[] arr;
    int size;
    int capacity;
    
    
    @SuppressWarnings("unchecked")
    DynaminArray(){
        size=0;
        arr=(T[])new Object[initaiCapa];
        capacity=initaiCapa;
        
    }
    
    
    public void add(T a) {
        if(size==capacity) {
            expandArray();
        }
        arr[size++]=a;
       
            
    }


    private void expandArray() {
        capacity*=2;
       arr= Arrays.copyOf(arr, capacity);
        
    }
    
    public void insertAtPos(int pos,T val) {
        if(size==capacity) {
            expandArray();
        }
        for(int i=size-1;i>=pos;i--) {
            arr[i+1]=arr[i];
        }
        arr[pos]=val;
        size++;
    }
    public void deleteAtPos(int pos) {
        for(int i=pos+1;i<size;i++) {
           arr[i-1]=arr[i];
        }
        size--;
        
        if(capacity>initaiCapa && capacity>size*3) {
            reduceArray();
        }
    }
    private void reduceArray() {
        capacity/=2;
        arr= Arrays.copyOf(arr, capacity);        
    }


    public void display() {
        for(int i=0;i<size;i++) {
            System.out.print(arr[i]+" ");
        }
    }


    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return new Iterator<T>() {

            int index=0;
            @Override
            public boolean hasNext() {
                // TODO Auto-generated method stub
                return index<size;
            }

            @Override
            public T next() {
                // TODO Auto-generated method stub
                return arr[index++];
            }
            
        };
    }

}
