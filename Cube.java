
public class Cube {
    private int side = 0;

    public int getSide() {
        return side;
    }

    public void setSide(int num) {
        side = num;
    }

    public static void main(String[] args) {
        Cube cube = new Cube();
        System.out.println("Initial side length: " + cube.getSide());

        // Set side length
        cube.setSide(5);
        System.out.println("Side length after setting: " + cube.getSide());
    }
}
    

