package sarasai.newpackage;

import sarasai.Klaida;

public class MyLinkedList {
    
    private Node head;
    
    public MyLinkedList(){
        this.head = null;
    }

    public void add(Object o) {
        System.out.println();
        System.out.println("ADDING");
        if (this.head == null) {
            this.head = new Node(o);
        } else {
            Node parent = this.head;
//            System.out.println("parent: " + parent);
//            System.out.println("parent.next: " + parent.next);
            while (parent.next != null) {
                parent = parent.next;
            }
            parent.next = new Node(o);
        }
    }
    
    
    public void remove(int index) {
        System.out.println();
        System.out.println("REMOVING");
        Node parent = this.head;
        System.out.println("parent: " + parent.value);
        System.out.println("parent: " + parent.next);
        Node naujas = new Node();
        System.out.println("naujas: " + naujas.value);
        int i = 0;
        
//        while(parent.next != null){
//            if(i != index){
//                naujas.next = parent.next;
//                i++;
//            }
//        }
        
        
        
    }
    
    public Object get(int index) {
        System.out.println();
        System.out.println("GETTING " + index);
        
        if(index >= 0){
            Node parent = this.head;
            int i = 0;
            Node wanted = null;
            Boolean found = false;

            while(!found){
                if(i == index){
                    wanted = parent;
                    found = true;
                } else if (parent.next != null){
                    parent = parent.next;
                i++;
                } else {
                    try {
                throw new Klaida("Indexas yra netinkamas skaicius: " + index);
                }
                catch(Klaida k){
                    System.out.println("*** Pagavau klaida: " + k.getMessage());
                }
                return null;
                }
            }
            return wanted.value;
        } else {
            try {
                throw new Klaida("Indexas yra netinkamas skaicius: " + index);
            }
            catch(Klaida k){
                System.out.println("*** Pagavau klaida: " + k.getMessage());
            }
            return null;
        }
        
        
    }

    public void set(int index, Object o) {
        System.out.println();
        System.out.println("SETTING " + index + " " + o);
        
//        Node senas = this.head;
////        Node naujas = new Node();
        int i = 0;
////        Boolean nebaigem = true;
//        Node temp = null;
             
        
//        while(nebaigem){
//            
//            if(index == i){
//                naujas = new Node(o);
//                if(senas.next != null){
//                    naujas.next = new Node(o);
//                    naujas = naujas.next;
//                } else {
//                    nebaigem = false;
//                }
//                i++;
//                System.out.println("pridedam '" + o + "' i indeksa: " + index);
//            } else if(senas.next == null){
//                nebaigem = false;
//                naujas = senas;
//                System.out.println("senas.next: " + senas.next);
//                System.out.println("paskutinias: " + naujas.value);
//                System.out.println("pridedam '" + o + "' i indeksa: " + index);
//            } else {
//                naujas = senas;
//                naujas.next = new Node(o);
//                naujas = naujas.next;
//                senas = senas.next;
//                i++;
//            }
//
//            
//        }
            this.head = this.head;
            
        while(i <= index){
            
            System.out.println("parent: " + this.head.value);
//            System.out.println("parent.next: " + parent.next.value);
//            parent = parent.next;
            
            if(i == index){
                this.head = new Node(o);
                System.out.println(this.head.value);
            } else {
                this.head = this.head.next;
//                System.out.println(this.head);
            }
            
            
            i++;

        }
        
        
    }

    public void insert(int index, Object o) {
    }

    public int size() {
        int size = 0;
        Node n = this.head;
        while (n != null) {
            size++;
            n = n.next;
        }
        return size;
    }

    public String toString() {
        String ret = "{";
        Node n = this.head;
        while (n != null) {
            ret += n.value + ", ";
            n = n.next;
        }
        ret += "}";
        return ret;
    }

    private class Node {
        Node next;
        Object value;
        
        Node () {
            this.next = null;
            this.value = null;
        }
        
        Node (Object value) {
            this.next = null;
            this.value = value;
        }
        
        Node (Node next, Object value) {
            this.next = next;
            this.value = value;
        }
    }
    
}
