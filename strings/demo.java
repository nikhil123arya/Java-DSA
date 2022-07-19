public class demo {
    public static void main(String[] args) {
        String name = "kunal kushwaha";
        char ch = 'p';
        int ans = search(name,ch);
        System.out.println(ans);
    }
    static int search(String name, char target) {
        if(name.length() == 0) {
            return -1;
        }
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == target) {
                return i;
            }
        }
        return -1;
    }
}
