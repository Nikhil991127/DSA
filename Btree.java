
import java.util.Queue;

public class Btree{
    static class Node{
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        public static void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public static void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
        public static void levelordertraversal(Node root){
            if(root==null){
                return ;
            }
            Queue<Node> Q=new java.util.LinkedList<>();
            Q.add(root);
            Q.add(null);
            while(!Q.isEmpty()){
                Node currNode=Q.remove();
                if(currNode==null){
                    System.out.println("");
                    if(Q.isEmpty()){
                        break;
                    }else{
                        Q.add(null);
                    }
                }
                else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        Q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        Q.add(currNode.right);
                    }
                }
            }
        }
        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int lh=height(root.left);
            int rh=height(root.right);
            return Math.max(lh,rh)+1;
        }
        public static int count(Node root){
            if(root==null){
                return 0;
            }
            int lcount=count(root.left);
            int rcount=count(root.right);
            return lcount+rcount+1;
        }
        public static int sum(Node root){
            if(root==null){
                return 0;
            }
            int lsum=sum(root.left);
            int rsum=sum(root.right);
            return lsum+rsum+root.data;
        }
    }
    public static void main(String[] args){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1 };
        BinaryTree tree=new BinaryTree();
        ///Node root=tree.buildTree(nodes);
        //System.out.println(root.data);
        //tree.preorder(root);
        //tree.inorder(root);
        //tree.postorder(root);
        Node root=new Node(1);
        root.left= new Node(2);
        root.right=new Node(3);
        //tree.levelordertraversal(root);
        System.out.println(tree.height(root));
        System.out.println(tree.count(root));
        System.out.println(tree.sum(root));
        System.out.println(tree.sum(root));
    }
}  