package test;

public class LinkedList {
  private Node<Integer> root;

  public void insert(Integer data) {
    if (root == null) {
      root = new Node<Integer>(data);
    } else {
      root.insert(data);
    }
  }

  class Node <T> {
    private T data;
    private Node<T> next;

    public Node(T data) {
      this.data = data;
    }

    public void insert(T newData) {
      if (next == null) {
        next = new Node<T>(newData);
      } else {
        next.insert(newData);
      }
    }
  }
}
