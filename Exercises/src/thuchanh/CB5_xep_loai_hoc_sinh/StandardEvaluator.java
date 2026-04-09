package thuchanh.CB5_xep_loai_hoc_sinh;

public class StandardEvaluator extends GradeEvaluator {
    private String gradeName;
    private double minScore;
    private double maxScore;
    private boolean isMaxInclusive;

    public StandardEvaluator(String gradeName, double minScore, double maxScore, boolean isMaxInclusive) {
        this.gradeName = gradeName;
        this.minScore = minScore;
        this.maxScore = maxScore;
        this.isMaxInclusive = isMaxInclusive;
    }

    @Override
    public void evaluate(double score) {
        boolean isMatch = isMaxInclusive ? (score >= minScore && score <= maxScore) : (score >= minScore && score < maxScore);
        if (isMatch) {
            System.out.println("Điểm: " + score + "\tXếp loại: " + gradeName);
        } else if (nextEvaluator != null) {
            nextEvaluator.evaluate(score);
        } else System.out.println("Lỗi: Điểm "+score +" không hợp lệ!");
    }
}
