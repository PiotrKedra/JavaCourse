class Matrix{
	float [][] matrix_;
	int rows_;
	int columns_;
	
	public Matrix(float [][] matrix, int rows, int columns){
		matrix_=matrix;
		rows_=rows;
		columns_=columns;
	}
	
	Matrix add(Matrix m2){
		if(this.rows_*this.columns_ != m2.rows_*m2.columns_) {
			float [][] tab = new float[1][1];
			Matrix matrix=new Matrix(tab,0,0);
			return matrix;
		}
		float [][] result = new float[m2.rows_][m2.columns_];
		for(int i=0; i<m2.rows_; ++i){
			for(int j=0; j<m2.columns_ ; ++j){
				result[i][j] = this.matrix_[i][j] + m2.matrix_[i][j];
			}
		}
		Matrix resultM = new Matrix(result, m2.rows_, m2.columns_);
		return resultM;
	}
	Matrix sub(Matrix m2){
		if(this.rows_*this.columns_ != m2.rows_*m2.columns_) {
			float [][] tab = new float[1][1];
			Matrix matrix=new Matrix(tab,0,0);
			return matrix;
		}
		float [][] result = new float[m2.rows_][m2.columns_];
		for(int i=0; i<m2.rows_; ++i){
			for(int j=0; j<m2.columns_ ; ++j){
				result[i][j] = this.matrix_[i][j] - m2.matrix_[i][j];
			}
		}
		Matrix resultM = new Matrix(result, 2, 2);
		return resultM;
	}
	
	Matrix mul(Matrix m2){
		if(this.columns_!=m2.rows_){
			float [][] tab = new float[][] {{0}};
			Matrix matrix=new Matrix(tab,1,1);
			return matrix;
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
		Matrix resultM = new Matrix(result, this.rows_, m2.columns_);
		return resultM;
	}
	
	
	void show(){
		for(int i=0; i<this.rows_; ++i){
			for(int j=0; j<this.columns_; ++j){
				System.out.println(this.matrix_[i][j]);
			}
		}
	}
}
	
		