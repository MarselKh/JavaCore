package Lesson2;

import java.lang.reflect.Array;

public class Throwable {

    public static void main(String[] args) {
/*        arrString ();*/
        try {
            arrString ();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static void arrString () throws MyArraySizeException, MyArrayDataException{
        String[][] arrStr = {{"5", "5", "7", "3"}, {"0", "8", "2", "0"}, {"9", "5", "6", "4"}, {"6", "8", "3", "0"}};
        int [][] arrInt = new int [arrStr.length][arrStr.length];
        int summ = 0;
            for (int i = 0; i < arrStr.length; i++) {it 
                for (int j = 0; j < arrStr.length; j++) {
                    if (arrStr.length != 4 || arrStr[i].length != 4)
                        throw new MyArraySizeException("Массив не соответствует размеру 4Х4");
                        try {
                            arrInt[i][j] = Integer.parseInt(arrStr[i][j]);
                            summ += arrInt[i][j];
                        } catch (NumberFormatException e) {
                            throw new MyArrayDataException("Ошибка в ячейке " + "[" + i + "]" + "[" + j + "]");
                        }
                }
            }
        System.out.println(summ);
    }

    static class MyArraySizeException extends RuntimeException {
        MyArraySizeException(String e) {
            super(e);
        }
    }

    static class MyArrayDataException extends RuntimeException {
        MyArrayDataException(String e) {
            super(e);
        }
    }
}

