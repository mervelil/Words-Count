/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mervecelik;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author merve çelik
 */
public class main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
       
        MinHeap  heap1=new MinHeap(10);
        TreeSearch tree = new TreeSearch();
        TreeSearch tree2 = new TreeSearch();
        TreeSearch tree3 = new TreeSearch();
        TreeSearch tree4 = new TreeSearch();
        TreeSearch tree5 = new TreeSearch();
        TreeSearch tree6 = new TreeSearch();
        TreeSearch tree7 = new TreeSearch();
        TreeSearch tree8 = new TreeSearch();
        TreeSearch tree9 = new TreeSearch();
        TreeSearch tree10 = new TreeSearch();
        File file = new File("cse22501.html");
        
        File file2 = new File("cse22502.html");
        File file3 = new File("cse22503.html");
        File file4 = new File("cse22504.html");
        File file5 = new File("cse22505.html");
        File file6 = new File("cse22506.html");
        File file7 = new File("cse22507.html");
        File file8 = new File("cse22508.html");
        File file9 = new File("cse22509.html");
        File file10 = new File("cse22510.html");
        tree.readFile(file); //aldıgımız dosyayı ıstenilen punc vs okuma ve insert etme
        tree2.readFile(file2);
        tree3.readFile(file3);
        tree4.readFile(file4);
        tree5.readFile(file5);
        tree6.readFile(file6);
        tree7.readFile(file7);
        tree8.readFile(file8);
        tree9.readFile(file9);
        tree10.readFile(file10);
        Scanner girdi = new Scanner(System.in);
        System.out.print("Enter your searching data  : ");
        String ad = girdi.nextLine();
        String[] bol = ad.split(" "); //Boşluk görünce cümleyi bölecektir. Buraya istediğiniz şeyi yazabilirsiniz.
        TreeSearch array[] = {tree, tree2, tree3, tree4, tree5, tree6, tree7, tree8, tree9, tree10};
        for (int i = 0; i < array.length; i++) {
               num(array[i], bol, heap1);
               
        }
        heap1.heapSort();
       
        
        File fl = new File("C:\\NetBeansProjects\\WordsCount\\output.txt");
        FileWriter fw = new FileWriter(fl, true);

        tree.preOrderOutput2(tree.root, fw); //verileri   preorder gore yazdırma
        fw.close();

    }
    static void num(TreeSearch tree,String array[], MinHeap heap){
        Node node = new Node();
        int counter =0;
        for (int i = 0; i < array.length; i++) {    
          Node newNode= tree.search(array[i]);
            if(newNode!=null) {
                counter+=newNode.count;
            }
        }
        node.count=counter;
        node.data=tree.dosya;
        heap.insert(node);
        
    }
}
