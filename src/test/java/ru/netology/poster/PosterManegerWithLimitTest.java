package ru.netology.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PosterManegerWithLimitTest {

    PosterManeger post = new PosterManeger(5);

    String film1 = "1";
    String film2 = "2";
    String film3 = "3";
    String film4 = "4";
    String film5 = "5";
    String film6 = "6";

    @Test
    public void shouldFindLastFilmsMoreLimit() {

        post.add(film1);
        post.add(film2);
        post.add(film3);
        post.add(film4);
        post.add(film5);
        post.add(film6);

        String[] expected = { film6, film5, film4, film3, film2 };
        String[] actual = post.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindLastFilmsEquallyLimit() {

        post.add(film1);
        post.add(film2);
        post.add(film3);
        post.add(film4);
        post.add(film5);

        String[] expected = { film5, film4, film3, film2, film1 };
        String[] actual = post.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFilmsLessLimit() {

        post.add(film1);
        post.add(film2);
        post.add(film3);
        post.add(film4);

        String[] expected = { film4, film3, film2, film1 };
        String[] actual = post.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}