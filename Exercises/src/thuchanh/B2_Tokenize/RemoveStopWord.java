package thuchanh.B2_Tokenize;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class RemoveStopWord extends TokenrizerDecorator {
    public RemoveStopWord(String cau, Tokenrizer cauXuLy) {
        super(cau, cauXuLy);
    }

    @Override
    public List<String> tokenize() {
        List<String> tokens = new ArrayList<>(super.tokenize());
        Set<String> stopwords = Set.of("và", "là", "mà", "hoặc");
        tokens.removeIf(stopwords::contains);
        return tokens;
    }
}
