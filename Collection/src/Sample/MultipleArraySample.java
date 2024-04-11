package Sample;

public class MultipleArraySample {

    public static void main(String[] args) {
     var martix = new int[3][4];// 3行4列の二次元配列
     
     //二次元配列へのアクセスと代入
     for(var i = 0; i < martix.length; i++) {
         for(var j = 0; j < martix[i].length; j++) {
         martix[i][j] = i * 3 + j + 1; //値の代入
         
     }
    
    }
     //二次元配列のを表示
     for(var i = 0; i < martix.length; i++) {
         for(var j = 0; j < martix[i].length; j++) {
             System.out.println(martix[i][j]+ "");
              }
             System.out.println();
             
             
     }
         
     }
}
