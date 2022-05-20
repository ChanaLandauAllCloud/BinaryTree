
public class BinaryTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] arr = new int[]{1, 1, 1, 1, 1, 1, 1, 1};//מערך ניסוי---
        Node root = new Node();//יצירת אוביקט ה ROOT שהוא ראש העץ (הסבא)---
        root.logicGate = LogicalGate.Or;
        root.right = new Node(LogicalGate.Or, new Node(LogicalGate.And), new Node(LogicalGate.Or));
        root.left = new Node(LogicalGate.And, new Node(LogicalGate.Xor), new Node(LogicalGate.Or));
        LogicalGatesBoard board = new LogicalGatesBoard(arr, root);
        System.out.println("the board return " + board.resultGates(root, 0, arr.length - 1));
        // ---קריאה לפונקציה הרקורסיבית שמחזירה את הביט הנכון שיצא מהלוח

        int [] arr2 = new int[]{0,0,1,1};
        Node root2 = new Node();
        root2.logicGate = LogicalGate.Or;
        root2.right = new Node(LogicalGate.Xor);
        root2.left = new Node(LogicalGate.And);
        LogicalGatesBoard board2 = new LogicalGatesBoard(arr2, root2);
        System.out.println("the board 2 return " + board2.resultGates(root2, 0, arr2.length - 1));


    }

}
