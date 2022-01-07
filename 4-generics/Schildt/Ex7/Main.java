import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Main {

    public static void main(String[] args) {

        Coords2D c2d = new Coords2D(2, 3);
        Coords3D c3d = new Coords3D(4, 2, 8);
        Coords4D c4d = new Coords4D(1, -3, 2, 4);
        System.out.println(c2d);
        System.out.println(c3d);
        System.out.println(c4d);

        CoordsHolder<Coords2D> ch1 = new CoordsHolder<>(c2d);
        CoordsHolder<Coords3D> ch2 = new CoordsHolder<>(c3d);
        CoordsHolder<Coords4D> ch3 = new CoordsHolder<>(c4d);

        System.out.println();
        printCoords2D(ch1);
        printCoords2D(ch2);
        printCoords2D(ch3);
    }

    public static void printCoords2D(CoordsHolder<? extends Coords2D> coords) {
        
        System.out.printf(
            "type: %s, coords: x = %s, y = %s\n",
            coords.getCoords().getClass().getName(),
            coords.getCoords().getX(),
            coords.getCoords().getY()
        );
    }
}

class Coords2D {

    protected double x, y;

    public Coords2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("[Coords 2D] x = %s y = %s", x, y);
    }
}

class Coords3D extends Coords2D {

    protected double z;

    public Coords3D(double x, double y, double z) {

        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return String.format("[Coords 3D] x = %s y = %s z = %s", x, y, z);
    }
}

class Coords4D extends Coords3D {

    protected double q;

    public Coords4D(double x, double y, double z, double q) {

        super(x, y, z);
        this.q = q;
    }

    public double getQ() {
        return q;
    }

    @Override
    public String toString() {
        return String.format("[Coords 4D] x = %s y = %s z = %s q = %s", x, y, z, q);
    }
}

class CoordsHolder<T extends Coords2D> {

    private T coords;

    public CoordsHolder(T coords) {
        this.coords = coords;
    }

    public T getCoords() {
        return coords;
    }
}
