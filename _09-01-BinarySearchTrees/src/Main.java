public class Main {
    public static void main(String[] args) {
        Tree inTree = new Tree();
        inTree.insert(25);
        inTree.insert(20);
        inTree.insert(15);
        inTree.insert(27);
        inTree.insert(30);
        inTree.insert(29);
        inTree.insert(26);
        inTree.insert(22);
        inTree.insert(32);

        inTree.traverseInOrder();

    }
}
