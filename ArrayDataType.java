public class ArrayDataType {
    public static void main(String[] args) {
        // Array adalah kumpulan sebuah data dengan tipe yang sama

        // One Dimension
        int[] arrayInteger = new int[3];
        arrayInteger[0] = 20;
        arrayInteger[1] = 40;
        arrayInteger[2] = 50;

        int[] arrayInteger2 = new int[]{20,40,50};

        // Multi Dimension

        int[][] arrayInteger3 = new int[][] {{20,50,40},{90,50,10},{50,10,80}};

        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = 20;
        arrayOfObject[1] = "Arvel Peyoh";
        arrayOfObject[2] = 20L;
    }
}
