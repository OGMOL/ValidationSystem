public class StringValidator<T> implements Validator<T> {

    @Override
    public void validate(T t) throws ValidationFailedException {
        String str = (String) t;
        String res = str.replaceFirst("[(a-z)]", " ");
        if (str.charAt(0) != res.charAt(0))
            throw new ValidationFailedException("Строка не начинается с заглавной буквы");
        if (str.isEmpty())
            throw new ValidationFailedException("Строка пуста");
    }
}
