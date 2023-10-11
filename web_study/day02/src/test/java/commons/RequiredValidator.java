package commons;

public interface RequiredValidator {            // required : 필수
    default void requiredCheck(String str, RuntimeException e) {
        if(str == null || str.isBlank()) {
            throw e;
        }
    }
}
