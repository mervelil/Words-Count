/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mervecelik;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author merve çelik
 */
public class Trial<T extends Comparable<T>> {

//    Node<T> root;
//    String ignoreList[];
// String[] ignore = {"a", "ain't", "am", "an", "and", "are", "aren't", "as", "at", "be", "been", "by", "can", "cannot", "cant",
//        "can't", "co", "co.", "com", "could", "couldn't", "did", "didn't","do","does","doesn't","don't","eg","else","et","etc","ex","for","from","going","got",
//  "had","hadn't","has","hasn't","have","haven't","he","he'd","he'll","her","hers","he's","hi","him","his","how","i","i'd","ie","if","i'll","i'm","in","inc",
//  "instead","into","is","isn't","it","it'd","it'll","its","it's","i've","let", "let's","ltd", "may","mayn't","me","might","mightn't","mine", "mr","mrs","ms",
//  "must","mustn't","my","nd","needn't","no","non","none","nor","not","of","off","oh","ok","okay","on","one's","onto","or","ought","oughtn't","our","ours","out",
//  "over","per","que","qv","rd","re","shall","shan't","she","she'd","she'll","she's","should","shouldn't","so","sub","such","sup","th","than","that"
//  ,"that'll","thats","that's","that've","the","their","theirs","them","then","thence","there","there'd","there'll","there're","theres","there's","there've",
//  "these","they","they'd","they'll,","they're","they've","thing","things","this","those","thus","to","too","un","up","us","via","viz","vs","was","wasn't",
//  "we","we'd","we'll","were","we're","weren't","we've","what'll","what's","what've","where's","who'd","who'll","who's","will","with","won't","would",
//  "wouldn't","yet","you","you'd","you'll","your","you're","yours","you've","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"};
//
//    String[] html = {"<DOC>", "<DOCNO>", "</DOCNO>", "<TITLE>", "</TITLE>", "<AUTHOR>", "</AUTHOR>",
//        "<BIBLIO>", "<BIBLIO>", "</BIBLIO>", "<TEXT>", "</TEXT>", "</DOC>"};
//
//    String[] punction = {".", "'", "!", ",", "?", ":", ";", "<", ">", "/"};
//
//    public Trial() {
//
//    }
//
//
//    void readFile(File file) throws FileNotFoundException {
//        Scanner input = new Scanner(file);
//        while (input.hasNext()) {
//            String word = input.next();
//            boolean isIgnore = isIgnoreList(word);
//            boolean punction = isPunction(word);
//            boolean isHtml = isHtml(word);
//
//            if (!isIgnore && !punction && !isHtml) {
//
//                insert(word);
//            }
//
//        }
//
//    }
//
//    void readIgnorelist() {
//        Scanner input = new Scanner("ignore.txt");
//        String ignore = "";
//        while (input.hasNext()) {
//            String word = input.next();
//            ignore += word + " ";
//        }
//        ignore.trim();
//        ignoreList = ignore.split(" ");
//
//    }
//
//    boolean isIgnoreList(String str) {
//        Scanner scanner = new Scanner("ignore.txt");
//        String ignore = "";
//        while (scanner.hasNext()) {
//            String word = scanner.next();
//            if(str.compareTo(word) == 0){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    boolean isHtml(String word) {
//        for (int i = 0; i < html.length; i++) {
//            if (html[i].compareTo(word) == 0) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    boolean isPunction(String word) {
//        for (int i = 0; i < punction.length; i++) {
//            if (punction[i].compareTo(word) == 0) {
//                return true;
//            }
//
//        }
//        return false;
//    }
//
//    void insert(String data) {
//        if (root == null) {
//            root = new Node(data);
//            root.count++;
//        } else {
//            //  Node temp =new Node(data);
//            Node<T> tempnode = root;
//            while (tempnode != null) {
//
//                if (data.compareTo(tempnode.data) > 0) {
//                    if (tempnode.right == null) {
//                        tempnode.right = new Node(data);
//                        tempnode.right.count++;
//                        return;
//                    } else {
//                        tempnode = tempnode.right;
//                    }
//                } else if (data.compareTo(tempnode.data) < 0) {
//                    if (tempnode.left == null) {
//                        tempnode.left = new Node(data);
//                        tempnode.left.count++;
//                        return;
//                    } else {
//                        tempnode = tempnode.left;
//                    }
//             
//                } else {
//                    tempnode.count++;
//                    return;
//                }
//
//            }
//        }
//    }
//
//    public void preOrder(Node<T> root) {
//        if (root != null) {
//            System.out.println(root.data + "," + root.count);
//
//            preOrder(root.left);
//            preOrder(root.right);
//        }
//    }

}
