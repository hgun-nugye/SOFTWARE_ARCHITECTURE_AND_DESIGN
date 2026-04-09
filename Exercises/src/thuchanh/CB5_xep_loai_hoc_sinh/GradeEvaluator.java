package thuchanh.CB5_xep_loai_hoc_sinh;

public abstract class GradeEvaluator {
    protected GradeEvaluator nextEvaluator;

    public GradeEvaluator setNextEvaluator(GradeEvaluator nextEvaluator) {
        this.nextEvaluator = nextEvaluator;
        return this.nextEvaluator;
    }

    public abstract void evaluate(double score);
}
