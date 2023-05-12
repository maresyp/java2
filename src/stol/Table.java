package stol;

import dekoracja.BookInterface;

import java.util.Stack;

public class Table {
    private Stack<BookInterface> stack;
    private int M;

    public Table(int M) throws TableException {
        if (M < 1) {
            throw new TableException("M cannot be negative");
        }

        this.M = M;
        stack = new Stack<BookInterface>();
    }

    void put(BookInterface book) throws TableException {
        if (stack.size() == M) {
            throw new TableException("Table is full");
        }

        stack.push(book);
    }

    BookInterface take() throws TableException {
        if (stack.size() == 0) {
            throw new TableException("Table is empty");
        }

        return stack.pop();
    }

    BookInterface peek() throws TableException {
        if (stack.size() == 0) {
            throw new TableException("Table is empty");
        }

        return stack.peek();
    }

    int size() {
        return stack.size();
    }

    int getM() {
        return M;
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}
