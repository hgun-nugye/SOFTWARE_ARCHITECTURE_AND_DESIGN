package thuchanh.B2_Tokenize;

import java.util.ArrayList;
import java.util.List;

public class RemovePunctuation extends TokenrizerDecorator {
    public RemovePunctuation(String cau, Tokenrizer cauXuLy) {
        super(cau, cauXuLy);
    }

    @Override
    public List<String> tokenize() {
        List<String> tokens = new ArrayList<>(super.tokenize());
        tokens.removeIf(t -> t.equals(".") || t.equals(",") || t.equals(";") || t.equals(":"));
        return tokens;
    }
}
