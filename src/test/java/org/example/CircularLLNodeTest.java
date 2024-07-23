package org.example;


import org.example.LinkedLists.CircularLLNode;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

/**
 * Unit test for simple App.
 */

@ExtendWith(MockitoExtension.class)
public class CircularLLNodeTest {

    @Mock
    CircularLLNode circularLLNode;

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
        assertTrue(list.containsNode(list,10));
    }

    @Test
    public void listContainsNodeFalse(){
        CircularLLNode list = null;
        int data = 10;
        list = CircularLLNode.addToEmpty(list, data);
        assertFalse(list.containsNode(list,13));
    }

    @Test
    public void deletingHeadMiddleTail(){


    }
}
