public class Tree
{
    private TreeNode root;

    public void insert(int t)
    {
        if(root==null)
        {
            root=new TreeNode(t);
        }
        else
        {
            root.insert(t);
        }
    }


    public void delete(int value)
    {
        root=delete(root,value);
    }

    private TreeNode delete(TreeNode subtree,int value)
    {
        if(subtree==null)
        {
            return subtree;
        }

        if(value<subtree.getData())
        {
            subtree.setLeftNode(delete(subtree.getLeftNode(),value));
        }
        else if(value>subtree.getData())
        {
            subtree.setRightNode(delete(subtree.getRightNode(), value));
        }
        else
        {
            if(subtree.getLeftNode()==null)
            {
                return subtree.getRightNode();
            }
            else if(subtree.getRightNode()==null)
            {
                return subtree.getLeftNode();
            }
            subtree.setData(subtree.getRightNode().min());
            subtree.setRightNode(delete(subtree.getRightNode(), subtree.getData()));
        }
        return subtree;
    }

    public void preOrder()
    {
        if(root==null)
        {
            return;
        }
        else{
            root.TransversePreOrder();
        }
    }


    public void inOrder()
    {
        if(root==null)
        {
            return;
        }
        else{
            root.TransverseInOrder();
        }
    }
    public TreeNode get(int value)
    {
        if(root!=null)
        {
            root.get(value);
        }
        return null;
    }

    public int min()
    {
        if(root==null)
        {
            return Integer.MIN_VALUE;
        }
        else
        {
            return root.min();
        }
    }

}