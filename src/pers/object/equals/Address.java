package pers.object.equals;

/**
 * @Author LiZiHao
 * @Date 2022/5/12/22:43
 */
public class Address {
    String city;
    String street;
    String zipcode;

    public Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Address)) return false;
        if (this == obj) return true;
        Address address = (Address) obj;
        return this.city.equals(address.city)
                && this.street.equals(address.street)
                && this.zipcode.equals(address.zipcode);
    }
}
