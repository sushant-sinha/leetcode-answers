// 66ms ( 86.59% ) 40.4mb ( 66.41% )

class OrderedStream {
    String[] words = null;
    int ptr = 0;
    public OrderedStream(int n) {
        this.words = new String[n];
    }

    public List<String> insert(int idKey, String value) {
        words[idKey-1] = value;
        List<String> res = new ArrayList<>();
        if(idKey-1 == ptr)
        {
            while(ptr < words.length && words[ptr] != null)
            {
                res.add(words[ptr++]);
            }
        }

        return res;
    }
}