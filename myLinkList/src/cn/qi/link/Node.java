package cn.qi.link;

public class Node<E> {
    E e;
    Node<E> pre;
    Node<E> next;
    Node(Node<E> pre,E e,Node<E> next){
        this.pre=pre;
        this.e=e;
        this.next=next;

    }

}
