package cn.lbl.face;

/*
beautiful number
1,11,111...
3  >二进制 11
13 >三进制 111
3<=N<=1000
 */
public class face01 {
    public static void main(String[] args) {
        for (int i = 3; i <= 1000; i++) {
            System.out.print(i+"的====");
            forj:for (int j = 2; j <=i-1; j++) {
                String s = Long.toString(i, j);
                byte[] bytes = s.getBytes();
                for (int k = 0; k <bytes.length ; k++) {
                    if(bytes[k]==49){
                    }else{
                        continue forj;
                    }
                }
                System.out.print(j+"进制完美");
                break;
            }
            System.out.println();
        }
    }
}
