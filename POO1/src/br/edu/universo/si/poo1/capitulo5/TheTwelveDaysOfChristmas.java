package br.edu.universo.si.poo1.capitulo5;

/**
 * Exercício 5.29 do Deitel
 * @author andremourajr
 * 
 * 
 */
public class TheTwelveDaysOfChristmas {
    public static void main(String[] args) {
        for (int i=1; i<=12; i++) {
            System.out.print("On the ");
            switch (i) {
                case 1: System.out.print("first"); break;
                case 2: System.out.print("second"); break;
                case 3: System.out.print("third"); break;
                case 4: System.out.print("forth"); break;
                case 5: System.out.print("fifth"); break;
                case 6: System.out.print("sixth"); break;
                case 7: System.out.print("seventh"); break;
                case 8: System.out.print("eighth"); break;
                case 9: System.out.print("nineth"); break;
                case 10: System.out.print("tenth"); break;
                case 11: System.out.print("eleventh"); break;
                case 12: System.out.print("twelfth"); break;
            }
            System.out.println(" day of Christmas");
            System.out.println("my true love sent to me:");
            
            switch (i) {
                case 12: System.out.println("Twelve Drummers Drumming");
                case 11: System.out.println("Eleven Pipers Piping");
                case 10: System.out.println("Ten Lords a Leaping");
                case 9: System.out.println("Nine Ladies Dancing");
                case 8: System.out.println("Eight Maids a Milking");
                case 7: System.out.println("Seven Swans a Swimming");
                case 6: System.out.println("Six Geese a Laying");
                case 5: System.out.println("Five Golden Rings");
                case 4: System.out.println("Four Calling Birds");
                case 3: System.out.println("Three French Hens");
                case 2: System.out.println("Two Turtle Doves");
                        System.out.println("and a Partridge in a Pear Tree");
                        break;
                case 1: System.out.println("A Partridge in a Pear Tree");
            }
            System.out.println();
        }
    }
}

/*
On the first day of Christmas
my true love sent to me:
A Partridge in a Pear Tree

On the second day of Christmas
my true love sent to me:
Two Turtle Doves
and a Partridge in a Pear Tree

On the third day of Christmas
my true love sent to me:
Three French Hens
Two Turtle Doves
and a Partridge in a Pear Tree

On the fourth day of Christmas
my true love sent to me:
Four Calling Birds
Three French Hens
Two Turtle Doves
and a Partridge in a Pear Tree

On the fifth day of Christmas
my true love sent to me:
Five Golden Rings
Four Calling Birds
Three French Hens
Two Turtle Doves
and a Partridge in a Pear Tree

On the sixth day of Christmas
my true love sent to me:
Six Geese a Laying
Five Golden Rings
Four Calling Birds
Three French Hens
Two Turtle Doves
and a Partridge in a Pear Tree

On the seventh day of Christmas
my true love sent to me:
Seven Swans a Swimming
Six Geese a Laying
Five Golden Rings
Four Calling Birds
Three French Hens
Two Turtle Doves
and a Partridge in a Pear Tree

On the eighth day of Christmas
my true love sent to me:
Eight Maids a Milking
Seven Swans a Swimming
Six Geese a Laying
Five Golden Rings
Four Calling Birds
Three French Hens
Two Turtle Doves
and a Partridge in a Pear Tree

On the ninth day of Christmas
my true love sent to me:
Nine Ladies Dancing
Eight Maids a Milking
Seven Swans a Swimming
Six Geese a Laying
Five Golden Rings
Four Calling Birds
Three French Hens
Two Turtle Doves
and a Partridge in a Pear Tree

On the tenth day of Christmas
my true love sent to me:
Ten Lords a Leaping
Nine Ladies Dancing
Eight Maids a Milking
Seven Swans a Swimming
Six Geese a Laying
Five Golden Rings
Four Calling Birds
Three French Hens
Two Turtle Doves
and a Partridge in a Pear Tree

On the eleventh day of Christmas
my true love sent to me:
Eleven Pipers Piping
Ten Lords a Leaping
Nine Ladies Dancing
Eight Maids a Milking
Seven Swans a Swimming
Six Geese a Laying
Five Golden Rings
Four Calling Birds
Three French Hens
Two Turtle Doves
and a Partridge in a Pear Tree

On the twelfth day of Christmas
my true love sent to me:
12 Drummers Drumming
Eleven Pipers Piping
Ten Lords a Leaping
Nine Ladies Dancing
Eight Maids a Milking
Seven Swans a Swimming
Six Geese a Laying
Five Golden Rings
Four Calling Birds
Three French Hens
Two Turtle Doves
and a Partridge in a Pear Tree

*/