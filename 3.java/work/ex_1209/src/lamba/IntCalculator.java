package lamba;

@FunctionalInterface
public interface IntCalculator<T> {
	int calc(T x, T y);

}
