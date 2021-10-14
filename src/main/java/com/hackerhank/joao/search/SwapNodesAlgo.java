package com.hackerhank.joao.search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SwapNodesAlgo {

    private static class Node {
        Integer data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }

        void swapNodes() {
            Node temp = left;
            left = right;
            right = temp;
        }
    }

    static void swapper(Node node, int depth, int target) {
        if (node == null) {
            return;
        }

        if (depth % target == 0) {
            node.swapNodes();
        }

        swapper(node.left, depth + 1, target);
        swapper(node.right, depth + 1, target);
    }

    static List<Integer> traverse(Node node) {
        List<Integer> order = new ArrayList<>();
        innerTraverse(node, order);

        return order;
    }

    static void innerTraverse(Node node, List<Integer> nodeOrder) {
        if (node == null) {
            return;
        }

        innerTraverse(node.left, nodeOrder);
        nodeOrder.add(node.data);
        innerTraverse(node.right, nodeOrder);
    }

    static Node buildTree(List<List<Integer>> indexes) {
        Node root = new Node(1);
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        for (List<Integer> index : indexes) {
            Node left;
            Node right;

            if (index.get(0) != -1) {
                left = new Node(index.get(0));
            } else {
                left = null;
            }

            if (index.get(1) != -1) {
                right = new Node(index.get(1));
            } else {
                right = null;
            }

            Node temp = q.remove();
            temp.left = left;
            temp.right = right;

            if (left != null)
                q.add(left);
            if (right != null)
                q.add(right);
        }

        return root;
    }

    public static List<List<Integer>> swapNodes(List<List<Integer>> indexes, List<Integer> queries) {
        Node root = buildTree(indexes);
        List<List<Integer>> traverses = new ArrayList<>();

        for (int query : queries) {
            swapper(root, 1, query);

            List<Integer> path = traverse(root);

            traverses.add(path);
        }

        return traverses;
    }
}
