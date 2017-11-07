package zad2;

import zad1.*;

public class DummyMatrix extends Matrix {
    public DummyMatrix(float [][] matrix, int rows, int columns){
        super(matrix, rows, columns);
    }

    public Matrix mul(Matrix m2) throws MatrixDimensionsException{
        if(this.columns_!=m2.rows_) {
            if (this.columns_ > m2.rows_) {
                float[][] matrix2 = new float[this.columns_][m2.columns_];
                for (int i = 0; i < this.columns_; ++i) {
                    for (int j = 0; j < m2.columns_; ++j) {
                        if (i >= m2.rows_) {
                            matrix2[i][j] = 1;
                        } else {
                            matrix2[i][j] = m2.matrix_[i][j];
                        }
                    }
                }
                Matrix extendedMatrixTmp = new Matrix(matrix2, this.columns_, m2.columns_);
                throw new MatrixDimensionsException(this.mul(extendedMatrixTmp));
            } else {
                float[][] matrix2 = new float[this.columns_][m2.columns_];
                for (int i = 0; i < this.columns_; ++i) {
                    System.arraycopy(m2.matrix_[i], 0, matrix2[i], 0, m2.columns_);
                }
                Matrix extendedMatrixTmp = new Matrix(matrix2, this.columns_, m2.columns_);

                throw new MatrixDimensionsException(this.mul(extendedMatrixTmp));
            }
        }
              // it is printing extra matrix
            //which expands both matrix (with value 1) so the can be multiply
            //the rest of the code is same as it is in Matrix class
        float [][] result = new float[this.rows_][m2.columns_];
        for(int i=0; i<this.rows_ ; ++i){
            for(int j=0; j<m2.columns_ ; ++j){
                int value = 0;
                int b=0;
                for(int a=0; a<this.columns_ ; ++a){
                    value += this.matrix_[i][a]*m2.matrix_[b][j];
                    ++b;
                }
                result[i][j] = value;
            }
        }
        return new Matrix(result, this.rows_, m2.columns_);
    }
}
