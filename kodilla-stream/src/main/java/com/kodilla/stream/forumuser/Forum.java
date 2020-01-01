package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theForumUser = new ArrayList<>();

    public Forum(){

        theForumUser.add(new ForumUser(1, "leon", 'M', 2000, 1, 22, 5));
        theForumUser.add(new ForumUser(2, "aga", 'F', 1995, 3, 2, 1));
        theForumUser.add(new ForumUser(3, "krzys", 'M', 1975, 5, 31, 3));
        theForumUser.add(new ForumUser(4, "gucio", 'M', 1970, 3, 9, 0));
        theForumUser.add(new ForumUser(5, "maja", 'F', 1997, 11, 11, 20));
        theForumUser.add(new ForumUser(6, "pajak", 'M', 1973, 04, 11, 5));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUser);
    }
}
