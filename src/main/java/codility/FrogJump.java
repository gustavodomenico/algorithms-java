package codility;

public class FrogJump {
    public int solution(int X, int Y, int D) {
        // Just return Finish - Beginning / Distance of Jumps
        return (int) Math.ceil((Y - X) / (double) D);
    }
}
