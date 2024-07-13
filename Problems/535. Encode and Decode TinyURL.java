public class Codec {

    HashMap<String, String> originalLinkToShortLink=new HashMap<>();
    HashMap<String, String> shortLinkToOriginal=new HashMap<>();

    final String characters="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {

        // tinyURL will be have maximum 6 characters, excluding https://tinyurl.com/

        if(originalLinkToShortLink.containsKey(longUrl)){
            return originalLinkToShortLink.get(longUrl);
        }

        String sb="https://tinyurl.com/";

        while(shortLinkToOriginal.containsKey(sb)){
            sb+=characters.charAt((int)Math.random()*61);
        }

        shortLinkToOriginal.put(sb, longUrl);
        originalLinkToShortLink.put(longUrl, sb);

        return sb;
        
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return shortLinkToOriginal.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));