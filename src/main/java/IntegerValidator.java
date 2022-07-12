public class IntegerValidator implements Validator{

    @Override
    public void validate(Object o) throws ValidationFailedException {
        if ((int)o < 0 || (int)o >10) throw new ValidationFailedException("Число не входит в диапазон");
    }
}
