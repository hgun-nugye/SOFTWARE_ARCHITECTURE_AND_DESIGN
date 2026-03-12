package thuchanh.B2_Tokenize;

import java.util.List;

public class PuntuationFilter extends TokenierDecorator{
    public PuntuationFilter(ITokenizer tokenizer) {
        super(tokenizer);
    }

    @Override
    public List<String> tokenize() {
        List<String> tokens = super.tokenize();
        for(int i=0; i<tokens.size(); i++){
            String cleanedToken = tokens.get(i).replaceAll("[^a-zA-Z0-9A-ZÀ-ỹ]", "");
            tokens.set(i, cleanedToken);
        }
        tokens.removeIf(String::isEmpty);
        return tokens;
    }
}
