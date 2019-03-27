package cn.qi.link;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        MyLinkList<Integer> list=new MyLinkList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.remove();
        //list.clear();
        list.addFirst(12);
        list.addLast(0);

        boolean b = list.contains(20);
        System.out.println(b);
        System.out.println("----------");
        boolean b1 = list.contains(4);
        System.out.println(b1);
        System.out.println("----------");
        Integer first = list.getFirst();
        System.out.println(first);
        System.out.println("----------");
        Integer last = list.getLast();
        System.out.println(last);
        System.out.println("----------");
        Integer integer = list.removeFirst();
        System.out.println(integer);
        System.out.println("----------");
        Integer integer1 = list.removeLast();
        System.out.println(integer1);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }





/*
     LinkedList<String> linkedList=new LinkedList<>();
        String remove = linkedList.remove();
        linkedList.addFirst("");
        linkedList.addLast("");
        boolean contains = linkedList.contains("");
        linkedList.getFirst();
        String s = linkedList.removeFirst();*/

    }
}
