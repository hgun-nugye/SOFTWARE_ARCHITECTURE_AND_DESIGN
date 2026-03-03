package thuchanh.B2_Tokenize;

import java.util.ArrayList;
import java.util.List;

public class RemovePunctuation extends TokenizerDecorator {
    public RemovePunctuation(String cau, Tokenizer cauXuLy) {
        super(cau, cauXuLy);
    }

    @Override
    public List<String> tokenize() {
        List<String> tokens = new ArrayList<>(super.tokenize());
        tokens.removeIf(t -> t.equals(".") || t.equals(",") || t.equals(";") || t.equals(":"));
        return tokens;
    }
}
