public interface Validator <T>{
    void validate(T t) throws ValidationFailedException;
}
