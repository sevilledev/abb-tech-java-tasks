package lesson7.chorefiles;

public class Stats<T extends Number> {
    T[] nums;

    public Stats(T[] nums) {
        this.nums = nums;
    }

    public T[] getNums() {
        return nums;
    }

    public void setNums(T[] nums) {
        this.nums = nums;
    }

    public double average() {
        double sum = 0;
        for (T num : nums) {
            sum += num.doubleValue();
        }
        return sum / nums.length;
    }

}
