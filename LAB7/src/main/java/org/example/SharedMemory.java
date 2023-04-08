package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * The type Shared memory.
 */
public class SharedMemory {

    private final Queue<Token> tokens;

    /**
     * Instantiates a new Shared memory.
     *
     * @param n the n
     */
    public SharedMemory(int n) {
        List<Token> tokenList = new ArrayList<>();
        for (int i = 1; i <= n * n * n; i++) {
            tokenList.add(new Token(i));
        }
        Collections.shuffle(tokenList);
        tokens = new LinkedList<>(tokenList);
    }

    /**
     * Extract tokens list.
     *
     * @param howMany the how many
     * @return the list
     */
    public synchronized List<Token> extractTokens(int howMany) {
        List<Token> extracted = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            Token token = tokens.poll();
            if (token == null) {
                break;
            }
            extracted.add(token);
        }
        return extracted;
    }

}