public class PathSegments {

    static String createPath(String[] pathSegments) {
    	return "/" + String.join("/", pathSegments);
    }
    
}
