public class StringValidator implements Validator<String> {

    @Override
    public void validate(String t) throws ValidationFailedException {
        String str = t;
        String res = str.replaceFirst("[(a-z)]", " ");
        if (str.isEmpty())
            throw new ValidationFailedException("Строка пуста");
        if (str.charAt(0) != res.charAt(0))
            throw new ValidationFailedException("Строка не начинается с заглавной буквы");
    }
}
