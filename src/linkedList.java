public class linkedList {
    private Node head;
    private int size = 0;

    private class Node{ //각 노드!
        private Object data;
        private Node nextNode;
        private Node preNode; //이전 노드 넣어서 양방향 검색 쉽게 해봐야지!

        public Node(Object input) {
            this.data = input;
            this.nextNode = null;
            this.preNode = null;
        }

    }

    @Override
    public String toString() {
        if(head == null) return "-1";
        else{
            Node tempNode = head;
            StringBuilder data = new StringBuilder();
            while(tempNode != null){
                data.append(tempNode.data + ", ");
                tempNode = tempNode.nextNode;
            }
            return data.toString().replaceAll(", $", "");
        }

    }

    public void add(Object input){
        Node newNode = new Node(input);
        if (head == null) head = newNode;
        else{
            Node tempNode = head;
            while(tempNode.nextNode != null){
                tempNode = tempNode.nextNode;
            }
            tempNode.nextNode = newNode;
            newNode.preNode = tempNode;
        }
    }
}