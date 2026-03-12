package thuchanh.B2_Tokenize;

import java.util.List;

public abstract class TokenierDecorator implements ITokenizer{
    protected ITokenizer tokenizer;

    public TokenierDecorator(ITokenizer tokenizer) {
        this.tokenizer = tokenizer;
    }

    @Override
    public List<String> tokenize() {
        return tokenizer.tokenize();
    }
}
