package org.example;


import org.example.LinkedLists.CircularLLNode;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.example.LinkedLists.CircularLLNode.addBegin;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

/**
 * Unit test for simple App.
 */

@ExtendWith(MockitoExtension.class)
public class CircularLLNodeTest {

    @Test
    public void addToEmptyListTest(){
        CircularLLNode list = null;
        int data = 10;
        list = CircularLLNode.addToEmpty(list, data);
        assertNotNull("last node should not be null");
        assertEquals(data, list.data, 10);
    }

    @Test
    public void listContainsNodeTrue(){
        CircularLLNode list = null;
        int data = 10;
        list = CircularLLNode.addToEmpty(list, data);
        assertTrue(CircularLLNode.containsNode(list,10));
    }

    @Test
    public void listContainsNodeFalse(){
        CircularLLNode list = null;
        int data = 10;
        list = CircularLLNode.addToEmpty(list, data);
        assertFalse(CircularLLNode.containsNode(list,13));
    }

    @Test
    public void deleteNodeTest(){
        CircularLLNode list = null;
        int data = 10;
        list = CircularLLNode.addToEmpty(list, data);
        CircularLLNode.addBegin(list, 4);
        CircularLLNode.addBegin(list, 2);
        CircularLLNode.deleteNode(list, 2);
        assertFalse(CircularLLNode.containsNode(list, 2));
        assertTrue(CircularLLNode.containsNode(list, 4));
    }

    @Test
    public void addToBeginningTest(){
        CircularLLNode list = null;
        int data = 10;
        list = CircularLLNode.addToEmpty(list, data);
        CircularLLNode.addBegin(list, 4);
        CircularLLNode.addBegin(list, 2);
        
        assertTrue(CircularLLNode.containsNode(list, 4));

    }
}
