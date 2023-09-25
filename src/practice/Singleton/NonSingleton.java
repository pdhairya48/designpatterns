package practice.Singleton;

import java.util.Objects;


public class NonSingleton {
    private NonSingleton nonSingleton;
    public NonSingleton() {
    }
    public NonSingleton getInstance(){
        return nonSingleton;
    }

    @Override public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final NonSingleton that = (NonSingleton) o;
        return Objects.equals(nonSingleton, that.nonSingleton);
    }

    @Override public int hashCode() {
        return Objects.hash(nonSingleton);
    }
}
