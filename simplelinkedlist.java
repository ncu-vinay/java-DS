import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int value) {
        this.data = value;
        this.next = null;
    }
}

public class simplelinkedlist {

    static void traverse(Node start) {
        Node temp = start;
        while (temp != null) {
            System.out.println("-->" + temp.data);
            temp = temp.next;
        }
    }

    static void insert_at_beginning(Node start, Node new_node) {
        if (start==null){
            start=new_node;
            new_node.next=null;
        }
        else{
            new_node.next=start;
            start=new_node;   
        }
    }

    static void insert_at_the_end(Node start, Node new_node) {
        Node temp = start;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_node;
        new_node.next = null;
    }

    static void insert_before(Node start, int val, Node new_node) {
        Node temp = start;
        while (temp.data != val) {
            temp = temp.next;
        }
        new_node.next = temp.next;
        temp.next = new_node;
    }

    static void insert_after(Node start, int val, Node new_node) {
        Node temp = start;
        Node temp1 = temp;
        while (temp.data != val) {
            temp1 = temp;
            temp = temp.next;
        }
        temp1.next = new_node;
        new_node.next = temp;
    }

    static void delete_in_beginning(Node start) {
        Node temp = start;
        if (temp.next == null) {
            System.out.println("Unable to delete last node: the list is empty");
        } else {
            temp = temp.next;
        }        
    }

    static void delete_at_the_end(Node start) {
        Node temp = start;
        if (temp.next != null) {
            while(temp.next.next!=null) {
                temp = temp.next;
            }
            temp.next = null;
        } else {
            System.out.println("Unable to delete first node: the list is empty");
        }
    }

    static void delete_before(Node start, int val) {
        Node temp = start;
        Node pretemp = temp;
        if (temp.next == null) {
            System.out.println("Unable to delete the node: the list is empty");
        } else {
            while (temp.next.data != val) {
                pretemp = temp;
                temp = temp.next;
            }
            pretemp.next = temp.next;
        }
    }

    static void delete_after(Node start, int val) {
        Node temp = start;
        if (temp.next == null) {
            System.out.println("Unable to delete the node: the list is empty");
        } else {
            while (temp.data != val) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    static void ins_switch(Node start) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n1.Insert in beginning\n2.Insert at the end\n3.Insert before\n4.Insert after\n5.Exit");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter node data: ");
                int val = sc.nextInt();
                Node new_node = new Node(val);
                insert_at_beginning(start, new_node);
                traverse(start);
                break;
            case 2:
                System.out.println("Enter node data: ");
                val = sc.nextInt();
                new_node = new Node(val);
                insert_at_the_end(start, new_node);
                traverse(start);
                break;
            case 3:
                System.out.println("Enter new node data: ");
                val = sc.nextInt();
                System.out.println("Enter node data preceding new node: ");
                int pos = sc.nextInt();
                new_node = new Node(val);
                insert_before(start, pos, new_node);
                traverse(start);
                break;
            case 4:
                System.out.println("Enter new node data: ");
                val = sc.nextInt();
                System.out.println("Enter node data succeeding new node: ");
                pos = sc.nextInt();
                new_node = new Node(val);
                insert_after(start, pos, new_node);
                traverse(start);
                break;
            case 5:
                break;
            default:
                break;
        }
    }

    static void del_switch(Node start) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n1.Delete in beginning\n2.Delete in the end\n3.Delete before\n4.Delete after");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                delete_in_beginning(start);
                traverse(start);
                break;
            case 2:
                delete_at_the_end(start);
                traverse(start);
                break;
            case 3:
                System.out.println("Enter value of preceding node: ");
                int pos = sc.nextInt();
                delete_before(start, pos);
                traverse(start);
                break;
            case 4:
                System.out.println("Enter value of succeeding node: ");
                pos = sc.nextInt();
                delete_after(start, pos);
                traverse(start);
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter node value: ");
        int val = sc.nextInt();
        Node a = new Node(val);
        System.out.println("Enter node value: ");
        val = sc.nextInt();
        Node b = new Node(val);
        System.out.println("Enter node value: ");
        val = sc.nextInt();
        Node c = new Node(val);
        System.out.println("Enter node value: ");
        val = sc.nextInt();
        Node d = new Node(val);
        System.out.println("Enter node value: ");
        val = sc.nextInt();
        Node e = new Node(val);

        Node start;
        start = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        System.out.print("Current linked list:");
        traverse(start);
        int choice = 0;
        while (choice != 3) {
            System.out.println("1.Insertion programs\n2.Deletion programs\n3.Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ins_switch(start);
                    break;
                case 2:
                    del_switch(start);
                    break;
                case 3:
                    System.exit(0);
                default:
                    break;
            }
        }

    }
}