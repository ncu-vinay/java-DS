import java.util.*;

class Node{
    int data;
    Node forward;
    Node backward;
    Node(int value)
{
    this.data=value;
    this.forward=null;
    this.backward=null;
}
}

class MenuDoubly{
    static Node  insert_at_beg(Node start,int value){
        Node new_node= new Node(value);
        if (start==null){
            start=new_node;
        }
        else{
         start.backward=new_node;
         new_node.forward=start;
         start=new_node;   
        }
        return start;
    }

    static void  insert_at_end(Node start,int value){
        Node new_node= new Node(value);
        Node temp=start;
        while (temp.forward!= null){
            temp=temp.forward;
        }
        temp.forward=new_node;
        new_node.backward=temp;
    }

    static void  insert_before_value(Node start,int value,int val){
        Node new_node= new Node(val);
        Node temp=start;
        while (temp.data!= value ){
            temp=temp.forward;
        }
        new_node.forward=temp;
        new_node.backward=temp.backward;
        temp.backward.forward=new_node;
        temp.backward=new_node;
    }

    static void  insert_after_value(Node start,int value,int val){
        Node new_node= new Node(val);
        Node temp=start;
        while (temp.data!= value ){
            temp=temp.forward;
        }
        new_node.forward=temp.forward;
        new_node.backward=temp;
        temp.forward.backward=new_node;
        temp.forward=new_node;
    }

    static void display(Node start){
        System.out.println("modified list: ");
        Node temp;
        temp=start;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.forward;
    }}

    static Node deletion_at_beg(Node start){
        return start.forward;
    }

    static void  deletion_at_end(Node start){
        Node temp=start;
        while (temp.forward.forward!= null){
            temp=temp.forward;
        }
        temp.forward=null;
        
    }

    static void delete_before_value(Node start,int value){
        Node temp=start;
        while (temp.forward.data!= value){
            temp=temp.forward;
        }
        temp.backward.forward=temp.forward;
        temp.forward.backward=temp.backward;
    }

    static void delete_after_value(Node start,int value){
        Node temp=start;
        while (temp.data!= value){
            temp=temp.forward;
        }
        temp.forward=temp.forward.forward;
        temp.forward.backward=temp;
    }

    public static void main(String[] agrs){
        int flag=0;int value=0;
        try (Scanner sc = new Scanner(System.in)) {
            Node start=null;
            while (true){
                System.out.println("\n-------------------------\n1. Insert at the beginning.\n2. Insert at end.\n3. Insert before a value.\n4. Insert after a value.");
                System.out.println("5. Deletion at beginning.\n6. Deletion at end.\n7. Deletion before a value.\n8. Deletion after a value. \n9. Exit\n");
                int choice = sc.nextInt();
                switch(choice){
                    case 1:
                    System.out.print("Enter the value: ");
                    value = sc.nextInt();
                    start = insert_at_beg(start,value);
                    display(start);
                    break;

                    case 2:
                    System.out.print("Enter the value: ");
                    value = sc.nextInt();
                    insert_at_end(start, value);
                    display(start);
                    break;
                    
                    case 3:
                    System.out.print("Enter the value before which element will be inserted: ");
                    value = sc.nextInt();
                    System.out.print("Enter the value: ");
                    int val = sc.nextInt();
                    insert_before_value(start, value,val);
                    display(start);
                    break;

                    case 4:
                    System.out.print("Enter the value after which element will be inserted: ");
                    value = sc.nextInt();
                    System.out.print("Enter the value: ");
                    int val1 = sc.nextInt();
                    insert_after_value(start, value,val1);
                    display(start);
                    break;   

                    case 5:
                    start=deletion_at_beg(start);
                    display(start);
                    break;

                    case 6:
                    deletion_at_end(start);
                    display(start);
                    break;

                    case 7:
                    System.out.print("Enter the value before which element will be deleted: ");
                    value = sc.nextInt();
                    delete_before_value(start, value);
                    display(start);
                    break;

                    case 8:
                    System.out.print("Enter the value after which element will be deleted: ");
                    value = sc.nextInt();
                    delete_after_value(start, value);
                    display(start);
                    break;

                    default:
                        System.out.println("You've entered the wrong choice.");
                        break;

                    case 9:
                        flag=1;
                        break;
                    
                }
                if (flag==1){
                    break;


            }
        }

        
        }



}}