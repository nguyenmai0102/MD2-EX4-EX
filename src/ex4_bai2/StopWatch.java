package ex4_bai2;

public class StopWatch {
    public static void main(String[] args) {
        // khai bao va khoi tao vong lap voi10000 phan tu
        int [] arrInt = new int[10000];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = (int) Math.random()*10000;
        }

        // b2: khoi tao dong ho
        StopWatch sw = new StopWatch();
        sw.start();

         //b3: start  thuwcj hieenj giair thuaatj giair thuaatj dde xawps xeeps soo nguyeen 10000 pan tuwr
        for (int i = 0; i < arrInt.length; i++) {
            for (int j = 0; j < args.length; j++) {
                if (arrInt[i]>arrInt[j]){
                    int temp = arrInt[i];
                    arrInt[i]=arrInt[j];
                    arrInt[j]=temp;
                }

            }

        }
         //b4: stop dong ho so thoiw gin
        // thuwcj de giai thuat
        sw.stop();
        // b5:   in so thoiw gian thuwc hien giai thuatj
        System.out.println("thi gian thuc hien giai thuat la: "+sw.getElapsedTime());
    }
}
