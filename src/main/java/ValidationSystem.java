public class ValidationSystem {

    public Validator validate(ValidatorType type) {
        Validator validator = null;

        switch (type) {
            case STRING_VALIDATOR:
                validator = new StringValidator();
                break;
            case INTEGER_VALIDATOR:
                validator = new IntegerValidator();
                break;
        }
        return validator;
    }
}
