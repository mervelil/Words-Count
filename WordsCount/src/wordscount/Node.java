/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mervecelik;

/**
 *
 * @author merve çelik
 */
public class Node  <T extends Comparable<T>> {
  String data;
   int count;
   Node <T>  left,right; 

    public Node(String data) {
        this.data = data;
        count=0;
      
    }

  public  Node() {
       
    }

   
}
