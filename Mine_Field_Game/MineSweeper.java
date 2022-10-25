package Mayin_Tarlasi;

import java.util.Scanner;

public class MineSweeper {
    int rowCount;
    int colCount;
    int mineCount;
    char[][] gameBoard;
    char[][] gameMap;
    int satir;
    int sutun;
    int nearStarCount;

    MineSweeper(int row, int col) {
        this.rowCount = row;
        this.colCount = col;
        this.gameBoard = new char[row][col];
        this.gameMap = new char[row][col];
        this.mineCount = ((col * row) / 4);


    }

    void minePosition() { 
        for (int i = 0; i < mineCount; i++) {
          
                int a = (int) (Math.random() * rowCount);
                int b = (int) (Math.random() * colCount);
                if (gameMap[a][b] != '*'){
                    gameMap[a][b] = '*';
            }
        }
    }

    void printGameMap() {
        System.out.println("Mayýn Tarlasýnýn Konumu");
        minePosition(); 
        for (int i = 0; i < gameMap.length; i++) {
            for (int j = 0; j < gameMap[0].length; j++) {
                if (gameMap[i][j] != '*') { 
                    gameMap[i][j] = '-';
                }
                System.out.print(gameMap[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("==============================");
    }

    void elementsGameBoard() {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                gameBoard[i][j] = '-';
            }
        }
    }

    void printGameBoard() {
        for (int i = 0; i < this.gameBoard.length; i++) {
            for (int j = 0; j < this.gameBoard[i].length; j++) {
                System.out.print(this.gameBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    void getData() { 
        boolean isTrue = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Seçmek istediðiniz noktanýn satýr ve sutun bilgilerini giriniz");
        System.out.print("Satýr bilgisini giriniz:");
        satir = (scan.nextInt() - 1);
        System.out.print("Sutun bilgisini giriniz:");
        sutun = (scan.nextInt() - 1);
        while (!isTrue) { 
            if (satir < 0 || satir > gameBoard.length - 1 || sutun < 0 || sutun > gameBoard[0].length - 1) {
                System.out.println("Hatalý bir giriþ yaptýnýz tekrar giriniz.");
                System.out.print("Satýr bilgisini giriniz:");
                satir = scan.nextInt() - 1;
                System.out.print("Sutun bilgisini giriniz:");
                sutun = scan.nextInt() - 1;
            } else
                isTrue = true;
        }
        System.out.println("=========================");
    }

    public int starCountonMap() { 
       
        nearStarCount = 0;
        if (sutun + 1 < gameMap[0].length - 1) {
            if (gameMap[satir][sutun + 1] == '*')
                nearStarCount++;
        }

        if (sutun - 1 >= 0) {
            if (gameMap[satir][sutun - 1] == '*')
                nearStarCount++;
        }

        if (satir + 1 < gameMap.length - 1) {
            if (gameMap[satir + 1][sutun] == '*')
                nearStarCount++;
        }

        if (satir - 1 >= 0) {
            if (gameMap[satir - 1][sutun] == '*')
                nearStarCount++;
        }
        if (satir - 1 >= 0 && sutun - 1 >= 0) {
            if (gameMap[satir - 1][sutun - 1] == '*')
                nearStarCount++;
        }
        if (satir - 1 >= 0 && sutun + 1 < gameMap[0].length - 1)
            if (gameMap[satir - 1][sutun + 1] == '*')
                nearStarCount++;
        if (satir + 1 < gameMap.length - 1 && sutun - 1 >= 0)
            if (gameMap[satir + 1][sutun - 1] == '*')
                nearStarCount++;
        if (satir + 1 < gameMap.length - 1 && sutun + 1 < gameMap[0].length - 1)
            if (gameMap[satir + 1][sutun + 1] == '*')
                nearStarCount++;
        return nearStarCount;
    }

    public void changeBoardGame() {
        switch (starCountonMap()) { 
            case 0:
                gameBoard[satir][sutun] = '0';
                gameMap[satir][sutun] = '0';
                break;
            case 1:
                gameBoard[satir][sutun] = '1';
                gameMap[satir][sutun] = '1';
                break;

            case 2:
                gameBoard[satir][sutun] = '2';
                gameMap[satir][sutun] = '2';
                break;

            case 3:
                gameBoard[satir][sutun] = '3';
                gameMap[satir][sutun] = '3';
                break;
            case 4:
                gameBoard[satir][sutun] = '4';
                gameMap[satir][sutun] = '4';
                break;

            case 5:
                gameBoard[satir][sutun] = '5';
                gameMap[satir][sutun] = '5';
                break;

            case 6:
                gameBoard[satir][sutun] = '6';
                gameMap[satir][sutun] = '6';
                break;
            case 7:
                gameBoard[satir][sutun] = '7';
                gameMap[satir][sutun] = '7';
                break;  
        }

    }

    boolean checkContinue() {
        for (int i = 0; i < gameMap.length; i++) {
            for (int j = 0; j < gameMap[0].length; j++) {
                if (gameMap[i][j] == '-')
                    return false;
            }
        }
        return true;
    }

    public void run() {
        printGameMap();
        System.out.println("Mayýn Tarlasý Oyununa Hoþgeldiniz ! ");
        System.out.println("-----------------------------------");
        elementsGameBoard(); 
        printGameBoard(); 
        while (true) { 
            this.getData();
            if (gameMap[satir][sutun] == '*') {
                System.out.println("Mayýna bastýnýz.");
                System.out.println("Game Over !!!");
                break;
            } else {
                changeBoardGame();
                printGameBoard();
                if ((checkContinue())) {
                    System.out.println("Tebrikler...Oyunu Kazandýnýz !");
                    break;
                }
            }
        }

    }
}