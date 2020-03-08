package collections;

import java.util.Objects;

public class RemoveDuplicate implements Comparable {

    int id;
    String emailId;

    @Override
    public int compareTo(Object o) {
        return 0;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RemoveDuplicate that = (RemoveDuplicate) o;
        return id == that.id &&
                Objects.equals(emailId, that.emailId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, emailId);
    }
}
