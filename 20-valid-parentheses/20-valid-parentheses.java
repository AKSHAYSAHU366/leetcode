class Solution {
    public boolean isValid(String s) {
         boolean v1 = true;
        boolean v2 = true;
        boolean res=true;
        int count = 0;
        String a =s;
        char s1[] = a.toCharArray();
        Stack st = new Stack();

        for (char b : s1) {
            if (b == '(' || b == '[' || b == '{') {

               // System.out.println("b = " + b);
                st.push(b);
                count++;
                continue;
            }

            if ((b == ')' || b == ']' || b == '}')) {
                                if (st.empty()) {
                    v2 = false;
                    break;
                    
                }

                if (b == ')') {
                   // System.out.println("41 st.peek = " + st.peek());
                    if ((st.peek().equals('('))) {
                        st.pop();
                    } else {
                        //System.out.println("41ouch FALSE ");
                        v1 = false;
                        break;
                    }
                }

                else if (b == ']') {
                    //System.out.println("93 st.peek = " + st.peek());
                    if (st.peek().equals('[')) {
                        st.pop();

                    } else {
                       // System.out.println("93ouch FALSE ");
                        v1 = false;
                        break;
                    }
                } else if (b == '}') {
                    //System.out.println("125 st.peek = " + st.peek());
                    if (st.peek().equals('{')) {
                        st.pop();
                    } else {
                        //System.out.println("125ouch FALSE ");
                        v1 = false;
                        break;
                    }
                }

            }

        }

        if (st.empty() && count > 0 && v1 == true && v2 == true) {
            res=true;
        } else {
            res=false;
        }
        return res;
    }
}