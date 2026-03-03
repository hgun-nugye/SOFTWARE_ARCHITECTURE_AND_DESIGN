package thuchanh.B2_Tokenize;

public class TokenrizerDecorator extends Tokenrizer {
    Tokenrizer cauXuLy;

    public TokenrizerDecorator(String cau, Tokenrizer cauXuLy) {
        super(cau);
        this.cauXuLy = cauXuLy;
    }
}
