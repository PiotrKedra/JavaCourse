package zad1;

import java.io.*;
import java.util.ArrayList;

class Matrix {
    private float [][] matrix_;
    private int rows_;
    private int columns_;

    Matrix(String path) throws IOException, MatrixDimensionsException{
        InputStreamReader in = new InputStreamReader(new FileInputStream(path));
        BufferedReader readMatrix = new BufferedReader(in);;


        try {
            ArrayList<String[]> matrix = new ArrayList<>();

            rows_=0;
            columns_ = 0;
            while(readMatrix.ready()){
                String[] line = readMatrix.readLine().split(" ");
                matrix.add(line);
                if(columns_ == 0){
                    columns_ = line.length;
                }
                else if(columns_ != line.length){
                    throw new MatrixDimensionsException();
                }
                ++rows_;
            }
            matrix_ = new float[rows_][columns_];

            for(int i = 0;i<rows_;++i){
                for(int j = 0;j<columns_;++j){
                    matrix_[i][j] = Float.parseFloat(matrix.get(i)[j]);
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            readMatrix.close();
        }

    }

    Matrix(float [][] matrix, int rows, int columns){
        matrix_=matrix;
        rows_=rows;
        columns_=columns;
    }

    Matrix add(Matrix m2) throws MatrixDimensionsException{
        if(this.rows_*this.columns_ != m2.rows_*m2.columns_) {
            throw new MatrixDimensionsException();
        }
        float [][] result = new float[m2.rows_][m2.columns_];
        for(int i=0; i<m2.rows_; ++i){
            for(int j=0; j<m2.columns_ ; ++j){
                result[i][j] = this.matrix_[i][j] + m2.matrix_[i][j];
            }
        }
        return new Matrix(result, m2.rows_, m2.columns_);
    }
    Matrix sub(Matrix m2) throws MatrixDimensionsException{
        if(this.rows_*this.columns_ != m2.rows_*m2.columns_) {
            throw new MatrixDimensionsException();
        }
        float [][] result = new float[m2.rows_][m2.columns_];
        for(int i=0; i<m2.rows_; ++i){
            for(int j=0; j<m2.columns_ ; ++j){
                result[i][j] = this.matrix_[i][j] - m2.matrix_[i][j];
            }
        }
        return new Matrix(result, 2, 2);
    }

    Matrix mul(Matrix m2) throws MatrixDimensionsException{
        if(this.columns_!=m2.rows_){
            throw new MatrixDimensionsException();
        }
        float [][] result = new float[this.rows_][m2.columns_];
        for(int i=0; i<this.rows_ ; ++i){
            for(int j=0; j<m2.columns_ ; ++j){
                int value = 0;
                for(int a=0; a<this.columns_ ; ++a){
                    for(int b=0; b<m2.rows_ ; ++b){
                        value += this.matrix_[i][a]*m2.matrix_[b][j];
                    }
                }
                result[i][j] = value;
            }
        }
        return new Matrix(result, this.rows_, m2.columns_);
    }


    void show(){
        for(int i=0; i<this.rows_; ++i){
            for(int j=0; j<this.columns_; ++j){
                System.out.print(this.matrix_[i][j] + " ");
            }
            System.out.println();
        }
    }
}
