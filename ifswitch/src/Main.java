public class Main {
    public static void main(String[] args) {
        int score = 78;
        if(score > 85) {
            System.out.println("Tốt");
        }else if(score < 65) {
            System.out.println("Trung bình");
        } else{
            System.out.println("Khá");
        }
        int day = 6;
        String result = switch (day){
            case 1 -> "Chủ Nhật";
            case 2 -> "Thứ 2";
            case 3 -> "Thứ 3";
            case 4 -> "Thứ 4";
            case 5 -> "Thứ 5";
            case 6 -> "Thứ 6";
            case 7 -> "Thứ 7";
            default -> "";
        };
        System.out.println(result);
    }
}