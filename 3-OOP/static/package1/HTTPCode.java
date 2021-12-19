
package package1;

public class HTTPCode {

    public static final String
        CODE_200,
        CODE_401,
        CODE_500;

    static {

        CODE_500 = "Internal server error";
        CODE_200 = "OK";
        CODE_401 = "Not authorized";
    }

    public static String getCodeMessage(int code) {

        switch (code) {

            case 200: return CODE_200;
            case 401: return CODE_401;
            case 500: return CODE_500;
        }

        return "Unknown HTTP code";
    }
}
