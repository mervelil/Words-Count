package mervecelik;

import java.io.BufferedWriter;
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
public class TreeSearch<T extends Comparable<T>> {

    String dosya;
    Node<T> root;
    String[] html = {"<DOC>", "<DOCNO>", "</DOCNO>", "<TITLE>", "</TITLE>", "<AUTHOR>", "</AUTHOR>",
        "<BIBLIO>", "<BIBLIO>", "</BIBLIO>", "<TEXT>", "</TEXT>", "</DOC>"};

    String[] punction = {".", "'", "!", ",", "?", ":", ";", "<", ">", "/"};


    void preOrderOutput2(Node<T> root,FileWriter fw) throws FileNotFoundException, IOException {
        
        ;
        //BufferedWriter bf = new BufferedWriter(fw);
        //PrintWriter output = new PrintWriter(fl);
        if (root != null) {

            fw.append(root.data + "," + root.count+"\n");    //veriyi preorder  gore yazdırmak için txt 
            preOrderOutput2(root.left,fw);

            preOrderOutput2(root.right,fw);
        }

 //       output.close();
    }

    

    void preOrderOutput(Node<T> root) throws FileNotFoundException {
        File foutput = new File("C:\\NetBeansProjects\\WordsCount\\output.txt");
        PrintWriter output = new PrintWriter(foutput);

        if (root != null) {

            output.write(root.data + "," + root.count);
           
            preOrderOutput(root.left);

            preOrderOutput(root.right);
        }
        output.close();
        //output.close();
    }

    void preOrderOutput() throws FileNotFoundException {
        preOrderOutput(root);
    }


    void readFile(File file) throws FileNotFoundException {
        Scanner input = new Scanner(file);
        this.dosya=file.getName();
        while (input.hasNext()) {
            String word = input.next();
            boolean isIgnore = isIgnoreList(word);    //istenilen punction ,html vs ignorelisttekiler yoksa yazdırması icin tanımlanan method
            boolean punction = isPunction(word);
            boolean isHtml = isHtml(word);

            if (!isIgnore && !punction && !isHtml) {

                insert(word);
            }

        }
        input.close();

    }



    boolean isIgnoreList(String str) throws FileNotFoundException {
        File file = new File("docs\\ignoreList.txt");
        Scanner scanner = new Scanner(file);
        String ignore = "";
        while (scanner.hasNext()) {
            String word = scanner.next();
            if (str.compareTo(word) == 0) {
                return true;
            }
        }
        return false;
    }

    boolean isHtml(String word) {
        for (int i = 0; i < html.length; i++) {
            if (html[i].compareTo(word) == 0) {
                return true;
            }
        }
        return false;
    }
  

    boolean isPunction(String word) {
        for (int i = 0; i < punction.length; i++) {
            if (punction[i].compareTo(word) == 0) {  //punclistteki leemanları forla gezerken karsılasırsa   rastlarsa dogru dondurcek  ve !booolean
                //ile veriyi alarak kullanmıcaz
                return true;
            }

        }
        return false;
    }
      Node search(String key) {   //binary tree de istedigimiz veriyi bulmak icin 
        if (root == null) {
            return null;  //tree bossa null dondur 
        }
        Node<T> temp = root;   
        while (temp != null) { //bos degilse
            if (temp.data.compareTo(key) > 0) { //parametredeki key ve rootdaki datamız beriden buyukse
                temp = temp.left; //trenın sol sub kısmına gec
            } else if (temp.data.compareTo(key) < 0) { //kucukse
                temp = temp.right; //saga
            } else {
                return temp;
            }
        }
        return null;

    }
    void insert(String data) {
        if (root == null) {
            root = new Node(data);
            root.count++;
        } else {
            //  Node temp =new Node(data);
            Node<T> tempnode = root;
            while (tempnode != null) {

                if (data.compareTo(tempnode.data) > 0) {
                    if (tempnode.right == null) {      
                        tempnode.right = new Node(data);
                        tempnode.right.count++;   //istenilen veri buyukse ascıı olarak right count eklencek ve count sayımı baslanıcak
                        return;
                    } else {
                        tempnode = tempnode.right;  
                    }
                } else if (data.compareTo(tempnode.data) < 0) {
                    if (tempnode.left == null) {
                        tempnode.left = new Node(data); //istenilen veri kucukse ascıı olarak left count eklencek ve count sayımı baslanıcak
                        tempnode.left.count++;
                        return;
                    } else {
                        tempnode = tempnode.left;
                    }

                } else {
                    tempnode.count++;
                    return;
                }

            }
        }
    }

}
