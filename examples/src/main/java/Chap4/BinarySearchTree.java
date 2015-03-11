package Chap4;

import java.util.NoSuchElementException;

/**
 * Created by Carl Shen on 3/11/15.
 */
public class BinarySearchTree<T extends Comparable<? super T>> {

    private static class TreeNode<T> {
        T val;
        TreeNode left, right;

        public TreeNode(T value) {
            this.val = value;
        }

        public TreeNode(T value, TreeNode left, TreeNode right) {
            this.val = value;
            this.left = left;
            this.right = right;
        }
    }

    private TreeNode<T> root = null;

    public boolean isEmpty() { return root == null; }

    public boolean contains(T element) { return contains(element, root); }

    public T findMin() {
        if (root == null) {
            throw new NoSuchElementException();
        } else {
            return findMin(root).val;
        }
    }

    public T findMax() {
        if (root == null) {
            throw new NoSuchElementException();
        } else {
            return findMax(root).val;
        }
    }

    public void insert(T data) {
        if (root == null) {
            throw new NoSuchElementException();
        } else {
            root = insert(data, root);
        }
    }

    public void remove(T data) {
        if (root == null) {
            throw new NoSuchElementException();
        } else {
            remove(data, root);
        }
    }

    private void remove(T data, TreeNode<T> root) {
        if (root == null) return;

    }

    private TreeNode<T> insert(T data, TreeNode<T> root) {
        if (root == null) return new TreeNode<T>(data);
        int res = data.compareTo(root.val);
        if (res < 0) {
            root.left = insert(data, root.left);
        } else if (res > 0) {
            root.right = insert(data, root.right);
        } else {
            return root;
        }
    }

    private TreeNode<T> findMax(TreeNode<T> root) {
        if (root == null) return null;
        if (root.right == null) return root;
        return findMax(root.right);
    }

    private TreeNode<T> findMin(TreeNode<T> root) {
        if (root == null) return null;
        if (root.left == null) return root;
        return findMin(root.left);
    }

    private boolean contains(T element, TreeNode<T> root) {
        if (root == null) {
            return false;
        }

        int res = element.compareTo(root.val);
        if (res == 0) return true;
        return res > 0 ? contains(element, root.right) : contains(element, root.left);
    }
}
