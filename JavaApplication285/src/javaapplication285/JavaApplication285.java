package javaapplication285;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class JavaApplication285 {

    private ListNode head = null;

    public void put(int val) {
        if (head == null) {
            head = new ListNode(val);
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(val);
        }
    }

    public int get(int index) {
        if (index == 0 && head != null) {
            return head.value;
        }
        ListNode current = head;
        int counter = 1;
        while (current.next != null) {
            current = current.next;
            if (counter++ == index) {
                return current.value;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        
        Game game = new Game();
        
        List numbers = new ArrayList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String line = sc.nextLine();
            if (!line.equals("")) {
                numbers.add(Integer.parseInt(line));
            } else {
                int sum = 0;
                for (int i = 0; i < numbers.size(); i++) {
                    sum+=(int) numbers.get(i);
                    System.out.println(numbers.get(i)+ " ");
                }
                System.out.println("result is: " + sum);
            }
        }
        

//        Game game = new Game();
//        Scanner scanner = new Scanner(System.in);
//        int player_ids = 0;
//        while(true) {
//            System.out.print("Enter new player name: ");
//            String playername = scanner.nextLine();
//            game.addPlayer(new Player(++player_ids,playername));
//            Player p = new Player();
//            playername = p.getName();
//        }
//        JavaApplication285 list = new JavaApplication285();
//        for (int i = 1; i < 101; i++) {
//            list.put(i * 10);
//        }
//        System.out.println(list.get(0));
//        System.out.println(list.get(49));
//        System.out.println(list.get(99));
//        System.out.println(list.get(100));
    }

}
