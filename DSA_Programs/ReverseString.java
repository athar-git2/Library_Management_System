class ReverseString{

    public static void main(String[] args) {
        
        String str = "hello java";

        System.out.println(reverse(str));


    }

    public static String reverse(String s)
    {
        if(s==null)
        {
            System.out.println("Null String");
        }

        StringBuilder sb = new StringBuilder();

       char[] ch = s.toCharArray();

       for(int i = ch.length-1;i>=0;i--)
       {
           sb.append(ch[i]);
       }

        return sb.toString();
    }
}

//OUTPUT

//avaj olleh



   