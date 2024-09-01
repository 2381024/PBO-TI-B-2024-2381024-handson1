public class StringDataType {
    public static void main(String[] args) {
        //Perbedaan primitive dan non primitice

        String firstName = "Arvel";
        String lastName = "Peyoh";
        String fullname = firstName + " " + lastName;
        System.out.println(firstName.concat(" ").concat(lastName));
        System.out.println(fullname.toUpperCase());
    }
}
