package lesson10;

import java.util.Objects;

public class Author {
    String firstName;
    String lastName;

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null)
            return false;
        if (getClass() != other.getClass())
            return false;
        Author author = (Author) other;
        if (firstName.equals(author.firstName))
            return true;
        if (lastName.equals(author.lastName))
            return true;
        return false;
    }
}


