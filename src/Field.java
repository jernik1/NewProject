/**
 * Created by JERNIK on 10/06/2014.
 */
public class Field {
    private static final int FIELD_SIZE = 3;

    private char[][] field = new char[FIELD_SIZE][FIELD_SIZE];

    private void eraseLine(int lineNumber){
        for (int i = 0;  i < FIELD_SIZE; i++){
            field[i][lineNumber] = ' ';
        }
    }
    private void showLine(int lineNumber){
        for (int i = 0;i <  FIELD_SIZE;i++){
            field[i][lineNumber] = ' ';
            showCell(i, lineNumber);
        }
    }
    public void eraseField() {
        for (int i = 0; i < FIELD_SIZE; i++) {
                eraseLine(i);
        }
    }
    public void showField(){
        System.out.println();
        for (int i = 0;i < FIELD_SIZE; i++) {
                showLine(i);
            }
        System.out.println();
    }
    private  void showCell(int x, int y){
        System.out.println("[" + field[x][y] + "]");
    }
}


/*
     [ ][ ][ ]
     [ ][ ][ ]
     [ ][ ][ ]
 */