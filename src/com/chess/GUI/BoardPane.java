
package com.chess.GUI;


import com.chess.engine.board.Board;

import javafx.scene.layout.GridPane;

public class BoardPane extends GridPane {
    TilePane[]boardTiles=new TilePane[64];
    Board chessBoard;

    public BoardPane(){
        this.chessBoard=Board.creatStandardBoard();
        System.out.print(chessBoard);
        
        for(int i=0;i<64;i++){
        boardTiles[i]=new TilePane(this,i);
        }
        for(int k=0;k<8;k++){
        for(int j=0;j<8;j++){
        add(boardTiles[j+(k*8)],j,k);
        }
        }
        
    }
    public  void drawBoard(Board board,BoardPane bp){
       getChildren().clear();
       for(final TilePane tilePane:bp.boardTiles){
            tilePane.drawTilePane(board);        }
         for(int k=0;k<8;k++){
        for(int j=0;j<8;j++){
        add(bp.boardTiles[j+(k*8)],j,k);
        
        }
        }
      
    }
}
