package org.example;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Exploration.
 */
public class Exploration {

    private final SharedMemory sharedMemory;
    private final ExplorationMap map;
    private final List<Robot> robots;

    /**
     * Instantiates a new Exploration.
     *
     * @param n           the n
     * @param numOfRobots the num of robots
     */
    public Exploration(int n, int numOfRobots) {
        sharedMemory = new SharedMemory(n);
        map = new ExplorationMap(n);
        robots = new ArrayList<>();

        for (int i = 0; i < numOfRobots; i++) {
            Robot robot = new Robot("Robot " + (i + 1), this);
            robots.add(robot);
        }
    }

    /**
     * Start exploration.
     */
    public void startExploration() {
        Thread[] robotThreads = new Thread[robots.size()];

        // Start each robot thread
        for (int i = 0; i < robots.size(); i++) {
            robotThreads[i] = new Thread(robots.get(i));
            robotThreads[i].start();
        }

        // Wait for each robot thread to finish
        for (Thread robotThread : robotThreads) {
            try {
                robotThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Print out the final exploration map
        System.out.println(map);
    }

    /**
     * Gets shared memory.
     *
     * @return the shared memory
     */
    public SharedMemory getSharedMemory() {
        return sharedMemory;
    }

    /**
     * Gets map.
     *
     * @return the map
     */
    public ExplorationMap getMap() {
        return map;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Exploration exploration = new Exploration(5, 3);
        exploration.startExploration();
    }
}