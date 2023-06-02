package manager;

import domain.ListFilms;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class ListFilmsManagerTest {
    ListFilms film1 = new ListFilms(101, 1, "Бладшот - Начало.", 500, 2);
    ListFilms film2 = new ListFilms(102, 2, "Вперёд", 500, 2);
    ListFilms film3 = new ListFilms(103, 3, "Отель Белград", 500, 2);
    ListFilms film4 = new ListFilms(104, 4, "Джентльмены", 700, 2);
    ListFilms film5 = new ListFilms(105, 5, "Человек-неведимка", 300, 2);


    @Test
    public void test1FindLast() {
        ListFilmsManager manager = new ListFilmsManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);


        ListFilms[] actual = manager.findLast();
        ListFilms[] expected = {film5, film4, film3, film2, film1};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void test2FindLast() {
        ListFilmsManager manager = new ListFilmsManager();
        manager.add(film1);


        ListFilms[] actual = manager.findLast();
        ListFilms[] expected = {film1};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void test3FindLast() {
        ListFilmsManager manager = new ListFilmsManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);



        ListFilms[] actual = manager.findLast();
        ListFilms[] expected = {film5, film4, film3, film2, film1};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void test4FindLast() {
        ListFilmsManager manager = new ListFilmsManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);



        ListFilms[] actual = manager.findLast();
        ListFilms[] expected = { film5, film4, film3, film2,film1};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void test5FindLast() {
        ListFilmsManager manager = new ListFilmsManager();


        ListFilms[] actual = manager.findLast();
        ListFilms[] expected = {};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testFindAll() {
        ListFilmsManager manager = new ListFilmsManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);




        ListFilms[] actual = manager.findAll();
        ListFilms[] expected = {film1, film2, film3, film4, film5 };

        assertArrayEquals(actual, expected);
    }


}
