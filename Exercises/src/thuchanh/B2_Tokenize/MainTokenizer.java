package thuchanh.B2_Tokenize;

public class MainTokenizer {
    public static void main(String[] args) {
        ITokenizer token = new BasicTokenizer("Tokenize là quá trình tách một chuỗi thành các từ.");
        System.out.println("Đã Tokenize: " + token.tokenize());
        System.out.println("Lọc stop words: ");
        token = new StopWordFilter(token);
        System.out.println(token.tokenize());

        System.out.println("Lọc dấu câu:");
        token = new PuntuationFilter(token);
        System.out.println(token.tokenize());

        System.out.println("Kết quả:");
        for(String i :token.tokenize()){
            System.out.println(i);
        }
        ITokenizer test = new PuntuationFilter(new StopWordFilter(new BasicTokenizer("Tokenize..... là quá trình tách một chuỗi thành các từ.")));
        ITokenizer test2 = new PuntuationFilter(new StopWordFilter(new BasicTokenizer("           ,,,.,............")));
        System.out.println(test.tokenize());
        System.out.println(test2.tokenize());
    }
}
