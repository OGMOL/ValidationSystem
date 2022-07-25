public class IntegerValidator implements Validator<Integer>{

    @Override
    public void validate(Integer t) throws ValidationFailedException {
        if (t <= 0 || t >10) throw new ValidationFailedException("Число не входит в диапазон");
    }
}
