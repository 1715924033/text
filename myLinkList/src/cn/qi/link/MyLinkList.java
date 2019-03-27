package cn.qi.link;


import java.util.NoSuchElementException;

public class MyLinkList<E> {


    private int listSize=0;
    private Node<E> frist;
    private Node<E> last;


//添加元素
    public Boolean add(E e) {
        listSize++;
        if(frist==null){
            frist=new Node<>(null,e,null);
            last=frist;
            return true;
        }
        //如果没有元素走到这有节点
        Node<E> node=new Node<>(null,e,null);
        last.next=node;
        node.pre=last;
        last=node;

        return true;

    }
    //集合的大小
    public int size(){
        return listSize;
    }
    //获取元素
    public E get(int i){
        Node<E> node=frist;
        int index=0;

        while (index<i){
            node=node.next;
            index++;

        }
        return node.e;
    }
    //删除元素
    public E remove(){

        if(frist==null){
            throw new NoSuchElementException();
        }
        final E e=frist.e;
        final Node<E> next=frist.next;
        frist.e=null;
        frist=next;
        if(next==null){
            last=null;
        }else {
            next.pre=null;
        }
        listSize--;

        return e;
    }
    //清空集合
    public void clear(){
        for(Node<E> x=frist;x!=null;){
            Node<E> next=x.next;
            x.pre=null;
            x.next=null;
            x.e=null;
            x=next;
        }
        frist=last=null;
        listSize=0;

    }
    //添加到第一个元素
    public void addFirst(E e){
        final Node<E> f=frist;
        final Node<E> newNode=new Node<>(null,e,f);
        frist=newNode;
        if(f==null){
            last=newNode;
        }else {
            f.pre=newNode;
        }
        listSize++;

    }
    //添加到最后一个元素
    public void addLast(E e){
        final Node<E> f=last;
        final Node<E> newNode=new Node<>(f,e,null);
        last=newNode;
        if(f==null){
            frist=last;
        }else {
            f.next=newNode;
        }
        listSize++;

    }
    //判断值是否存在
    public boolean contains(E e){
       for (Node<E> x=frist;x!=null;x=x.next){
           if(x.e.equals(e)){
               return true;
           }
       }

        return false;
    }
    //获取第一个
    public E getFirst(){
        if(frist!=null){
            return frist.e;
        }else {
            throw new NoSuchElementException();
        }
    }
    //获取最后一个元素
    public E getLast(){
        if(last!=null){
            return last.e;
        }else {
            throw new NoSuchElementException();
        }
    }
    //删除第一个
    public E removeFirst(){
        if(frist==null){
            throw new NoSuchElementException();
        }
        E e=frist.e;
        final Node<E> f=frist.next;
        if(f==null){
            last=null;
        }
        frist=null;
        f.pre=null;
        frist=f;
        listSize--;
        return e;
    }
    //删除最后一个元素
    public  E removeLast(){
        if(last==null){
            throw new NoSuchElementException();
        }
        E e=last.e;
        Node<E> f=last.pre;
        last=null;
        if(f==null){
            frist=null;
        }
        f.next=null;
        last=f;
        listSize--;
        return e;


    }

























}
