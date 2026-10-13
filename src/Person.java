public class Person {
    String name;
    Address address;


    public static void main(String[] args){

//      creating the address

        Address ad1 = new Address();
        ad1.city ="Bulawayo";
        ad1.housenumber =9770;
//        creating the person
        Person me = new Person();
        me.name = "Leslie";
//      assigning the person'address to the address we have created above
        me.address = ad1;

//      now its person->address->city
        System.out.println(me.name+ "'s address is " + me.address.city);


//        now showing when the address is Null

        Address ad2 = null;

        me.address = ad2;
        System.out.println(me.name+ "'s address is " + me.address.city);
    }

}
