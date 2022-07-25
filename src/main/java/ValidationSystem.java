public class ValidationSystem {

    static <T> Validator create (T type) throws ValidationFailedException {
        if (type instanceof Integer) {
            return new IntegerValidator();
        }
        if (type instanceof String) {
            return new StringValidator();
        } else throw new ValidationFailedException("неправильный тип");
    }

    public static <T> void validate(T type) throws ValidationFailedException {
        create(type).validate(type);
    }
}
