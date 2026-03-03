package thuchanh.B2_Tokenize;

import java.util.Arrays;
import java.util.List;

public abstract class Tokenizer {
    String cau;

    public Tokenizer(String cau) {
        this.cau = cau;
    }

    public List<String> tokenize(){
        return Arrays.stream(cau.split("[^\\p{L}]+"))
                .filter(s -> !s.isBlank())
                .toList();
    }
}
