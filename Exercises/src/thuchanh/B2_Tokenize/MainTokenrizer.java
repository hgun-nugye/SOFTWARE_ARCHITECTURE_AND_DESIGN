package thuchanh.B2_Tokenize;

public class MainTokenrizer {
    public static void main(String[] args) {
        Tokenrizer cau = new TokenString("Xin chào, tôi là một câu.");

        TokenrizerDecorator xuLyDau = new RemovePunctuation(cau.cau, cau);

        TokenrizerDecorator xuLyTu = new RemoveStopWord(cau.cau, xuLyDau);

        System.out.println(xuLyTu.tokenize());
    }
}
