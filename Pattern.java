class Pattern {
    public static void triangle(){
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void Itriangle(){
        System.out.println("inverted triangle");
        int row=5;
        for(int i=0;i<row;i++){
            for(int j=row;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void numbertriangle(){
        int rows=5;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void charactertriangle(){
        int row=5;
         char ch='A';
        for(int i=0;i<row;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ch +" ");
            }
            ch++;
            System.out.println(" ");
        }
    }
    public static void Hollowrectangle(int l,int b) {
        for(int i=0;i<l;i++){
            for(int j=0;j<b;j++){
                if(i==0||i==l-1||j==0||j==b-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        
    }
    public static void rotatedtriangle(){
        int row=5;
        for(int i=0;i<row;i++){
            for(int k=0;k<row-i-1;k++){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){    
                System.out.print("* ");
            }
            System.out.println("");
        }
        
    }
    public static void Flloydtriangle(){
        int n=5;
        int num=1;
         for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ +" ");
            }
            System.out.println();
        }
    }
    public static void zeroonetriangle(){
        int n=5;
        int num=1;
        for (int i = 1; i <= n; i++) {
           if(i%2==0){
                    num=0;
                }
                else{
                    num=1;
                }
            for (int j = 1; j <= i; j++) {
                
                if (num==1){
                    System.out.print(num +" ");
                    num=0;
                }
                else{
                    System.out.print(num +" ");
                    num=1;
                }
                
            }
            System.out.println();
        }
        }
        public static void butterfly() {
            int rows = 5;
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                }
                for( int k=0;k<2*rows-2*i;k++ ){
                    System.out.print("  ");
                }
                for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = 1; i <= rows; i++) {
                for (int j = i; j <=rows; j++) {
                System.out.print("* ");
                }
                for( int k=0;k<2*i-2;k++ ){
                    System.out.print("  ");
                }
                for (int j = i; j <= rows; j++) {
                System.out.print("* ");
                }
                System.out.println();
            }
        }
        public static void rohombus(int l,int b) {
        for(int i=0;i<l;i++){
            for(int k=0;k<l-i-1;k++){
                System.out.print ("  ");
            }
            for(int j=0;j<b;j++){    
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
        public static void Hollowrohombus(int l,int b) {
        for(int i=0;i<l;i++){
            for(int k=0;k<l-i-1;k++){
                System.out.print ("  ");
            }
            for(int j=0;j<b;j++){    
                if(i==0||i==l-1||j==0||j==b-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
    public static void diamond(){
        int row=5;
        for(int i=0;i<row;i++ ){
            for(int k=0; k<row-i-1;k++){
                System.out.print("  ");
            }
            
            for(int j=0; j< 2*i+1;j++){
                System.out.print("* ");

            }
            System.out.println("");
        }
        for(int i=1;i<row;i++ ){
            for(int k=0; k<i;k++){
                System.out.print("  ");
            }
            
            for(int j=i; j< 2*row-i-1;j++){
                System.out.print("* ");

            }
            System.out.println("");
        }
    }

    public static void main(String [] args) {
        triangle();
        Itriangle();
        numbertriangle();
        charactertriangle();
        Hollowrectangle(5, 10);
        rotatedtriangle();
        Flloydtriangle();
        zeroonetriangle();
        butterfly();
        rohombus(5, 5);
        Hollowrohombus(5, 5);
        diamond();
    }
}