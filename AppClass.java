public class App {

public static void main(String[] args) {
Address address = new Address();

address.setStreetName("Anderson");
address.setZipCode("30291");
address.setHouseNumber("321");
address.setApartmentNumber("Undefined");

Book book = new Book();

book.setIsbn("9302914532");
book.setName("Radiation");

Author author = new Author();


author.setFirstName("Serge");
author.setLastName("Power");

System.out.println(author.getFirstName());
}


}
