package com.kodilla.testing.forum.statistics;

import org.junit.Test;
import org.junit.Assert;
import java.util.*;

import static org.mockito.Matchers.doubleThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class StatisticsTestSuite {


    @Test
    public void forPostEqualsZero(){

        Statistics statisticsMock = mock(Statistics.class);

        LinkedList<String> theUserList = new LinkedList<String>();
        for (int i = 0; i<6; i++){
            theUserList.add("user_" + i);
        }

        when(statisticsMock.usersNames()).thenReturn(theUserList);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);


        CalculateStatistics calculateStatistics = new CalculateStatistics();

        calculateStatistics.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0.0, calculateStatistics.getAveragePostsUsers(),0.01);
        Assert.assertEquals(1.66, calculateStatistics.getAverageCommentsUsers(),0.01);
        Assert.assertEquals(0.0, calculateStatistics.getAverageCommentsPosts(),0.01);

    }


    @Test
    public void forPostEquals1000() {

        Statistics statisticsMock = mock(Statistics.class);

        LinkedList<String> theUserList = new LinkedList<String>();
        for (int i = 0; i<20; i++){
            theUserList.add("user_" + i);
        }

        when(statisticsMock.usersNames()).thenReturn(theUserList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(20);


        CalculateStatistics calculateStatistics = new CalculateStatistics();

        calculateStatistics.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(50.00, calculateStatistics.getAveragePostsUsers(),0.01);
        Assert.assertEquals(1.00, calculateStatistics.getAverageCommentsUsers(),0.01);
        Assert.assertEquals(0.02, calculateStatistics.getAverageCommentsPosts(),0.01);

    }


    @Test
    public void forCommentsEqualsZero() {

        Statistics statisticsMock = mock(Statistics.class);

        LinkedList<String> theUserList = new LinkedList<String>();
        for (int i = 0; i<20; i++){
            theUserList.add("user_" + i);
        }

        when(statisticsMock.usersNames()).thenReturn(theUserList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);


        CalculateStatistics calculateStatistics = new CalculateStatistics();

        calculateStatistics.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(50.00, calculateStatistics.getAveragePostsUsers(),0.01);
        Assert.assertEquals(0.00, calculateStatistics.getAverageCommentsUsers(),0.01);
        Assert.assertEquals(0.00, calculateStatistics.getAverageCommentsPosts(),0.01);

    }

    @Test
    public void forCommentsLessPost() {

        Statistics statisticsMock = mock(Statistics.class);

        LinkedList<String> theUserList = new LinkedList<String>();
        for (int i = 0; i<20; i++){
            theUserList.add("user_" + i);
        }

        when(statisticsMock.usersNames()).thenReturn(theUserList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(20);


        CalculateStatistics calculateStatistics = new CalculateStatistics();

        calculateStatistics.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(50.00, calculateStatistics.getAveragePostsUsers(),0.01);
        Assert.assertEquals(1.00, calculateStatistics.getAverageCommentsUsers(),0.01);
        Assert.assertEquals(0.02, calculateStatistics.getAverageCommentsPosts(),0.01);

    }

    @Test
    public void forCommentsGreaterPost() {

        Statistics statisticsMock = mock(Statistics.class);

        LinkedList<String> theUserList = new LinkedList<String>();
        for (int i = 0; i<20; i++){
            theUserList.add("user_" + i);
        }

        when(statisticsMock.usersNames()).thenReturn(theUserList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(2000);


        CalculateStatistics calculateStatistics = new CalculateStatistics();

        calculateStatistics.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(50.00, calculateStatistics.getAveragePostsUsers(),0.01);
        Assert.assertEquals(100.00, calculateStatistics.getAverageCommentsUsers(),0.01);
        Assert.assertEquals(2.00, calculateStatistics.getAverageCommentsPosts(),0.01);

    }

    @Test
    public void forUsersEqualsZero() {

        Statistics statisticsMock = mock(Statistics.class);

        LinkedList<String> theUserList = new LinkedList<String>();

        when(statisticsMock.usersNames()).thenReturn(theUserList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(20);


        CalculateStatistics calculateStatistics = new CalculateStatistics();

        calculateStatistics.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0.00, calculateStatistics.getAveragePostsUsers(),0.01);
        Assert.assertEquals(0.00, calculateStatistics.getAverageCommentsUsers(),0.01);
        Assert.assertEquals(0.02, calculateStatistics.getAverageCommentsPosts(),0.01);

    }

    @Test
    public void forUsersEqual100() {

        Statistics statisticsMock = mock(Statistics.class);

        LinkedList<String> theUserList = new LinkedList<String>();
        for (int i = 0; i<100; i++){
            theUserList.add("user_" + i);
        }

        when(statisticsMock.usersNames()).thenReturn(theUserList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(2000);


        CalculateStatistics calculateStatistics = new CalculateStatistics();

        calculateStatistics.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(10.00, calculateStatistics.getAveragePostsUsers(),0.01);
        Assert.assertEquals(20.00, calculateStatistics.getAverageCommentsUsers(),0.01);
        Assert.assertEquals(2.00, calculateStatistics.getAverageCommentsPosts(),0.01);

    }


}
