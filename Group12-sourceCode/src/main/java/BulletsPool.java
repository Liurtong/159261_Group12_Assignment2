import java.util.ArrayList;
import java.util.List;

public class BulletsPool {
    public static final int POOL_SIZE = 200;
    //Maximum pond capacity
    public static final int POOL_MAXSIZE = 200;
    // A container used to hold all bullets
    private static List<Bullet> pool = new ArrayList<>();

    //    Create 200 bullet objects to add to the container at class load time
    static {
        for (int i = 0; i < POOL_SIZE; i++) {
            pool.add(new Bullet());
        }
    }

    /**
     * Get a bullet object from the pond
     * @return
     */
    public static Bullet get() {

        Bullet bullet = null;
        // The pond was hollowed out
        if (pool.size() == 0) { //There are no objects in the pond to create objects
            bullet = new Bullet();
        } else {//There are objects in the pond, so take the object in the first place
            bullet = pool.remove(0);
        }
        return bullet;
    }

    /**
     * Return the bullet
     */
    // The bullet was returned to the pond in the process of being destroyed
    public static void theReturn(Bullet bullet) {
        // When the bullet pool reaches its maximum, it will not be returned
        if (pool.size() == POOL_MAXSIZE) {
            return;
        }
        pool.add(bullet);
    }
}
