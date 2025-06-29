public class Main {
    public static void main(String[] args) {
        Tree t = new Tree(new int[]{1, -2, -1, -1, 3, -1, -1});
        t.postorder();
    }
}

class Tree {
    private Node root;
    private int index = -1;

    Tree(int[] nodes) {
        this.root = buildTreeUsingArray(nodes);
    }

    private Node buildTreeUsingArray(int[] nodes) {
        index++;
        if (index >= nodes.length || nodes[index] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[index]);
        newNode.left = buildTreeUsingArray(nodes);
        newNode.right = buildTreeUsingArray(nodes);
        return newNode;
    }

    public void postorder() {
        Node temp = root;
        postorderHelper(temp);
    }

    private void postorderHelper(Node temp) {
        if (temp == null) return;
        postorderHelper(temp.left);
        postorderHelper(temp.right);
        System.out.print(temp.data + " ");
    }
}

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
