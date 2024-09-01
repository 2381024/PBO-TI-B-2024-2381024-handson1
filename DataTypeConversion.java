public class DataTypeConversion {
    public static void main(String[] args) {
        //Widening
        byte byte_data = 10;
        short short_data = byte_data;
        int int_data = short_data;
        long long_data = int_data;
        float float_data = long_data;
        double double_data = float_data;

        //Narrowing
        int int_data1 = 190;
        byte byte_data1 = (byte) int_data1;
        System.out.println(byte_data1);
    }
}
