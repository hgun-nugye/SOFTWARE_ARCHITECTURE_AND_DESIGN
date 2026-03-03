package thuchanh.B2_Tokenize;

public class MainTokenizer {
    public static void main(String[] args) {
        Tokenizer cau = new TokenString("Xin chào, tôi là một câu.");

        TokenizerDecorator xuLyDau = new RemovePunctuation(cau.cau, cau);

        TokenizerDecorator xuLyTu = new RemoveStopWord(cau.cau, xuLyDau);

        System.out.println(xuLyTu.tokenize());
    }
}
