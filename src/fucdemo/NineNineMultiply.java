package fucdemo;

public class NineNineMultiply {
    // 公共的 静态 无返回值 main方法 数组
    public static void main(String[] str) {
        /**
         * 九九乘法表
         */
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i + 1; j++) {
            System.out.print(j + "*" + i + " = " + j * i + "\t");            
            }
            System.out.println(" ");
        }
    }
}
