package thuchanh.B2_Tokenize;

public class TokenizerDecorator extends Tokenizer {
    Tokenizer cauXuLy;

    public TokenizerDecorator(String cau, Tokenizer cauXuLy) {
        super(cau);
        this.cauXuLy = cauXuLy;
    }
}
