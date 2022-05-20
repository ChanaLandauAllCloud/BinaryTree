public class Node {//כל הערכים בעץ הבינארי הם אובייקטים של הCLASS הזה
//שמכיל גם את הערך של השער הלוגי וגם יחוס לאוביקטים הבאים (הילדים של העלה העכשוי)
    public LogicalGate logicGate;
    public Node right;
    public Node left;

    public Node(LogicalGate logicGate, Node right, Node left) {
        this.logicGate = logicGate;
        this.right = right;
        this.left = left;
    }

    public Node() {
    }

    public Node(LogicalGate logicGate) {
        this.logicGate = logicGate;
    }


}