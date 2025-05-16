import java.util.Scanner;

class Node1 {
    protected int regd_no;
    protected float mark;
    protected Node next;
}

public class A1Q1 {
    static Node head = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("***MENUU***");
            System.out.println("0. exit");
            System.out.println("1. create");
            System.out.println("2. display");
            System.out.println("3. insertion begining");
            System.out.println("4. insertion end");
            System.out.println("5. insertion at any position");
            System.out.println("6. deletion from beginning");
            System.out.println("7. deletion from end");
            System.out.println("8. deletion from any position");
            System.out.println("9. deletion by registration number");
            System.out.println("10. sort by marks");
            System.out.println("11. reverse the list");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Exiting...");
                    break;
                case 1:
                    head = create();
                    break;
                case 2:
                    display(head);
                    break;
                case 3:
                    head = InsBeg(head);
                    break;
                case 4:
                    head = InsEnd(head);
                    break;
                case 5:
                    head = InsAny(head);
                    break;
                case 6:
                    head = DelBeg(head);
                    break;
                case 7:
                    head = DelEnd(head);
                    break;
                case 8:
                    head = DelAny(head);
                    break;
                case 9:
                    head = DelByRegdNo(head);
                    break;
                case 10:
                    head = sort(head);
                    break;
                case 11:
                    head = reverse(head);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        } while (choice != 0);
        sc.close();
    }

    public static Node create() {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        Node p = null;
        System.out.println("Do you want to create a node (y/n)?");
        char c = sc.next().charAt(0);
        while (c == 'y' || c == 'Y') {
            Node newNode = new Node();
            System.out.println("enter the registration number");
            newNode.regd_no = sc.nextInt();
            System.out.println("enter the marks");
            newNode.mark = sc.nextFloat();
            newNode.next = null;
            if (head == null) {
                head = newNode;
                p = head;
            } else {
                p.next = newNode;
                p = newNode;
            }
            System.out.println("Do you want to create another node (y/n)?");
            c = sc.next().charAt(0);
        }
        return head;
    }

    public static void display(Node temp) {
        if (temp == null) {
            System.out.println("The list is empty.");
            return;
        }
        while (temp != null) {
            System.out.println("Registration Number: " + temp.regd_no);
            System.out.println("Marks: " + temp.mark);
            temp = temp.next;
            if (temp != null) {
                System.out.println("---");
            }
        }
        System.out.println();
    }

    public static Node InsBeg(Node start) {
        Scanner sc = new Scanner(System.in);
        Node newNode = new Node();
        System.out.println("enter the registration number");
        newNode.regd_no = sc.nextInt();
        System.out.println("enter the marks");
        newNode.mark = sc.nextFloat();
        newNode.next = start;
        return newNode;
    }

    public static Node InsEnd(Node start) {
        Scanner sc = new Scanner(System.in);
        Node newNode = new Node();
        System.out.println("enter the registration number");
        newNode.regd_no = sc.nextInt();
        System.out.println("enter the marks");
        newNode.mark = sc.nextFloat();
        newNode.next = null;

        if (start == null) {
            return newNode;
        }

        Node current = start;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return start;
    }

    public static Node InsAny(Node start) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position to insert (starting from 1): ");
        int position = sc.nextInt();

        if (position < 1) {
            System.out.println("Invalid position.");
            return start;
        }

        Node newNode = new Node();
        System.out.println("enter the registration number");
        newNode.regd_no = sc.nextInt();
        System.out.println("enter the marks");
        newNode.mark = sc.nextFloat();
        newNode.next = null;

        if (position == 1) {
            newNode.next = start;
            return newNode;
        }

        Node current = start;
        int count = 1;
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Position out of bounds.");
            return start;
        }

        newNode.next = current.next;
        current.next = newNode;
        return start;
    }

    public static Node DelBeg(Node start) {
        if (start == null) {
            System.out.println("List is empty. Cannot delete from beginning.");
            return null;
        }
        return start.next;
    }

    public static Node DelEnd(Node start) {
        if (start == null) {
            System.out.println("List is empty. Cannot delete from end.");
            return null;
        }
        if (start.next == null) {
            return null; // Only one node
        }
        Node current = start;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        return start;
    }

    public static Node DelAny(Node start) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position to delete (starting from 1): ");
        int position = sc.nextInt();

        if (start == null) {
            System.out.println("List is empty. Cannot delete.");
            return null;
        }
        if (position < 1) {
            System.out.println("Invalid position.");
            return start;
        }
        if (position == 1) {
            return start.next;
        }

        Node current = start;
        int count = 1;
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }

        if (current == null || current.next == null) {
            System.out.println("Position out of bounds.");
            return start;
        }

        current.next = current.next.next;
        return start;
    }

    public static Node DelByRegdNo(Node start) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the registration number to delete: ");
        int regdToDelete = sc.nextInt();

        if (start == null) {
            System.out.println("List is empty. Cannot delete.");
            return null;
        }

        if (start.regd_no == regdToDelete) {
            return start.next;
        }

        Node current = start;
        while (current.next != null && current.next.regd_no != regdToDelete) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Registration number not found in the list.");
            return start;
        }

        current.next = current.next.next;
        return start;
    }

    public static Node sort(Node start) {
        if (start == null || start.next == null) {
            return start; // Already sorted or empty
        }

        Node i, j;
        int tempRegd;
        float tempMark;

        for (i = start; i.next != null; i = i.next) {
            for (j = i.next; j != null; j = j.next) {
                if (i.mark > j.mark) {
                    // Swap data
                    tempRegd = i.regd_no;
                    tempMark = i.mark;
                    i.regd_no = j.regd_no;
                    i.mark = j.mark;
                    j.regd_no = tempRegd;
                    j.mark = tempMark;
                }
            }
        }
        return start;
    }

    public static Node reverse(Node start) {
        Node prev = null;
        Node current = start;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev; // prev is the new head
    }
}