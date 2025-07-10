public class Main {
    public static void main(String[] args) {
        int b2= 1;
        int b3 = 1;
        int b4 = 1;
        int b5 = 1;
        int b6 = 1;
        int b7 = 1;
        int b8 = 1;
        int b9 = 1;
        while (b2 < 11){
            System.out.println("Bảng cửu chương 2 ");
            System.out.println("2 * " + b2 + " = "  + 2 * b2);
            b2++;
            if(b2 > 10){
                while (b3 < 11){
                    System.out.println("Bảng cửu chương 3 ");
                    System.out.println("3 * " + b3 + " = " + 3* b3);
                    b3++;
                }
                if(b3 > 10){
                    while (b4 < 11){
                        System.out.println("Bảng cửu chương 4 ");
                        System.out.println("4 * " + b4 + " = " + 4* b4);
                        b4++;
                    }
                    if(b4 > 10){
                        while (b5 < 11){
                            System.out.println("Bảng cửu chương 5 ");
                            System.out.println("5 * " + b5 + " = " + 5* b5);
                            b5++;
                        }
                        if(b5 > 10){
                            while (b6 < 11){
                                System.out.println("Bảng cửu chương 6 ");
                                System.out.println("6 * " + b6 + " = " + 6* b6);
                                b6++;
                            }
                            if(b6 > 10){
                                while (b7 < 11){
                                    System.out.println("Bảng cửu chương 7 ");
                                    System.out.println("7 * " + b7 + " = " + 7* b7);
                                    b7++;
                                }
                                if (b7 > 10){
                                    while (b8 < 11){
                                        System.out.println("Bảng cửu chương 8 ");
                                        System.out.println("8 * " + b8 + " = " + 8* b8);
                                        b8++;
                                    }
                                    if(b8 > 10){
                                        while (b9 < 11){
                                            System.out.println("Bảng cửu chương 9 ");
                                            System.out.println("9 * " + b9 + " = " + 9* b9);
                                            b9++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
        int dem = 0;
        for (int i = 1; i <= 100; i++){
            if(i % 3 == 0){
                dem = dem + i;
            }
        }
        System.out.println(dem);
        int [] array = {5,10,15,20};
        for (int all :array){
            System.out.println(all);
        }
    }
}