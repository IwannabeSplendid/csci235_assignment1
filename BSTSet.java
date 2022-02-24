
package csci235;

import java.util.ArrayList;
import java.util.List;


public class BSTSet<T extends Comparable<T> > implements Set<T> 
{
    private Node root;
    private int size;
    
    public BSTSet() {
        root = null;
        size = 0;
    }


    public class Node {
        public T value;
        public Node left;
        public Node right;

        public Node(T val) {
            value = val;
            left = null;
            right = null;
        }


    }

}


