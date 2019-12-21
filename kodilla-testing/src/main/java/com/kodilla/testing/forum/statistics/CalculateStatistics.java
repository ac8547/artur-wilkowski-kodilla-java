package com.kodilla.testing.forum.statistics;

import java.util.*;

public class CalculateStatistics {

    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double averagePostsUsers;
    private double averageCommentsUsers;
    private double averageCommentsPosts;

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAveragePostsUsers() {
        return averagePostsUsers;
    }

    public double getAverageCommentsUsers() {
        return averageCommentsUsers;
    }

    public double getAverageCommentsPosts() {
        return averageCommentsPosts;
    }

    private double calAveragePostsPerUsers(){
        if(usersQuantity>0){
            return (double)postsQuantity/usersQuantity;
        } else {
            return 0;
        }
    }

    private double calAverageCommentsPerUsers(){
        if(usersQuantity>0){
            return (double)commentsQuantity/usersQuantity;
        } else {
            return 0;
        }
    }

    private double calAverageCommentsPerPosts(){
        if(postsQuantity>0){
            return (double)commentsQuantity/postsQuantity;
        } else {
            return 0;
        }
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        averagePostsUsers = calAveragePostsPerUsers();
        averageCommentsUsers = calAverageCommentsPerUsers();
        averageCommentsPosts = calAverageCommentsPerPosts();
    }


    public void showStatistics (){
        System.out.println(usersQuantity);
        System.out.println(postsQuantity);
        System.out.println(commentsQuantity);
        System.out.println(calAveragePostsPerUsers());
        System.out.println(calAverageCommentsPerPosts());
        System.out.println(calAverageCommentsPerUsers());
    }
}