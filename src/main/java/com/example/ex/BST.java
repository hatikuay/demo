package com.example.ex;

public class BST {
    private class Node {
        int val;
        Node left;
        Node right;
    
        public Node(int val) {
            this.val = val;
        }
    
    }

    public Node root;

    public void insert(int val) {
        root = insert(root, val);
    }

    /*
     * Given a Binary Search Tree and two values representing
     * the start and end of a range, return the sum of all nodes within that range.
     * 
     * Input: ​​
     * Tree: [10,5,15,3,7,null,18],
     * Range: [7;15]
     * Output: 32
     */

    private Node insert(Node node, int val) {
        if (node == null) {
            return new Node(val);
        }
        if (val < node.val) {
            node.left = insert(node.left, val);
        } else if (val > node.val) {
            node.right = insert(node.right, val);
        }
        return node;
    }

    public boolean search(int val) {
        return search(root, val);
    }

    private boolean search(Node node, int val) {
        if (node == null) {
            return false;
        }
        if (val == node.val) {
            return true;
        }
        if (val < node.val) {
            return search(node.left, val);

        } else {
            return search(node.right, val);
        }
    }

    public void delete(int val) {
        root = delete(root, val);
    }

    private Node delete(Node node, int val) {
        if (node == null) {
            return null;
        }
        if (val < node.val) {
            node.left = delete(node.left, val);
        } else if (val > node.val) {
            node.right = delete(node.right, val);
        } else {
            if (node.left == null && node.right == null) {
                return null;
            }
            if (node.left == null) {
                return node.right;
            }
            if (node.left == null) {
                return node.right;
            }
            int successorVal = findMin(node.right);
            node.val = successorVal;
            node.right = delete(node.right, successorVal);
        }
        return node;
    }

    private int findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node.val;
    }


    public int rangeSum(int start, int end) {
        Node startNode = findNode(root, start);
        Node endNode = findNode(root, end);
        return sumBetween(root, startNode, endNode);
    }

    private Node findNode(Node node, int val) {
        if (node == null) {
            return null;
        }
        if (node.val == val) {
            return node;
        }
        if (val < node.val) {
            return findNode(node.left, val);
        } else {
            return findNode(node.right, val);
        }
    }

    private int sumBetween(Node node, Node startNode, Node endNode) {
        if (node == null) {
            return 0;
        }
        if (node.val < startNode.val) {
            return sumBetween(node.right, startNode, endNode);
        }
        if (node.val > endNode.val) {
            return sumBetween(node.left, startNode, endNode);
        }
        return node.val + sumBetween(node.left, startNode, endNode) + sumBetween(node.right, startNode, endNode);
    }

}
