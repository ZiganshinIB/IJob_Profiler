package converter.base;

public abstract class Convert<T>{
    abstract String convertTo(T);
    abstract T fromConvert();
}
