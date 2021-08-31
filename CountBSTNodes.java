public class CountBSTNodes {

    static class Node{
        Node left, right;
        int data;

        public Node(int data){
            this.left = null;
            this.data = data;
            this.right = null;
        }
    }

    public int countNoOfNodes(Node root){
        if (root == null)
            return 0;
        else
            return countNoOfNodes(root.left) + countNoOfNodes(root.right) + 1;
    }

    public static void main(String[] args) {
        CountBSTNodes countBSTNodes = new CountBSTNodes();

        Node root = new Node(50);

        root.left = new Node(40);
        root.left.left = new Node(35);
        root.left.right = new Node(45);

        root.right = new Node(60);
        root.right.left = new Node(55);
        root.right.right = new Node(65);

        System.out.println("No. of Nodes in the tree = "+ countBSTNodes.countNoOfNodes(root));
    }
}

