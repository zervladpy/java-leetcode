import java.util.Stack;

public class SimplifyPath {

    public String simplifyPath(String path) {

        /// Split path into directories
        String[] dirs = path.split("/");

        Stack<String> stack = new Stack<>();
        for (String dir : dirs) {
            /// edge case for empty string because between two / is an empty space
            if (dir.isEmpty()) continue;
            /// `.` is a current directory so, we don't want to change nothing
            if (dir.equals(".")) continue;
            /// `..` string is go back one directory if is not a root directory
            if (dir.equals("..") && !stack.isEmpty()) {
                stack.pop();
                /// add dir if is not a go back command
            } else if (!dir.equals("..")) {
                stack.push(dir);
            }
        }

        StringBuilder res = new StringBuilder();

        /// create new path
        while (!stack.isEmpty()) {
            res.insert(0, "/" + stack.pop());
        }

        /// in case stack is empty we add the root path
        if (res.isEmpty()) res.append("/");

        return res.toString();
    }
}
