/*
 * Copyright (C) 2019 WipCamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package XI.Project;

import java.util.Scanner;

/**
 *
 * @author WipCamp11
 */
public class Stock {

    public static void main(String[] args) {
        System.out.println("1");
        Scanner sc = new Scanner(System.in);
        int item = 5;
        int limit = 10;
        int menu;

        System.out.println("limit : " + limit);
        System.out.println("item : " + item);
        System.out.println("---โกดัง---");
        System.out.println("1.add");
        System.out.println("2.remove");
        System.out.println("3.check");
        System.out.print("enter menu id : ");
        menu = sc.nextInt();
        if (menu == 1) {
            System.out.print("ADD Item : ");

            int amount = sc.nextInt();
            if (amount + item <= limit) {
                item = item + amount;
                System.out.println("item : " + item);

            } else {
                System.out.println("เต็มเเล้วจย้าาา");

            }
        } else if (menu == 2) {
            System.out.println("Remove Item : ");
            
            if (item > 0) {
                int amount = sc.nextInt();
                if (item - amount >= 0) {
                    item = item - amount;
                    System.out.println("item : " + item);

                } else {
                    System.out.println("ไอเทมไม่พอจย้าาา");

                }
            } else {
                System.out.println("ไอเทมหมดเเร้วจย้าา");
            }
        } else if (menu == 3) {
            System.out.println("item : " + item + "limit : " + limit);
        } else {
            System.out.println("เอ๋อเร๋อจย้าาา");

        }
    }
}
