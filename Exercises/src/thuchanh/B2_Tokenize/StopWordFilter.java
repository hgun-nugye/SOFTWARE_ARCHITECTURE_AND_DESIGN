package thuchanh.B2_Tokenize;

import java.util.Arrays;
import java.util.List;

public class StopWordFilter extends TokenierDecorator{
    private List<String> stopWords = Arrays.asList("và","hoặc", "thì", "mà", "là");

    public StopWordFilter(ITokenizer tokenizer) {
        super(tokenizer);
    }

    @Override
    public List<String> tokenize() {
        List<String> tokens = super.tokenize();
        tokens.removeIf(token ->stopWords.contains(token.toLowerCase()));
        return tokens;
    }
}
