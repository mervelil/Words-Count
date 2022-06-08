/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mervecelik;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author merve çelik
 */
public class MinHeap  {
    Node heap [];
    private int size;

    public MinHeap(int N) {
        heap= new Node[N];
        size=0;
    }
    int parent(int index){
        return (index-1)/2;
    }
    void swap(int i, int j){
        Node temp=heap[i];
        heap[i]=heap[j];
        heap[j]=temp;
    }
    void insert(Node data){
        if(size<heap.length){
            heap[size]=data;
            int current=size;
            int parent=parent(current);
            
            while(heap[current].count<(heap[parent].count)){
                swap(current,parent);
                current=parent;
                parent=parent(current);
            }
            size++;
        }else{
            System.out.println("Heap is full!");
        }
    }
    void print(){
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i].data+" "+heap[i].count+" ");
        }
        System.out.println();
    }
    void heapify(){
        int lastindex=size-1;
        int parent=parent(lastindex);
        
        for (int i = parent; i >=0; i--) {
            minHeap(i);
        }
    }
    void minHeap(int i){
        int left=2*i+1;
        int right=2*i+2;
        
        int min=i;
        if(left<size && heap[left].count<(heap[min].count)){
            min=left;
        }
        if(right<size && heap[right].count<(heap[min].count)){
            min=right;
        }
        if(min!=i){
            swap(min, i);
            minHeap(min);
        }
            
    }
         void heapSort() {
         int lstIndx = size-1;
        int tempSize= size;
        for (int i = lstIndx; i > 0; i--) {
            swap(0, i);
            size--;
            minHeap(0);
        }
        for (int i = 0; i < tempSize; i++) {
            System.out.print(heap[i].data + " " +heap[i].count+ " ");
        }
        System.out.println(" ");
    }

          
    
  
    Node deleteMin(){
        Node deleted=heap[0];
        heap[0]=heap[size-1];
        size--;
        heapify();
        return deleted;
    }
      public static int getCount(String word, TreeMap<String, Integer> frequencyData)
    {
        if (frequencyData.containsKey(word))
        {  // The word has occurred before, so get its count from the map  
            return frequencyData.get(word); // Auto-unboxed  
        }
        else
        {  // No occurrences of this word  
            return 0;
        }
    }


    public static void printAllCounts(TreeMap<String, Integer> frequencyData)
    {
        System.out.println("-----------------------------------------------");
        System.out.println("    Occurrences    Word");

        for(String word : frequencyData.keySet( ))
        {
            System.out.printf("%15d    %s\n", frequencyData.get(word), word);
        }

        System.out.println("-----------------------------------------------");
    }




    
}
