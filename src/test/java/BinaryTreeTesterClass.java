import com.loic.projectfacebook.crackingcode.trees.BinaryTree;
import com.loic.projectfacebook.crackingcode.trees.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryTreeTesterClass {



    BinaryTree tp = new BinaryTree();
    TreeNode tree;
    int [] arr = {1,2,3,4,5,6};

    @Test
    public void findNode() {

        TreeNode node = tp.findValue(tree, 4);
        //Assert.assertTrue(node instanceof TreeNode);
        TreeNode nullNode = tp.findValue(tree, 5);
        Assert.assertNull(nullNode);

    }




}
