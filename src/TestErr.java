public class TestErr {
    public int age(String agestr) {
        // Integer.parseIntで変換を試みる
        int age = 0;
        try {
            age = Integer.parseInt(agestr); // 文字列を整数に変換
            if (age < 0) {
                // 年齢が負の場合はIllegalArgumentExceptionをスロー
                throw new IllegalArgumentException("age cannot be negative");
            }
        } catch(NullPointerException e) {
            // 渡された引数がnullの場合
            throw new IllegalArgumentException(e);

        }
        catch (NumberFormatException e) {
            // 数字以外の文字列が渡された場合
            throw new IllegalArgumentException("age must be a valid number", e);
        } 
        return age;
    }

    public static void main(String[] args) {
        TestErr err = new TestErr();

        // -1 の場合、例外がスローされることを期待
        try {
            System.out.println(err.age("-1"));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        // "太郎" の場合、例外がスローされることを期待
        try {
            System.out.println(err.age("太郎"));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage() +" Cause:"+e.getCause());
        }

        // null の場合、例外がスローされることを期待
        try {
            System.out.println(err.age(null));
        } catch (IllegalArgumentException e) { 
            System.err.println("Error: " + e.getMessage()+" Cause:"+e.getCause());
        }
    }
}
