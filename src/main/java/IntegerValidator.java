public class IntegerValidator<T> implements Validator<T>{

    @Override
    public void validate(T t) throws ValidationFailedException {
        if ((int)t <= 0 || (int)t >10) throw new ValidationFailedException("Число не входит в диапазон");
    }
}
