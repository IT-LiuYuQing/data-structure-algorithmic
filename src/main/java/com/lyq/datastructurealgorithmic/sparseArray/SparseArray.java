package com.lyq.datastructurealgorithmic.sparseArray;

import org.springframework.stereotype.Service;

/**
 * @author lyq
 * @description: 数组与稀疏数组之间的相互转换
 * @date 2022/1/25 11:12
 */
@Service
public class SparseArray {
    public void sparseArray() {
        int[][] ints = new int[11][11];
        ints[2][3] = 1;
        ints[3][4] = 2;
        int sums = 1;
        for (int i = 0; i < ints.length; i++) {
            for (int ii = 0; ii < ints[i].length; ii++) {
                if (ints[i][ii] != 0) {
                    sums++;
                }
            }
        }

        //构建稀疏数组--减少存储空间
        int[][] ints1 = new int[sums][3];
        ints1[0][0] = ints.length;
        ints1[0][1] = ints[0].length;
        ints1[0][2] = sums-1;
        int row = 1;
        for (int i = 0; i < ints.length; i++) {
            for (int ii = 0; ii < ints[i].length; ii++) {
                if (ints[i][ii] != 0) {
                    ints1[row][0] = i;
                    ints1[row][1] = ii;
                    ints1[row][2] = ints[i][ii];
                    row++;
                }
            }
        }
        System.out.println("数组构建稀疏数组成功");

        //稀疏数组变为数组
        int[][] array = new int[ints1[0][0]][ints1[0][1]];
        for (int i = 1; i < ints1.length; i++) {

            int  row1=ints1[i][0];
            int  col1=ints1[i][1];
            int  value=ints1[i][2];

            array[row1][col1]=value;

        }
        System.out.println("稀疏数组构建数组成功");


    }
}
