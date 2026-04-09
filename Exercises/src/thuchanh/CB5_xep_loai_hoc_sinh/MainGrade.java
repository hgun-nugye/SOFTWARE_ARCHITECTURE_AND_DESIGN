package thuchanh.CB5_xep_loai_hoc_sinh;

public class MainGrade {
    public static void main(String[] args) {
        GradeEvaluator yeu = new StandardEvaluator("Yếu", 0, 5, false);
        GradeEvaluator tb = new StandardEvaluator("Trung bình", 5, 7, false);
        GradeEvaluator kha = new StandardEvaluator("Khá", 7, 8, false);
        GradeEvaluator gioi = new StandardEvaluator("Giỏi", 8, 9, false);
        GradeEvaluator xs = new StandardEvaluator("Xuất sắc", 9, 10, true);

        yeu.setNextEvaluator(tb).setNextEvaluator(kha).setNextEvaluator(gioi).setNextEvaluator(xs);

        double[] diems = {4.5,4.999, 5.0, 6.5, 7.5, 8.5, 9.5, -1, 10.5};
        for (double diem : diems) {
            yeu.evaluate(diem);
        }
    }
}
