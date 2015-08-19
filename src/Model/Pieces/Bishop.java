package Model.Pieces;

import Model.ChessModel;
import Model.PieceEnum;
import Model.Position;
import java.util.ArrayList;

/**
 * Created by Adam Fowles on 7/17/2015.
 */
public class Bishop extends Piece
{
    private final int[][] offsets = {{1,1},{-1,1},{-1,-1},{1,-1}};
    public Bishop(int row, int col, int color, ChessModel model)
    {
        super(row, col, color, model);
        pieceType = PieceEnum.BISHOP;
    }

    @Override
    public ArrayList<Position> getValidMoves()
    {
        ArrayList<Position> validMoves = new ArrayList<Position>();
        int currentRow = currentPos.row;
        int currentCol = currentPos.col;
        for (int[] offset: offsets)
        {
            validMoves.addAll(getValidMultiple(offset[0],offset[1],currentRow,currentCol));
        }
        return validMoves;
    }



}
