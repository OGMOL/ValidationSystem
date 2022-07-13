public class ValidationSystem<T> {
    private T type;

    private ValidationSystem(T type) {
        this.type = type;
    }

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
