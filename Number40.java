import java.util.*;
import java.io.*;
public class Number40 {

	static long mod = 1000000007;
	public static void main(String[] args) throws IOException {
		initFactors();
        InputReader reader = new InputReader(System.in);
        System.out.println("Enter number of test cases");
        int T = reader.readInt();
        for (int t=0; t<T; t++) {
        	System.out.println("Enter the values of N,M,L,R");
            long N = reader.readInt();
            long M = reader.readInt();
            int L = reader.readInt();
            int R = reader.readInt();
            long sum = 0;
            int[] f = new int[10];
            for (int D=L; D<=R; D++) {
                int[] factorization = factors[D];
                for (int mask=0; mask<(1 << factorization.length); mask++) {
                    int bits = 0;
                    for (int bit=0; bit<factorization.length; bit++) {
                        if ((mask&(1 << bit)) != 0) {
                            f[bits] = factorization[bit];
                            bits++;
                        }
                    }
                    long base = 0;
                    for (int subMask=0; subMask<(1<<bits); subMask++) {
                        long number = 1;
                        int subBits = 0;
                        for (int bit=0; bit<bits; bit++) {
                            if ((subMask&(1 << bit)) != 0) {
                                subBits++;
                                number *= f[bit];
                            }
                        }
                        if (subBits%2 == 0) {
                            base += M/number;
                        } else {
                            base -= M/number;
                        }
                    }
                    if (bits%2 == 0) {
                        sum += modPow(base, N);
                    } else {
                        sum -= modPow(base, N);
                    }
                    sum %= mod;
                }
            }
            if (sum < 0) {
                sum += mod;
            }
            System.out.println(sum);
        }
    }

    static long modPow(long base, long exp) {
        long result = 1;
        long pow = base;
        while (exp != 0) {
            if ((exp&1) != 0) {
                result *= pow;
                result %= mod;
            }
            pow *= pow;
            pow %= mod;
            exp >>= 1;
        }
        return result;
    }

    static int[][] factors;
    static void initFactors() {
        factors = new int[1001][];
        for (int m=1; m<=1000; m++) {
            List<Integer> list = new ArrayList<Integer>();
            int number = m;
            int p = 2;
            while (number > 1) {
                int factor = 1;
                while (number%p == 0) {
                    number /= p;
                    factor *= p;
                }
                if (factor != 1) {
                    list.add(factor);
                }
                p++;
            }
            int[] factorization = new int[list.size()];
            for (int i=0; i<list.size(); i++) {
                factorization[i] = list.get(i);
            }
            factors[m] = factorization;
        }
    }

    static final class InputReader {
        private final InputStream stream;
        private final byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        private int read() throws IOException {
            if (curChar >= numChars) {
                curChar = 0;
                numChars = stream.read(buf);
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public final int readInt() throws IOException {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res;
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
    }
    
}