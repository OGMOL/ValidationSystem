public class ValidationSystem<T> {

    public static <T> void validate(T type) throws ValidationFailedException {

        if (type instanceof Integer) {
            Validator<Integer> a = new IntegerValidator();
            a.validate((Integer) type);
        }
        if (type instanceof String) {
            Validator<String> a = new StringValidator();
            a.validate((String) type);
        }
    }
}
