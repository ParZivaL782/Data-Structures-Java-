
public class TreeNode 
{
    private int data;
    private TreeNode leftNode;
    private TreeNode RightNode;

    public TreeNode(int d)
    {
        this.data=d;
    }

    
    public void insert(int t)
    {
        if(t==data)
        {
            return;
        }
        if(t<data)
        {
            if(leftNode==null)
            {
                leftNode=new TreeNode(t);
            }
            else
            {
                leftNode.insert(t);
            }
        }
        else
        {
            if(RightNode==null)
            {
                RightNode=new TreeNode(t);
            }
            else
            {
                RightNode.insert(t);
            }
        }
    }



    public TreeNode get(int value)
    {
        if(data==value)
        {
            return this;
        }
        if(value<data)
        {
            if(leftNode!=null)
                return leftNode.get(value);
        }
        else
        {
            if(RightNode!=null)
                return RightNode.get(value);
        }
        return null;
    }


    public int min()
    {
        if(this.getLeftNode()==null)
        {
            return this.data;
        }
        else
        {
            return this.getLeftNode().min();
        }
    }

    public void TransverseInOrder()
    {
        if(leftNode!=null)
        {
            leftNode.TransverseInOrder();
        }
        System.out.print(data+",");

        if(RightNode!=null)
        {
            RightNode.TransverseInOrder();
        }
    }

    public void TransversePreOrder()
    {
        if(this!=null)
        {
            System.out.print(data+",");
        }
        if(leftNode!=null)
        {
            leftNode.TransversePreOrder();
        }
        if(RightNode!=null)
        {
            RightNode.TransversePreOrder(); 
        }

    }

    public int getData() {
        return data;
    }


    public void setData(int data) {
        this.data = data;
    }


    public TreeNode getLeftNode() {
        return leftNode;
    }


    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }


    public TreeNode getRightNode() {
        return RightNode;
    }


    public void setRightNode(TreeNode rightNode) {
        RightNode = rightNode;
    }

   

}
