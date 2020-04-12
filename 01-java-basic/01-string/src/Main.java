public class Main {

    public static void main(String[] args) {
        String str1 = "中国人";
        String str2 = "中国人";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("中国人");
//        stringBuilder.append('e');
//        stringBuilder.append('s');
//        stringBuilder.append('t');
        String str3 = new String(stringBuilder);
        System.out.println(String.format("str1 @%x", str1.hashCode()));
        System.out.println(String.format("str2 @%x", str2.hashCode()));
        System.out.println(String.format("str3 @%x", str3.hashCode()));
        System.out.println(str1.equals(str2));
    }
}
