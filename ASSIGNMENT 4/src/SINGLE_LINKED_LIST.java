import java.util.Scanner;

class Node
	 {
	 protected int regd_no;
	 protected float mark;
	 protected Node  next;
	 }

public class SINGLE_LINKED_LIST {
	static Node head = null; 
	 public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     while(true) {
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
	         System.out.println("10.search by regd_no and update marks");
	         System.out.println("11. sort by marks");
	         System.out.println("12. count the number of node");
	         System.out.println("13. reverse the list");
	         System.out.print("Enter your choice: ");    
	    	 int choice  = sc.nextInt();
	    	 
	    	 switch(choice) {
	    	 case 0:
	    		 System.exit(0);
	    		 break;
	    	 case 1:
	    		 create();
	    		 break;
	    	 case 2:
	    		 display(head);
	    		 break;
	    	 case 3:
	    		 head = InsBeg();
	    		 break;
	    	 case 4:
	    		 head = InsEnd();
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
                 search(head);
                 break; 
	    	 case 11:
                 head = sort(head);
                 break;     
	    	 case 12:
                 int n =count(head);
                 System.out.println("number of node is" + n);
                 break;   
	    	 case 13:
                head = reverse(head);
                 break;    
	    	 }
	     }
	     }
	 public static void create() {
		 Scanner sc = new Scanner(System.in);
		 Node p = new Node();
		 System.out.println("enter the regestration number");
		 p.regd_no = sc.nextInt();
		 System.out.println("enter the marks");
		 p.mark = sc.nextFloat();
		 p.next = null;
		 head = p;
		 System.out.println("Do you want to create new node");
		 char c = sc.next().charAt(0);
		 while(c!='n') {
			 Node q = new Node();
			 System.out.println("enter the regestration number");
			 q.regd_no = sc.nextInt();
			 System.out.println("enter the marks");
			 q.mark = sc.nextFloat();
			 q.next = null;
			 p.next = q;
			 p = q;
			 System.out.println("Do you want to create new node");
			 c = sc.next().charAt(0);
		 }
	 }
	 public static void display(Node temp) {
		 while(temp!=null) {
			 System.out.println(temp.regd_no);
			 System.out.println(temp.mark);
			 temp = temp.next;
		 }
	 }
	 public static Node InsBeg() {
		 Scanner sc = new Scanner(System.in);
		  Node temp = new Node();
		  System.out.println("enter the regestration number");
		  temp.regd_no = sc.nextInt();
		  System.out.println("enter the marks");
		  temp.mark = sc.nextFloat();
		  temp.next = head;
		  return temp;
		 
	 }
	 public static Node InsEnd() {
		 Scanner sc = new Scanner(System.in);
		 Node temp = new Node();
		 System.out.println("enter the regestration number");
		 temp.regd_no = sc.nextInt();
		 System.out.println("enter the marks");
		 temp.mark = sc.nextFloat();
		 temp.next = null;
		 if(head==null)
			 return temp;
		 Node p = head;
		 while(p.next!=null) {
			 p=p.next;
		 }
		 p.next = temp;
		 return head;
	 }
	 public static Node InsAny(Node start) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the position to insert (starting from 1): ");
	        int pos = sc.nextInt();
	        if (pos < 1) {
	            System.out.println("Invalid position.");
	            return start;
	        }
	        Node temp = new Node();
	        System.out.println("enter the registration number");
	        temp.regd_no = sc.nextInt();
	        System.out.println("enter the marks");
	        temp.mark = sc.nextFloat();
	        temp.next = null;
	        if (pos == 1) {
	            temp.next = start;
	            return temp;
	        }
	        Node p = start;
	        for(int i=0;i<pos -2;i++) {
	        	p = p.next;
	        }
	        temp.next = p.next;
	        p.next = temp;
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
	          Node temp = start;
	          Node p = temp.next;
	          while (p.next != null) {
	        	  temp = p;
	              p = p.next;
	          }
	          temp.next = null;
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
	          Node temp = head;
	          Node p = temp.next;
	          for(int i=0;i<position-2;i++) {
	        	  temp = p;
	        	  p = temp.next;
	          }
	         if (p== null) {
	              System.out.println("Position out of bounds.");
	              return start; 
	              }
	          temp.next = p.next;
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

	        Node temp = start;
	        while (temp.next != null && temp.next.regd_no != regdToDelete) {
	            temp = temp.next;
	        }

	        if (temp.next == null) {
	            System.out.println("Registration number not found in the list.");
	            return start;
	        }

	        temp.next = temp.next.next;
	        return start;
	      }
	 public static void search(Node temp) {
	 		 Scanner sc = new Scanner(System.in);
	 		 System.out.println("enter the regd_no to search");
	 		 int ele = sc.nextInt();
	 		 int flag =0,p=0;
	 		 while(temp!=null) {
	 			 p++;
	 			 if(temp.regd_no == ele) {
	 				 flag = 1;
	 				 break;
	 			 }
	 			 temp = temp.next;
	 		}
	 		 if(flag ==0) {
	 			 System.out.println(ele+ "regd_no is not present in SSL");
	 		 }
	 		 else {
	 			 System.out.println(ele + "regd_no is present at node no"+p);
	 			 temp.mark = 30;
	 		 }
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
	 public static int count(Node temp) {
	 		 int c = 0;
	 		 while(temp!=null) {
	 			c++;
	 			 temp = temp.next;
	 		 }
	 		 return c;
	 	 }
     public static Node reverse(Node start) {
		 Node p = null;
		 Node temp = start;
		 Node q = null;
		 while(temp!=null) {
			 q = temp.next;
			 temp.next = p;
			 p = temp;
			 temp = q;
		 }
		 System.out.println("LINKED LIST REVERSED SUCCESSFULLY");
		 return p;
	 }
}
