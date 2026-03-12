package thuchanh.B2_Tokenize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicTokenizer implements ITokenizer{
    private String text;

    public BasicTokenizer(String text) {
        this.text = text;
    }

    @Override
    public List<String> tokenize() {
        return new ArrayList<>(Arrays.asList(text.split("\\s+")));
    }
}
