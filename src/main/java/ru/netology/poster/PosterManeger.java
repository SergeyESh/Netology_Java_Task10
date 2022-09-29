package ru.netology.poster;

public class PosterManeger {
    private String[] films = new String[0];
    private int size;

    public PosterManeger() {
        size = 10;
    }

    public PosterManeger(int size) {
        this.size = size;
    }

    public void add(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength;
        if (films.length < size) {
            resultLength = films.length;
        } else {
            resultLength = size;
        }

        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }
}
