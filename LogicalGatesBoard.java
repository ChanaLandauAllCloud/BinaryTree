
public class LogicalGatesBoard {

    public int[] arr;
    public Node currentNode;

    public LogicalGatesBoard(int[] arr, Node currentNode) {
        this.arr = arr;
        this.currentNode = currentNode;
    }

    public int resultGates(Node node, int startIndex, int endIndex) {
        //האנדקסים משמשים כדרך לדעת אילו מקומות במערך משויכים לכל עלה סופי ללא ילדים
        if (node.right == null && node.left == null) {//בהסתמך על כך שאכן זהו עץ בינארי מושלם
            return logicGateAction(node.logicGate, arr[startIndex], arr[endIndex]);
            //אם התנאי מתקיים זה חייב להיות העלים הסופיים ולכן אני יבדוק מה יחזור לי מפונקצית הבדיקה
            //הביטים הנשלחים הם המקומות המתאימים במערך
        }
        //אם זה לא העלים הסופיים אני יפנה לפונקציה הבודקת עם הבנים של הNODE הנוכחי
        return logicGateAction(node.logicGate, resultGates(node.right, (endIndex + startIndex + 1) / 2, endIndex), resultGates(node.left, startIndex, (endIndex + startIndex) / 2));
    }

    // פונקציה שמקבלת 2 ביטים והשער הלוגי שביניהם ומחזירה מה השער היוצא
    private int logicGateAction(LogicalGate logicGateAction, int bit1, int bit2) {
        int result = 0;
        switch (logicGateAction) {
            case And:
                result = bit1 & bit2;
                break;
            case Or:
                result = bit1 | bit2;
                break;
            case Xor:
                result = bit1 ^ bit2;
                break;
        }
        System.out.println("result" + result);
        return result;
    }

}
