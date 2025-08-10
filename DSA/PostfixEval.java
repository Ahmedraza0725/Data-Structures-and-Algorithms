//package LAB10;
//interface S {
//    void p(int i);
//    Integer o();
//    boolean e(); }
//class St implements S {
//    int[] a;
//    int t = -1;
//    St(int c) {
//        a = new int[c]; }
//    public void p(int i) {
//        a[++t] = i; }
//    public Integer o() {
//        return e() ? null : a[t--]; }
//    public boolean e() {
//        return t == -1; }}
//public class PostfixEval {
//    static int eval(String s) {
//        St st = new St(s.length());
//        for (String tok : s.split("\\s+")) {
//            if (tok.matches("\\d+")) {
//                st.p(Integer.parseInt(tok));
//            } else {
//                int o2 = st.o(), o1 = st.o();
//                switch (tok) {
//                    case "+":
//                        st.p(o1 + o2);
//                        break;
//                    case "-":
//                        st.p(o1 - o2);
//                        break;
//                    case "*":
//                        st.p(o1 * o2);
//                        break;
//                    case "/":
//                        st.p(o1 / o2);
//                        break; }}}
//        return st.o(); }
//    public static void main(String[] args) {
//        String postfix = "2 3 1 * + 9 -";
//        int result = eval(postfix);
//        System.out.println("Result: " + result); }}