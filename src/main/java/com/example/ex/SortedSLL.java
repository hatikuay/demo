package com.example.ex;
/*Create class SortedSLL (sorted singly-linked list) implementing singly-linked list of
ints. The elements of the list are represented by objects of class Node containing data
(an int) and the reference to the next such node. The SortedSLL class contains only
one method adding elements to the list, addSorted, which adds them in such a way
that the nodes are always ordered by values of data that they contain in ascending
order. Add a method to print the list, so the following fragment*/

public class SortedSLL {
    
    private Node node = new Node(); 
   
    void addSorted(Integer number) {
        if(node.getNumber()==null)
            node.setNumber(number);
        else if(node.getNumber() < number)
        {
            node.getNext();
        }
    }    
    
    void show() {

    }
}
