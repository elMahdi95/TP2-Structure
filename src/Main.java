public class Main {
    public static void main(String[] args) {
        SquareSubMatrix matrixTest = new SquareSubMatrix(3,new int[3][3], 0, 0, 2, 2);
        matrixTest.fillOne(); // test method fillOne
        //System.out.println(matrixTest); //imprime test de la method fillOne

        /*matrixTest.fillRand();   // test method fillRand
        System.out.println(matrixTest); // imprime test de la method fillRand
        */
        SquareSubMatrix matrixclone;
        matrixclone = matrixTest.clone();
        System.out.println(matrixclone);

        /*matrixTest.set(1,1,2);
        System.out.println(matrixTest);

         */
        //System.out.println(matrixTest.get(1,0));
        //matrixTest.set(0,0,3);
        //matrixTest.set(2,1,2);
        //matrixTest.set(1,2,4);
        //System.out.println(matrixTest);
        //matrixTest.sum(matrixclone);
        //System.out.println(matrixTest);

    }
}
