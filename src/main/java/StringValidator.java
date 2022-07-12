public class StringValidator implements Validator{


    @Override
    public void validate(Object o) throws ValidationFailedException {
        String str = (String) o;
        String res = str.replaceFirst("[(a-z)]", " ");
        if (str.charAt(0) != res.charAt(0))
            throw new ValidationFailedException("Строка не начинается с заглавной буквы");
    }

}
