package com.example.demo;
// import java.util.*;

import org.springframework.web.bind.annotation.*;

@RestController
public class SchedulerController {

    @GetMapping("/schedule")
    public int[][] schedule(@RequestParam int n) {
        int[][] board = new int[n][n];

        if (scheduleMeetings(board, 0, n)) {
            return board;
        }

        return new int[0][0]; // no solution
    }

     public static boolean scheduleMeetings(int[][] board, int col, int N) {

        if (col == N) return true;

        for (int row = 0; row < N; row++) {

            if (isSafe(board, row, col, N)) {

                board[row][col] = 1;

                if (scheduleMeetings(board, col + 1, N))
                    return true;

                board[row][col] = 0; // backtrack
            }
        }

        return false;
    }

    public static boolean isSafe(int[][] board, int row, int col, int N) {

        // Check same row (time slot conflict)
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1)
                return false;
        }

        // Upper diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }

        // Lower diagonal
        for (int i = row, j = col; i < N && j >= 0; i++, j--) {
            if (board[i][j] == 1)
                return false;
        }

        return true;
    }

    public static void printSchedule(int[][] board, int N) {

        System.out.println("\nMeeting Schedule:\n");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 1)
                    System.out.print("M ");
                else
                    System.out.print(". ");
            }
            System.out.println();
        }
    }

    // public static void main(String[] args) {

    //     Scanner input = new Scanner(System.in);

    //     System.out.print("Enter number of meetings: ");
    //     int N = input.nextInt();

    //     int[][] board = new int[N][N];

    //     if (scheduleMeetings(board, 0, N)) {
    //         printSchedule(board, N);
    //     } else {
    //         System.out.println("No valid meeting arrangement possible.");
    //     }

    //     input.close();
    // }
}
