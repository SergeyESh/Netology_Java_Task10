package ru.netology.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterManagerWithoutLimitTest {
    PosterManeger post = new PosterManeger();

    String film1 = "1";
    String film2 = "2";
    String film3 = "3";
    String film4 = "4";
    String film5 = "5";
    String film6 = "6";
    String film7 = "7";
    String film8 = "8";
    String film9 = "9";
    String film10 = "10";
    String film11 = "11";

    @BeforeEach
    public void setup() {
        post.add(film1);
        post.add(film2);
        post.add(film3);
        post.add(film4);
        post.add(film5);
        post.add(film6);
        post.add(film7);
        post.add(film8);
        post.add(film9);
        post.add(film10);
        post.add(film11);
    }

    @Test
    public void shouldFindAllFilms() {

        String[] expected = { film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11 };
        String[] actual = post.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFilms() {

        String[] expected = { film11, film10, film9, film8, film7, film6, film5, film4, film3, film2 };
        String[] actual = post.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
